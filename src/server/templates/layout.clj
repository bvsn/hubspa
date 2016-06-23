(ns server.templates.layout
  (:use [hiccup.core :only [html]]
        [hiccup.page :only [html5]]

        [settings         :only [public-path]]
        [server.lib.util.io :only [last-modified-date]])
  (:require [hiccup.page :as page]
            [clojure.tools.macro :as macro]))


(def js {:site ["/js/site.js"]})

(def css {:site ["/css/site.css"]})


(defn make-revision
  [file]
  (str file "?r=" (last-modified-date (str public-path file))))

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
        [:title "Hubspa"]
        [:meta {:name "description" :content "Andrew Bovsunovskiy"}]
        [:meta {:name "keywords" :content ""}]
        [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
        [:meta {:http-equiv "Content-Type" :content "text/html; charset=utf-8"}]
        [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]

        [:link {:href "/public/favicon.ico" :rel "shortcut icon" :type "image/x-icon"}]

        (map include-css (~kind css))]
      [:body
        ~body
        (map include-js (~kind js))]))

(defmacro defsite
  [template]
  `(defpage :site (html
    [:div.b-wrapper.h-clear
      ~template])))
