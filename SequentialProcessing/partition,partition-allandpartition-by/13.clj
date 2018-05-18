(import '[java.time Duration Instant]
        '[java.time.format DateTimeFormatter]
        '[java.time.temporal TemporalAccessor])

(def events [{:t "2017-05-04T13:08:57Z" :msg "msg1"}  ; <1>
             {:t "2017-05-04T13:09:52Z" :msg "msg2"}
             {:t "2017-05-04T13:11:03Z" :msg "msg3"}
             {:t "2017-05-04T23:13:10Z" :msg "msg4"}
             {:t "2017-05-04T23:13:23Z" :msg "msg5"}])

(defn ->inst [{t :t}] ; <2>
  (Instant/from
    (.parse (DateTimeFormatter/ISO_INSTANT) t)))

(defn burst? [t1 t2]  ; <3>
  (let [diff (.getSeconds (Duration/between (->inst t2) (->inst t1)))]
    (<= (Math/abs diff) 120)))

(partition-with burst? events) : <4>

;; (({:t "2017-05-04T13:08:57Z", :msg "msg1"}
;;   {:t "2017-05-04T13:09:52Z", :msg "msg2"})
;;  ({:t "2017-05-04T13:11:03Z", :msg "msg3"})
;;  ({:t "2017-05-04T23:13:10Z", :msg "msg4"}
;;   {:t "2017-05-04T23:13:23Z", :msg "msg5"}))