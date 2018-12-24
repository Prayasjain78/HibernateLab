--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `database`.`myemployees3` DROP PRIMARY KEY;

DROP TABLE `database`.`myemployees3`;

CREATE TABLE `database`.`myemployees3` (
	`eid` INT NOT NULL,
	`ename` VARCHAR(255),
	`city` VARCHAR(255),
	`status` VARCHAR(255),
	`totalfee` DOUBLE,
	PRIMARY KEY (`eid`)
);

