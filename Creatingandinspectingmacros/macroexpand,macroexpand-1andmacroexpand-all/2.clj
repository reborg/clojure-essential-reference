(macroexpand-1 '(when false (println "this will never be printed!")))
;; (if false (do (println "this will never be printed!")))