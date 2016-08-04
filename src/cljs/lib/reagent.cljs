(ns cljs.apps.reagent)


(defn nesting [component times & args]
  (for [i (range times)]
    ^{:key i} [component args]
  ))

(defn glue [main & components]
  (vec (concat main components)))
