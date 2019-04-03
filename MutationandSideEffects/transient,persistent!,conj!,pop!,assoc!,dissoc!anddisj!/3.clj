(import 'java.util.HashMap)

(def transient-map (transient {}))
(def java-map (HashMap.))

(dotimes [i 20] ; <1>
  (assoc! transient-map i i)
  (.put java-map i i))

(persistent! transient-map) ; <2>
;; {0 0, 1 1, 2 2, 3 3, 4 4, 5 5, 6 6, 7 7}

(into {} java-map) ; <3>
;; {0 0, 7 7, 1 1, 4 4, 15 15, 13 13, 6 6,
;;  3 3, 12 12, 2 2, 19 19, 11 11, 9 9, 5 5,
;;  14 14, 16 16, 10 10, 18 18, 8 8, 17 17}