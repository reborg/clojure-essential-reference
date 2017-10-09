(->> (range 1500)
     (into [])
     (r/map
       #(do (println      ; <1>
          (str (Thread/currentThread))) %))
     (r/map range)
     (r/mapcat conj)
     (r/filter odd?)
     dedupe
     (r/fold +))
;; Thread[main,5,main]    ; <2>
;; Thread[main,5,main]
;; ....
;; 280338192