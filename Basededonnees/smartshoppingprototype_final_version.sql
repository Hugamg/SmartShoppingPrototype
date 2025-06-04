-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 04 juin 2025 à 13:43
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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `ingredient`
--

INSERT INTO `ingredient` (`id`, `nom`, `id_type_ingredient`, `id_calorie`) VALUES
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
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
  `quantite` int NOT NULL,
  `id_recette` int NOT NULL,
  `id_ingredient` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_recette` (`id_recette`),
  KEY `id_ingredient` (`id_ingredient`)
) ENGINE=InnoDB AUTO_INCREMENT=404 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `recette_ingredient`
--

INSERT INTO `recette_ingredient` (`id`, `quantite`, `id_recette`, `id_ingredient`) VALUES
(8, 1, 3, 4),
(9, 1, 3, 14),
(10, 1, 3, 55),
(11, 1, 4, 9),
(12, 1, 4, 22),
(86, 1, 13, 3),
(87, 1, 13, 6),
(88, 1, 13, 11),
(89, 1, 14, 13),
(90, 1, 14, 21),
(91, 1, 14, 36),
(92, 1, 15, 5),
(93, 1, 15, 20),
(94, 1, 15, 45),
(95, 1, 16, 7),
(96, 1, 16, 31),
(97, 1, 16, 39),
(98, 1, 17, 6),
(99, 1, 17, 22),
(100, 1, 17, 60),
(101, 1, 18, 16),
(102, 1, 18, 33),
(103, 1, 18, 41),
(104, 1, 19, 63),
(105, 1, 19, 21),
(106, 1, 19, 3),
(107, 1, 20, 55),
(108, 1, 20, 75),
(109, 1, 20, 20),
(110, 1, 21, 35),
(111, 1, 21, 45),
(112, 1, 21, 85),
(113, 1, 22, 6),
(114, 1, 22, 11),
(115, 1, 22, 44),
(116, 1, 23, 8),
(117, 1, 23, 23),
(118, 1, 23, 24),
(119, 1, 24, 10),
(120, 1, 24, 25),
(121, 1, 24, 21),
(122, 1, 25, 25),
(123, 1, 25, 33),
(124, 1, 25, 41),
(125, 1, 26, 6),
(126, 1, 26, 12),
(127, 1, 26, 20),
(128, 1, 27, 22),
(129, 1, 27, 31),
(130, 1, 27, 45),
(131, 1, 28, 13),
(132, 1, 28, 35),
(133, 1, 28, 36),
(134, 1, 29, 23),
(135, 1, 29, 31),
(136, 1, 29, 56),
(137, 1, 30, 33),
(138, 1, 30, 35),
(139, 1, 30, 36),
(140, 1, 31, 5),
(141, 1, 31, 11),
(142, 1, 31, 66),
(143, 1, 32, 3),
(144, 1, 32, 39),
(145, 1, 32, 76),
(146, 1, 33, 33),
(147, 1, 33, 6),
(148, 1, 33, 41),
(149, 1, 34, 2),
(150, 1, 34, 12),
(151, 1, 34, 32),
(152, 1, 35, 35),
(153, 1, 35, 45),
(154, 1, 35, 85);

-- --------------------------------------------------------

--
-- Structure de la table `repas`
--

DROP TABLE IF EXISTS `repas`;
CREATE TABLE IF NOT EXISTS `repas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date_repas` date DEFAULT NULL,
  `personne` int DEFAULT NULL,
  `id_utilisateur` int DEFAULT NULL,
  `id_type` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_utilisateur` (`id_utilisateur`),
  KEY `id_type` (`id_type`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `repas`
--

INSERT INTO `repas` (`id`, `date_repas`, `personne`, `id_utilisateur`, `id_type`) VALUES
(10, '2025-06-04', 9, 1, 3),
(11, '2025-06-05', 2, 1, 3),
(12, '2025-06-06', 4, 1, 2),
(14, '2025-06-07', 4, 1, 5),
(15, '2025-06-07', 2, 1, 2),
(16, '2025-07-06', 8, 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `repas_recette`
--

DROP TABLE IF EXISTS `repas_recette`;
CREATE TABLE IF NOT EXISTS `repas_recette` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_repas` int NOT NULL,
  `id_recette` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_repas` (`id_repas`),
  KEY `id_recette` (`id_recette`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `repas_recette`
--

INSERT INTO `repas_recette` (`id`, `id_repas`, `id_recette`) VALUES
(6, 10, 4),
(7, 10, 25),
(8, 10, 29),
(9, 10, 34),
(10, 10, 35),
(11, 11, 4),
(12, 11, 27),
(13, 11, 30),
(14, 12, 4),
(15, 12, 27),
(16, 12, 30),
(17, 12, 33),
(18, 12, 35),
(27, 15, 15),
(28, 15, 17),
(29, 15, 19),
(30, 16, 21),
(31, 16, 26),
(32, 16, 27),
(33, 16, 31),
(34, 16, 33),
(35, 16, 34),
(40, 11, 4),
(41, 11, 27),
(42, 11, 30);

-- --------------------------------------------------------

--
-- Structure de la table `type_ingredient`
--

DROP TABLE IF EXISTS `type_ingredient`;
CREATE TABLE IF NOT EXISTS `type_ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `ingredient`
--
ALTER TABLE `ingredient`
  ADD CONSTRAINT `ingredient_ibfk_1` FOREIGN KEY (`id_type_ingredient`) REFERENCES `type_ingredient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ingredient_ibfk_2` FOREIGN KEY (`id_calorie`) REFERENCES `calorie` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `recette_ingredient`
--
ALTER TABLE `recette_ingredient`
  ADD CONSTRAINT `recette_ingredient_ibfk_1` FOREIGN KEY (`id_ingredient`) REFERENCES `ingredient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `recette_ingredient_ibfk_2` FOREIGN KEY (`id_recette`) REFERENCES `recette` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `repas`
--
ALTER TABLE `repas`
  ADD CONSTRAINT `repas_ibfk_1` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `repas_ibfk_2` FOREIGN KEY (`id_type`) REFERENCES `type_repas` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `repas_recette`
--
ALTER TABLE `repas_recette`
  ADD CONSTRAINT `repas_recette_ibfk_1` FOREIGN KEY (`id_repas`) REFERENCES `repas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `repas_recette_ibfk_2` FOREIGN KEY (`id_recette`) REFERENCES `recette` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
