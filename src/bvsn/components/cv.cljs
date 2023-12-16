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
              [:p.b-work-place__text "Led the development of a scalable, robust new version of the product, focusing on team efficiency and product scalability. Implemented Agile methodologies, enhancing team productivity and accelerating product development."]

              [:br]

              [:p.b-work-place__text "Technologies: Python, FastAPI, SQLModel, AsyncPG, React, React Query, PostgreSQL, AWS, Docker, GitHub Actions, IaC"]
              [:p.b-work-place__text "Keywords: Leadership, Team Restructuring, Agile Methodologies, Innovation Management, Product Development, Efficiency Improvement"]

              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Achieved a complete product revamp, emphasizing scalability and robustness"]
                [:li "Implemented efficient team structures and workflows, enhancing overall productivity"]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://justin.ua" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/justin.png"}]
                    [:figcaption "Justin"]]]
                [:p.b-work-place__period "Jul 2021 – Mar 2022"]]
              [:p.b-work-place__position "CTO"]
              [:p.b-work-place__text
                (str "Transformed organization structure into agile squads, enhancing team performance and reducing time-to-market. Collaborated closely with cross-functional departments to align technology with business KPIs, significantly improving company profits. Unfortunately, the war halted this process.")]

              [:br]

              [:p.b-work-place__text
                (str "Technologies: IoT, Node.js, Python, PHP, C#, GCP, React, PostgreSQL, GCP, Docker, Kubernetes, GitHub Actions, GitOps, IaC")]
              [:p.b-work-place__text "Keywords: Organizational Transformation, Agile Leadership, Cloud Migration, Technology Strategy, Business Alignment, Profitability Enhancement"]

              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Improved collaboration and cross-communication between completely different 5 in-house products"]
                [:li "I've reduced cash burn by 15% and increased teams velocity up to 50%"]
                [:li "Led significant cloud migration and data governance projects, aligning technology with business objectives"]
                [:li "Formed a 50-member development team in close collaboration with non-development departments (CPO, Marketing, Sales, Support)"]
                [:li "Drastically improved the stability and performance of the core product"]]]

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
                (str "Guided the company's technological growth from startup to a major player with over 6000 clients. Focused on team building and professional development, growing the engineering team to 20 members and driving key business metrics. I returned to Orderry to boost its growth and global expansion in May 2020. Currently, it's a completely autonomous, highly motivated team.")]

              [:br]
              [:p.b-work-place__text "Technologies: Python, Django, PyTest, JavaScript, Erlang, React, RabbitMQ, PostgreSQL, Redis, Celery, Protobuf, DigitalOcean, Docker, Kubernetes, GitHub Actions, Jenkins"]
              [:p.b-work-place__text "Keywords: Startup Growth, Team Expansion, Professional Development, Engineering Leadership, Business Metrics Improvement"]

              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "I've built the project from MVP to production that has more than 6000 paid clients"]
                [:li "The development department grew up from 0 up to 20 engineers"]
                [:li "Very close work with the business KPI to achieve a better company profit"]
                [:li "Was involved in increasing the ARPU, LTV, and MAU metrics from early adopters to enterprise clients"]]]

           [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:figure.la-fx.fx-ai-b
                  [:img.b-work-place__logo {:src "/images/agro-online.svg"}]]
                [:p.b-work-place__period "Jan 2019 – Jan 2020"]]
              [:p.b-work-place__position "CTO"]
              [:p.b-work-place__text "Reengineered legacy systems for scalability and performance. Built and led a 12-person engineering team, fostering a culture of innovation and cross-departmental collaboration."]
              [:br]
              [:p.b-work-place__text "Python, Django, PyTest, VueJS, TurfJS, WebGL, Mapbox, RabbitMQ, PostgreSQL, PostGIS, Celery"]
              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Have built a team from 2 to 12 engineers and improve cross-department collaboration"]
                [:li "Technological vision with the whole system design was implemented"]]]

            [:section.b-work-place
              [:div.la-fx.fx-jc-sb.fx-ai-c
                [:a.b-work-place__link {:href "https://fex.net" :target "_blank"}
                  [:figure.la-fx.fx-ai-b
                    [:img.b-work-place__logo {:src "/images/fex.png"}]
                    [:figcaption "FEX.NET"]]]
                [:p.b-work-place__period "Dec 2017 – Jan 2019"]]
              [:p.b-work-place__position "Head of Web Development"]
              [:p.b-work-place__text "Managed backend and frontend teams, focusing on inter-team communication and integration. Achieved a major technological overhaul, contributing to substantial growth in user engagement and data storage capabilities."]
              [:br]
              [:p.b-work-place__text "Technologies: Python, Flask, PyTest, ReactJS, Go, RabbitMQ, PostgreSQL, Redis, etcd, Celery"]
              [:p.b-work-place__text "Keywords: Team Management, Inter-Team Collaboration, Technological Transition, Platform Scalability, User Engagement Enhancement"]
              [:br]
              [:p.b-work-place__text "Achievements:"]
              [:ol
                [:li "Data storage - 10PB. Completely updated product during 16 months"]
                [:li "Made restructuring of the teams, most of the teammates were hired by myself. Managed two teams of 20 people overall"]
                [:li "Have completely rebuilt the application from Perl to Go, Python, JS on the fly (10m MAU)"]]]

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
