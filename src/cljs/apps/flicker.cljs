(ns cljs.apps.flicker
  (:use [cljs.lib.utils :only [select-random]])

  (:require [cljs.core.async :refer [chan]]

            [cljs.apps.reagent :as rlib]

            [reagent.core :as r]))


(def ^:const colors [
    "#2986E2"
    "#52B321"
    "#F0AD4E"
    "#BBBBBB"
    "#F4F4F4"
    "#F74E4D"
])


(defn random-color []
  (select-random colors))

(defn random-interval []
  (nth (range 600 1000) (rand-int 400)))

(defn cell [_]
  (let [color (r/atom (random-color))]
    (fn [idx]
      (js/setTimeout (fn [] (swap! color random-color)) (random-interval))
      [:li.b-ngun__cell {:style {:background-color @color}}]
  )))

(defn component []
  (rlib/glue [:ul.b-ngun]
    (rlib/nesting cell 72)))

(defn colony [target]
  (r/render-component [component] target))
