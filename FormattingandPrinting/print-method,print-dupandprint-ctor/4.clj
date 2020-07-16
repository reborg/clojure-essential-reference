(defmethod print-method user.Point [object writer]
  (.append writer (format "[x=%s, y=%s]" (.x object) (.y object))))

(pr-str (Point. 1 2)) ; <1>
;; "[x=1, y=2]"

(defmethod print-dup user.Point [object writer] ; <2>
  (print-ctor
    object
    (fn print-args [object writer]
      (.append writer (str (.x object) " " (.y object))))
    writer))

(binding [*print-dup* true] (pr-str (Point. 1 2))) ; <3>
;; "#=(user.Point. 1 2)"