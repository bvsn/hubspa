(ns cljs.lib.logger)


(defn js-apply [f target args]
  (.apply f target (to-array args)))

(defn log [& args]
  (js-apply (.-log js/console) js/console args))
