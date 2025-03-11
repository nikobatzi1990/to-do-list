(ns db
  (:require [next.jdbc :as jdbc]))
  
  (def db {:dbtype "h2" :dbname "to-do-list"})
  (def ds (jdbc/get-datasource db))
  
  (jdbc/execute! ds ["
  create table tasks (
    id int auto_increment primary key,
    task varchar(255)
  )"])
  
  (jdbc/execute! ds ["
  insert into tasks(task)
    values('do laundry')"])
  
  (jdbc/execute! ds ["select * from tasks"])