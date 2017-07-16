-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 16, 2017 at 07:40 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_food_shop_comparator`
--

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `unit` int(11) DEFAULT NULL,
  `weight` decimal(10,0) DEFAULT NULL,
  `barcode` bigint(11) DEFAULT NULL,
  `kolonial` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `kosik` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `rohlik` varchar(255) DEFAULT NULL,
  `tesco` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `albert` decimal(10,0) DEFAULT NULL,
  `dam` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--
INSERT INTO `items` (`id`, `name`, `unit`, `weight`, `barcode`, `kolonial`, `kosik`, `rohlik`, `tesco`, `albert`, `dam`) VALUES
(1, 'Rohlik', 1, '0', 8580000000000, 'https://www.kolonial.cz/pecivo-cerstve-bile/rohlik-jemny-43g', 'https://www.kosik.cz/produkt/360-penam-rohlik-jemny-43g', 'https://www.rohlik.cz/1286399-rohlik-jemny', 'https://nakup.itesco.cz/groceries/cs-CZ/products/2001000151875', '2', '2'),
(2, 'Salat',1,NULL,NULL,'https://www.kolonial.cz/salaty-pomazanky/boneco-vajecny-salat-140g','https://www.kosik.cz/produkt/29211-gastro-parizsky-salat-140g','https://www.rohlik.cz/714305-varmuza-parizsky-salat','https://nakup.itesco.cz/groceries/cs-CZ/products/2001019478482',NULL,NULL),
(3, 'Kofola',1,NULL,NULL,'https://www.kolonial.cz/kolove-limonady/kofola-original-limonada-2l','https://www.kosik.cz/produkt/2854-kofola-original-limonada-2l','https://www.rohlik.cz/733945-kofola-original','https://nakup.itesco.cz/groceries/cs-CZ/products/2001009255932',NULL,NULL),
(4, 'Korbac Udeny 55 G',1,NULL,NULL,NULL,NULL,NULL,NULL,28.9,NULL),
(5, 'AHB Mozarella 125 G',1,NULL,NULL,NULL,NULL,NULL,NULL,17.9,NULL),
(6, 'Bryndza plnotucna 125 G',1,NULL,NULL,NULL,NULL,NULL,NULL,35.9,NULL),
(7, 'AQ Gouda 48% Blocek 200 G',1,NULL,NULL,NULL,NULL,NULL,NULL,29.9,NULL),
(8, 'Majoneza Hellmanns 225 ML',1,NULL,NULL,NULL,NULL,NULL,NULL,32.9,NULL),
(9, '*MLEKO JC Lahodne 1.5% 1 L',1,NULL,NULL,NULL,NULL,NULL,NULL,19.9,NULL),
(10, 'Tuniak v Slun. Oleji 3x80/16',1,NULL,NULL,NULL,NULL,NULL,NULL,114.9,NULL),
(11, 'Dressing Hellmanns Tisic.2',1,NULL,NULL,NULL,NULL,NULL,NULL,37.9,NULL),
(12, 'Curaprox - bodova kefka',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,129),
(13, 'Elmex zubna pasta 75 ML',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,59.9),
(14, 'H&S Sensitive sculp 400 ML',1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,99);
--
-- Indexes for dumped tables
--

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
