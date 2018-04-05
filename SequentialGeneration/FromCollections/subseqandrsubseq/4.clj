(require '[clojure.string :refer [split]])

(def dict
  (into (sorted-set) ; <1>
    (split (slurp "/usr/share/dict/words") #"\s+")))

(defn complete [w dict] ; <2>
  (take 4 (subseq dict >= w)))

(map #(complete % dict) ["c" "cl" "clo" "clos" "closu"]) ; <3>
;; (("c" "ca" "caam" "caama")
;;  ("clabber" "clabbery" "clachan" "clack")
;;  ("cloaca" "cloacal" "cloacaline" "cloacean")
;;  ("closable" "close" "closecross" "closed")
;;  ("closure" "clot" "clotbur" "clote"))