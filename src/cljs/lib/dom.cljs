(ns cljs.lib.dom)


(defn sel1
  ([base selector]
    (.querySelector base selector))

  ([selector]
    (sel1 js/document.body selector)))

(defn scroll-to
  ([x] (scroll-to x 0))
  ([x y] ((.-scrollTo js/window) x y)))
