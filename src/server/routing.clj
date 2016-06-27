(ns server.routing
  (:use [compojure.core       :only [context defroutes]]
        [compojure.route      :only [not-found resources]]
        [server.templates.404 :only [not-found-page]])
  (:require [server.site.routing :as site]))


(defroutes routes
  (context "/" [] site/routes)

  (resources "/public")

  (not-found not-found-page))
