(import 'java.util.HashMap)

(hash-unordered-coll (HashMap. {:a 1 :b 2})) ; <1>
;; ClassCastException java.util.HashMap cannot be cast to java.lang.Iterable