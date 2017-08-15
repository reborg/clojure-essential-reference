(defn locs-xform [match]
  (letfn [(matching? [ns]                       ; <1>
            (re-find
              (re-pattern match)
              (str (ns-name ns))))
          (var->sym [{:keys [ns name]}]
            (symbol (str ns) (str name)))
          (count-lines [fsym]
            (count
              (clojure.string/split-lines
                (or (clojure.repl/source-fn fsym) ""))))]
    (comp                                       ; <2>
      (filter matching?)
      (map ns-interns)
      (mapcat vals)
      (map meta)
      (map var->sym)
      (map (juxt identity count-lines)))))