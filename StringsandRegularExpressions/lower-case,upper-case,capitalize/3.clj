(def names
  ["john abercrombie"
   "Brad mehldau"
   "Cassandra Wilson"
   "andrew cormack"])

(map
  (fn [name]
    (->> (s/split name #"\b") ; <1>
         (map s/capitalize)   ; <2>
         s/join))             ; <3>
  names)

;; ("John Abercrombie"
;;  "Brad Mehldau"
;;  "Cassandra Wilson"
;;  "Andrew Cormack")