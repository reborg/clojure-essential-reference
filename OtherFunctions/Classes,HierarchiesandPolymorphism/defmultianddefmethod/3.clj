(defn- add-ops [hierarchy ops] ; <1>
  (reduce
    (fn [h [op [f kind]]] (derive h op kind))
    hierarchy
    ops))

(def hierarchy ; <2>
  (add-ops (make-hierarchy) ops))

(defn resolve-op [ops op] ; <3>
  (first (ops op)))

(def calculate nil)
(defmulti calculate ; <4>
  (fn [form] (:op form))
  :hierarchy #'hierarchy)

(defmethod calculate :varargs ; <5>
  [{:keys [op expr]}]
  (apply (resolve-op ops op) (map calculate expr)))

(defmethod calculate :onearg
  [{op :op [x] :expr}]
  ((resolve-op ops op) (calculate x)))

(defmethod calculate :twoargs
  [{op :op [x y] :expr}]
  ((resolve-op ops op) (calculate x) (calculate y)))

(defmethod calculate nil
  [[_ number]] ; <6>
  number)

(defmethod calculate :default
  [form]
  (throw
    (RuntimeException.
      (str "Don't know how to calculate " form))))

(calculate total-payments) ; <7>
;; 205659.10262863498