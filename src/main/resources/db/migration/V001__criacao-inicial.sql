CREATE TABLE `patient_information_cvd` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(50) DEFAULT NULL,
    `age` int(11) DEFAULT NULL,
    `sex` varchar(45) DEFAULT NULL,
    `birth_date` varchar(45) DEFAULT NULL,
    `cpf` varchar(45) DEFAULT NULL,
    `professsion` varchar(100) DEFAULT NULL,
    `schooling` varchar(45) DEFAULT NULL,
    `adress` varchar(130) DEFAULT NULL,
    `income` varchar(45) DEFAULT NULL,
    `marital_status` varchar(45) DEFAULT NULL,
    `imc` double DEFAULT NULL,
    `group` varchar(45) DEFAULT NULL,
    `vaccination` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `cytokines_covid` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `patient-information-id` int(11) DEFAULT NULL,
    `FGF-basic` double DEFAULT NULL,
    `G-CSF` double DEFAULT NULL,
    `GM-CSF` double DEFAULT NULL,
    `PDGF` double DEFAULT NULL,
    `VEGF` double DEFAULT NULL,
    `IL-1-beta` double DEFAULT NULL,
    `IL-6` double DEFAULT NULL,
    `IL-12p70` double DEFAULT NULL,
    `IFN-gamma` double DEFAULT NULL,
    `TNF-alpha` double DEFAULT NULL,
    `CCL2` double DEFAULT NULL,
    `CCL3` double DEFAULT NULL,
    `CCL4` double DEFAULT NULL,
    `CCL5` double DEFAULT NULL,
    `Eotaxin` double DEFAULT NULL,
    `IL-4` double DEFAULT NULL,
    `IL-5` double DEFAULT NULL,
    `IL-13` double DEFAULT NULL,
    `IL-2` double DEFAULT NULL,
    `IL-10` double DEFAULT NULL,
    `CXCL10` double DEFAULT NULL,
    `CXCL8` double DEFAULT NULL,
    `IL-1ra` double DEFAULT NULL,
    `IL-7` double DEFAULT NULL,
    `IL-9` double DEFAULT NULL,
    `IL-15` double DEFAULT NULL,
    `IL-17` double DEFAULT NULL,
    `DIS` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `age_group` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `group` VARCHAR(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `ethnicity` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `group` VARCHAR(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `frequency_food_consumption` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `frequency` VARCHAR(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `nutricional_data` (
    `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
    `nutricional_group` VARCHAR(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `age_group` (`group`) VALUES
('Menos de 20'), ('20 a 29'), ('30 a 39'), ('40 a 49'),
('50 a 59'), ('60 a 69'), ('70 a 79'), ('80 a 89'), ('90 a 99');
INSERT INTO `ethnicity` (`group`) VALUES ('Branca'), ('Parda'), ('Preta'), ('Amarela'), ('Indigena');
INSERT INTO `frequency_food_consumption` (`frequency`) VALUES ('Todo dia'), ('5 a 6x na semana'), ('1 a 4x na semana'),
                                                            ('1 a 3x ao mês'), ('Não consome');
INSERT INTO `nutricional_data` (`nutricional_group`) VALUES ('Eutrófico'), ('Sobrepeso'), ('Obesidade'), ('Abaixo do peso');

alter table `patient_information_cvd`
drop column `name`,
drop column `birth_date`,
drop column `cpf`;