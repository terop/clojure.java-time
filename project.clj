(defproject clojure.java-time "0.3.4-SNAPSHOT"
  :description "Clojure wrapper for Java 8 Time API"
  :url "http://github.com/dm3/clojure.java-time"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :scm {:name "git"
        :url "http://github.com/dm3/clojure.java-time"}
  :dependencies [[org.clojure/clojure "1.10.3" :scope "provided"]]
  :profiles {:dev {:dependencies [[criterium "0.4.6"]
                                  [com.taoensso/timbre "4.10.0"]
                                  [org.clojure/tools.namespace "1.2.0"]
                                  [joda-time/joda-time "2.10.13"]
                                  [org.threeten/threeten-extra "1.7.0"]]
                   :plugins [[lein-codox "0.10.3"]]
                   :codox {:namespaces [java-time java-time.repl]
                           :doc-files ["README.md" "CHANGELOG.md"]}
                   :source-paths ["dev"]
                   :global-vars {*warn-on-reflection* true}}
             :async-profiler
             {:jvm-opts ["-Djdk.attach.allowAttachSelf" "-XX:+UnlockDiagnosticVMOptions" "-XX:+DebugNonSafepoints"]
              :dependencies [[com.clojure-goes-fast/clj-async-profiler "0.5.1"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.8-three-ten-joda {:dependencies [[org.clojure/clojure "1.8.0"]
                                                 [org.threeten/threeten-extra "1.7.0"]
                                                 [joda-time/joda-time "2.10.13"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.9-three-ten-joda {:dependencies [[org.clojure/clojure "1.9.0"]
                                                 [org.threeten/threeten-extra "1.7.0"]
                                                 [joda-time/joda-time "2.10.13"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :1.10-three-ten-joda {:dependencies [[org.clojure/clojure "1.10.3"]
                                                  [org.threeten/threeten-extra "1.7.0"]
                                                  [joda-time/joda-time "2.10.13"]]}}
  :aliases {"test-all" ["do"
                        ["with-profile" "1.8:1.9:1.10:1.8-three-ten-joda:1.9-three-ten-joda:1.10-three-ten-joda" "test"]]})
