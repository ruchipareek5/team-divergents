CREATE SCHEMA IF NOT EXISTS msde;
GRANT ALL PRIVILEGES ON *.* TO 'msde_db_user'@'localhost' IDENTIFIED BY 'Msde1234$$' with GRANT option;
GRANT SELECT  ON `msde`.* TO 'msde_user'@'localhost' IDENTIFIED BY 'myteam';
GRANT SELECT,UPDATE,INSERT,DELETE  ON `msde`.* TO 'msde_app_user'@'localhost' IDENTIFIED BY 'MsdeApp123$$';