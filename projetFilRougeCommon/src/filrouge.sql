-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 29 avr. 2021 à 12:42
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `filrouge`
--

-- --------------------------------------------------------

--
-- Structure de la table `Appartient`
--

DROP TABLE IF EXISTS `Appartient`;
CREATE TABLE IF NOT EXISTS `Appartient` (
  `idModule` int(11) NOT NULL,
  `idTheme` int(11) NOT NULL,
  PRIMARY KEY (`idModule`,`idTheme`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Comporte`
--

DROP TABLE IF EXISTS `Comporte`;
CREATE TABLE IF NOT EXISTS `Comporte` (
  `idSession` int(11) NOT NULL,
  `idParcours` int(11) NOT NULL,
  PRIMARY KEY (`idSession`,`idParcours`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Compose`
--

DROP TABLE IF EXISTS `Compose`;
CREATE TABLE IF NOT EXISTS `Compose` (
  `idParcours` int(11) NOT NULL,
  `idModule` int(11) NOT NULL,
  PRIMARY KEY (`idParcours`,`idModule`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ComposeTheme`
--

DROP TABLE IF EXISTS `ComposeTheme`;
CREATE TABLE IF NOT EXISTS `ComposeTheme` (
  `idTheme` int(11) NOT NULL,
  `idThemeCompose` int(11) NOT NULL,
  PRIMARY KEY (`idTheme`,`idThemeCompose`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Entreprise`
--

DROP TABLE IF EXISTS `Entreprise`;
CREATE TABLE IF NOT EXISTS `Entreprise` (
  `idEntreprise` int(11) NOT NULL AUTO_INCREMENT,
  `nomResponsable` varchar(30) COLLATE utf8_bin NOT NULL,
  `prenomResponsable` varchar(30) COLLATE utf8_bin NOT NULL,
  `fonctionResponable` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idEntreprise`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Evaluation`
--

DROP TABLE IF EXISTS `Evaluation`;
CREATE TABLE IF NOT EXISTS `Evaluation` (
  `idEval` int(11) NOT NULL AUTO_INCREMENT,
  `evalAccueil` int(2) NOT NULL,
  `evalEnvironnement` int(2) NOT NULL,
  `evalContenu` int(2) NOT NULL,
  `evalFormateur` int(2) NOT NULL,
  PRIMARY KEY (`idEval`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Formateur`
--

DROP TABLE IF EXISTS `Formateur`;
CREATE TABLE IF NOT EXISTS `Formateur` (
  `idFormateur` int(11) NOT NULL AUTO_INCREMENT,
  `nomFormateur` varchar(30) COLLATE utf8_bin NOT NULL,
  `prenomFormateur` varchar(30) COLLATE utf8_bin NOT NULL,
  `mailFormateur` varchar(30) COLLATE utf8_bin NOT NULL,
  `adrFormateur` varchar(30) COLLATE utf8_bin NOT NULL,
  `telFormateur` varchar(30) COLLATE utf8_bin NOT NULL,
  `datePremiereSession` date NOT NULL,
  `tarifFormateur` double NOT NULL,
  `isNouveau` tinyint(1) NOT NULL,
  PRIMARY KEY (`idFormateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Module`
--

DROP TABLE IF EXISTS `Module`;
CREATE TABLE IF NOT EXISTS `Module` (
  `idModule` int(11) NOT NULL,
  `nomModule` varchar(30) COLLATE utf8_bin NOT NULL,
  `prixHtModule` float NOT NULL,
  `objectifModule` varchar(200) COLLATE utf8_bin NOT NULL,
  `prerequisModule` varchar(200) COLLATE utf8_bin NOT NULL,
  `programmeModule` varchar(200) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Parcours`
--

DROP TABLE IF EXISTS `Parcours`;
CREATE TABLE IF NOT EXISTS `Parcours` (
  `idParcours` int(11) NOT NULL AUTO_INCREMENT,
  `nomParcours` varchar(30) COLLATE utf8_bin NOT NULL,
  `isIntra` tinyint(1) NOT NULL,
  `isInter` tinyint(1) NOT NULL,
  `idResponsable` int(11) NOT NULL,
  PRIMARY KEY (`idParcours`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ParticipeParcours`
--

DROP TABLE IF EXISTS `ParticipeParcours`;
CREATE TABLE IF NOT EXISTS `ParticipeParcours` (
  `idStagiaire` int(11) NOT NULL,
  `idParcours` int(11) NOT NULL,
  `testPrerequis` tinyint(1) NOT NULL,
  PRIMARY KEY (`idStagiaire`,`idParcours`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `ParticipeSession`
--

DROP TABLE IF EXISTS `ParticipeSession`;
CREATE TABLE IF NOT EXISTS `ParticipeSession` (
  `idStagiaire` int(11) NOT NULL,
  `idEval` int(11) NOT NULL,
  `idSession` int(11) NOT NULL,
  `testPrerequis` tinyint(1) NOT NULL,
  PRIMARY KEY (`idStagiaire`,`idEval`,`idSession`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Responsable`
--

DROP TABLE IF EXISTS `Responsable`;
CREATE TABLE IF NOT EXISTS `Responsable` (
  `idResponsable` int(11) NOT NULL AUTO_INCREMENT,
  `nomResponsable` varchar(30) COLLATE utf8_bin NOT NULL,
  `prenomResponsable` varchar(30) COLLATE utf8_bin NOT NULL,
  `fonctionResponsable` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idResponsable`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Salle`
--

DROP TABLE IF EXISTS `Salle`;
CREATE TABLE IF NOT EXISTS `Salle` (
  `idSalle` int(11) NOT NULL AUTO_INCREMENT,
  `VilleSalle` varchar(30) COLLATE utf8_bin NOT NULL,
  `AdresseSalle` varchar(200) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idSalle`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Session`
--

DROP TABLE IF EXISTS `Session`;
CREATE TABLE IF NOT EXISTS `Session` (
  `idSession` int(11) NOT NULL AUTO_INCREMENT,
  `dateDebSession` date NOT NULL,
  `dateFinSession` date NOT NULL,
  `idFormateur` int(11) NOT NULL,
  `idModule` int(11) NOT NULL,
  `idSalle` int(11) NOT NULL,
  PRIMARY KEY (`idSession`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Stagiaire`
--

DROP TABLE IF EXISTS `Stagiaire`;
CREATE TABLE IF NOT EXISTS `Stagiaire` (
  `idStagiaire` int(11) NOT NULL AUTO_INCREMENT,
  `nomStagiaire` varchar(30) COLLATE utf8_bin NOT NULL,
  `prenomStagiaire` varchar(30) COLLATE utf8_bin NOT NULL,
  `mailStagiaire` varchar(100) COLLATE utf8_bin NOT NULL,
  `telStagiaire` varchar(20) COLLATE utf8_bin NOT NULL,
  `idEntreprise` int(11) NOT NULL,
  PRIMARY KEY (`idStagiaire`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `Theme`
--

DROP TABLE IF EXISTS `Theme`;
CREATE TABLE IF NOT EXISTS `Theme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idTheme`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
