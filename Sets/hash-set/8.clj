(def s #{:a :b :c}) ; <1>

(def powerset-of-s ; <2>
  #{#{} #{:a} #{:b} #{:c} #{:a :b} #{:a :c} #{:b :c} #{:a :b :c}})