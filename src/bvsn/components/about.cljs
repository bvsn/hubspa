(ns bvsn.components.about)

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container.la-fx.fx-d-column
        [:article
          [:p "Hello, I'm Andrii Bovsunovskyi."]

          [:p (str "Software engineer with 8 years of experience in web-development, creating projects "
                   "from scratch, team management and high load systems.")]

          [:p (str "I prefer to work in the small companies that create useful things. My goal is to "
                   "create software that will help to solve/optimize people's tasks. Today I either "
                   "assist such companies or create them by myself :)")]]

        [:figure.b-bvsn__clj]]]])
