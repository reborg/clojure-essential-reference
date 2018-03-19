(defn into* [to & args] ; <1>
  (into to
    (apply comp (butlast args))  ; <2>
    (last args)))

(into* [] (range 10)) ; <3>
;; [0 1 2 3 4 5 6 7 8 9]
(into* [] (map inc) (range 10))
;; [1 2 3 4 5 6 7 8 9 10]
(into* [] (map inc) (filter odd?) (range 10))
;; [1 3 5 7 9]