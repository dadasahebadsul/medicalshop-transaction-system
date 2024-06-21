-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema allmedicine
--

CREATE DATABASE IF NOT EXISTS allmedicine;
USE allmedicine;

--
-- Definition of table `allrecord`
--

DROP TABLE IF EXISTS `allrecord`;
CREATE TABLE `allrecord` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `companyname` varchar(45) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL,
  `price` int(10) unsigned NOT NULL,
  `quantity` int(10) unsigned NOT NULL,
  `ex_date` varchar(45) NOT NULL,
  `mfg_date` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `allrecord`
--

/*!40000 ALTER TABLE `allrecord` DISABLE KEYS */;
INSERT INTO `allrecord` (`id`,`name`,`companyname`,`price`,`quantity`,`ex_date`,`mfg_date`) VALUES 
 (12,'qwer',0x72657771,56,5,'10 04 2024','01 04 2024'),
 (16,'karan',0x78797A,89,6,'10 04 2024','02 04 2024'),
 (34,'ram',0x616263,56,34,'30 05 2024','02 04 2024'),
 (56,'priyanka',0x78797A,88,90,'16 04 2025','11 04 2024'),
 (78,'omiii',0x78797A7A,88,96,'18 04 2024','02 04 2024');
/*!40000 ALTER TABLE `allrecord` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
