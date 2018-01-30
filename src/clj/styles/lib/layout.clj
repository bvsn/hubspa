(ns clj.styles.lib.layout
  (:require [garden.def :refer [defstyles]]
            [garden.units :refer [px percent]]
            [garden.color :refer [rgba]]))


(defstyles layout
  [:html {:font-size (px 10)
          :font-family "sans-serif"
          :-ms-text-size-adjust (percent 100)
          :-webkit-text-size-adjust (percent 100)
          :-webkit-tap-highlight-color (rgba 0 0 0 0)}

    [:button :input {:-webkit-appearance "button"
                     :cursor "pointer"}]]

  ["*" {:box-sizing "border-box"}

    [:&:after :&:before {:box-sizing "border-box"}]])
