(require '[criterium.core :refer [quick-bench]]) ; <1>
(require '[clojure.string :as s])

(def contacts "Contact us: support@manning.com or 203-626-1510") ; <2>

(let [s contacts]
  (quick-bench (s/index-of s "support@manning.com")))
;; Execution time mean : 16.570516 ns

(let [s contacts
      re #"support@manning.com"]
  (quick-bench (re-find re s)))
;; Execution time mean : 345.104914 ns ; <3>

(let [s contacts]
  (quick-bench (s/includes? s "support@manning.com")))
;; Execution time mean : 18.364512 ns