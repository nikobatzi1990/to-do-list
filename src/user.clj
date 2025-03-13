(ns user
  (:require [migratus.core] :as migratus))

(defn migrate []
  (migratus/migrate ()))