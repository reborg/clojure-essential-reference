(let [{:keys [::x foo/bar]} {::x 1 :foo/bar 2}]
  [x bar])
;; [1 2]