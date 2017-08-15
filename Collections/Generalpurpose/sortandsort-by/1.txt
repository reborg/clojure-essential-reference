(sort
  ([coll])
  ([^java.util.Comparator comp coll]))

(sort-by
  ([keyfn coll])
  ([keyfn ^java.util.Comparator comp coll]))