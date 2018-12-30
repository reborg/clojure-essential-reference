(defmethod print-method user.Point [object writer] ; <1>
  (let [class-name (.getName (class object))
        args (str (.x object) " " (.y object))]
    (.append writer (format "(%s. %s)" class-name args)))) ; <2>

(def point (Point. 1 2))
(def point-as-str (pr-str point))
(def point-as-list (read-string point-as-str))
(def back-to-point (eval point-as-list))

[point-as-str :type (type point-as-str)] ; <3>
;; ["(user.Point. 1 2)" :type java.lang.String]

[point-as-list :type (type point-as-list)] ; <4>
;; [(user.Point. 1 2) :type clojure.lang.PersistentList]

[back-to-point :type (type back-to-point)] ; <5>
;; [(user.Point. 1 2) :type user.Point]