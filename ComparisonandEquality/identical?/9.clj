(def a 1000)
(def b a)
(identical? a b)                                              ; <1>
                                                              ;; true

(let [x 1000 y x]
  (identical? x y))                                           ; <2>
                                                              ;; false