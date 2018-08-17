(apply s/intersection
  (remove nil? [#{1 2 3} nil #{4 2 6}])) ; <1>
;; #{2}