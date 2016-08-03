(ns cljs.site.component)


(defn menu []
  [:div.b-container
    [:div.col-xs-12.b-header__contacts.b-wrapper
      [:ul.h-f-r
        [:li
          [:a.hb-header__link.b-header__link_color_grey {:href "mailto:an.bvsn@gmail.com"}
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
  [:p "Hello, I'm Andrew Bovsunovskiy."])

(defn cv []
  [:p "cv"])
