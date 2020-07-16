(binding [*print-dup* true] ; <1>
  (pr-str {:a 1 :b 2}))

;; "#=(clojure.lang.PersistentArrayMap/create {:a 1, :b 2})"