(create-ns 'a)

(ns my.ns
  (:refer a) ; <1>
  (:refer-clojure :exclude [+ - * /]) ; <2>
  (:import java.util.Date)  ; <3>
  (:require (clojure.set))  ; <4>
  (:use (clojure.xml))      ; <5>
  (:gen-class))             ; <6>