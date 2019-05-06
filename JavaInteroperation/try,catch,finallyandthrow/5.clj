(try
  (/ 1 0)
  (catch Exception e "Returning from catch") ; <1>
  (finally (println "Also executing finally"))) ; <2>
;; Also executing finally
;; "Returning from catch"