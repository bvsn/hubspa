(ns cljs.apps.flicker
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :refer [timeout <!]]

            [cljs.lib.dom :as dom]))


(def ^:const colors [
    "#2986E2"
    "#52B321"
    "#F0AD4E"
    "#BBBBBB"
    "#F4F4F4"
    "#F74E4D"
])


(defn cell [ctx x y]
  (go (while true
    (set! (.-fillStyle ctx) (rand-nth colors))
    (.fillRect ctx x y 10 10)
    (<! (timeout (rand-int 5000))))))

(defn colony [target]
  (dotimes [x 87]
    (dotimes [y 40]
      (set! (.-width target) 870)
      (set! (.-height target) 400)
      (cell (.getContext target "2d") (* x 10) (* y 10)))))
