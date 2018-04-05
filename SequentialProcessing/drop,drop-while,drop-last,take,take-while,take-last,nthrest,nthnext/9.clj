(require '[clojure.java.io :as io])
(import  '[java.io File])

(defn generate-file [id] ; <1>
  (let [file (File/createTempFile (str "temp" id "-") ".tmp")]
    (with-open [fw (io/writer file)]
      (binding [*out* fw]
        (pr id)
        file))))

(defn fetch-clean [f] ; <2>
  (let [content (slurp f)]
    (println "Deleting file" (.getName f))
    (io/delete-file f)
    content))

(defn service [] ; <3>
  (let [data (map #(generate-file %) (list 1 2 3 4 5))]
    (nthrest (map fetch-clean data) 2)))

(def consumer (service)) ; <4>
;; Deleting file temp1-8176280320841013882.tmp
;; Deleting file temp2-6114428806665839159.tmp