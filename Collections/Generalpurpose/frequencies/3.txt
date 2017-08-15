(frequencies ['() [] (clojure.lang.PersistentQueue/EMPTY)]) ; <1>
;; {() 3}

(frequencies [(byte 1) (short 1) (int 1) (long 1) 1N]) ; <2>
;; {1 5}