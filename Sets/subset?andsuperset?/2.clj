(s/superset? nil #{}) ; <1>
;; true

(s/subset? #{0 3} [:a :b :c :d]) ; <2>
;; true