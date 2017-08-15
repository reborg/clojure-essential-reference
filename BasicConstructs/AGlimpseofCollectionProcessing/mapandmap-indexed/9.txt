diff(L,V) = (car(L)=const->copy(CO),
  car(L)= var -> (car (cdr(L)) = V -> copy(C1, 1->copy(C0)),
  car(L)= plus -> consel(plus, maplist(CDR(L), λ(J diff(car(J), V)))),
  car(L)= times-> consel(plus, maplist(cdr(L),
    λ(J, consel(times, maplist(cdr(L),
      λ(K, (J != K -> copy(car(K)), l->diff(car(K), V))))))))))