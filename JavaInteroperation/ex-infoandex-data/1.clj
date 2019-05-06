(def ex
  (ex-info "Temperature drop!" ; <1>
    {:time "10:29pm"
     :reason "Front door open."
     :mitigation #(println "close the door")}))

(type ex) ; <2>
;; clojure.lang.ExceptionInfo