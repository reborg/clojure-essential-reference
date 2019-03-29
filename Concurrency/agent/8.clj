(require '[clojure.string :refer [split]])
(def alpha (mapv agent (repeat 26 0))) ; <1>
(def others (agent 0)) ; <2>
(def words (agent {})) ; <3>

(def war-and-peace "http://www.gutenberg.org/files/2600/2600-0.txt")
(def book (slurp war-and-peace))

(send-off words ; <4>
  (fn [state]
    (doseq [letter book
            :let [l (Character/toLowerCase letter)
                  idx (- (int l) (int \a))]]
      (send (get alpha idx others) inc))
      (release-pending-sends) ; <5>
    (merge-with + state (frequencies (split book #"\s+")))))

(apply await alpha)
(map deref alpha) ; <6>
;; (202719 34657 61621 118297 313572
;;  54901 51327 167415 172257 2575 20432
;;  96530 61648 184185 190083 45533 2331
;;  148431 162897 226414 64400 27087
;;  59209 4384 46236 2388)