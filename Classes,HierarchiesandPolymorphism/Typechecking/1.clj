(let [add-meta (with-meta [1 2 3] {:type "MyVector"}) ; <1>
      no-meta [1 2 3]]
  [(type add-meta) (class add-meta) (type no-meta)]) ; <2>
;; ["MyVector" clojure.lang.PersistentVector clojure.lang.PersistentVector]