(ns import-local-java-4.core
  (:import (java2import MyLocalClass1
                        MyLocalClass2)))
;; There is a treasure trove of useful import examples here:
;; https://clojuredocs.org/clojure.core/import

;; Call the 0-arity constructor in MyLocalClass1:
(def uut1 (new MyLocalClass1))

;; Call the 2-arity constructor in MyLocalClass2:
(def uut2 (new MyLocalClass2 -6 "my name is fred"))

;; Now at the REPL, you should be able to call setters & getters of our objects:
;; import-local-java-4.core=> (.getX uut2)
;; -6
;;
;; import-local-java-4.core=> (.getY uut2)
;; "my name is fred"

;; Happy Clojuring and Java-ing!
