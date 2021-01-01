(set! *warn-on-reflection* true)
(set! *unchecked-math* :warn-on-boxed) ; <1>

(defn amap-upto [a f limit]
  (amap a idx out
    (let [old (aget a idx)
          new (f old)
          sum (asum-upto out idx)]
      (if (> (+ new sum) limit) old new))))

; <2>
;; Reflection warning, method aclone on RT can't be resolved (argument types: unknown).
;; Reflection warning, alength on RT can't be resolved (argument types: unknown).
;; Boxed math warning, boolean Numbers.lt(long,Object).
;; Reflection warning, aget on RT can't be resolved (argument types: unknown, int).
;; Boxed math warning, Number Numbers.unchecked_add(Object,Object).
;; Boxed math warning, boolean Numbers.gt(Object,Object).
;; Reflection warning, aset on RT can't be resolved.