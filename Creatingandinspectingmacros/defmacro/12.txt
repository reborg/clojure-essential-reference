(defmacro just-print-me [& args] ; <1>
  (println &form)

(just-print-me foo :bar 123)     ; <2>
;; (just-print-me foo :bar 123)
;; nil