(let [xs (range 1e8)] (last xs) (reduce + xs)) ; <1>

;; OutOfMemory