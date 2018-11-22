-- MySQL Script generated by MySQL Workbench
-- 11/22/18 16:24:54
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cidade` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Cidade` VARCHAR(60) NOT NULL,
  `Endereço_id` INT NOT NULL,
  `Endereço_Pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Cidade_Endereço1_idx` (`Endereço_id` ASC, `Endereço_Pessoa_id` ASC),
  CONSTRAINT `fk_Cidade_Endereço1`
    FOREIGN KEY (`Endereço_id` , `Endereço_Pessoa_id`)
    REFERENCES `mydb`.`Endereço` (`id` , `Pessoa_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UF`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`UF` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(2) NOT NULL,
  `Cidade_id` INT NOT NULL,
  `Cidade_Endereço_id` INT NOT NULL,
  `Cidade_Endereço_Pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_UF_Cidade1_idx` (`Cidade_id` ASC, `Cidade_Endereço_id` ASC, `Cidade_Endereço_Pessoa_id` ASC),
  CONSTRAINT `fk_UF_Cidade1`
    FOREIGN KEY (`Cidade_id` , `Cidade_Endereço_id` , `Cidade_Endereço_Pessoa_id`)
    REFERENCES `mydb`.`Cidade` (`id` , `Endereço_id` , `Endereço_Pessoa_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
