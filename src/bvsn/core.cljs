(ns bvsn.core
  (:require [domina :as dom]
            [reagent.core :as r]
            [pushy.core :as pushy]
            [secretary.core :as secretary :include-macros true :refer-macros [defroute]]

            [bvsn.layout :as layout]

            [bvsn.components.cv :as cv]
            [bvsn.components.about :as about]
            [bvsn.components.menu :as menu]
            [bvsn.components.index :as index]))

(secretary/set-config! :prefix "/")

(def history (pushy/pushy secretary/dispatch! (fn [x] (when (secretary/locate-route x) x))))


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

(defn init []
  (routes)
  (pushy/start! history))

(defn reload []
  (pushy/stop! history)
  (pushy/start! history))