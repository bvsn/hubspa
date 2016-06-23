(ns server.site.routing
  (:use [compojure.core        :only [GET defroutes]]

        [server.templates.layout     :only [defsite]]
        [server.templates.site.index :only [template]]))


(defroutes routes
  (GET "/" [] (defsite template)))
