(defn path [s]
  (let [s (and s (.trim s))]  ; <1>
    (and
      (seq s)                 ; <2>
      (subs s 0 (.lastIndexOf s "/")))))

(path "/tmp/exp/lol.txt")
;; "/tmp/exp"

(path "   ")
;; nil

(path "")
;; nil

(path nil)
;; nil