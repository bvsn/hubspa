(ns clj.lib.util.io)


(defn last-modified-date
  [file]
  (-> (clojure.java.io/file file)
      (.lastModified)
      (/ 1000)))
