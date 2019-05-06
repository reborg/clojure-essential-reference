(try
  (/ 1 0)
  (catch Exception e ; <1>
    (throw
      (ex-info "Don't do this."
        {:type "Math"
         :recoverable? false} e)))) ; <2>

;; ArithmeticException Divide by zero