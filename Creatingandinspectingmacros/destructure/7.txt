(let [my-map {:x 1 :y 2 :z nil}
      {x :x y :y :as m} my-map            ; <1>
      {:keys [x y]} my-map                ; <2>
      {:keys [z t] :or {z 3 t 4}} my-map] ; <3>
  [x y z t m])
;; [1 2 nil 4 {:x 1, :y 2, :z nil}]