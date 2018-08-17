(require '[clojure.set :as s])

(s/select #(> (:age %) 30) users) ; <1>

;; #{{:id 3, :name "amanda", :age 63, :type "personal"}}

(s/project ; <2>
  (s/join users accounts {:user-id :user-id}) ; <3>
  [:user-id :acc-id :name])

;; #{{:user-id 2, :acc-id 2, :name "jake"}
;;   {:user-id 1, :acc-id 1, :name "john"}
;;   {:user-id 1, :acc-id 3, :name "john"}}

(s/project
  (s/join users accounts {:user-id :user-id})
  [:user-id :acc-id :type]) ; <4>

;; #{{:user-id 2, :acc-id 2, :type "saving"}
;;   {:user-id 1, :acc-id 1, :type "saving"}
;;   {:user-id 1, :acc-id 3, :type "debit"}}

(s/project
  (s/join users (s/rename accounts {:type :atype})) ; <5>
  [:user-id :acc-id :type :atype])

;; #{{:user-id 1, :acc-id 1, :type "personal", :atype "saving"}
;;   {:user-id 2, :acc-id 2, :type "company", :atype "saving"}
;;   {:user-id 1, :acc-id 3, :type "personal", :atype "debit"}}

(s/index users [:type]) ; <6>

;; {{:type "company"}
;;  #{{:user-id 2, :name "jake", :age 28, :type "company"}},
;;  {:type "personal"}
;;  #{{:user-id 3, :name "amanda", :age 63, :type "personal"}
;;    {:user-id 1, :name "john", :age 22, :type "personal"}}}
