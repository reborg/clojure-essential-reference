(macroexpand '(lazy-cat [1 2 3] (range))) ; <1>
;; (concat (lazy-seq [1 2 3]) (lazy-seq (range)))