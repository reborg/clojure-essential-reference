(binding [*compile-path* "."
          *compiler-options* {:elide-meta [:doc :t1]}] ; <1>
  (compile 'example))