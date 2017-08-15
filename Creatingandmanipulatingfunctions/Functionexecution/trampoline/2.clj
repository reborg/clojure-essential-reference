(defn- invoke                                     ; <1>
  [f-key & args]
  (apply (resolve (symbol (name f-key))) args))

(defn green [[light & lights]]                    ; <2>
  #(case light
     :red false
     nil true
     (invoke light lights)))

(defn red [[light & lights]]
  #(case light
     :amber false
     nil true
     (invoke light lights)))

(defn amber [[light & lights]]
  #(case light
     :green false
     nil true
     (invoke light lights)))

(defn flashing-red [[light & lights]]             ; <3>
  #(if (nil? light) true (invoke light lights)))

(defn flashing-amber [[light & lights]]
  #(if (nil? light) true (invoke light lights)))

(defn traffic-light [lights]                      ; <4>
  (trampoline flashing-amber lights))

(traffic-light [:red :amber :red])
;; false

(traffic-light [:red :green :amber :red])
;; true

(time (traffic-light (take 10000000 (cycle [:amber :red :green]))))
;; "Elapsed time: 5919.991775 msecs"
;;true