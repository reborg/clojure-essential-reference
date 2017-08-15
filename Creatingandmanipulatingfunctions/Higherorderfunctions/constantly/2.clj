(def notes [{:name "f" :volume 60 :duration 118 :expr ">"}
            {:name "f" :volume 63 :duration 120 :expr "<"}
            {:name "a" :volume 64 :duration 123 :expr "-"}])

(defn- expressiveness [average exp]
  (case exp
    ">" (+ average 5)
    "<" (- average 5)
    average))

(defn- process-note [note fns]                                  ; <1>
  (letfn [(update-note [note [k f]] (update note k f))]         ; <2>
    (reduce update-note note fns)))                             ; <3>

(defn quantize-volume [notes]                                   ; <4>
  (let [avg (quot (reduce + (map :volume notes)) (count notes))
        fns {:volume (constantly avg)                           ; <5>
             :expr (partial expressiveness avg)}]               ; <6>
    (map #(process-note % fns) notes)))

(quantize-volume notes)                                         ; <7>

;; ({:name "f", :volume 62, :duration 118, :expr 67}
;;  {:name "f", :volume 62, :duration 120, :expr 57}
;;  {:name "a", :volume 62, :duration 123, :expr 62})