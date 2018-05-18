(def customers-format ; <1>
  (array-map
    (with-meta 'TITLE  {:db :title   }) (checkfn #{"Mrs" "Miss" "Mr"})
    (with-meta 'FIRST  {:db :name    }) (checkfn (comp some? seq))
    (with-meta 'LAST   {:db :surname }) (checkfn (comp some? seq))
    (with-meta 'NUMBER {:db :n       }) (checkfn #(re-find #"^\d+$" %))
    (with-meta 'STREET {:db :address }) (checkfn (comp some? seq))
    (with-meta 'CITY   {:db :town    }) (checkfn (comp some? seq))))

(map (comp :db meta) (keys customers-format)) ; <2>
;; (:title :name :surname :n :address :town)