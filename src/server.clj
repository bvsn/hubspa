(ns server
  (:gen-class :main true)
  (:use [ring.middleware.params :only [wrap-params]]
        [ring.middleware.nested-params :only [wrap-nested-params]]
        [ring.middleware.keyword-params :only [wrap-keyword-params]]

        [clj.core :only [routes]])

  (:require [immutant.web :as web]
            [mount.core :refer [start defstate]]

            [config :refer [app-config]]))


(defn- handler
  []
  (-> routes
      wrap-keyword-params
      wrap-nested-params
      wrap-params))

(defn- start-server
  [{:keys [debug port]}]

  (if debug
      (web/run-dmc (handler) {:port port})
      (web/run (handler) {:port port}))
  (println "Starting development server at" port))


(defstate app :start (start-server app-config)
              :stop (web/stop))


(defn -main
  [& args]
  (start))
