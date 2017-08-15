(for [i (range 10)                      ; <1>
      [k v] {:a "!" :b "?" :c "$"}      ; <2>
      :let [s (str i k v)]              ; <3>
      :while (not= :b k)                ; <4>
      :when (odd? i)]                   ; <5>
  s)                                    ; <6>
;; ("1:a!" "3:a!" "5:a!" "7:a!" "9:a!")