(def libs {:async [:analyzer.jvm] ; <1>
           :analyzer.jvm [:memoize :analyzer :reader :asm]
           :memoize [:cache]
           :cache [:priority-map]
           :priority-map []
           :asm []})

(mapcat libs (:analyzer.jvm libs)) ; <2>
;; (:cache)