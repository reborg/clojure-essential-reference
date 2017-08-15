(require '[clojure.java.io :as io])
(require '[clojure.xml :as xml])

(defn- to-double [k m]
  (update-in m [k] #(Double/valueOf %)))

(defn parse [xml]                                         ; <1>
  (let [xml-in (java.io.ByteArrayInputStream. (.getBytes xml))
        results (to-double
                  :currentBalance
                  (apply merge
                         (map #(hash-map (:tag %) (first (:content %)))
                              (:content (xml/parse xml-in)))))]
    (.close xml-in)
    results))

(defn clean-key [k]                                       ; <2>
  (let [kstr (str k)]
    (if (= \: (first kstr))
      (apply str (rest kstr))
      kstr)))

(defn- up-first [[head & others]]
  (apply str (conj others (.toUpperCase (str head)))))

(defn separate-words [k]                                  ; <3>
  (let [letters (map str k)]
    (up-first (reduce #(str %1 (if (= %2 (.toLowerCase %2)) %2 (str " " %2))) "" letters))))

(defn format-decimals [v]                                 ; <4>
  (if (float? v)
    (let [[_ nat dec] (re-find #"(\d+)\.(\d+)" (str v))]
      (cond
        (= (count dec) 1) (str v "0")
        (> (count dec) 2) (apply str nat "." (take 2 dec))
        :default (str v)))
    v))

(defn print-balance [xml]                                 ; <5>
  (let [balance (parse xml)]
    (letfn [(transform [acc item]
              (assoc acc
                     (separate-words (clean-key item))
                     (format-decimals (item balance))))]
      (reduce transform {} (keys balance)))))

(print-balance balance)
;; {"Account Id" 3764882, "Last Access" "20120121", "Current Balance" "80.12"}