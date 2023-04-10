CREATE database login_java;
CREATE TABLE `login_java`.`tb_user` (`user_id` INT NOT NULL AUTO_INCREMENT , `user_nom` VARCHAR(150) NOT NULL , `user_mail` VARCHAR(200) NOT NULL , `user_pass` VARCHAR(15) NOT NULL , PRIMARY KEY (`user_id`)) ENGINE = InnoDB;

INSERT INTO `tb_user` (`user_id`, `user_nom`, `user_mail`, `user_pass`) VALUES (NULL, 'Leslie Cardoza', 'leslieal2202@gmail.com', '2207');

select*from tb_user;
select*from tb_user where user_mail='leslieal2202@gmail.com' and user_pass='2207';

