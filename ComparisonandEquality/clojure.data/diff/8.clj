(require 'clojure.data)

(defn generate [n]    ; <1>
  (reduce (fn [m e]
    (assoc-in m (range e) {e e}))
    {}
    (range 1 n)))

(defn blow [depth]    ; <2>
  (doseq [n (range depth 100 -50)]
    (let [a (generate n)
          b (generate (inc n))]
      (try
        (clojure.data/diff a b)
        (catch StackOverflowError soe
          (println "StackOverflow at" n "deep."))))))

(blow 700)
;; StackOverflow at 700 deep.
;; StackOverflow at 650 deep.
;; StackOverflow at 600 deep.
;; StackOverflow at 550 deep.
;; StackOverflow at 500 deep.
;; ... from here diff starts working ; <3>
;; correctly from the bottom of the stack