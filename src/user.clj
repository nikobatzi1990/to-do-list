(ns user
  (:require [migratus.core :as migratus]))

(def config {:store :database
             :migration-dir "resources/migrations"
             :db {:dbtype "h2"
                  :dbname "to-do-list"
                  :host "localhost"
                  :user "username"
                  :password "password"}})

(migratus/init config)

(defn migrate []
  (migratus/migrate config))

(defn create-migration [name]
  (migratus.core/create config name))

(defn rollback-migration []
  (migratus/rollback config))

(migrate)
(create-migration "create-database")