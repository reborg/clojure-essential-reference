(ns reductions-vote
  (:import java.util.concurrent.LinkedBlockingQueue))

(def values (LinkedBlockingQueue. 1))
(def eos "end-of-sequence")

(defn value-seq []
  (lazy-seq
    (cons (.take values) (value-seq))))

(defn moving-average [[cnt sum avg] x]
  (if (= eos x)
    (reduced eos)
    (let [new-cnt (inc cnt)
          new-sum (+ sum x)
          new-avg (/ new-sum (double new-cnt))
          res [new-cnt new-sum new-avg]]
      (println "->" res)
      res)))

(defn stats [xs]
  (doall
    (reduce moving-average [0 0 0] xs)))

(defn start []
  (let [out *out*]
    (.start (Thread.
        #(binding [*out* out]
           (stats (value-seq))
           (println "... done"))))))

(start)
(.offer values 10)
(.offer values 50)
(.offer values eos)