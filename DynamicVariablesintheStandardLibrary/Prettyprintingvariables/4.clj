(def s ; <1>
  (binding [*print-meta* true]
    (pr-str (with-meta [1 2 3] {:my :meta}))))

(println s) ; <2>
;; ^{:my :meta} [1 2 3]

(def v (read-string s))

(println v) ; <3>
;; [1 2 3]

(meta v) ; <4>
;; {:my :meta}