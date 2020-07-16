(require '[clojure.core.reducers :as r])
(import 'java.util.concurrent.atomic.AtomicInteger)
(set! *warn-on-reflection* true)

(defn pdrop  ; <1>
  [n coll]
  (r/folder
    coll (fn [rf]
      (let [nv (volatile! n)]
        (fn
          ([result input]
           (let [n @nv]
             (vswap! nv dec)
             (if (pos? n)
               result
               (rf result input)))))))))

(distinct    ; <2>
  (for [i (range 1000)]
    (->> (vec (range 1600))
         (pdrop 10)
         (r/fold 200 + +))))
;; (1279155 1271155 1277571 ...)