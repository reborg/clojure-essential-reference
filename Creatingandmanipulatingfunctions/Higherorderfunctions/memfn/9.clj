(defmacro memfn [name & args]
  (let [t (with-meta (gensym "target") (meta name))] ; <1>
    `(fn [~t ~@args]
       (. ~t (~name ~@args))))) ; <2>