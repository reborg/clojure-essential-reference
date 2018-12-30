(binding [*ns* (the-ns 'myns)] ; <1>
  (refer-clojure
    :only ['+ '-]
    :rename {'+ 'plus '- 'minus}))