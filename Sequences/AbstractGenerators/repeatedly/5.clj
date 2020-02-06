(import '[java.util.concurrent ConcurrentLinkedQueue])
(def q (ConcurrentLinkedQueue. (range 1000))) ; <1>
(def ^:const parallel 5)

(defn task [job]    ; <2>
  (Thread/sleep (rand-int 2000))
  (println "Work done on" job)
  (inc job))

(def workers        ; <3>
  (repeatedly
    #(let [out *out*]
       (future
         (binding [*out* out]
           (when-let [item (.poll q)]
             (task item)))))))

(defn run [workers] ; <4>
  (println "-> starting" parallel "new workers")
  (let [done? #(> (reduce + (remove nil? %)) 30)  ; <5>
        futures (doall (take parallel workers))   ; <6>
        results (mapv deref futures)]             ; <7>
    (cond                                         ; <8>
      (done? results) results
      (.isEmpty q) (println "Empty.")
      :esle (recur (drop parallel workers)))))

(run workers)                ; <9>
;; -> starting 5 new workers
;; Work done on 0
;; Work done on 1
;; Work done on 2
;; Work done on 3
;; Work done on 4
;; -> starting 5 new workers
;; Work done on 5
;; Work done on 6
;; Work done on 7
;; Work done on 8
;; Work done on 9
;; [6 7 8 9 10]