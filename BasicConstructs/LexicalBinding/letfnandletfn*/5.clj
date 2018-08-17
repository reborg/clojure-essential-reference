(require '[clojure.string :refer [split-lines]]
         '[clojure.repl :refer [source-fn]])

(defn locs-xform [match]
  (comp
    (filter (fn [ns]                      ; <1>
              (re-find
                (re-pattern match)
                (str (ns-name ns)))))
    (map ns-interns)
    (mapcat vals)
    (map meta)
    (map (fn [{:keys [ns name]}]          ; <2>
           (symbol (str ns) (str name))))
    (map (juxt identity
               (fn [sym]
                 (count
                   (split-lines           ; <3>
                     (or (source-fn sym) ""))))))))

(defn top-locs
  ([match] (top-locs match 10))
  ([match n]
   (->>
     (all-ns)
     (sequence (locs-xform match))   ; <4>
     (sort-by last >)
     (take n))))

(top-locs "clojure.core" 1)
;; ['clojure.core/generate-class 382]