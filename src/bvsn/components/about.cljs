(ns bvsn.components.about
  (:require [reagent.core :as r]))

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container.la-fx.fx-d-column
        [:article.b-about
          [:h2 "A brief overview of Andrii Bovsunovskyi"]

          [:p (str "Hello there 👋")]

          [:p (str "I'm a seasoned Software Engineer and Manager, boasting 12 years of hands-on experience in web development. My expertise lies in spearheading projects from conception to completion, overseeing departmental management, and engineering high-performance systems.")]

          [:p (str "My mission is to develop impactful software solutions through collaborative teamwork. I specialize in crafting CRM and ERP systems, as well as automating or streamlining various processes. I take pride in having successfully built and led cross-functional teams—spanning development, QA, and other departments—to achieve high-impact outcomes.")]

          [:p (str "As a versatile software engineer, I possess a comprehensive understanding of multiple technologies and programming languages. I adhere to the philosophy that each problem warrants a tailored technology and approach for its resolution. Currently, I'm proficient in Python, JavaScript, Clojure, and ClojureScript. However, my ultimate ambition is to hone my leadership skills and elevate my company's technological capabilities, aiming for market leadership.")]

          [:p (str "I firmly believe that achieving any significant milestones is contingent upon a skilled team and a conducive company culture. When the creativity of talented individuals is harnessed effectively, the results can be nothing short of explosive. 🏄‍♂️")

          [:h2 "Articles 💡"]
          [:p "I share my experiences and thoughts on LinkedIn. Here are some of my recent articles"]

          [:ul
            [:li [:a {:href "https://www.linkedin.com/pulse/personal-profile-model-andrii-bovsunovskyi"} "Personal Profile Model"]]
            [:li [:a {:href "https://www.linkedin.com/pulse/technical-debt-feature-cost-andrii-bovsunovskyi"} "Technical Debt: The Feature Cost"]]
            [:li [:a {:href "https://www.linkedin.com/pulse/personal-handbook-andrii-bovsunovskyi"} "Personal Handbook"]]]]]]]])
