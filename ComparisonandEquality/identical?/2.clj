(let [x #{1 2 3}                                              ; <1>
      y x]                                                    ; <2>
  (identical? x y))
                                                              ;; true