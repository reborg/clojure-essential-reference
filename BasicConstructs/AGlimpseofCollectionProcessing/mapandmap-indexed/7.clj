diff = (ctr(J) = 1 -> 0,                                              ; <1>
  car(J) = "x" -> 1,
  car(J) = "plus"  -> consel("plus", maplist(cdr(J), K, diff(K))),    ; <2>
  car(J) = "times" -> consel("plus", maplist(cdr(J), K, consel(
      "times" -> consel(
      "plus",  maplist(cdr(J), K, consel(
      "times", maplist(cdr(J), L, (L = K -> copy (L))))))))))