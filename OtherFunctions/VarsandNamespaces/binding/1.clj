(def ^:dynamic *trace*) ; <1>

(defmacro trace! [msg & body] ; <2>
  `(do
     (when (thread-bound? #'*trace*)
       (set! *trace* (conj *trace* ~msg)))
     ~@body))

(defn params [query] ; <3>
  (let [pairs (clojure.string/split query #"&")]
    (trace! (format "Handling params %s" pairs)
      (->> pairs
         (map #(clojure.string/split % #"="))
         (map #(apply hash-map %))
         (apply merge)))))

(defn handle-request [{:strs [op arg1 arg2]}] ; <4>
  (let [op (resolve (symbol op))
        x (Integer. arg1)
        y (Integer. arg2)]
  (trace!
    (format "Handling request %s %s %s" op x y)
    (op x y))))

(binding [*trace* []] ; <5>
  (let [query "op=+&arg1=1&arg2=2"
        res (handle-request (params query))]
    (pprint *trace*)
    res))

;; ["Handling params [\"op=+\" \"arg1=1\" \"arg2=2\"]"
;;  "Handling request #'clojure.core/+ 1 2"]