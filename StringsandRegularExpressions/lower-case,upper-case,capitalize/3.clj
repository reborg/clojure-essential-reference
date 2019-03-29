(def names
  ["john abercrombie"
   "Brad mehldau"
   "Cassandra Wilson"
   "andrew cormack"])

(sequence
  (comp
    (mapcat #(s/split % #"\b")) ; <1>
    (map s/capitalize)          ; <2>
    (partition-all 3)           ; <3>
    (map s/join))               ; <4>
  names)

;; ("John Abercrombie"
;;  "Brad Mehldau"
;;  "Cassandra Wilson"
;;  "Andrew Cormack")