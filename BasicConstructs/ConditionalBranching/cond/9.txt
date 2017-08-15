(doseq [n (filter even? (range 10000))]
  (do (println n)
      (clojure.walk/macroexpand-all           ; <1>
        `(cond ~@(take n (repeat false))))))

;; ...
;; ...
;; 2040
;; 2042
;; 2044

;; StackOverflowError   clojure.lang.Compiler.macroexpand1 (Compiler.java:6767)