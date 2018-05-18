(macroexpand '(while (> 0.5 (rand))
  (println "loop")))

;; (loop* [] (when (> 0.5 (rand))
;;   (println "loop") (recur)))