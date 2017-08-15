  (with-precision <precision> [<rounding>] [<exprs>])                         ; <1>

  precision :=>                                                               ; <2>
  0 <= X <= Integer/MAX_VALUE

  rounding :=>                                                                ; <3>
  :rounding [CEILING|FLOOR|HALF_UP|HALF_DOWN|HALF_EVEN|UP|DOWN|UNNECESSARY]

  exprs :=>                                                                   ; <4>
  form1,form2,..,formN