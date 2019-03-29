(ns myns)
(require
  '[clojure.set ; <1>
    :as se ; <2>
    :refer [union]] ; <3>
  '[clojure.string ; <4>
    :as st
    :refer :all]) ; <5>