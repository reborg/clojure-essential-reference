(def records ; <1>
  [{(with-meta 'id {:tags [:expired]}) "1311" 'b "Mary" 'c "Mrs"}
   {(with-meta 'id {:tags []}) "4902" 'b "Jane" 'c "Miss"}
   {(with-meta 'id {:tags []}) "1201" 'b "John" 'c "Mr"}])

(def ids (keep #(find % 'id) records)) ; <2>

(-> ids first key meta :tags) ; <3>
;; [:expired]