(defproject hubspaclj "1.0"
  :description "hubspa"
  :url "https://bvsn.github.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/clojurescript "1.9.946"]

                 [reagent "0.8.0-alpha2"]
                 [secretary "1.2.3"]
                 [lein-cljsbuild "1.1.7"]

                 [mount "0.1.11"]
                 [garden "1.3.3"]
                 [hiccup "1.0.5"]
                 [compojure "1.6.0"]
                 [org.immutant/web "2.1.10"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-devel "1.6.3"]]

  :plugins [[lein-ring "0.12.3"]
            [lein-cljsbuild "1.1.7"]
            [lein-garden "0.3.0"]]

  :clean-targets ^{:protect false} [
    "resources/public/js"
    "resources/public/css"
  ]

  :aliases {"dev" ["with-profile" "dev" "run"]
            "deploy" ["do" "clean" ["uberjar"]]

            "js-prod" ["cljsbuild" "once" "prod"]
            "js-watch" ["cljsbuild" "auto" "dev"]
            "js-compile" ["cljsbuild" "once" "dev"]}

  :hooks [leiningen.cljsbuild]

  :profiles {;; activated automatically during uberjar
             :uberjar {:aot :all
                       :omit-source true
                       :uberjar-name "hubspa.jar"}}

  :garden {:builds
            [{:id "site"
              :stylesheet clj.styles.site/styles
              :source-paths ["src"]
              :compiler {:output-to "resources/public/css/site.css"
                         :pretty-print? false
                         :vendors ["webkit" "moz" "o" "ms"]}}]}

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

  :main server)
