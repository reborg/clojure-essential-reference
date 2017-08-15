(defmacro deffexpr [name args & body]
  `(defmacro ~name ~args (list 'quote (do ~@body))))

(deffexpr if-pos [test then else]
  (if (pos? (eval test))
    (eval then)
    (eval else)))

(if-pos 1 (println "pos") (println "neg"))
;; pos
;; nil