(def ex (ex-info "Problem." {:status :surprise}))

(pst ex) ; <1>

;; ExceptionInfo Problem. {:status :surprise}
;;   clojure.core/ex-info (core.clj:4617)
;;   clojure.core/ex-info (core.clj:4617)
;;   clojure.lang.Compiler$InvokeExpr.eval (Compiler.java:3652)
;;   clojure.lang.Compiler$DefExpr.eval (Compiler.java:451)
;;   clojure.lang.Compiler.eval (Compiler.java:6932)
;;   clojure.lang.Compiler.eval (Compiler.java:6890)
;;   clojure.core/eval (core.clj:3105)
;;   clojure.core/eval (core.clj:3101)
;;   clojure.main/repl/read-eval-print--7408/fn--7411 (main.clj:240)
;;   clojure.main/repl/read-eval-print--7408 (main.clj:240)
;;   clojure.main/repl/fn--7417 (main.clj:258)
;;   clojure.main/repl (main.clj:258)

(pst ex 4) ; <2>

;; ExceptionInfo Problem. {:status :surprise}
;;         clojure.core/ex-info (core.clj:4617)
;;         clojure.core/ex-info (core.clj:4617)
;;         clojure.lang.Compiler$InvokeExpr.eval (Compiler.java:3652)
;;         clojure.lang.Compiler$DefExpr.eval (Compiler.java:451)