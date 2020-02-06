(zipmap (map keyword (repeatedly gensym)) (range 5)) ; <1>
;; {:G__52 0, :G__53 1, :G__54 2, :G__55 3, :G__56 4}