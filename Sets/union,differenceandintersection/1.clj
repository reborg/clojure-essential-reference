(union
  ([])
  ([s1])
  ([s1 s2])
  ([s1 s2 & sets]))

(intersection
  ([s1])
  ([s1 s2])
  ([s1 s2 & sets]))

(difference
  ([s1])
  ([s1 s2])
  ([s1 s2 & sets]))