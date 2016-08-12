(ns cljs.site.core
  (:use [cljs.apps.flicker :only [colony]])

  (:require [reagent.core :as r]

            [cljs.lib.dom :as dom]
            [cljs.site.component :as c]))


(defn menu []
  (r/render-component [c/menu] (dom/sel1 "#js-header")))

(defn about []
  (r/render-component [c/about] (dom/sel1 "#js-body")))

(defn cv []
  (r/render-component [c/cv] (dom/sel1 "#js-body")))

(defn apps []
  (r/render-component [
    (fn [] [:canvas#js-flicker])
  ] (dom/sel1 "#js-body"))

  (colony (dom/sel1 "#js-flicker")))


(defn componify [components]
  (doseq [component components]
    (component)))

(defn with-site [& components]
  (menu)
  (componify components))
