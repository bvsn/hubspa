(ns bvsn.components.about)

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container.la-fx.fx-d-column
        [:article.b-about
          [:h2 "A brief overview of Andrii Bovsunovskyi"]

          [:p (str "Software engineer with 8 years of experience in web-development,
            creating projects from scratch, team management, and high load systems.")]

          [:p (str "I prefer to work in small companies that create useful things. My "
            "goal is to create software that will help to solve or optimize any tasks. Today I "
            "either assist such companies or create them by myself.")]

          [:p (str "Like any other experienced software engineer, I have extensive knowledge of "
            "different technologies and programming languages. I try to follow the principle: each "
            "problem should be solved with the specific technology and approach. Currently, I'm "
            "fluent in the following technologies: Python, JavaScript, Clojure, ClojureScript. But "
            "my main goal is to become a perfect manager of a whole IT department of the company "
            "with the focus on technologies and self-sufficient processes.")]]

        [:figure.b-about__clj]]]])
