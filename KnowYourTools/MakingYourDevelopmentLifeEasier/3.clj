(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])
(require '[clojure.string :refer [split capitalize join]])

(defn- to-double [k m]
  (update-in m [k] #(Double/valueOf %)))

(defn parse [xml]                                         ; <1>
  (with-open [xml-in (io/input-stream (.getBytes xml))]
    (->> (xml/parse xml-in)
         :content
         (map #(hash-map (:tag %) (first (:content %))))
         (into {})
         (to-double :currentBalance))))

(defn separate-words [s]
  (->> (split s #"(?=[A-Z])")     ; <2>
       (map capitalize)           ; <3>
       (join " ")))

(defn format-decimals [v]
  (if (float? v)
    (clojure.pprint/cl-format nil "~$" v)                 ; <4>
    v))

(defn print-balance [xml]
  (let [balance (parse xml)
        ks (map (comp separate-words name) (keys balance))
        vs (map format-decimals (vals balance))]
    (zipmap ks vs)))                                      ; <5>

(print-balance balance)
;; {"Account Id" 3764882, "Last Access" "20120121", "Current Balance" "80.12"}