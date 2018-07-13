(ns bvsn.components.menu)


(defn component []
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
          [:a.b-menu__link {:href "/"} "About"]]

        [:li.b-menu__item.h-ml-20
          [:a.b-menu__link {:href "/cv"} "CV"]]]]])
