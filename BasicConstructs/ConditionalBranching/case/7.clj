(defn score [ks]
  (case ks ; <1>
    [\k \k \k \k \l \l \l \l] 5
    [\4 \k \4 \l] 10
    0))

(defn check [s]
  (score (seq s))) ; <2>

(check "kl")
;; 0

(check "kkkkllll")
;; 5

(check "4k4l")
;; 10