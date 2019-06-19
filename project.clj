(defproject tentacles "0.5.3-SNAPSHOT"
  :description "A library for working with the Github API."
  :url "https://github.com/clojure-garden/tentacles"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.10.0"]
                 [cheshire "5.8.1"]
                 ;; url has been archieved
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/data.codec "0.1.1"]
                 [environ "1.1.0"]])
