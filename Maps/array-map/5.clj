(def query-results ; <1>
  [{:date "01/05/2012 12:51" :surname "Black"
    :name "Mary" :title "Mrs" :n "20"
    :address "Hillbank St" :town "Kelso" :postcode "TD5 7JW"}
   {:date "01/05/2012 17:02" :surname "Bowie"
    :name "Chris" :title "Miss" :n "44"
    :address "Hall Rd" :town "Sheffield" :postcode "S5 7PW"}
   {:date "01/05/2012 17:08" :surname "Burton"
    :name "John" :title "Mr" :n "41"
    :address "Warren Rd" :town "Yarmouth" :postcode "NR31 9AB"}])

(defn checkfn [predicate] ; <2>
  (fn [val]
    (let [res (predicate val)]
      (if (predicate val)
        val
        (throw (RuntimeException.
          (str "Error: '" val "' is not valid")))))))

(def customers-format ; <3>
  (array-map
    'TITLE  [:title (checkfn #{"Mrs" "Miss" "Mr"})]
    'FIRST  [:name (checkfn (comp some? seq))]
    'LAST   [:surname (checkfn (comp some? seq))]
    'NUMBER [:n (checkfn #(re-find #"^\d+$" %))]
    'STREET [:address (checkfn (comp some? seq))]
    'CITY   [:town (checkfn (comp some? seq))]
    'POST   [:postcode (checkfn #(re-find #"^\w{2,4} \w{2,4}$" %))]
    'JOINED [:date (checkfn #(re-find #"^\d{2}/\d{2}/\d{4} \d{2}:\d{2}$" %))]))

(defn csv-str [coll] ; <4>
  (str (apply str (interpose "," coll)) "\n"))

(defn format-row [format] ; <5>
  (fn [row]
    (let [specs (map second format)
          data (map (fn [[column checkfn]]
                      (checkfn (row column))) specs)]
      (csv-str data))))

(defn format-data [data format] ; <6>
  (let [headers (csv-str (keys format))
        body (map (format-row format) data)]
    (apply str headers (seq body))))

(println (format-data query-results customers-format)) ; <7>
;; TITLE,FIRST,LAST,NUMBER,STREET,CITY,POST,JOINED
;; Mrs,Mary,Black,20,Hillbank St,Kelso,TD5 7JW,01/05/2012 12:51
;; Miss,Chris,Bowie,44,Hall Rd,Sheffield,S5 7PW,01/05/2012 17:02
;; Mr,John,Burton,41,Warren Rd,Yarmouth,NR31 9AB,01/05/2012 17:08