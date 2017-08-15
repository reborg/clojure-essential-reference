(macroexpand-1 '(when (= 1 2) (println "foo")))

;; (if (= 1 2)             ; <1>
;;   (do (println "foo")))

(when (= 1 2)              ; <2>
  (println "foo"))

;; nil