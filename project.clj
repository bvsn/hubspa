(defproject hubspaclj "0.1.0"
  :description "hubspa"
  :url "https://bvsn.github.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.385"]
                 [org.clojure/clojurescript "1.9.89"]

                 [reagent "0.6.0-rc"]

                 [secretary "1.2.3"]

                 [lein-cljsbuild "1.1.3"]

                 [hiccup "1.0.5"]
                 [environ "1.0.3"]
                 [http-kit "2.1.19"]
                 [compojure "1.5.1"]]

  :plugins [[lein-ring "0.9.7"]
            [lein-environ "1.0.3"]
            [lein-cljsbuild "1.1.3"]]

  :clean-targets ^{:protect false} [
    "resources/public/js"
    "resources/public/css"
  ]

  :ring {:handler hubspa/app}

  :aliases {"dev" ["with-profile" "dev" "ring" "server-headless" "8000"]

            "js-prod" ["cljsbuild" "once" "prod"]
            "js-watch" ["cljsbuild" "auto" "dev"]
            "js-compile" ["cljsbuild" "once" "dev"]}

  :profiles {:dev {:env {:origin "http://example.com:8000"
                         :public-path "resources/public"}}

             :prod {:env {:origin "http://hubspa.ru"
                          :public-path "resources/public"}}}

  :hooks [leiningen.cljsbuild]

  :cljsbuild {:builds
              [{:id "dev"

                :source-paths ["src/cljs"]

                :compiler {:output-to "resources/public/js/site.js"
                           :output-dir "resources/public/js"
                           :optimizations :whitespace
                           :source-map-timestamp true}}

               {:id "prod"
                :source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/site.js"
                           :output-dir "resources/public/compiled"
                           :optimizations :advanced
                           :elide-asserts true
                           :warnings false
                           :output-wrapper false
                           :pretty-print false}} ]}

  :main hubspa)
