-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 26 mai 2025 à 06:22
-- Version du serveur : 9.1.0
-- Version de PHP : 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `smartshoppingprototype`
--

-- --------------------------------------------------------

--
-- Structure de la table `calorie`
--

DROP TABLE IF EXISTS `calorie`;
CREATE TABLE IF NOT EXISTS `calorie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `gramme` decimal(8,3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `calorie`
--

INSERT INTO `calorie` (`id`, `nom`, `gramme`) VALUES
(1, '10', 0.000),
(2, '20', 0.000),
(3, '30', 0.000),
(4, '40', 0.000),
(5, '50', 0.000),
(6, '60', 0.000),
(7, '70', 0.000),
(8, '80', 0.000),
(9, '90', 0.000),
(10, '100', 0.000),
(11, '120', 0.000),
(12, '140', 0.000),
(13, '160', 0.000),
(14, '180', 0.000),
(15, '200', 0.000),
(16, '220', 0.000),
(17, '240', 0.000),
(18, '260', 0.000),
(19, '280', 0.000),
(20, '300', 0.000),
(21, '350', 0.000),
(22, '400', 0.000),
(23, '450', 0.000),
(24, '500', 0.000),
(25, '600', 0.000),
(26, '700', 0.000),
(27, '800', 0.000),
(28, '900', 0.000),
(29, '1000', 0.000),
(30, '1200', 0.000);

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
CREATE TABLE IF NOT EXISTS `ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `id_type_ingredient` int NOT NULL,
  `id_calorie` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_type_ingredient` (`id_type_ingredient`) USING BTREE,
  KEY `id_calorie` (`id_calorie`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=91 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `ingredient`
--

INSERT INTO `ingredient` (`id`, `nom`, `id_type_ingredient`, `id_calorie`) VALUES
(1, 'Carotte', 1, 3),
(2, 'Pomme', 2, 5),
(3, 'Poulet', 3, 15),
(4, 'Saumon', 4, 20),
(5, 'Yaourt', 5, 10),
(6, 'Riz', 6, 12),
(7, 'Œuf', 7, 8),
(8, 'Lentilles', 8, 9),
(9, 'Basilic', 9, 1),
(10, 'Huile d’olive', 10, 25),
(11, 'Courgette', 1, 4),
(12, 'Orange', 2, 6),
(13, 'Bœuf', 3, 18),
(14, 'Thon', 4, 22),
(15, 'Fromage blanc', 5, 11),
(16, 'Quinoa', 6, 14),
(17, 'Oeuf dur', 7, 7),
(18, 'Pois chiches', 8, 13),
(19, 'Coriandre', 9, 2),
(20, 'Beurre', 10, 28),
(21, 'Brocoli', 1, 5),
(22, 'Fraise', 2, 4),
(23, 'Jambon', 3, 17),
(24, 'Truite', 4, 19),
(25, 'Crème fraîche', 5, 12),
(26, 'Semoule', 6, 16),
(27, 'Blanc d’œuf', 7, 6),
(28, 'Haricots rouges', 8, 14),
(29, 'Aneth', 9, 3),
(30, 'Saindoux', 10, 30),
(31, 'Tomate', 1, 3),
(32, 'Banane', 2, 7),
(33, 'Steak haché', 3, 20),
(34, 'Sardine', 4, 23),
(35, 'Mozzarella', 5, 9),
(36, 'Pain complet', 6, 15),
(37, 'Omelette', 7, 10),
(38, 'Soja', 8, 13),
(39, 'Thym', 9, 2),
(40, 'Mayonnaise', 10, 29),
(41, 'Poivron', 1, 4),
(42, 'Pêche', 2, 5),
(43, 'Escalope de dinde', 3, 16),
(44, 'Maquereau', 4, 21),
(45, 'Camembert', 5, 11),
(46, 'Avoine', 6, 14),
(47, 'Œuf poché', 7, 7),
(48, 'Haricots blancs', 8, 12),
(49, 'Romarin', 9, 3),
(50, 'Huile de coco', 10, 27),
(51, 'Chou-fleur', 1, 4),
(52, 'Kiwi', 2, 6),
(53, 'Saucisson', 3, 18),
(54, 'Tilapia', 4, 22),
(55, 'Kéfir', 5, 10),
(56, 'Boulgour', 6, 15),
(57, 'Œuf au plat', 7, 8),
(58, 'Pois cassés', 8, 14),
(59, 'Sauge', 9, 2),
(60, 'Crème de coco', 10, 26),
(61, 'Radis', 1, 3),
(62, 'Melon', 2, 7),
(63, 'Foie de veau', 3, 20),
(64, 'Haddock', 4, 23),
(65, 'Brie', 5, 9),
(66, 'Farine complète', 6, 16),
(67, 'Œuf brouillé', 7, 10),
(68, 'Fèves', 8, 13),
(69, 'Estragon', 9, 3),
(70, 'Ghee', 10, 28),
(71, 'Salade', 1, 2),
(72, 'Ananas', 2, 5),
(73, 'Magret de canard', 3, 19),
(74, 'Bar', 4, 21),
(75, 'Lait fermenté', 5, 8),
(76, 'Orge', 6, 14),
(77, 'Œuf dur', 7, 7),
(78, 'Soja vert', 8, 12),
(79, 'Fenouil', 9, 2),
(80, 'Huile de sésame', 10, 25),
(81, 'Épinard', 1, 3),
(82, 'Pamplemousse', 2, 6),
(83, 'Boudin noir', 3, 17),
(84, 'Hareng', 4, 22),
(85, 'Roquefort', 5, 11),
(86, 'Seigle', 6, 15),
(87, 'Œuf à la coque', 7, 9),
(88, 'Lupin', 8, 13),
(89, 'Menthe', 9, 1),
(90, 'Huile de palme', 10, 30);

-- --------------------------------------------------------

--
-- Structure de la table `recette`
--

DROP TABLE IF EXISTS `recette`;
CREATE TABLE IF NOT EXISTS `recette` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `recette`
--

INSERT INTO `recette` (`id`, `nom`) VALUES
(2, 'Ratatouille'),
(3, 'Quiche Lorraine'),
(4, 'Poulet basquaise'),
(5, 'Soupe de légumes'),
(6, 'Tarte aux pommes'),
(7, 'Pizza margherita'),
(8, 'Couscous'),
(9, 'Paëlla'),
(10, 'Boeuf bourguignon'),
(11, 'Spaghetti bolognaise'),
(12, 'Salade niçoise'),
(13, 'Lasagnes'),
(14, 'Blanquette de veau'),
(15, 'Chili con carne'),
(16, 'Omelette aux champig'),
(17, 'Tarte au citron'),
(18, 'Riz cantonais'),
(19, 'Filet mignon'),
(20, 'Mousse au chocolat'),
(21, 'Fondue savoyarde'),
(22, 'Risotto aux champign'),
(23, 'Cassoulet'),
(24, 'Pot-au-feu'),
(25, 'Hachis parmentier'),
(26, 'Tarte tatin'),
(27, 'Clafoutis aux cerise'),
(28, 'Croque-monsieur'),
(29, 'Sandwich club'),
(30, 'Burger maison'),
(31, 'Gratin dauphinois'),
(32, 'Curry de poulet'),
(33, 'Boulettes de viande'),
(34, 'Salade de fruits'),
(35, 'Pizza 4 fromages');

-- --------------------------------------------------------

--
-- Structure de la table `recette_ingredient`
--

DROP TABLE IF EXISTS `recette_ingredient`;
CREATE TABLE IF NOT EXISTS `recette_ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quantite` decimal(8,3) DEFAULT NULL,
  `id_recette` int DEFAULT NULL,
  `id_ingredient` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_recette` (`id_recette`),
  KEY `id_ingredient` (`id_ingredient`)
) ENGINE=MyISAM AUTO_INCREMENT=89 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `recette_ingredient`
--

INSERT INTO `recette_ingredient` (`id`, `quantite`, `id_recette`, `id_ingredient`) VALUES
(1, 1.000, 2, 7),
(2, 1.000, 2, 19),
(3, 1.000, 2, 25),
(4, 1.000, 2, 48),
(5, 1.000, 3, 4),
(6, 1.000, 3, 14),
(7, 1.000, 3, 55),
(8, 1.000, 4, 1),
(9, 1.000, 4, 9),
(10, 1.000, 4, 22),
(11, 1.000, 5, 3),
(12, 1.000, 5, 16),
(13, 1.000, 5, 39),
(14, 1.000, 6, 8),
(15, 1.000, 6, 13),
(16, 1.000, 6, 44),
(17, 1.000, 7, 2),
(18, 1.000, 7, 17),
(19, 1.000, 7, 23),
(20, 1.000, 8, 6),
(21, 1.000, 8, 11),
(22, 1.000, 8, 27),
(23, 1.000, 9, 10),
(24, 1.000, 9, 34),
(25, 1.000, 9, 53),
(26, 1.000, 10, 15),
(27, 1.000, 10, 24),
(28, 1.000, 10, 31),
(29, 1.000, 11, 18),
(30, 1.000, 11, 36),
(31, 1.000, 11, 62),
(32, 1.000, 12, 20),
(33, 1.000, 12, 28),
(34, 1.000, 12, 47),
(35, 1.000, 13, 30),
(36, 1.000, 13, 35),
(37, 1.000, 13, 41),
(38, 1.000, 14, 21),
(39, 1.000, 14, 38),
(40, 1.000, 14, 52),
(41, 1.000, 15, 26),
(42, 1.000, 15, 29),
(43, 1.000, 15, 40),
(44, 1.000, 16, 32),
(45, 1.000, 16, 43),
(46, 1.000, 16, 57),
(47, 1.000, 17, 37),
(48, 1.000, 17, 46),
(49, 1.000, 17, 63),
(50, 1.000, 18, 42),
(51, 1.000, 18, 49),
(52, 1.000, 18, 59),
(53, 1.000, 19, 50),
(54, 1.000, 19, 54),
(55, 1.000, 19, 61),
(56, 1.000, 20, 45),
(57, 1.000, 20, 56),
(58, 1.000, 20, 65),
(59, 1.000, 21, 51),
(60, 1.000, 21, 58),
(61, 1.000, 21, 67),
(62, 1.000, 22, 68),
(63, 1.000, 22, 69),
(64, 1.000, 22, 70),
(65, 1.000, 23, 71),
(66, 1.000, 23, 72),
(67, 1.000, 23, 73),
(68, 1.000, 24, 74),
(69, 1.000, 24, 75),
(70, 1.000, 24, 76),
(71, 1.000, 25, 77),
(72, 1.000, 25, 78),
(73, 1.000, 25, 79),
(74, 1.000, 26, 80),
(75, 1.000, 26, 81),
(76, 1.000, 26, 82),
(77, 1.000, 27, 83),
(78, 1.000, 27, 84),
(79, 1.000, 27, 85),
(80, 1.000, 28, 86),
(81, 1.000, 28, 87),
(82, 1.000, 28, 88),
(83, 1.000, 29, 89),
(84, 1.000, 29, 90),
(85, 1.000, 29, 91),
(86, 1.000, 30, 92),
(87, 1.000, 30, 93),
(88, 1.000, 30, 94);

-- --------------------------------------------------------

--
-- Structure de la table `repas`
--

DROP TABLE IF EXISTS `repas`;
CREATE TABLE IF NOT EXISTS `repas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date_repas` date DEFAULT NULL,
  `personne` decimal(7,1) DEFAULT NULL,
  `id_utilisateur` int DEFAULT NULL,
  `id_type` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_utilisateur` (`id_utilisateur`),
  KEY `id_type` (`id_type`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `repas`
--

INSERT INTO `repas` (`id`, `date_repas`, `personne`, `id_utilisateur`, `id_type`) VALUES
(7, '2025-01-14', 3.0, 1, 5),
(6, '2024-10-12', 3.0, 1, 5),
(5, '2024-10-12', 2.0, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `repas_recette`
--

DROP TABLE IF EXISTS `repas_recette`;
CREATE TABLE IF NOT EXISTS `repas_recette` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_repas` int DEFAULT NULL,
  `id_recette` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_repas` (`id_repas`),
  KEY `id_recette` (`id_recette`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `repas_recette`
--

INSERT INTO `repas_recette` (`id`, `id_repas`, `id_recette`) VALUES
(1, 4, 14),
(2, 4, 18),
(3, 5, 2),
(4, 5, 7),
(5, 6, 18),
(6, 6, 24),
(7, 6, 27),
(8, 7, 18),
(9, 7, 24),
(10, 7, 27);

-- --------------------------------------------------------

--
-- Structure de la table `type_ingredient`
--

DROP TABLE IF EXISTS `type_ingredient`;
CREATE TABLE IF NOT EXISTS `type_ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `type_ingredient`
--

INSERT INTO `type_ingredient` (`id`, `nom`) VALUES
(1, 'Légumes'),
(2, 'Fruits'),
(3, 'Viandes'),
(4, 'Poissons'),
(5, 'Laitages'),
(6, 'Céréales'),
(7, 'Œufs'),
(8, 'Légumineuses'),
(9, 'Herbes et épices'),
(10, 'Huiles et graisses'),
(11, 'Féculants');

-- --------------------------------------------------------

--
-- Structure de la table `type_repas`
--

DROP TABLE IF EXISTS `type_repas`;
CREATE TABLE IF NOT EXISTS `type_repas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `type_repas`
--

INSERT INTO `type_repas` (`id`, `nom`) VALUES
(1, 'Petit-déjeuner'),
(2, 'Collation du matin'),
(3, 'Déjeuner'),
(4, 'Collation de l\'après-midi'),
(5, 'Dîner');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int NOT NULL AUTO_INCREMENT,
  `identifiant` varchar(40) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `identifiant` (`identifiant`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `identifiant`, `nom`, `prenom`, `mdp`) VALUES
(1, 'user01', 'Dupont', 'Martin', 'mdp1234'),
(2, 'user02', 'Lefevre', 'Claire', 'qwerty5678'),
(3, 'user03', 'Lemoine', 'Pierre', 'passw0rd2025'),
(4, 'user04', 'Martin', 'Sophie', 'abcD1234'),
(5, 'user05', 'Leblanc', 'Jacques', 'mypassword999'),
(6, 'user06', 'Dufresne', 'Isabelle', 'iL0veCoding!'),
(7, 'user07', 'Dupuis', 'François', 'superSecure1'),
(8, 'user08', 'Robert', 'Emilie', 'code1234@2025'),
(9, 'user09', 'Lebrun', 'Hugo', 'easyPass2025'),
(10, 'user10', 'Gauthier', 'Nathalie', 'n4thG@uth2025'),
(11, 'user11', 'Bernard', 'Michel', 'B3rn4rdMichel'),
(12, 'user12', 'Simon', 'Elodie', 'S1m0nElodie'),
(13, 'user13', 'Moreau', 'Amandine', 'amandine2025'),
(14, 'user14', 'Lefevre', 'David', 'L3f3vr3David'),
(15, 'user15', 'Pires', 'Lucie', 'Lup!cer23'),
(16, 'user16', 'Robert', 'Antoine', 'Antoine2025*'),
(17, 'user17', 'Roussel', 'Julien', 'rouss3lJu1en'),
(18, 'user18', 'Bourgeois', 'Charlotte', 'ch4rL0tt3B'),
(19, 'user19', 'Dupuy', 'Louis', 'Dupuy2025!'),
(20, 'user20', 'Lemoine', 'Céline', 'CelineL!m2025'),
(21, 'h.amaglio', 'AMAGLIO', 'Hugo', '16121992');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
