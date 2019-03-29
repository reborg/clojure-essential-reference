(def configuration (atom {})) ; <1>

(defn initialize [] ; <2>
  (reset! configuration (System/getenv)))

(initialize) ; <3>
(take 3 (keys @configuration))
;; ("JAVA_MAIN_CLASS_65503" "IRBRC" "PATH")