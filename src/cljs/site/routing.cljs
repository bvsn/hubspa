(ns cljs.site.routing
  (:require [secretary.core :as secretary :refer-macros [defroute]]

            [cljs.lib.event :as event]
            [cljs.site.component :as component]))


(secretary/set-config! :prefix "#!")


(defroute "/" []
  (component/with-site component/about))

(defroute "/cv" []
  (component/with-site component/cv))

(defroute "/apps" []
  (component/with-site component/apps))


(secretary/dispatch! (.-hash js/location))

(event/on-hashchange (fn [url]
  (secretary/dispatch! url)))
