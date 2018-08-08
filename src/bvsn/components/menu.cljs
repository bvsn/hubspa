(ns bvsn.components.menu
  (:require [reagent.core :as r]))


(def ^:const css-current-item-class "a-rainbow")

(def schema [
  {:href "/" :title "b" :css-class "b-bvsn__logo"}
  {:href "/about" :title "About"}
  {:href "/cv" :title "CV"}])

(def s-current (r/atom nil))


(defn- is-current-item
  [href]
  (= href @s-current))

(defn- compound-css-class
  [{:keys [href css-class]}]
  (if (is-current-item href)
      (str css-class " " css-current-item-class)
      css-class))

(defn- menu-item
  [idx menu-item]
  (let [{:keys [href title]} menu-item]
    ^{:key idx} [:li.b-menu__item
        [:a.b-menu__link {:class (compound-css-class menu-item)
                          :href href} title]]))


(defn component []
  (conj [:ul.b-menu] (doall (map-indexed menu-item schema))))
