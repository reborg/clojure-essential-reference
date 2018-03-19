(require '[criterium.core :refer [quick-bench]])    ; <1>

(defn with-dupes [n]                                ; <2>
  (shuffle
    (into []
      (apply concat (take n (repeat (range n)))))))

(let [c (with-dupes 1000)]                          ; <3>
  (quick-bench (doall (distinct c)))
  (quick-bench (doall (dedupe c)))
  (quick-bench (doall (sequence (distinct) c)))
  (quick-bench (doall (sequence (dedupe) c))))

;; Execution time mean : 271.592546 ms
;; Execution time mean : 102.599305 ms
;; Execution time mean : 93.271275 ms
;; Execution time mean : 105.953654 ms
