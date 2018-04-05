(every? seq (list [:a] #{} "hey" nil {:a 1})) ; <1>
;; false