(import 'java.util.ArrayList)
(def l (ArrayList.))

(doto l ; <1>
  (.add "fee")
  (.add "fi")
  (.add "fo")
  (.add "fum"))
;; ["fee" "fi" "fo" "fum"]