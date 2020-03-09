(let [m1 {:id [11] :colors ["red" "blue"]} ; <1>
      m2 {:id [10] :colors ["yellow"]}
      m3 {:id [31] :colors ["brown" "red"]}]
  (merge-with into m1 m2 m3))

;; {:id [11 10 31], ; <2>
;;  :colors ["red" "blue" "yellow" "brown" "red"]}