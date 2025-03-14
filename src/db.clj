(ns db
  (:require [next.jdbc :as jdbc]))
  
  (def db {:dbtype "h2" :dbname "to-do-list"})
  (def ds (jdbc/get-datasource db))
  
 (jdbc/execute! ds ["select * from task"])