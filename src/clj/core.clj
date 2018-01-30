(ns clj.core
  (:use [compojure.core       :only [context defroutes]]
        [compojure.route      :only [not-found resources]]
        [clj.templates.404 :only [not-found-page]])
  (:require [clj.site.routing :as site]))


(defroutes routes
  (context "/" [] site/routes)

  (resources "/public")

  (not-found not-found-page))
