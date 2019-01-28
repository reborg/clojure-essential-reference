(binding [*data-readers* {'uuid (constantly 'UUID)}] ; <1>
  (read-string "#uuid \"374c8c4-fd89-4f1b-a11f-42e334ccf5ce\""))
;; UUID