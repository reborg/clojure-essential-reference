(definline timespi [x]                                ; <1>
  `(* ~x 3.14))

(timespi 3)                                           ; <2>
;; 9.42

(macroexpand-1 '(definline timespi [x] `(* ~x 3.14))) ; <3>

;; after removing core namespaces

;; (do
;;   (defn timespi [x]                                ; <4>
;;     (* x 3.14))
;;   (alter-meta! (var timespi)                       ; <5>
;;                assoc :inline
;;                (fn timespi [x]
;;                  (seq
;;                    (concat (list (quote *))
;;                            (list x)
;;                            (list 3.14)))))
;;   (var timespi))