(defn randomly-recoverable-operation [] ; <1>
  (throw
    (ex-info "Weak connection."
      {:type :connection
       :recoverable? (< 0.3 (rand))})))

(defn main-program-loop []
  (try
    (println "Attempting operation...")
    (randomly-recoverable-operation)
    (catch Exception e
      (let [{:keys [type recoverable?]} (ex-data e)] ; <2>
        (if (and (= :connection type) recoverable?)
          (main-program-loop)
          (ex-info "Not recoverable problem."
            {:type :connection} e))))))

(main-program-loop) ; <3>

;; Attempting operation...
;; Attempting operation...
;; #error {
;;  :cause "Weak connection."
;;  :data {:type :connection, :recoverable? false}
;;  :via
;;  [{:type clojure.lang.ExceptionInfo
;;    :message "Not recoverable problem."
;;    :data {:type :connection}
;;    :at [clojure.core$ex_info invokeStatic "core.clj" 4617]}
;;   {:type clojure.lang.ExceptionInfo
;;    :message "Problem."
;;    :data {:type :connection, :recoverable? false}
;;    :at [clojure.core$ex_info invokeStatic "core.clj" 4617]}]