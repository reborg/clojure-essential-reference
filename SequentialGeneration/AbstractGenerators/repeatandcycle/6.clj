(defn to-tally [n] ; <1>
  (apply str (concat
     (repeat (quot n 5) "卌")
     (repeat (mod n 5) "|"))))

(defn new-tally [] ; <2>
  (let [cnt (atom 0)]
    (fn []
      (to-tally (swap! cnt inc)))))

(def t (new-tally))

(t) ; <3>
;; "|"
(t)
;; "||"
(t)
;; "|||"
(t)
;; "||||"
(t)
;; "卌"

(repeatedly 5 t) ; <4>
;; ("卌|" "卌||" "卌|||" "卌||||" "卌卌")
