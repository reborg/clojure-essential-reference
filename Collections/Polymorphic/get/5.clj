(get (sorted-map :a 1 :b 2) :c "not-found")     ; <1>
;; "not-found"

(get (sorted-map :a 1 :b 2) "c" "not-found")    ; <2>
;; ClassCastException clojure.lang.Keyword cannot be cast to java.lang.String