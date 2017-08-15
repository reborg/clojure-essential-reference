(let [my-vec [1 2 3 4]
      [a b] my-vec               ; <1>
      [_ _ & r] my-vec           ; <2>
      [_ _ c d e :as v] my-vec]  ; <3>
  [a b c d e r v])
;;[1 2 3 4 nil (3 4) [1 2 3 4]]