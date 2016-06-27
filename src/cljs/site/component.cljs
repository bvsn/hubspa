(ns cljs.site.component
  (:require [om.core :as om]

            [cljs.lib.dom :as dom]
            [cljs.site.view :as view]))


(defn menu []
  (om/root view/menu (atom {}) {:target (dom/sel1 "#js-header")}))

(defn about []
  (om/root view/about (atom {}) {:target (dom/sel1 "#js-body")}))

(defn cv []
  (om/root view/cv (atom {}) {:target (dom/sel1 "#js-body")}))

(defn apps []
  (om/root view/apps (atom {}) {:target (dom/sel1 "#js-body")}))


(defn componify [components]
  (doseq [component components]
    (component)))

(defn with-site [& components]
  (menu)
  (componify components))
