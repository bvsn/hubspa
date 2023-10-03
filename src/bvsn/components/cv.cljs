(ns bvsn.components.cv)

(defn component []
  [:div
    [:div.b-wrapper
      [:section.b-container
        [:article.b-cv
          [:div
            [:span.b-cv__name "Andrii Bovsunovskyi"]

            [:div.la-fx.fx-ai-c.fx-jc-sb
              [:div.b-cv__contacts
               [:a {:href "tel:+380638485100"} "Kyiv UA 🇺🇦 +38 (063) 84-85-100"]
               [:a.la-fx {:href "https://www.linkedin.com/in/anbvsn/" :target "_blank"}
                [:img.h-mr-5 {:src "images/linkedin.svg" :style {"width" "16px"}}] "LinkedIn"]
               [:a {:href "https://t.me/anbvsn" :target "_blank"}
                [:img.h-mr-5 {:src "images/telegram.svg" :style {"width" "16px"}}] "t.me/anbvsn"]
               [:a {:href "mailto:an.bvsn@gmail.com"}
                [:img.h-mr-5 {:src "images/gmail.svg" :style {"width" "16px"}}] "an.bvsn@gmail.com"]]

              [:figure.la-fx.fx-ai-c
                [:img.b-cv__picture {:src "images/picture.png"}]
              ]]]

          [:h4 "Experience"]
          [:hr]

          [:div
            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://ordercast.io" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/ordercast.png"}]
                  [:figcaption "OrderCast"]]]
                [:p.b-work-place__period "Sep 2022 – Oct 2023"]]
              [:p.b-work-place__position "Head of Engineering"]
              [:p.b-work-place__text "OrderCast enables wholesalers to shift their B2B ordering process online by quickly transforming spreadsheets of product listings into an online shop."]
              [:p.b-work-place__text "I'm responsible for creating a new version of a top-notch product. As always, it would be scalable, robust, and incredibly fast."]

              [:br]

              [:p.b-work-place__text "Technologies: Python (FastAPI, SQLModel, AsyncPG), React (React Query), PostgreSQL"]
              [:p.b-work-place__text "Infrastructure: AWS, Docker, GitHub Actions, IaC"]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://justin.ua" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/justin.png"}]
                    [:figcaption "Justin"]]]
                [:p.b-work-place__period "Jul 2021 – Mar 2022"]]
              [:p.b-work-place__position "CTO"]
              [:p.b-work-place__text
                (str "My main focus was to transform a big and slow organization into fast and maneuverable squads to "
                  "improve commands performance and reduce time to market value. Unfortunately, the war stopped "
                  "this process.")]

              [:br]

              [:p.b-work-place__text
                (str "Technologies: Node.js, Python, PHP, C#, GCP, React, PostgreSQL")]
              [:p.b-work-place__text
                (str "Infrastructure: GCP, Docker, Kubernetes, GitHub Actions, GitOps, IaC")]

              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "I've reduced cash burn by a 15% and increase teams velocity up to 50%"]
                [:li "Roadmap for the cloud migration had been created and started"]
                [:li (str "Created a development team with close cooperation with other non-development departments "
                  "(CPO, Marketing, Sales, Support) to close their needs. Overall teams size - 45")]
                [:li "Dramatically improved stability and performance of the project"]
                [:li "Very close work with the business KPI to achieve a better company profit"]
                [:li "The basic Data Governance transformation has been started"]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
              [:a.b-work-place__link {:href "https://orderry.com" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/orderry.png"}]
                    [:figcaption "Orderry"]]]
                [:div
                  [:p.b-work-place__period "May 2020 – Jul 2021"]
                  [:p.b-work-place__period "Dec 2013 – Sep 2017"]]]
              [:p.b-work-place__position "CTO, co-owner"]
              [:p.b-work-place__text
                (str "I grew up from the first engineer to CTO. I’ve done all the "
                  "job that good manager and engineer should do 😏")]

              [:p.b-work-place__text
                (str "Came back to my company in the May of 2020 to boost its growth and world expansion.")

                (str "A big boost had been given to the tech team. Currently, it's a completely autonomous highly "
                  "motivated team. My job is done and I may go further.")]
              [:br]
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
              [:br]
              [:p.b-work-place__text
                (str "Technologies: Python 3.6, Django, PyTest, VueJS, TurfJS, WebGL, Mapbox, RabbitMQ, PostgreSQL, "
                  "PostGIS, Celery")]
              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Have built a command from 2 to 12 engineers"]
                [:li "Technological vision with the whole system design was partially implemented"]
                [:li "Spread technology advantages through all the company departments"]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://fex.net" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/fex.png"}]
                    [:figcaption "FEX.NET"]]]
                [:p.b-work-place__period "Dec 2017 – Jan 2019"]]
              [:p.b-work-place__position "Head of Web Development"]
              [:p.b-work-place__text
                (str "Responsible for communication between backend API and several other products "
                "such as mobile and tv apps, infrastructure services etc. I’ve managed two teams of "
                "backend and frontend with their own Team Leads.")]
              [:br]
              [:p.b-work-place__text
                (str "Technologies: Python 3.6, Flask, PyTest, ReactJS, Go, RabbitMQ, PostgreSQL, Redis, etcd, Celery")]
              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Data storage - 10PB"]
                [:li "Managed two teams of 20 people overall"]
                [:li "Have completely rebuilt application from Perl to Go, Python, JS on the fly (10m MAU)"]
                [:li "Made restructuring of the team, most of the staff were hired by me."]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://evo.company/en/" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/evo.png"}]
                    [:figcaption ""]]]
                [:p.b-work-place__period "Sep 2011 – May 2013"]]
              [:p.b-work-place__position "Software Engineer"]
              [:p.b-work-place__text
                (str "First hard engineering experience of the full stack web developer. I was involved "
                  "in all things from the low-level backend features to the UI pages.")]
              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Built a frontend team together with my Team Lead"]
                [:li "Wrote tons of code that still works until nowadays"]
                [:li "Worked in small teams on the refactoring of various parts of the platform"]]]]

          [:h4.h-mt-30 "Education"]
          [:hr]

          [:p (str "2007 — 2012 Taras Shevchenko National University of Kyiv, Faculty of Cybernetics, "
            "Department of Theoretical Cybernetics.")]]]]])
