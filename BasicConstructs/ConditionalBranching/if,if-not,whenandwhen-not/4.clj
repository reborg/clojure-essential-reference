(def tree
  [:a 1 :b :c
   [:d
    [1 2 3 :a
     [1 2
      [1 2
       [3
        [4
         [0]]]]]                                ; <1>
     [:z
      [1 2
       [1]]]
     8]]
   nil])

(defn walk [depth tree]
  (if-not (vector? tree)                        ; <2>
    depth
    (map (partial walk (inc depth)) tree)))

(defn depth [tree]
  (apply max (flatten (walk 0 tree))))          ; <3>

(depth tree)
;; 8