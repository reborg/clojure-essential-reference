(require '[clojure.edn :as edn]) ; <1>
(alias 'core 'clojure.core)

(core/read-string "@#'+") ; <2>
;; (clojure.core/deref (var +))

(edn/read-string "@#'+") ; <3>
;; RuntimeException Invalid leading character: @