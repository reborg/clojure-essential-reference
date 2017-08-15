(defn levenshtein* [[c1 & rest1 :as str1]         ; <1>
                    [c2 & rest2 :as str2]]
  (let [len1 (count str1)
        len2 (count str2)]
    (cond (zero? len1) len2
          (zero? len2) len1
          :else
          (min (inc (levenshtein* rest1 str2))
               (inc (levenshtein* str1 rest2))
               (+ (if (= c1 c2) 0 1) (levenshtein* rest1 rest2))))))

(def levenshtein (memoize levenshtein*))          ; <2>

(defn to-words [txt init]                         ; <3>
  (->> txt
       slurp
       clojure.string/split-lines
       (filter #(.startsWith % init))
       (remove #(> (count %) 8))
       doall))

(defn best [misp dict]                            ; <4>
  (->> dict
       (map #(-> [% (levenshtein misp %)]))
       (sort-by last)
       (take 3)))

(defn dict [init]
  (to-words "/usr/share/dict/words" init))

(def dict-ac (dict "ac"))                         ; <5>

(time (best "achive" dict-ac))
;; "Elapsed time: 4671.226198 msecs"              ; <6>
;; (["achieve" 1] ["achime" 1] ["active" 1])

(time (best "achive" dict-ac))
;; "Elapsed time: 0.854094 msecs"                 ; <7>
;; (["achieve" 1] ["achime" 1] ["active" 1])