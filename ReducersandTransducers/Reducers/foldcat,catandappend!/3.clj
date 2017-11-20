(require '[clojure.core.reducers :as r])
(require '[clojure.string :as s])

(def text                               ; <1>
  (-> "http://www.gutenberg.org/files/2600/2600-0.txt"
      slurp
      s/split-lines))

(def r-word                             ; <2>
  (comp
    (r/map #(vector % (count %)))
    (r/map s/lower-case)
    (r/remove s/blank?)
    (r/map #(re-find #"\w+" %))
    (r/mapcat #(s/split % #"\s+"))))

(def words (r/foldcat (r-word text)))   ; <3>

(take 5 words)
;; (["the" 3] ["project" 7] ["gutenberg" 9] ["ebook" 5] ["of" 2])