(defn dedupe-string [s]
  (loop [[el & more] s                    ; <1>
         [cur ret :as state] [nil ""]]    ; <2>

    (cond

      (not el)                            ; <3>
      (str ret cur)

      (= el cur)                          ; <4>
      (recur more state)

      :else                               ; <5>
      (recur more [el (str ret cur)]))))

(dedupe-string "")
;; ""
(dedupe-string "foobar")
;; "fobar"
(dedupe-string "fubar")
;; "fubar"