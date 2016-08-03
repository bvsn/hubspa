(ns cljs.site.view
  (:use [cljs.apps.ngun :only [shoot]])
  (:require [om.core :as om]

            [sablono.core :as html :refer-macros [html]]))


(defn menu [app owner]
  (om/component
    (html
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
              [:a.b-menu__link {:href "#!/apps"} "Apps"]] ]]])))

(defn about [app owner]
  (om/component
    (html [:p "Hello, I'm Andrew Bovsunovskiy."])))

(defn apps [app owner]
  (shoot))

(defn cv [app owner]
  (om/component
    (html [:p "cv"])))
