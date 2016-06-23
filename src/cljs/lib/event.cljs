(ns cljs.lib.event
  (:use [cljs.lib.dom :only [scroll-to]]))


(defn on-hashchange
  [handler]
  (.addEventListener js/window "hashchange" (fn [_]
    (scroll-to 0)
    (handler (.-hash js/location)))))
