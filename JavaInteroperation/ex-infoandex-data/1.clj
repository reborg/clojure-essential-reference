(def ex
  (ex-info "Temperature drop!" ; <1>
    {:time "10:29pm"
     :reason "Front door open."
     :mitigation #(println "close the door")}))

(type ex) ; <2>
;; clojure.lang.ExceptionInfo

ex ; <3>

;; #error {
;;  :cause "Temperature drop!"
;;  :data {:time "10:29pm", :reason "Front door open.",
;;         :mitigation #object[user$fn__1569 0x1ef43242]}
;;  :via
;;  [{:type clojure.lang.ExceptionInfo
;;    :message "Temperature drop!"
;;    :data {:time "10:29pm", :reason "Front door open.",
;;           :mitigation #object[user$fn__1569 0x1ef43242]}
;;    :at [clojure.core$ex_info invokeStatic "core.clj" 4617]}]
;;  :trace
;;  [[clojure.core$ex_info invokeStatic "core.clj" 4617]
;;   [...]
;;   [java.lang.Thread run "Thread.java" 748]]}
