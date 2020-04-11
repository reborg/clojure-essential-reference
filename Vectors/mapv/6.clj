(defn create-vector-fn [f]           ; <1>
  (fn [a & b] (apply mapv f a b)))

(def add (create-vector-fn +))       ; <2>

(def subtract (create-vector-fn -))

(defn scalar-multiply [c a]
  (mapv (partial * c) a))

(defn dot-product [a b]              ; <3>
  (reduce + (map * a b)))

(add [1 2] [3 4])
;; [4 6]

(subtract [2 7 3] [5 4 1])
;; [-3 3 2]

(scalar-multiply 3 [1 2 3])
;; [3 6 9]

(dot-product [1 1 0] [0 0 1])        ; <4>
;; 0