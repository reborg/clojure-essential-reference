(import '[java.util ArrayList])

(let [a (ArrayList. [:o :o :o]) s (seq a)] ; <1>
  [(.set a 0 :x) (first s) (.get a 0)])    ; <2>
;; [:o :x :x]

(let [a (ArrayList. [:o :o :o]) s (seq a)] ; <3>
  [(first s) (.set a 0 :x) (first s) (.get a 0)])
;; [:o :o :o :x]