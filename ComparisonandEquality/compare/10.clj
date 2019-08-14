(map compare [:a :my/a :a :my/a :abc123/a]                    ; <1>
             [:z :my/z :my/a :a :abc/a ])
                                                              ;; (-25 -25 -1 1 3)

(map compare ['a 'my/a 'a 'my/a 'abc123/a]                    ; <2>
             ['z 'my/z 'my/a 'a 'abc/a ])
                                                              ;; (-25 -25 -1 1 3)
