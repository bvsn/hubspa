(ns hubspa
  (:use [server.routing     :only [routes]]
        [compojure.handler  :only [site]]
        [hiccup.middleware  :only [wrap-base-url]]
        [org.httpkit.server :only [run-server]]))


(def app
  (-> routes
      wrap-base-url
      site))

(defn -main []
  (run-server app {:port 8000 :thread 2}))
