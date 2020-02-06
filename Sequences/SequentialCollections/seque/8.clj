(import '[java.util.concurrent LinkedBlockingQueue])
(def q (LinkedBlockingQueue. 5))  ; <1>
(def sentinel (Object.))          ; <2>

(defmacro start [& body]          ; <3>
  `(let [out# *out*]
    (future
      (binding [*out* out#] ~@body))))

(defn producer [^LinkedBlockingQueue q items] ; <4>
  (start
    (loop [[x & xs :as items] items]
      (Thread/sleep 1000)
      (let [x (or x sentinel)]
        (println "adding" x)
        (if (.offer q x)
          (when-not (identical? x sentinel) (recur xs))
          (recur (or items sentinel)))))))

(defn seque2 [^LinkedBlockingQueue q] ; <5>
  (lazy-seq
    (let [x (.take q)]
      (cons
        (if (identical? x sentinel) nil x)
        (seque2 q)))))

(defn consumer [q]                ; <6>
  @(start
    (map
      #(do
         (println "consume" %)
         (Thread/sleep 1000))
      (seque2 q))))