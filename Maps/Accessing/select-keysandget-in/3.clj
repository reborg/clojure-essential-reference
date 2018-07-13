(select-keys [:a :b :c :d :e] [1 3]) ; <1>
;; {1 :b, 3 :d}

(get-in [:a :b :c [:d :e]] [3 1]) ; <2>
;; :e