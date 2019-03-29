(definline timespi [x] `(* ~x 3.14)) ; <1>
(alter-var-root #'timespi (fn [_] (constantly 1))) ; <2>
(timespi 10) ; <3>
;; 31.400002

(alter-meta! #'timespi dissoc :inline-arities :inline) ; <4>
(timespi 10)
;; 1