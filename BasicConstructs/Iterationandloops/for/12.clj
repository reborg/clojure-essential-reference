(macroexpand
  '(for [i (range 3)] i))

(let* [main-fn
       (fn recur-fn [xs]
         (lazy-seq
           (loop [xs xs]
             (when-let [xs (seq xs)]                          ; <1>
               (if (chunked-seq? xs)
                 (let [fchunk (chunk-first xs)
                       chunk-size (int (count fchunk))
                       chunk-buff (chunk-buffer chunk-size)]
                   (if (loop [i (int 0)]
                         (if (< i chunk-size)
                           (let [i (.nth fchunk i)]
                             (do (chunk-append chunk-buff i)
                                 (recur (unchecked-inc i))))
                           true))
                     (chunk-cons
                       (chunk chunk-buff)
                       (recur-fn (chunk-rest xs)))          ; <2>
                     (chunk-cons (chunk chunk-buff) nil)))
                 (let [i (first xs)]
                   (cons i (recur-fn (rest xs)))))))))]
  (main-fn (range 3)))