(def orig
  {:defproject :prj1
   :description "the prj"
   :url "https://theurl"
   :license {:name "EPL"
             :url "http://epl-v10.html"}
   :dependencies {:dep1 "1.6.0"
                  :dep2 "1.0.13"
                  :dep6 "1.7.5"}
   :profiles {:uberjar {:main 'some.core :aot "all"}
              :dev {:dependencies {:dep8 "1.6.3"}
                    :plugins {:dep9 "3.1.1" :dep11 {:id 13}}}}})