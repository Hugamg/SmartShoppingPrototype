-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 07 avr. 2025 à 16:54
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

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

CREATE TABLE `calorie` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `ratio` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `calorie`
--

INSERT INTO `calorie` (`id`, `nom`, `ratio`) VALUES
(1, '10', 0),
(2, '20', 0),
(3, '30', 0),
(4, '40', 0),
(5, '50', 0),
(6, '60', 0),
(7, '70', 0),
(8, '80', 0),
(9, '90', 0),
(10, '100', 0),
(11, '120', 0),
(12, '140', 0),
(13, '160', 0),
(14, '180', 0),
(15, '200', 0),
(16, '220', 0),
(17, '240', 0),
(18, '260', 0),
(19, '280', 0),
(20, '300', 0),
(21, '350', 0),
(22, '400', 0),
(23, '450', 0),
(24, '500', 0),
(25, '600', 0),
(26, '700', 0),
(27, '800', 0),
(28, '900', 0),
(29, '1000', 0),
(30, '1200', 0);

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

CREATE TABLE `ingredient` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `id_type_ingredient` int(11) NOT NULL,
  `id_calorie` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

CREATE TABLE `recette` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

CREATE TABLE `recette_ingredient` (
  `id` int(11) NOT NULL,
  `quantite` decimal(8,3) DEFAULT NULL,
  `id_recette` int(11) DEFAULT NULL,
  `id_ingredient` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `recette_ingredient`
--

INSERT INTO `recette_ingredient` (`id`, `quantite`, `id_recette`, `id_ingredient`) VALUES
(1, 1.000, 1, 5),
(2, 1.000, 1, 12),
(3, 1.000, 1, 33),
(4, 1.000, 2, 7),
(5, 1.000, 2, 19),
(6, 1.000, 2, 25),
(7, 1.000, 2, 48),
(8, 1.000, 3, 4),
(9, 1.000, 3, 14),
(10, 1.000, 3, 55),
(11, 1.000, 4, 1),
(12, 1.000, 4, 9),
(13, 1.000, 4, 22),
(14, 1.000, 4, 60),
(15, 1.000, 5, 3),
(16, 1.000, 5, 16),
(17, 1.000, 5, 39),
(18, 1.000, 6, 8),
(19, 1.000, 6, 13),
(20, 1.000, 6, 44),
(21, 1.000, 7, 2),
(22, 1.000, 7, 17),
(23, 1.000, 7, 23),
(24, 1.000, 7, 66),
(25, 1.000, 8, 6),
(26, 1.000, 8, 11),
(27, 1.000, 8, 27),
(28, 1.000, 9, 10),
(29, 1.000, 9, 34),
(30, 1.000, 9, 53),
(31, 1.000, 10, 15),
(32, 1.000, 10, 24),
(33, 1.000, 10, 31),
(34, 1.000, 11, 18),
(35, 1.000, 11, 36),
(36, 1.000, 11, 62),
(37, 1.000, 12, 20),
(38, 1.000, 12, 28),
(39, 1.000, 12, 47),
(40, 1.000, 13, 30),
(41, 1.000, 13, 35),
(42, 1.000, 13, 41),
(43, 1.000, 14, 21),
(44, 1.000, 14, 38),
(45, 1.000, 14, 52),
(46, 1.000, 15, 26),
(47, 1.000, 15, 29),
(48, 1.000, 15, 40),
(49, 1.000, 16, 32),
(50, 1.000, 16, 43),
(51, 1.000, 16, 57),
(52, 1.000, 17, 37),
(53, 1.000, 17, 46),
(54, 1.000, 17, 63),
(55, 1.000, 18, 42),
(56, 1.000, 18, 49),
(57, 1.000, 18, 59),
(58, 1.000, 19, 50),
(59, 1.000, 19, 54),
(60, 1.000, 19, 61),
(61, 1.000, 20, 45),
(62, 1.000, 20, 56),
(63, 1.000, 20, 65),
(64, 1.000, 21, 51),
(65, 1.000, 21, 58),
(66, 1.000, 21, 67),
(67, 1.000, 22, 68),
(68, 1.000, 22, 69),
(69, 1.000, 22, 70),
(70, 1.000, 23, 71),
(71, 1.000, 23, 72),
(72, 1.000, 23, 73),
(73, 1.000, 24, 74),
(74, 1.000, 24, 75),
(75, 1.000, 24, 76),
(76, 1.000, 25, 77),
(77, 1.000, 25, 78),
(78, 1.000, 25, 79),
(79, 1.000, 26, 80),
(80, 1.000, 26, 81),
(81, 1.000, 26, 82),
(82, 1.000, 27, 83),
(83, 1.000, 27, 84),
(84, 1.000, 27, 85),
(85, 1.000, 28, 86),
(86, 1.000, 28, 87),
(87, 1.000, 28, 88),
(88, 1.000, 29, 89),
(89, 1.000, 29, 90),
(90, 1.000, 29, 91),
(91, 1.000, 30, 92),
(92, 1.000, 30, 93),
(93, 1.000, 30, 94);

-- --------------------------------------------------------

--
-- Structure de la table `type_ingredient`
--

CREATE TABLE `type_ingredient` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

CREATE TABLE `type_repas` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `identifiant` varchar(40) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `mdp` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(20, 'user20', 'Lemoine', 'Céline', 'CelineL!m2025');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `calorie`
--
ALTER TABLE `calorie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `ingredient`
--
ALTER TABLE `ingredient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_1` (`id_type_ingredient`),
  ADD KEY `id_qualite` (`id_calorie`);

--
-- Index pour la table `recette`
--
ALTER TABLE `recette`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `recette_ingredient`
--
ALTER TABLE `recette_ingredient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_recette` (`id_recette`),
  ADD KEY `id_ingredient` (`id_ingredient`);

--
-- Index pour la table `type_ingredient`
--
ALTER TABLE `type_ingredient`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `type_repas`
--
ALTER TABLE `type_repas`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `identifiant` (`identifiant`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `calorie`
--
ALTER TABLE `calorie`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT pour la table `ingredient`
--
ALTER TABLE `ingredient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=91;

--
-- AUTO_INCREMENT pour la table `recette`
--
ALTER TABLE `recette`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT pour la table `recette_ingredient`
--
ALTER TABLE `recette_ingredient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT pour la table `type_ingredient`
--
ALTER TABLE `type_ingredient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT pour la table `type_repas`
--
ALTER TABLE `type_repas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
