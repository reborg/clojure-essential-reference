(require '[clojure.main :as main])

(def repl-options
  [:prompt #(printf "enter expression :> ")
   :read   (fn [request-prompt request-exit] ; <1>
             (or ({:line-start request-prompt :stream-end request-exit} ; <2>
                  (main/skip-whitespace *in*))
                  (re-find #"^(\d+)([\+\-\*\/])(\d+)$" (read-line)))) ; <3>
   :eval   (fn [[_ x op y]] ; <4>
             (({"+" + "-" - "*" * "/" /} op)
              (Integer. x) (Integer. y)))])

(apply main/repl repl-options)

;; enter expression :> 2*3 ; <5>
;; 6
;; click ctrl+d to exit calculator