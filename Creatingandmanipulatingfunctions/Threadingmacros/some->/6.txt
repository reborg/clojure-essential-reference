(defn system-port []
  (or
    (some-> (System/getenv "PORT") Integer.)    ; <1>
    4444))

(system-port)                                   ; <2>
;; 4444