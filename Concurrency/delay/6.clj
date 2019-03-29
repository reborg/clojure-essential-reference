(def d (delay (throw (ex-info "error" {:cause (rand)})))) ; <1>

(try @d (catch Exception e (ex-data e))) ; <2>
;; {:cause 0.14105452022720477}

(try @d (catch Exception e (ex-data e)))
;; {:cause 0.14105452022720477}