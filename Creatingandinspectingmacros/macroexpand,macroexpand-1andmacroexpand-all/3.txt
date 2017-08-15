(macroexpand-1 '(when-first [a [1 2 3]] (println a)))                        ; <1>
;; (clojure.core/when-let [xs__5218__auto__ (clojure.core/seq [1 2 3])]
;;   (clojure.core/let [a (clojure.core/first xs__5218__auto__)]
;;     (println a)))

(macroexpand '(when-first [a [1 2 3]] (println a)))                          ; <2>
;; (let* [temp__4670__auto__ (clojure.core/seq [1 2 3])]
;;   (clojure.core/when temp__4670__auto__
;;     (clojure.core/let [xs__5218__auto__ temp__4670__auto__]
;;       (clojure.core/let [a (clojure.core/first xs__5218__auto__)]
;;         (println a)))))

(clojure.walk/macroexpand-all '(when-first [a [1 2 3]] (println a)))        ; <3>
;; (let* [temp__4670__auto__ (clojure.core/seq [1 2 3])]
;;   (if temp__4670__auto__
;;     (do (let* [xs__5218__auto__ temp__4670__auto__]
;;           (let* [a (clojure.core/first xs__5218__auto__)]
;;              (println a))))))