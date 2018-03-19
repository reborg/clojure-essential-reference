(def signed-up ; <1>
  "Jack 221 610-5007 (call after 9pm) Anna 221 433-4185,
   Charlie 661 471-3948, Hugo 661 653-4480 (busy on Sun),
   Jane 661 773-8656, Ron 555 515-0158")

(let [people (re-seq #"(\w+) (\d{3}) \d{3}-\d{4}" signed-up)] ; <2>
  {:names (map second people) :area (map last people)}) ; <3>

;; {:names ("Jack" "Anna" "Charlie" "Hugo" "Jane" "Ron")
;;  :area ("221" "221" "661" "661" "661" "555")}