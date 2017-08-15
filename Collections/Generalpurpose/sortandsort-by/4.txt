(require '[clojure.java.io :as io])
(require '[clojure.core.reducers :as r])

(defn- save-chunk! [data]             ; <1>
  (let [file (java.io.File/createTempFile "mergesort-" ".tmp")]
    (with-open [fw (io/writer file)]
      (binding [*out* fw]
        (pr data)
        file))))

(defprotocol DataProvider             ; <2>
  (fetch-ids [id-range]))

(defn- process-leaf [id-range sortf]  ; <3>
  (-> (fetch-ids id-range)
      sortf
      save-chunk!
      vector))

(defrecord IdRange [from to]          ; <4>
  r/CollFold
  (coll-fold [{:keys [from to] :as id-range} n mergef sortf]
    (if (<= (- to from) n)            ; <5>
      (process-leaf id-range sortf)
      (let [half (+ from (quot (- to from) 2))
            r1 (IdRange. from half)
            r2 (IdRange. half to)
            fc (fn [id-range] #(r/fold n mergef sortf id-range))]
        (#'r/fjinvoke
          #(let [f1 (fc r1)
                 t2 (#'r/fjtask (fc r2))]
             (#'r/fjfork t2)
             (mergef (f1) (#'r/fjjoin t2))))))))

(extend-type IdRange
  DataProvider
  (fetch-ids [id-range]
    (shuffle (range (:from id-range) (:to id-range)))))

(map (memfn getName) (r/fold concat sort (IdRange. 0 2000))) ; <7>
;; ("mergesort-5429651713147139838.tmp"
;;  "mergesort-3439385946421413136.tmp"
;;  "mergesort-822035540728588026.tmp"
;;  "mergesort-4508682892448825604.tmp")