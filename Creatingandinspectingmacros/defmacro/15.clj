(let [a 1
      b [:foo :bar]]
  (let [[a b] (mapv str [a b])]
    [a b]))