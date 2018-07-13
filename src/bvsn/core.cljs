(ns bvsn.core
  (:require [domina :as dom]
            [reagent.core :as r]
            [pushy.core :as pushy]
            [secretary.core :as secretary :include-macros true :refer-macros [defroute]]

            [bvsn.components.cv :as cv]
            [bvsn.components.menu :as menu]
            [bvsn.components.index :as index]))

(secretary/set-config! :prefix "/")

(def history (pushy/pushy secretary/dispatch! (fn [x] (when (secretary/locate-route x) x))))


(defn index-page []
  (r/render-component [menu/component] (dom/by-id "js-header"))
  (r/render-component [index/component] (dom/by-id "js-root")))

(defn cv-page []
  (r/render-component [menu/component] (dom/by-id "js-header"))
  (r/render-component [cv/component] (dom/by-id "js-root")))


(defn routes []
  (defroute "/" [] (index-page))
  (defroute "/cv" [] (cv-page))

  (defroute "*" [] (set! (.-location js/window) "/")))


(defn ^:export main []
  (routes)
  (pushy/start! history))
