;; == Service definition == ; <1>
;; Wireless MXD CXP  ; header: kind & codes
;; ClassA 34.97 34.5 ; metric: name & measures
;; ClassT 11.7 11.4  ; metric: name & measures
;; ClassH 0.7 0.4    ; metric: name & measures

(def scanner-input ; <2>
  [["Communication services version 2"]
   ["Radio controlled:" "Enabled"]
   ["Ack on transmission" "Enabled" ""]
   ["TypeA"]
   ["East" "North" "South" "West"]
   ["10.0" "11.0" "12.0" "13.0"]
   ["Wireless" "MXD" ""]
   ["ClassA" "34.97" "" "34.5"]
   ["ClassB" "11.7" "11.4"]
   ["Unreadable line"]
   ["North" "South" "East" "West"]
   ["10.0" "11.0" "12.0" "13.0"]
   ["Wired" "QXD"]
   ["ClassA" "34.97" "33.6" "34.5"]
   ["ClassC" "11.0" "11.4"]])