(let [x "123"] (if (string? x) (Integer. x) x)) ; <1>
(let [x "123"] (cond-> x (string? x) Integer.)) ; <2>