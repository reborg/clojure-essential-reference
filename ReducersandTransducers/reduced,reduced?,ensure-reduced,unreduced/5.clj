(import 'java.util.concurrent.LinkedBlockingQueue)
(def values (LinkedBlockingQueue. 1))         ; <1>

(defn value-seq []                            ; <2>
  (lazy-seq
    (cons (.take values) (value-seq))))

(defn moving-average [[cnt sum avg] x]        ; <3>
  (let [new-cnt (inc cnt)
        new-sum (+ sum (unreduced x))
        new-avg (/ new-sum (double new-cnt))
        res [new-cnt new-sum new-avg]]
    (println res)
    (if (reduced? x)
      (reduced res)
      res)))

(defn start []                                ; <4>
  (let [out *out*]
    (.start (Thread.
      #(binding [*out* out]
        (println "Done:"
          (reduce
            moving-average
            [0 0 0]
            (value-seq))))))))

(start)
(.offer values 10)
;; [1 10 10.0]
(.offer values 10)
;; [2 20 10.0]
(.offer values 50)
;; [3 70 23.333333333333332]
(.offer values (reduced 20))
;; [4 90 22.5]
;; Done: [4 90 22.5]