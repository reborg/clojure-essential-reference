(def zipper-end ; <1>
  (-> (zip/vector-zip [1 2]) zip/next zip/next zip/next))

(zip/end? zipper-end) ; <2>
;; true

(zip/prev zipper-end) ; <3>
;; nil