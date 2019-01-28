(defn c1 [n]
  (case n 127 "127" 128 "128" :none))

(c1 127)
;; "127"
(c1 128)    ; <1>
;; "128"

(defn c2 [n]
  (cond (identical? n 127) "127" (identical? n 128) "128" :else :none))

(c2 127)
;; "127"
(c2 128)    ; <2>
;; :none