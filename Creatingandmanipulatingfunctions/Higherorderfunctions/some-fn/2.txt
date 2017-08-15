((some-fn integer? float?) 1)   ; <1>
;; true
((some-fn integer? float?) 1.)  ; <2>
;; true
((some-fn integer? float?) "")  ; <3>
;; false