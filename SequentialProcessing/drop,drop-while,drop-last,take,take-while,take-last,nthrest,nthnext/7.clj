(def eager (take-last 1 (take 10 (xs)))) ; <1>
;; ..........#'user/eager

(def lazy-bomb (drop-last (xs))) ; <2>
;; #'user/lazy-bomb