(def hex?
  (set (sequence ; <1>
    (comp
      (mapcat range) ; <2>
      (map char))
    [48 65] ; <3>
    [58 71])))

(every? hex? "CAFEBABE") ; <4>
;; true