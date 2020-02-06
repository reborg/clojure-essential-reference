;; please see "next-gen" from the "for" chapter.

(defn grid [h w cells] ; <1>
  (letfn [(concats [& strs]
            (apply str (apply concat strs)))
          (edge [w]
            (concats
              " "
              (repeat (* 2 w) "-")
              " \n"))
          (row [h w cells]
            (concats
              "|"
              (for [x (range w) :let [y h]]
                (if (cells [x y]) "<>" "  "))
              "|\n"))]
    (concats
      (edge w)
      (for [y (range h) :let [x w]]
        (row y x cells))
      (edge w))))

(defn life [height width init] ; <2>
  (iterate (partial next-gen height width) init))

(def pulsar-init ; <3>
  #{[2 4] [2 5] [2 6] [2 10] [2 11] [2 12]
    [4 2] [4 7] [4 9] [4 14]
    [5 2] [5 7] [5 9] [5 14]
    [6 2] [6 7] [6 9] [6 14]
    [7 4] [7 5] [7 6] [7 10] [7 11] [7 12]
    [9 4] [9 5] [9 6] [9 10] [9 11] [9 12]
    [10 2] [10 7] [10 9] [10 14]
    [11 2] [11 7] [11 9] [11 14]
    [12 2] [12 7] [12 9] [12 14]
    [14 4] [14 5] [14 6] [14 10] [14 11] [14 12]})

(defn pulsar [] ; <4>
  (let [height 17 width 17 init pulsar-init]
    (doseq [state (take 3 (life height width init))]
      (println (grid height width state)))))