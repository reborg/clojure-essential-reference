(definline timespi [x] `(* ~x 3.14)) ; <1>
(alter-var-root #'timespi (fn [_] (constantly 1))) ; <2>
(timespi 100) ; <3>
;; 314.0

(alter-meta! #'timespi dissoc :inline-arities :inline) ; <4>
(timespi 100) ; <5>
;; 1