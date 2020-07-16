(require '[clojure.java.io :as io])
(require '[clojure.string :as s])

(def file-content ; <1>
"TITLE,FIRST,LAST,NUMBER,STREET,CITY,POST,JOINED
Mrs,Mary,Black,20,Hillbank St,Kelso,TD5 7JW,01/05/2012 12:51
Miss,Chris,Bowie,44,Hall Rd,Sheffield,S5 7PW,01/05/2012 17:02
Mr,John,Burton,41,Warren Rd,Yarmouth,NR31 9AB,01/05/2012 17:08")

(defn split-line [line] ; <2>
  (s/split line #","))

(defn transform [data] ; <3>
  (let [lines (line-seq data)
        headers (split (first lines))]
    (eduction
      (map split)
      (map (partial zipmap headers)) ; <4>
      (rest lines))))

(with-open [data (io/reader (char-array file-content))] ; <5>
  (doall (transform data)))

;; ({"TITLE" "Mrs", "FIRST" "Mary", "LAST" "Black", "NUMBER" "20",
;;   "STREET" "Hillbank St", "CITY" "Kelso", "POST" "TD5 7JW",
;;   "JOINED" "01/05/2012 12:51"}
;;  {"TITLE" "Miss", "FIRST" "Chris", "LAST" "Bowie", "NUMBER" "44",
;;   "STREET" "Hall Rd", "CITY" "Sheffield", "POST" "S5 7PW",
;;   "JOINED" "01/05/2012 17:02"}
;;  {"TITLE" "Mr", "FIRST" "John", "LAST" "Burton", "NUMBER" "41",
;;   "STREET" "Warren Rd", "CITY" "Yarmouth", "POST" "NR31 9AB",
;;   "JOINED" "01/05/2012 17:08"})