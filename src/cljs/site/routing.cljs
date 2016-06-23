(ns cljs.site.routing
  (:require [secretary.core :as secretary :refer-macros [defroute]]

            [cljs.lib.event :as event]
            [cljs.site.component :as component]))


(secretary/set-config! :prefix "#!")


(defroute "/" []
  (component/menu)
  (component/about))

(defroute "/cv" []
  (component/menu)
  (component/cv))

(defroute "/apps" []
  (component/menu)
  (component/apps))


(secretary/dispatch! (.-hash js/location))

(event/on-hashchange (fn [url]
  (secretary/dispatch! url)))
