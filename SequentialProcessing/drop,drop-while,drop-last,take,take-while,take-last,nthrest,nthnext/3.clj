(def hub-sample ; <1>
 [[401 7  :mar "-0800" :GET 1.1 12846]
  [200 9  :mar "-0800" :GET 1.1 4523]
  [200 2  :mar "-0800" :GET 1.1 6291]
  [401 17 :mar "-0800" :GET 1.1 7352]
  [200 23 :mar "-0800" :GET 1.1 5253]
  [200 7  :mar "-0800" :GET 1.1 11382]
  [400 27 :mar "-0800" :GET 1.1 4924]
  [200 27 :mar "-0800" :GET 1.1 12851]])

(defn error? [code month] ; <2>
  (and (= (>= code 400) (= :mar month))))

(defn process-errors [hub-messages] ; <3>
  (filter #(let [[code _ month] (take 3 %)]
    (error? code month))
    hub-sample))

(process-errors hub-sample)
;; ([401 7 :mar "-0800" :GET 1.1 12846]
;;  [401 17 :mar "-0800" :GET 1.1 7352]
;;  [400 27 :mar "-0800" :GET 1.1 4924])