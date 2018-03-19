(import '[clojure.lang PersistentQueue])
(def q (PersistentQueue/EMPTY))
(def v [])
(def l ())

(peek (conj q "a" "b" "c")) ; "a"   ; <1>
(peek (conj v "a" "b" "c")) ; "c"   ; <2>
(peek (conj l "a" "b" "c")) ; "c"   ; <3>