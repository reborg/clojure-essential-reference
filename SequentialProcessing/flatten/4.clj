(require '[clojure.walk :as w])

(defn core-fns [form]
  (->> (w/macroexpand-all form)   ; <1>
       flatten                    ; <2>
       (map str)
       (map #(re-find #"clojure\.core/(.*)" %))
       (keep last)
       distinct))                 ; <3>

(core-fns                         ; <4>
  '(for [[head & others] coll
         :while #(< i %)
         :let [a (mod i 2)]]
    (when (zero? a)
      (doseq [item others]
        (print item)))))

;; ("seq" "chunked-seq?" "chunk-first" "int"
;;  "count" "chunk-buffer" "<" "first" "next"
;;  "chunk-append" "unchecked-inc" "chunk-rest"
;;  "chunk-cons" "chunk" "cons" "rest")