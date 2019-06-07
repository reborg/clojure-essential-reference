(def ex ; <1>
  (ex-info "Problem." {:status :surprise}
    (try (/ 1 0)
    (catch Exception e
      (ex-info "What happened?" {:status :unkown} e)))))

(pst ex 3) ; <2>

;; ExceptionInfo Problem. {:status :surprise}
;;         clojure.core/ex-info (core.clj:4617)
;;         clojure.core/ex-info (core.clj:4617)
;;         clojure.lang.Compiler$InvokeExpr.eval (Compiler.java:3652)
;; Caused by:
;; ExceptionInfo What happened? {:status :unkown}
;;         clojure.core/ex-info (core.clj:4617)
;;         clojure.core/ex-info (core.clj:4617)
;;         user/fn--2169 (form-init4179141376169992155.clj:5)
;; Caused by:
;; ArithmeticException Divide by zero
;;         clojure.lang.Numbers.divide (Numbers.java:158)
;;         clojure.lang.Numbers.divide (Numbers.java:3808)