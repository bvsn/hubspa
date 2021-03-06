(ns bvsn.components.cv)

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container
        [:article.b-cv
          [:div
            [:span.b-cv__name "Andrii Bovsunovskyi"]
            [:br]
            [:div.b-cv__contacts
              [:span "Kyiv UA ● +38(063)84-85-100"]
              [:span "an.bvsn@gmail.com"]]]

          [:h4.h-mt-30 "Experience"]
          [:hr]

          [:div
            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/orderry.png"}]
                  [:figcaption "РемОнлайн"]]
                [:div
                  [:p.b-work-place__period "May 2020 – Present"]
                  [:p.b-work-place__period "Dec 2013 – Sep 2017"]]]
              [:p.b-work-place__position "CTO, co-owner"]
              [:p.b-work-place__text
                (str "I grew up from the first engineer to CTO. I’ve done all the "
                  "job that good manager and engineer should do 😏")]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "I've built the project from MVP to production that has more than 6000 paid clients"]
                [:li "The development department grew up from 0 up to 20 engineers"]]]

           [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/agro-online.svg"}]
                  [:figcaption "AgroOnline"]]
                [:p.b-work-place__period "Jan 2019 – Jan 2020"]]
              [:p.b-work-place__position "CTO"]
              [:p.b-work-place__text
                (str "Responsible for most of the technological aspects of the company. I have been "
                "fighting with the analog for the favor of digital.")]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Have built a command from 2 to 12 engineers"]
                [:li "Technological vision with the whole system design was partially implemented"]
                [:li "Spread technology advantages through all the company departments"]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/fex.png"}]
                  [:figcaption "FEX.NET"]]
                [:p.b-work-place__period "Dec 2017 – Jan 2019"]]
              [:p.b-work-place__position "Head of Web Development"]
              [:p.b-work-place__text
                (str "Responsible for communication between backend API and several other products "
                "such as mobile and tv apps, infrastructure services etc. I’ve managed two teams of "
                "backend and frontend with their own Team Leads.")]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Managed two teams of 14 people overall"]
                [:li "Have completely rebuilt application from Perl to Go, Python, JS on the fly"]
                [:li "Made restructuring of the team, most of the staff were hired by me."]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/evo.png"}]
                  [:figcaption ""]]
                [:p.b-work-place__period "Sep 2011 – May 2013"]]
              [:p.b-work-place__position "Software Engineer"]
              [:p.b-work-place__text
                (str "First hard engineering experience of the full stack web developer. I was involved "
                  "in all things from the low-level backend features to the UI pages.")]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Built a frontend team together with my Team Lead"]
                [:li "Wrote tons of code that still works until nowadays"]
                [:li "Worked in small teams on the refactoring of various parts of the platform."]]]]

          [:h4.h-mt-30 "Education"]
          [:hr]

          [:p (str "2007 — 2012 Taras Shevchenko National University of Kyiv, Faculty of Cybernetics, "
            "Department of Theoretical Cybernetics.")]]]]])
