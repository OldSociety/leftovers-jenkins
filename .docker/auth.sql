CREATE USER 'leftovers'@'%' IDENTIFIED BY 'rootpassword';
GRANT ALL PRIVILEGES ON *.* TO 'leftovers'@'%' WITH GRANT OPTION;