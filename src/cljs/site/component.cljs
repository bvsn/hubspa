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
          [:a.b-menu__link {:href "#!/cv"} "CV"]]

        [:li.b-menu__item.h-ml-20
          [:a.b-menu__link {:href "#!/apps"} "Apps"]]]]])

(defn about []
  [:div
    [:p "Hello, I'm Andrew Bovsunovskiy."]

    [:p (str "Software developer with 6 years of experience in web developing, "
             "creating projects from scratch, team management, high load systems.")]

    [:p (str "I enjoy working in a small companies that create useful things. "
             "My goal is to create software that will help solve/optimize people tasks. "
             "Today I or assist such companies or itself creates such :)")]])

(defn cv []
  [:div
    [:p (str "Like any other experienced developer I have extensive knowledge in "
             "different technologies and programming languages. In my training "
             "and development I try to follow the principle: 2 years for one language. "
             "Currently I am freely with such technologies: Python, JavaScript, "
             "Clojure, ClojureScript, Erlang.")]

    [:p (str "Yep of course, I said that 2 years for one language, but wrote a 4 "
             "different languages. It's all overtimes :) During the last 3 years, "
             "from time-to-time I'm doing my pet projects with the Erlang. "
             "I really like him, but I only once used it in my work. I hope that "
             "I will have the opportunity to work with him in any future project.")]

    [:p.h-ta-c "..."]
  ])
