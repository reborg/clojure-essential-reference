(def ^:dynamic *debug*)

(defn debug [msg] ; <1>
  (when (and (thread-bound? #'*debug*) *debug*)
     (println "Debugging..." msg)))

(binding [*debug* true] ; <2>
  (.start (Thread. #(debug "from a thread."))))
;; nil

(binding [*debug* true] ; <3>
  (.start (Thread. (bound-fn* #(debug "from a thread.")))))
;; Debugging... from a thread.
;; nil