-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 04 juin 2025 à 15:24
-- Version du serveur : 5.7.31
-- Version de PHP : 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `centresportif`
--

-- --------------------------------------------------------

--
-- Structure de la table `addresses`
--

DROP TABLE IF EXISTS `addresses`;
CREATE TABLE IF NOT EXISTS `addresses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `street_name` varchar(255) NOT NULL,
  `street_number` int(11) NOT NULL,
  `box_number` decimal(15,2) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `city_id` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `authorizations`
--

DROP TABLE IF EXISTS `authorizations`;
CREATE TABLE IF NOT EXISTS `authorizations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `authorizations_name` varchar(255) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE IF NOT EXISTS `cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(255) NOT NULL,
  `zip_code` int(11) NOT NULL,
  `country_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `country_id` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `closes`
--

DROP TABLE IF EXISTS `closures`;
CREATE TABLE IF NOT EXISTS `closures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `sports_field_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `sports_field_id` (`sports_field_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `countries`
--

DROP TABLE IF EXISTS `countries`;
CREATE TABLE IF NOT EXISTS `countries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) NOT NULL,
  `iso_alpha3` varchar(255) NOT NULL,
  `is_active` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `countries`
--

INSERT INTO `countries` (`id`, `country_name`, `iso_alpha3`, `is_active`) VALUES
(1, 'Belgique', 'Bel', 0),
(2, 'France', 'Fra', 0),
(3, 'Etats-unis', 'Usa', 0),
(4, 'Espagne', 'ESP', 1),
(5, 'Chocolat', 'Cho', 0),
(6, 'vanille', 'van', 1);

-- --------------------------------------------------------

--
-- Structure de la table `discounts`
--

DROP TABLE IF EXISTS `discounts`;
CREATE TABLE IF NOT EXISTS `discounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(255) NOT NULL,
  `percent` decimal(15,2) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `events`
--

DROP TABLE IF EXISTS `events`;
CREATE TABLE IF NOT EXISTS `events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(255) NOT NULL,
  `begin_date_hour` date NOT NULL,
  `end_date_hour` date NOT NULL,
  `info` varchar(255) NOT NULL,
  `picture` varchar(255) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fields`
--

DROP TABLE IF EXISTS `fields`;
CREATE TABLE IF NOT EXISTS `fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `field_name` varchar(255) NOT NULL,
  `hall_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `hall_id` (`hall_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `halls`
--

DROP TABLE IF EXISTS `halls`;
CREATE TABLE IF NOT EXISTS `halls` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hall_name` varchar(255) NOT NULL,
    `width` decimal(5,2) NOT NULL,
    `length` decimal(5,2) NOT NULL,
    `height` decimal(5,2) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `historicals_sports_prices`
--

DROP TABLE IF EXISTS `historicals_sports_prices`;
CREATE TABLE IF NOT EXISTS `historicals_sports_prices` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `begin_date` date NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `sport_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sport_id` (`sport_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_order` datetime NOT NULL,
  `total_price` decimal(15,2) NOT NULL,
  `tva` decimal(15,2) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `orders_discounts`
--

DROP TABLE IF EXISTS `orders_discounts`;
CREATE TABLE IF NOT EXISTS `orders_discounts` (
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `order_id` int(11) NOT NULL,
  `discount_id` int(11) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`order_id`,`discount_id`),
  KEY `discount_id` (`discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `orders_subscriptions`
--

DROP TABLE IF EXISTS `orders_subscriptions`;
CREATE TABLE IF NOT EXISTS `orders_subscriptions` (
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `subscription_id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`subscription_id`,`order_id`),
  KEY `order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
CREATE TABLE IF NOT EXISTS `reservations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_name` varchar(255) NOT NULL,
  `start_date_reservation` datetime NOT NULL,
  `end_date_reservation` datetime NOT NULL,
  `price` decimal(15,2) NOT NULL,
  `tva` decimal(15,2) NOT NULL,
  `statut` enum('1','2','3') NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `sports_field_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `sports_field_id` (`sports_field_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `roles_authorizations`
--

DROP TABLE IF EXISTS `roles_authorizations`;
CREATE TABLE IF NOT EXISTS `roles_authorizations` (
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `role_id` int(11) NOT NULL,
  `authorization_id` int(11) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`role_id`,`authorization_id`),
  KEY `authorization_id` (`authorization_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `sports`
--

DROP TABLE IF EXISTS `sports`;
CREATE TABLE IF NOT EXISTS `sports` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sport_name` varchar(255) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `price` decimal(10,2) NOT NULL
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `sports_fields`
--

DROP TABLE IF EXISTS `sports_fields`;
CREATE TABLE IF NOT EXISTS `sports_fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sport_id` int(11) DEFAULT NULL,
  `field_id` int(11) DEFAULT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `date_start` datetime NOT NULL,
  `day` int(11) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `sport_id` (`sport_id`),
  KEY `field_id` (`field_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `subscriptions`
--

DROP TABLE IF EXISTS `subscriptions`;
CREATE TABLE IF NOT EXISTS `subscriptions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subscription_name` varchar(255) NOT NULL,
  `token` int(11) NOT NULL,
  `sport_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `sport_id` (`sport_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(90) NOT NULL,
  `last_name` varchar(90) NOT NULL,
  `email` varchar(255) NOT NULL,
  `statut` enum('1','2') NOT NULL,
  `birthdate` date NOT NULL,
  `password` varchar(64) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `gender` enum('M','F','Autre') NOT NULL,
  `civilite` enum('M','Mme','Dr','Autre') NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `event_id` int(11) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `role_id` (`role_id`),
  KEY `address_id` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users_subscriptions`
--

DROP TABLE IF EXISTS `users_subscriptions`;
CREATE TABLE IF NOT EXISTS `users_subscriptions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `subscription_id` int(11) DEFAULT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `subscription_id` (`subscription_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `addresses`
--
ALTER TABLE `addresses`
  ADD CONSTRAINT `addresses_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `cities`
--
ALTER TABLE `cities`
  ADD CONSTRAINT `cities_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `closes`
--
ALTER TABLE `closes`
  ADD CONSTRAINT `closes_ibfk_1` FOREIGN KEY (`sports_field_id`) REFERENCES `sports_fields` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `fields`
--
ALTER TABLE `fields`
  ADD CONSTRAINT `fields_ibfk_1` FOREIGN KEY (`hall_id`) REFERENCES `halls` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `historicals_sports_prices`
--
ALTER TABLE `historicals_sports_prices`
  ADD CONSTRAINT `historicals_sports_prices_ibfk_1` FOREIGN KEY (`sport_id`) REFERENCES `sports` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `orders_discounts`
--
ALTER TABLE `orders_discounts`
  ADD CONSTRAINT `orders_discounts_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_discounts_ibfk_2` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `orders_subscriptions`
--
ALTER TABLE `orders_subscriptions`
  ADD CONSTRAINT `orders_subscriptions_ibfk_1` FOREIGN KEY (`subscription_id`) REFERENCES `subscriptions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_subscriptions_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`sports_field_id`) REFERENCES `sports_fields` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `roles_authorizations`
--
ALTER TABLE `roles_authorizations`
  ADD CONSTRAINT `roles_authorizations_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `roles_authorizations_ibfk_2` FOREIGN KEY (`authorization_id`) REFERENCES `authorizations` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `sports_fields`
--
ALTER TABLE `sports_fields`
  ADD CONSTRAINT `sports_fields_ibfk_1` FOREIGN KEY (`sport_id`) REFERENCES `sports` (`id`),
  ADD CONSTRAINT `sports_fields_ibfk_2` FOREIGN KEY (`field_id`) REFERENCES `fields` (`id`);

--
-- Contraintes pour la table `subscriptions`
--
ALTER TABLE `subscriptions`
  ADD CONSTRAINT `subscriptions_ibfk_1` FOREIGN KEY (`sport_id`) REFERENCES `sports` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `users_ibfk_2` FOREIGN KEY (`address_id`) REFERENCES `addresses` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `users_subscriptions`
--
ALTER TABLE `users_subscriptions`
  ADD CONSTRAINT `users_subscriptions_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `users_subscriptions_ibfk_2` FOREIGN KEY (`subscription_id`) REFERENCES `subscriptions` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
