(ns cljs.site.routing
  (:use [cljs.site.components.about :only [about]])

  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [om.core :as om]

            [cljs.lib.dom :as dom]))


(secretary/set-config! :prefix "#!")


(defonce about-state (atom {}))


(defroute "/" []
  (om/root about about-state {:target (dom/sel1 "#js-container")}))


(secretary/dispatch! (.-hash js/location))
