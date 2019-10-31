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

          [:p (str "Software engineer with 8 years of experience in web development,
            creating projects from scratch, team management, and high load systems.")]

          [:p (str "I prefer to work in small companies that create useful things. My "
            "goal is to create software that will help to solve or optimize any tasks. Today I "
            "either assist such companies or create them by myself.")]

          [:p (str "Like any other experienced software engineer, I have extensive knowledge of "
            "different technologies and programming languages. I try to follow the principle: each "
            "problem should be solved with the specific technology and approach. Currently, I'm "
            "fluent in the following technologies: Python, JavaScript, Clojure, ClojureScript. But "
            "my main goal is to become a perfect manager of a whole IT department of the company "
            "with a focus on technologies and self-sufficient processes.")]]

        [:figure {
          :class @figure-class
          :on-click #(swap! figure-class other-class)
          }]]]])
