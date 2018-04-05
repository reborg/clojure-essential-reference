(defn team [& names] ; <1>
  (apply interleave (map repeat names)))

(defn shifts [& teams] ; <2>
  (apply interleave teams))

(def a-team (team :john :rob :jessica))
(def b-team (team :arthur :giles))
(def c-team (team :paul :eva :donald :jake))

(take 10 (shifts a-team b-team)) ; <3>

;; (:john :arthur :rob :giles :jessica :arthur :john :giles :rob :arthur)