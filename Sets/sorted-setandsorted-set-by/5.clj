(require '[clojure.string :refer [split-lines]])

(def dict ; <1>
  (atom
    (->> "/usr/share/dict/words"
      slurp
      split-lines
      (into (sorted-set)))))

(defn new-word [w] ; <2>
  (println "Could not find the word:" w)
  (println "Add word to dictionary? [y/n]")
  (when (= "y" (read-line))
    (swap! dict conj w)
    (take 5 (subseq @dict >= w)))) ; <3>

(defn spell-check [w]
  (if (contains? @dict w) ; <4>
    (println "Word spelled correctly")
    (new-word w)))

(defn ask-word []
  (println "Please type word:")
  (when-let [w (read-line)]
    (spell-check w)))

(ask-word) ; <5>
;; Please type word:
;; google
;; Could not find the word: google
;; Add word to dictionary? [y/n]
;; y
;; word added (google googly googol googolplex googul)

(ask-word)
;; Please type word:
;; google
;; Word spelled correctly