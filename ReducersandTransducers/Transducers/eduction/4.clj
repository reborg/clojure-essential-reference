(import 'java.util.Date)

(defn- merge-into [k ks]    ; <1>
  (map (fn [m]
    (merge (m k) (select-keys m ks)))))

(defn- update-at [k f]
  (map (fn [m]
    (update m k f))))

(defn- if-key [k]
  (filter (fn [m]
    (if k (m k) true))))

(defn if-equal [k v]
  (filter (fn [m]
    (if v (= (m k) v) true))))

(defn if-range [k-min k-max v]
  (filter (fn [m]
    (if v (<= (m k-min) v (m k-max)) true))))

(def prepare-data           ; <2>
  (comp
    (merge-into :product [:fee-attribute :created-at])
    (update-at :created-at #(Date. %))))

(defn filter-data [params]  ; <3>
  (comp
    (if-key :visible)
    (if-key :online)
    (if-equal :company-id (params :company-id))
    (if-key (params :repayment-method))
    (if-range :min-loan-amount
              :max-loan-amount
              (params :loan-amount))))

(defn xform [params]        ; <4>
  (comp
    prepare-data
    (filter-data params)))