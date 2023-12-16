(ns bvsn.components.about
  (:require [reagent.core :as r]))

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container.la-fx.fx-d-column
        [:article.b-about
          [:h2 "A brief overview of Andrii Bovsunovskyi"]

          [:p (str "Hi there 👋")]

          [:p (str "I'm a dynamic and visionary engineering leader. I bring a unique blend of business acumen and technical expertise, honed over 12 years at the forefront of software engineering and management. My approach is rooted in a deep commitment to product excellence and a people-first philosophy. I excel in creating and leading high-performing teams, nurturing a culture of innovation, and driving product-centric strategies. My leadership is characterized by a keen understanding of the interplay between technology, team dynamics, and business objectives, ensuring the delivery of exceptional results in fast-paced environments.")]

          [:p (str "Beyond the technical spectrum, my passion extends to sustainable brands. When not immersed in code or steering my team toward our next milestone, you can find me on the ski slopes, trekking trails, or pursuing my passion for the gym 🏄‍♂️")]

          [:h2 "Articles 💡"]
          [:p "I share my experiences and thoughts on LinkedIn. Here are some of my recent articles"]

          [:ul
            [:li [:a {:href "https://www.linkedin.com/pulse/personal-profile-model-andrii-bovsunovskyi"} "Personal Profile Model"]]
            [:li [:a {:href "https://www.linkedin.com/pulse/technical-debt-feature-cost-andrii-bovsunovskyi"} "Technical Debt: The Feature Cost"]]
            [:li [:a {:href "https://www.linkedin.com/pulse/personal-handbook-andrii-bovsunovskyi"} "Personal Handbook"]]]]]]])
