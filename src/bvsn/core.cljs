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
  (defroute "/about" [] (about-page))

  (defroute "*" [] (set! (.-location js/window) "/")))

(defn start []
  (routes)
  (secretary/dispatch! (.-hash js/location)))

(defn reload []
  (secretary/dispatch! (.-hash js/location)))

(defn ^:export init []
  (.addEventListener js/window "hashchange" (fn [_]
    (secretary/dispatch! (.-hash js/location))
    (swap! menu/s-current (fn [_]
      (.-hash js/location)))))
  (start))
