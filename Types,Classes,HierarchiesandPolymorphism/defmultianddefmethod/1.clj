(def total-payments ; <1>
  {:op 'times
   :expr
   [[:loan 150000]
    {:op 'pow
     :expr
     [{:op 'plus
       :expr
       [[:incr 1]
        {:op 'divide
         :expr [[:rate 3.16]
                [:decimals 100]
                [:months 12]]}]}
      {:op 'times
       :expr [[:months 12] [:years 10]]}]}]})

(def ops ; <2>
  {'plus +
   'times *
   'divide /
   'pow #(Math/pow %1 %2)})

(defmulti calculate ; <3>
  (fn [form] (:op form)))

(defmethod calculate 'plus ; <4>
  [{:keys [op expr]}]
  (apply (ops op) (map calculate expr)))

(defmethod calculate 'times
  [{:keys [op expr]}]
  (apply (ops op) (map calculate expr)))

(defmethod calculate 'divide
  [{:keys [op expr]}]
  (apply (ops op) (map calculate expr)))

(defmethod calculate 'pow
  [{[x y] :expr}]
  (Math/pow (calculate x) (calculate y)))

(defmethod calculate nil ; <5>
  [[descr number]]
  number)

(defmethod calculate :default [form] ; <6>
  (throw (RuntimeException. (str "Don't know how to calculate" form))))

(calculate total-payments) ; <7>
;; 205659.10262863498