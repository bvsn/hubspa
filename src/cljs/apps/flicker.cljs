(ns cljs.apps.flicker
  (:use [cljs.lib.utils :only [select-random]])

  (:require [cljs.core.async :refer [chan]]

            [reagent.core :as r]))


(def ^:const colors [
    "#2986E2"
    "#52B321"
    "#F0AD4E"
    "#BBBBBB"
    "#F4F4F4"
    "#F74E4D"
])


(defn cell [i]
  [:li.b-ngun__cell {:key i :style {:background-color (select-random colors)}}])

(defn component []
  [:ul.b-ngun
    (map cell (range 72))
  ])

(defn colony [target]
  (r/render-component [component] target))
