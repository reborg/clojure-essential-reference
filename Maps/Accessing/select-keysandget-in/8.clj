(let [word "hello"]
  (select-keys (vec word) (filter even? (range (count word)))))
;; {0 \h, 2 \l, 4 \o}