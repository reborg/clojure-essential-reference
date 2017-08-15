(def person-table                                                           ; <1>
  [{:id 1234567 :name "Annette Kann" :age 31 :nick "Ann" :sex :f}
   {:id 1000101 :name "Emma May" :age 33 :nick "Emma" :sex :f}
   {:id 1020010 :name "Johanna Reeves" :age 31 :nick "Jackie" :sex :f}
   {:id 4209100 :name "Stephen Grossmann" :age 33 :nick "Steve" :sex :m}])

(def sort-criteria (juxt :age :nick))                                       ; <2>
(def group-criteria (juxt :age :sex))

(defn sort-by-age [t]                                                       ; <3>
  (->> t
    (sort-by sort-criteria)
    (map sort-criteria)))

(sort-by-age person-table)
;; ([31 "Ann"] [31 "Jackie"] [33 "Emma"] [33 "Steve"])

(defn group-by-age-sex [t]                                                  ; <4>
  (->> t
    (group-by group-criteria)
    (map (fn [[k v]] {k (map sort-criteria v)}))))

(group-by-age-sex person-table)
;; ({[31 :f] ([31 "Ann"] [31 "Jackie"])}
;;  {[33 :f] ([33 "Emma"])}
;;  {[33 :m] ([33 "Steve"])})