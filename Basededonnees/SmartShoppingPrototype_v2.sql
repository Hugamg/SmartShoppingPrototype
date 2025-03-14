-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           10.4.32-MariaDB - mariadb.org binary distribution
-- SE du serveur:                Win64
-- HeidiSQL Version:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Listage de la structure de la base pour smartshoppingprototype
CREATE DATABASE IF NOT EXISTS `smartshoppingprototype` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `smartshoppingprototype`;

-- Listage de la structure de table smartshoppingprototype. calorie
CREATE TABLE IF NOT EXISTS `calorie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.calorie : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. composer
CREATE TABLE IF NOT EXISTS `composer` (
  `id_recette` int(11) NOT NULL,
  `id_ingredient` int(11) NOT NULL,
  PRIMARY KEY (`id_recette`,`id_ingredient`),
  KEY `id_ingredient` (`id_ingredient`),
  CONSTRAINT `composer_ibfk_1` FOREIGN KEY (`id_recette`) REFERENCES `recette` (`id`),
  CONSTRAINT `composer_ibfk_2` FOREIGN KEY (`id_ingredient`) REFERENCES `ingredient` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.composer : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. disposer
CREATE TABLE IF NOT EXISTS `disposer` (
  `id_repas` int(11) NOT NULL,
  `id_recette` int(11) NOT NULL,
  PRIMARY KEY (`id_repas`,`id_recette`),
  KEY `id_recette` (`id_recette`),
  CONSTRAINT `disposer_ibfk_1` FOREIGN KEY (`id_repas`) REFERENCES `repas` (`id`),
  CONSTRAINT `disposer_ibfk_2` FOREIGN KEY (`id_recette`) REFERENCES `recette` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.disposer : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. fournir
CREATE TABLE IF NOT EXISTS `fournir` (
  `id_recette` int(11) NOT NULL,
  `id_ustensile` int(11) NOT NULL,
  PRIMARY KEY (`id_recette`,`id_ustensile`),
  KEY `id_ustensile` (`id_ustensile`),
  CONSTRAINT `fournir_ibfk_1` FOREIGN KEY (`id_recette`) REFERENCES `recette` (`id`),
  CONSTRAINT `fournir_ibfk_2` FOREIGN KEY (`id_ustensile`) REFERENCES `ustensile` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.fournir : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. ingredient
CREATE TABLE IF NOT EXISTS `ingredient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `quantite` decimal(2,2) NOT NULL,
  `ingredient_id` int(11) NOT NULL,
  `id_qualite` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ingredient_id` (`ingredient_id`),
  KEY `id_qualite` (`id_qualite`),
  CONSTRAINT `ingredient_ibfk_1` FOREIGN KEY (`ingredient_id`) REFERENCES `type_ingredient` (`id`),
  CONSTRAINT `ingredient_ibfk_2` FOREIGN KEY (`id_qualite`) REFERENCES `calorie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.ingredient : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. recette
CREATE TABLE IF NOT EXISTS `recette` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.recette : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. repas
CREATE TABLE IF NOT EXISTS `repas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `date_repas` date DEFAULT NULL,
  `personne` decimal(7,1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.repas : ~2 rows (environ)
INSERT INTO `repas` (`id`, `nom`, `type`, `date_repas`, `personne`) VALUES
	(7, 'midi', NULL, NULL, NULL),
	(8, 'soir', NULL, NULL, NULL);

-- Listage de la structure de table smartshoppingprototype. type_ingredient
CREATE TABLE IF NOT EXISTS `type_ingredient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.type_ingredient : ~0 rows (environ)

-- Listage de la structure de table smartshoppingprototype. ustensile
CREATE TABLE IF NOT EXISTS `ustensile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Listage des données de la table smartshoppingprototype.ustensile : ~0 rows (environ)

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
