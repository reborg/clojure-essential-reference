(ns myns (:require [clojure.pprint :refer [pprint]]))

(pprint (ns-map 'myns)) ; <1>
;; {primitives-classnames #'clojure.core/primitives-classnames,
;;  +' #'clojure.core/+',
;;  Enum java.lang.Enum,
;;  decimal? #'clojure.core/decimal?,
;;  restart-agent #'clojure.core/restart-agent,
;;  sort-by #'clojure.core/sort-by,
;; [...]

(distinct (map #(map type %) (ns-map 'myns)))
;; ((clojure.lang.Symbol clojure.lang.Var)
;;  (clojure.lang.Symbol java.lang.Class))