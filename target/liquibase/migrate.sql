--  *********************************************************************
--  Update Database Script
--  *********************************************************************
--  Change Log: src/main/resources/changelog/changelog-master.xml
--  Ran at: 21/3/22 7:13 PM
--  Against: root@localhost@jdbc:mysql://localhost:3306/yox
--  Liquibase version: 3.6.3
--  *********************************************************************

--  Lock Database
UPDATE DATABASECHANGELOGLOCK SET `LOCKED` = 1, LOCKEDBY = 'WTC-L-YOGESHA (192.168.2.6)', LOCKGRANTED = '2022-03-21 19:13:07.261' WHERE ID = 1 AND `LOCKED` = 0;

--  Release Database Lock
UPDATE DATABASECHANGELOGLOCK SET `LOCKED` = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

