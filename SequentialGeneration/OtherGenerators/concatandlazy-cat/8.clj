(require '[clojure.string :as s])

(defn padder [width] ; <1>
  #(take width (concat % (repeat " "))))

(defn line [width] ; <2>
  (apply str (repeat (+ 2 width) "-")))

(defn quote-sentence [sentence width]
  (transduce ; <3>
    (comp
      (map (padder width))
      (map #(apply str %))
      (map #(str "|" % "|\n")))
    (completing str #(str % (line width)))
    (str (line width) "\n")
    (s/split sentence #"\s+")))

(println (quote-sentence "Clojure is my favorite language" 12)) ; <4>
;; --------------
;; |Clojure     |
;; |is          |
;; |my          |
;; |favorite    |
;; |language    |
;; --------------