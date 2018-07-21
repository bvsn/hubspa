(ns bvsn.components.index)

(defn component []
  [:div
    [:div.b-image-wrapper
      [:figure.b-bvsn__hero]]
    [:div..b-container
      [:section.b-bvsn.b-bvsn_section_index
        [:a.b-bvsn__link {:href "/about"}
          "Learn more about bvsn"]]]])
