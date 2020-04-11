(import '[clojure.lang PersistentQueue])
(def q (into (PersistentQueue/EMPTY) [1 2 3]))
(def v [1 2 3])
(def l '(1 2 3))

(peek q) ; 1   ; <1>
(peek v) ; 3   ; <2>
(peek l) ; 1   ; <3>