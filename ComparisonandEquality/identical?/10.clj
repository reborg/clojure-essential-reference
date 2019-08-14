(let [x 1000 y x]
  (identical? (Long/valueOf x) (Long/valueOf y)))
                                                              ;; false