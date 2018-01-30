(ns clj.site.routing
  (:use [compojure.core        :only [GET defroutes]]

        [clj.templates.layout     :only [defsite]]
        [clj.templates.site.index :only [template]]))


(defroutes routes
  (GET "/" [] (defsite template)))
