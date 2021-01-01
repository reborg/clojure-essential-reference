(deftype StubReflector [] ; <1>
  r/Reflector
  (do-reflect [this typeref]
    {:bases #{} :flags #{} :members #{}}))

(r/reflect java.lang.Integer :reflector (StubReflector.)) ; <2>
;; {:bases #{}, :flags #{}, :members #{}}