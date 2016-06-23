(ns cljs.site.components.about
  (:require [om.core :as om :include-macros true]

            [sablono.core :as html :refer-macros [html]]))


(defn about [app owner]
  (om/component
    (html [:p "hello"])))
