(defn paint! [^"[[I" img points]                            ; <1>
  (let [pset (into #{} points)]
  (dotimes [i (alength img)]
    (dotimes [j (alength (aget img 0))]
      (if (pset [i j])
        (aset-int img i j 1)))))                            ; <2>
  img)

(defn zeros [n]
  (take n (repeat 0)))

(defn new-image [n]
  (into-array (map int-array (take n (repeat (zeros n))))))

(mapv vec (paint! (new-image 12) (to-points 2 3 10 10)))      ; <3>

;; after adding line breaks for clarity:
;; [
;; [0 0 0 0 0 0 0 0 0 0 0 0]
;; [0 0 0 0 0 0 0 0 0 0 0 0]
;; [0 0 0 1 0 0 0 0 0 0 0 0]
;; [0 0 0 0 1 0 0 0 0 0 0 0]
;; [0 0 0 0 0 1 0 0 0 0 0 0]
;; [0 0 0 0 0 0 1 0 0 0 0 0]
;; [0 0 0 0 0 0 1 0 0 0 0 0]
;; [0 0 0 0 0 0 0 1 0 0 0 0]
;; [0 0 0 0 0 0 0 0 1 0 0 0]
;; [0 0 0 0 0 0 0 0 0 1 0 0]
;; [0 0 0 0 0 0 0 0 0 0 1 0]
;; [0 0 0 0 0 0 0 0 0 0 0 0]
;; ]