(def a-var {:a 1})
(alter-var-root
  #'a-var
  update-in [:a] inc) ; <1>
{:a 2}