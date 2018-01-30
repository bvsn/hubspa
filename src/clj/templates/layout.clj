(ns clj.templates.layout
  (:use [hiccup.core :only [html]]
        [hiccup.page :only [html5]]

        [config :only [app-config]]
        [clj.lib.util.io :only [last-modified-date]])

  (:require [hiccup.page :as page]

            [clojure.tools.macro :as macro]))


(def js {:site ["/public/js/site.js"]})

(def css {:site ["/public/css/site.css"]})


(defn make-revision
  [file]
  (str file "?v=" (last-modified-date (str (:public-path app-config) file))))

(defn include-js
  [file]
  (page/include-js (make-revision file)))

(defn include-css
  [file]
  (page/include-css (make-revision file)))


(defmacro defpage
  [kind body]
    `(html5
      [:head
        [:title "Andrii Bovsunovskyi"]
        [:meta {:name "description" :content "Andrii Bovsunovskyi"}]
        [:meta {:name "keywords" :content ""}]
        [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
        [:meta {:http-equiv "Content-Type" :content "text/html; charset=utf-8"}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]

        [:link {:href "/public/favicon.ico" :rel "shortcut icon" :type "image/x-icon"}]
        [:link {:rel "stylesheet" :type "text/css" :href "//fonts.googleapis.com/css?family=Lato:400,700"}]

        (map include-css (~kind css))]
      [:body
        ~body
        (map include-js (~kind js))]))

(defmacro defsite
  [template]
  `(defpage :site (html
    [:div#js-header.b-header]
    [:div.b-wrapper ~template])))