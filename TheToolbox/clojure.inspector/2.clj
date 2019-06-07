(require '[clojure.inspector :refer [inspect-table]]) ; <1>

(def events [{:time "2017-05-04T13:08:57Z" :msg "msg1"} ; <2>
             {:time "2017-05-04T13:09:52Z" :msg "msg2"}
             {:time "2017-05-04T13:11:03Z" :msg "msg3"}
             {:time "2017-05-04T23:13:10Z" :msg "msg4"}
             {:time "2017-05-04T23:13:23Z" :msg "msg5"}])

(inspect-table events)