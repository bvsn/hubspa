(ns server.templates.404
  (:use [hiccup.page     :only [html5]]

        [server.templates.layout :only [include-css]]))


(def not-found-page
  (html5
    [:head
      [:meta {:name "description" :content "404 - Page not found"}]
      [:meta {:name "keywords" :content ""}]
      [:meta {:name "viewport" :content "width=1200, maximum-scale=1"}]
      [:meta {:name "yandex-verification" :content "7ab4b93759e02435"}]
      [:meta {:name "w1-verification" :content "118260694845"}]
      [:meta {:http-equiv "Content-Type" :content "text/html; charset=utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]

      [:title "404 - Page not found"]
      [:link {:href "/static/images/favicon.ico" :rel "shortcut icon" :type "image/x-icon"}]

      (include-css "/css/site.css")]

    [:body
      [:h1 "Page not found"]]))
