(defn scramble [^long x ^long y]                  ; <1>
 (unchecked-add (unchecked-multiply 31 x) y))     ; <2>

(defn hash-str [s]                                ; <3>
  (let [large-prime 1125899906842597]             ; <4>
    (reduce scramble large-prime (map int s))))   ; <5>

(hash-str "couple words")                         ; <6>
;; 1664082230529263278

(hash-str "even longer sentences")
;; -7674745620208396614