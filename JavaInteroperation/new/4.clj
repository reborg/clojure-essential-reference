(StringBuffer. "init") ; <1>
;; #object[java.lang.StringBuffer 0x5fa1cc83 "init"]

(macroexpand '(StringBuffer. "init")) ; <2>
;; (new StringBuffer "init")