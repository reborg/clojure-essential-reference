(let [{:keys [::x foo/bar]} {::x 1 :foo/bar 2}] ; <1>
  [x bar])
;; [1 2]