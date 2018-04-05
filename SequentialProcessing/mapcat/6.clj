(defn tsort [deps k] ; <1>
  (loop [res () ks [k]]
    (if (empty? ks) ; <2>
      res
      (recur (apply conj res ks) ; <3>
             (mapcat deps ks)))))

(tsort libs :async) ; <4>
;; (:priority-map :cache :asm
;;  :reader :analyzer :memoize
;;  :analyzer.jvm)