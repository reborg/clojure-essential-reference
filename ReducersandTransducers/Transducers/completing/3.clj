(def ^:dynamic *debug* false)

(defn- print-if [s]                     ; <1>
  (when *debug* (print (str s " "))))

(defn- identity-xform                   ; <2>
  ([]
    (fn [rf]
      (fn
        ([] (print-if "#0") (rf))
        ([acc] (print-if "#1") (rf acc))
        ([acc item] (print-if "#2") (rf acc item)))))
  ([x] x))

(defn- completing-debug [f]             ; <3>
  (completing f
    #(do (print-if "#done!") %)))

(binding [*debug* true]                 ; <4>
  (transduce
    (comp (map inc) (identity-xform))
    (completing-debug +)
    [1 2 3]))

;; #2 #2 #2 #1 #done! 9