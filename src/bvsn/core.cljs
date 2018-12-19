(ns bvsn.core
  (:require [domina :as dom]
            [reagent.core :as r]
            [secretary.core :as secretary :include-macros true :refer-macros [defroute]]

            [bvsn.layout :as layout]

            [bvsn.components.cv :as cv]
            [bvsn.components.about :as about]
            [bvsn.components.menu :as menu]
            [bvsn.components.index :as index]))

(secretary/set-config! :prefix "#")


(defn- locate
  [location]
  (if (secretary/locate-route location)
      location
      "/"))

(defn- dispatch!
  [location]
  (let [route (locate location)]
    (swap! menu/s-current (fn [_]
      (menu/fix-location route)))
    (secretary/dispatch! route)))

(defn- index-page []
  (r/render-component [layout/index] (dom/by-id "js-root"))

  (r/render-component [menu/component] (dom/by-id "js-menu"))
  (r/render-component [index/component] (dom/by-id "js-body")))

(defn- cv-page []
  (r/render-component [layout/cv] (dom/by-id "js-root"))

  (r/render-component [menu/component] (dom/by-id "js-menu"))
  (r/render-component [cv/component] (dom/by-id "js-body")))

(defn- about-page []
  (r/render-component [layout/about] (dom/by-id "js-root"))

  (r/render-component [menu/component] (dom/by-id "js-menu"))
  (r/render-component [about/component] (dom/by-id "js-body")))


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
