(define-syntax when
  (syntax-rules ()
    ((when pred body ..)
     (if pred (begin body ..)))))