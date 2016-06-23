(ns settings
  (:use [environ.core :only [env]]))


(def public-path (env :public-path))

(def origin (env :origin))
