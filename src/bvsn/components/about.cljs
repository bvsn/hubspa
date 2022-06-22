(ns bvsn.components.about
  (:require [reagent.core :as r]))

(def ^:const python-class "b-about__python")
(def ^:const clojure-class "b-about__clojure")

(def figure-class (r/atom python-class))

(defn- other-class [current]
  (if (= current python-class)
    clojure-class
    python-class))

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container.la-fx.fx-d-column
        [:article.b-about
          [:h2 "A brief overview of Andrii Bovsunovskyi"]

          [:p (str "Hi there 👋")]

          [:p (str "I'm a Software Engineer / Manager with 11 years of experience in web development, creating projects"
            "from scratch, department management, and high-performance systems.")]

          [:p (str "My goal is to create software in teams that will help to solve or optimize any tasks. Such as CRM "
            "systems on ERP or any kind of process automatization (or simplification system). Successfully built and "
            "led collaborative development, QA, and other departments teams to achieve high-impact results.")]

          [:p (str "Like any other experienced software engineer, I have extensive knowledge of different technologies "
            "and programming languages. I'm trying to follow the principle: each problem should be solved with a "
            "specific technology and approach. Currently, I'm fluent in the following technologies: Python, "
            "JavaScript, Clojure, ClojureScript. But my main goal is to improve my leadership skill and improve "
            "company technologies to achieve leading positions in the market.")]
            
          [:p (str "Any goals couldn't be achieved without an experienced team and proper company culture. The "
            "creativity of the talents should create explosive results 🏄‍♂️")]]

        [:figure {
          :class @figure-class
          :on-click #(swap! figure-class other-class)
          }]]]])
