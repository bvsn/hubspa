(ns cljs.site.routing
  (:require [secretary.core :as secretary :refer-macros [defroute]]

            [cljs.lib.event :as event]
            [cljs.site.core :as core]))


(secretary/set-config! :prefix "#!")


(defroute "/" []
  (core/with-site core/about))

(defroute "/cv" []
  (core/with-site core/cv))

(defroute "*" []
  (set! (.-location js/window) "/"))


(secretary/dispatch! (.-hash js/location))

(event/on-hashchange (fn [url]
  (secretary/dispatch! url)))
