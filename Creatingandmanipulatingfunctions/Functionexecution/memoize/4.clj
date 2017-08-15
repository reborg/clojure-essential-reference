(defn memoize2 [f]
  (let [mem (atom {}) ; <1>
        hits (atom 0)
        miss (atom 0)
        calls (atom 0)]
    (fn [& args]
      (if (identical? :done (first args)) ; <2>
        (let [count-chars (reduce + (map count (flatten (keys @mem))))]
          {:calls @calls
           :hits @hits
           :misses @miss
           :count-chars count-chars
           :bytes (* (int (/ (+ (* count-chars 2) 45) 8)) 8)}) ; <3>
        (do (swap! calls inc) ; <4>
            (if-let [e (find @mem args)]
              (do (swap! hits inc) (val e))
              (let [ret (apply f args)
                    _ (swap! miss inc)]
                (swap! mem assoc args ret)
                ret)))))))