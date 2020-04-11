(ns user)

(defn clean-ns [ns]
  (ns 'user)
  (create-ns ns)
  (let [ks (keys (ns-map ns))]
    (doseq [k ks]
      (ns-unmap ns k)))
  (ns-map ns))

(clean-ns 'myns) ; <1>
;; {}

(binding [*ns* (the-ns 'myns)] ; <2>
  (refer 'clojure.core
    :only ['+ '-]
    :rename {'+ 'plus '- 'minus}))

(ns-map 'myns) ; <3>
;; {minus #'clojure.core/-
;;  plus #'clojure.core/+}