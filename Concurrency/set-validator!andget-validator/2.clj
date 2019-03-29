(def a (atom 1))

(defn- should-be-positive [x] ; <1>
  (if (pos? x)
    x
    (throw
      (ex-info (format "%s should be positive" x)
        {:valid? (pos? x)
         :value x
         :error "Should be a positive number"
         :action "State hasn't changed"}))))

(set-validator! a should-be-positive)

(swap! a dec) ; <3>
;; ExceptionInfo 0 should be positive

(try (swap! a dec)
  (catch Exception e (ex-data e))) ; <4>
;; {:valid? false,
;;  :value 0,
;;  :error "Should be a positive number",
;;  :action "State hasn't changed"}