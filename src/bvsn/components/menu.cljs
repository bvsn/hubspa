(ns bvsn.components.menu)

(defn component []
  [:ul.b-menu.b-menu_pos_fixed
    [:li.b-menu__item.b-bvsn
      [:a.b-menu__link.b-bvsn__logo {:href "/"} "b"]]

    [:li.b-menu__item
      [:a.b-menu__link {:href "/about"} "About"]]

    [:li.b-menu__item
      [:a.b-menu__link {:href "/cv"} "CV"]]])
