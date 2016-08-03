(ns cljs.apps.ngun
  (:require [cljs.core.async :refer [chan]]

            [om.core :as om]

            [sablono.core :as html :refer-macros [html]]))


(defonce action-c (chan))


(defn draw-node []
  [:li.b-ngun__gear])

(defn shoot []

  (om/component
    (html [:ul.b-ngun "shoot"])))
