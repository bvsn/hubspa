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

    [:p (str "I enjoy working in small companies that create useful things. "
             "My goal is to create software that will help to solve/optimize people's "
             "tasks. Today I either assist such companies or create them by myself :)")]])

(defn cv []
  [:div
    [:p (str "Like any other experienced developer I have extensive knowledge in "
             "different technologies and programming languages. In my training "
             "and self-development I try to follow the principle: 2 years for "
             "learning one language. Currently I am freely with such technologies: "
             "Python, JavaScript, Clojure, ClojureScript, Erlang.")]

    [:p (str "Yep, I said that 2 years for one language, but had written 4 "
             "different languages. It's all overtimes :) During the last 3 years "
             "from time to time I do my pet projects with the Erlang. "
             "I really like it, but I have used it only once before in my work. I hope "
             "I will have the opportunity to work with it in any future project.")]

    [:p.h-ta-c "..."]
  ])
