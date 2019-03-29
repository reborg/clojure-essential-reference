(def op-fn ; <1>
  "(defn op [sel]
     (condp = sel
        \"plus\" +
        \"minus\" -
        \"mult\" *
        \"div\" /
        \"rem\" rem
        \"quot\" quot))")

(pprint (read-string op-fn)) ; <2>

(defn
 op
 [sel]
 (condp
  =
  sel
  "plus"
  +
  "minus"
  -
  "mult"
  *
  "div"
  /
  "rem"
  rem
  "quot"
  quot))