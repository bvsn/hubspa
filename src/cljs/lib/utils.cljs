(ns cljs.lib.utils)


(defn select-random
  [v]
  (get v (rand-int (count v))))
