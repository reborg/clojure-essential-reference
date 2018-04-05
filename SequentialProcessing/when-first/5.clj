(println (with-out-str (clojure.pprint/write ; <1>
  (macroexpand
    '(when-first [x coll] (println x))))))

;; (let* [temp_123 (seq coll)] ; <2>
;;  (when temp_123
;;   (let [xs_123 temp_123]
;;    (let [x (first xs_123)] ; <3>
;;     (println x)))))