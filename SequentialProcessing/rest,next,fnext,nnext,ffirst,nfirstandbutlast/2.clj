((juxt rest next butlast nfirst ffirst nnext fnext) nil) ; <1>
;; [() nil nil nil nil nil nil]

((juxt rest next butlast nfirst ffirst nnext fnext) []) ; <2>
;; [() nil nil nil nil nil nil]