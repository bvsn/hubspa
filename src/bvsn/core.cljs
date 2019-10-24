(ns bvsn.core
  (:require [reagent.core :as r]
            [goog.dom :as dom]
            [secretary.core :as secretary :include-macros true :refer-macros [defroute]]

            [bvsn.layout :as layout]

            [bvsn.components.cv :as cv]
            [bvsn.components.about :as about]
            [bvsn.components.menu :as menu]
            [bvsn.components.index :as index]))

(def ^:const prefix "#")


(secretary/set-config! :prefix prefix)


(defn- get-element
  "Return the element with the passed id."
  [id]
  (dom/getElement (name id)))

(defn- locate
  [location]
  (if (secretary/locate-route (clojure.string/replace location prefix ""))
      location
      "/"))

(defn- dispatch!
  [location]
  (let [route (locate location)]
    (swap! menu/s-current (fn [_]
      (menu/fix-location route)))
    (secretary/dispatch! route)))

(defn- index-page []
  (r/render-component [layout/index] (get-element "js-root"))

  (r/render-component [menu/component] (get-element "js-menu"))
  (r/render-component [index/component] (get-element "js-body")))

(defn- cv-page []
  (r/render-component [layout/cv] (get-element "js-root"))

  (r/render-component [menu/component] (get-element "js-menu"))
  (r/render-component [cv/component] (get-element "js-body")))

(defn- about-page []
  (r/render-component [layout/about] (get-element "js-root"))

  (r/render-component [menu/component] (get-element "js-menu"))
  (r/render-component [about/component] (get-element "js-body")))


(defn routes []
  (defroute "/" [] (index-page))
  (defroute "/cv" [] (cv-page))
  (defroute "/about" [] (about-page)))

(defn start []
  (routes)
  (dispatch! (.-hash js/location)))

(defn reload []
  (dispatch! (.-hash js/location)))

(defn ^:export init []
  (start))


(.addEventListener js/window "hashchange" (fn [x]
  (dispatch! (.-hash js/location))))
