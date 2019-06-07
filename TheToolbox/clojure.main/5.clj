(require '[clojure.main :as main])

(def repl-options
  [:init   #(require '[calculator :refer :all])
   :prompt #(printf "enter expression :> ")])

(apply main/repl repl-options)

;; enter expression :> (+ 1 1) ; <1>
;; 2