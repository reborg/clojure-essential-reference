(instance? java.lang.Comparable (range 10))
                                                              ;; false

(let [x (range 10) y x] (compare x y))
                                                              ;; 0