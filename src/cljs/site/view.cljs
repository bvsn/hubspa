(ns cljs.site.view
  (:require [om.core :as om]

            [sablono.core :as html :refer-macros [html]]))


(defn menu [app owner]
  (om/component
    (html
      [:div.b-container
        [:ul.b-menu.h-clear
          [:li.b-menu__item
            [:a {:href "#!/"} "About"]]

          [:li.b-menu__item.h-ml-20
            [:a {:href "#!/cv"} "CV"]]

          [:li.b-menu__item.h-ml-20
            [:a {:href "#!/apps"} "Apps"]]]])))

(defn about [app owner]
  (om/component
    (html [:p "Hello, I'm Andrew Bovsunovskiy."])))

(defn apps [app owner]
  (om/component
    (html [:p "apps"])))

(defn cv [app owner]
  (om/component
    (html [:p "cv"])))
