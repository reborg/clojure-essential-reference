(mapcat
  (fn [i]
    (map
      (fn [a] (str i "-" a))
  ["D" "C" "H" "S"]))
(range 1 14))