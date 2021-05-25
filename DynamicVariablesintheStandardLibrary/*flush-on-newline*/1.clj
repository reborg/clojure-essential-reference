(binding [*flush-on-newline* false]
  (doseq [x (range 500)]
    (Thread/sleep 100)
    (println "Logging " x))) ; <1>
;; "Logging 0"
;; "Logging 1"
;; [...]
;; "Logging 84"
;; "Logging 85"
;; [...]
;; Logging 499