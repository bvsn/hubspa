(ns cljs.site.component)


(defn menu []
  [:div.b-container
    [:div.col-xs-12.b-header__contacts.b-wrapper
      [:ul.h-f-r
        [:li.h-f-l.h-mr-15
          [:a.b-header__link.b-header__link_color_grey {:href "tel:380638485100"}
            "+38 (063) 84-85-100"]]

        [:li.h-f-l
          [:a.b-header__link.b-header__link_color_grey {:href "mailto:an.bvsn@gmail.com"}
            "an.bvsn@gmail.com"]]]]
    [:hr]

    [:div.col-xs-12.b-header__menu
      [:ul.b-menu.col-center
        [:li.b-menu__item
          [:a.b-menu__link {:href "#!/"} "About"]]

        [:li.b-menu__item.h-ml-20
          [:a.b-menu__link {:href "#!/cv"} "CV"]]]]])

(defn about []
  [:div
    [:p "Hello, I'm Andrii Bovsunovskyi."]

    [:p (str "Software developer with 8 years of experience in web-development, creating projects "
             "from scratch, team management and high load systems.")]

    [:p (str "I prefer to work in the small companies that create useful things. My goal is to "
             "create software that will help to solve/optimize people's tasks. Today I either "
             "assist such companies or create them by myself :)")]])

(defn cv []
  [:div
    [:p (str "Like any other experienced developer, I have extensive knowledge of different "
             "technologies and programming languages. I try to follow the principle: each problem "
             "should be solved with the specific technology and approach. Currently, I am freely "
             "with such technologies: Python, JavaScript, Clojure, ClojureScript.")]

    [:p.h-ta-c "..."]
  ])
