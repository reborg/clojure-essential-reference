(defn backoff! [attempt timeout] ; <1>
  (-> attempt
      (inc)
      (rand-int)
      (* timeout)
      (Thread/sleep)))

(defn frequently-failing! [] ; <2>
  (when-not (-> (range 30)
                (rand-nth)
                (zero?))
    (throw (Exception. "Fake IO Exception"))))

(defmacro with-backoff! ; <3>
  [{:keys [timeout max-attempts warning-after] :or {timeout 100}} & body]
  `(letfn [(warn# [level# n#] ; <4>
             (binding [*out* *err*]
               (println
                 (format "%s: expression %s failed %s times"
                         (name level#) '(do ~@body) n#))))] ; <5>
     (loop [attempt# 1] ; <6>
       (when (not= :success (try
                              ~@body
                              :success
                              (catch Exception e#)))
         (when (= ~warning-after attempt#)
           (warn# :WARN attempt#))
         (if (not= ~max-attempts attempt#)
           (do
             (backoff! attempt# ~timeout)
             (recur (inc attempt#)))
           (warn# :ERR attempt#))))))

(with-backoff! ; <7>
  {:timeout 10
   :max-attempts 50
   :warning-after 15}
  (frequently-failing!))

;; WARN : expression (do (frequently-failing!)) failed 15 times
;; nil