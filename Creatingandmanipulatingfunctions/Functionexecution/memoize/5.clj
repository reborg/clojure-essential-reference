(def levenshtein (memoize2 levenshtein*))

(best "achive" dict-ac)
;; (["achieve" 1] ["achime" 1] ["active" 1])

(levenshtein :done)
;; {:calls 400, :hits 0, :misses 400 :count-chars 5168 :bytes 10376}

(best "achive" dict-ac)
;; (["achieve" 1] ["achime" 1] ["active" 1])

(levenshtein :done)
;; {:calls 800, :hits 400, :misses 400 :count-chars 5168 :bytes 10376}