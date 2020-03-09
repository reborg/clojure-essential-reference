(map #(instance? java.util.Comparator %) [< > <= >= =]) ; <1>
;; (true true true true true)

(map #(instance? java.util.Comparator %) [+ - str prn]) ; <2>
;; (true true true true)