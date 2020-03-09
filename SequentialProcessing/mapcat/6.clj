(defn tp-sort [deps k]    ; <1>
  (loop [res () ks [k]]
    (if (empty? ks)     ; <2>
      (butlast res)
      (recur (apply conj res ks) ; <3>
             (mapcat deps ks)))))

(tp-sort libs :async) ; <4>
;; (:priority-map :cache :asm
;;  :reader :analyzer :memoize
;;  :analyzer.jvm)