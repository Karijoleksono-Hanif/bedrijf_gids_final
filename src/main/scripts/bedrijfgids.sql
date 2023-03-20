CREATE DATABASE  IF NOT EXISTS `bedrijfgids` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bedrijfgids`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: bedrijfgids
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bedrijf`
--

DROP TABLE IF EXISTS `bedrijf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bedrijf` (
  `id` bigint NOT NULL,
  `bedrijf_naam` varchar(255) DEFAULT NULL,
  `email_adress` varchar(255) DEFAULT NULL,
  `filiaal` varchar(255) DEFAULT NULL,
  `filiaal_adress` varchar(255) DEFAULT NULL,
  `telefoon_nummer` varchar(255) DEFAULT NULL,
  `entiteit_id` bigint DEFAULT NULL,
  `mediaFiles_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKse54cb4e18l1gdy4jhj21p0ub` (`entiteit_id`),
  KEY `FK7f2a4e666u3kgfwistdc6cmly` (`mediaFiles_id`),
  CONSTRAINT `FK7f2a4e666u3kgfwistdc6cmly` FOREIGN KEY (`mediaFiles_id`) REFERENCES `mediafiles` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FKse54cb4e18l1gdy4jhj21p0ub` FOREIGN KEY (`entiteit_id`) REFERENCES `entiteit` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bedrijf`
--

LOCK TABLES `bedrijf` WRITE;
/*!40000 ALTER TABLE `bedrijf` DISABLE KEYS */;
INSERT INTO `bedrijf` VALUES (1,'HSDS','costumer@hsds.sr','HSDS Noord','Ringweg Noord 36','+597 545326',1,1),(2,'HSDS','costumer@hsds.sr','HSDS Wanica','Indira Ghandiweg 773','+597 545286',1,1),(3,'CHS','costumer@chs.sr','CHS Wanica','chswanicastraat','+597 123',1,2),(4,'TELESUR','costumer@telesur.sr','TELESUR Wanica','telesurwanicastraat','+597 69596',1,3),(5,'DIGICEL','costumer@digicel.sr','DIGICEL Wanica','digicelwanicastraat','+597 5454158748',1,4);
/*!40000 ALTER TABLE `bedrijf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bedrijf_industrie`
--

DROP TABLE IF EXISTS `bedrijf_industrie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bedrijf_industrie` (
  `Bedrijf_id` bigint NOT NULL,
  `Inustrie_id` bigint NOT NULL,
  PRIMARY KEY (`Bedrijf_id`,`Inustrie_id`),
  KEY `FKkb7jf20pm7lswtu7nuk0in2jg` (`Inustrie_id`),
  CONSTRAINT `FKkb7jf20pm7lswtu7nuk0in2jg` FOREIGN KEY (`Inustrie_id`) REFERENCES `bedrijf` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FKp0jqey7dlijsxl7wb5jdnp529` FOREIGN KEY (`Bedrijf_id`) REFERENCES `industrie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bedrijf_industrie`
--

LOCK TABLES `bedrijf_industrie` WRITE;
/*!40000 ALTER TABLE `bedrijf_industrie` DISABLE KEYS */;
INSERT INTO `bedrijf_industrie` VALUES (2,1),(2,2),(1,3),(1,4);
/*!40000 ALTER TABLE `bedrijf_industrie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bedrijf_seq`
--

DROP TABLE IF EXISTS `bedrijf_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bedrijf_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bedrijf_seq`
--

LOCK TABLES `bedrijf_seq` WRITE;
/*!40000 ALTER TABLE `bedrijf_seq` DISABLE KEYS */;
INSERT INTO `bedrijf_seq` VALUES (101);
/*!40000 ALTER TABLE `bedrijf_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entiteit`
--

DROP TABLE IF EXISTS `entiteit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entiteit` (
  `id` bigint NOT NULL,
  `typeZaak` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entiteit`
--

LOCK TABLES `entiteit` WRITE;
/*!40000 ALTER TABLE `entiteit` DISABLE KEYS */;
INSERT INTO `entiteit` VALUES (1,'Naamloze Vennootschap (N.V.)'),(2,'Eenmans Zaak'),(3,'Stichting of Vereniging'),(4,'Venootschao onder Firma(V.O.F.)');
/*!40000 ALTER TABLE `entiteit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entiteit_seq`
--

DROP TABLE IF EXISTS `entiteit_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entiteit_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entiteit_seq`
--

LOCK TABLES `entiteit_seq` WRITE;
/*!40000 ALTER TABLE `entiteit_seq` DISABLE KEYS */;
INSERT INTO `entiteit_seq` VALUES (101);
/*!40000 ALTER TABLE `entiteit_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filialen`
--

DROP TABLE IF EXISTS `filialen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filialen` (
  `id` bigint NOT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `openingstijden` varchar(255) DEFAULT NULL,
  `telefoonNummer` varchar(255) DEFAULT NULL,
  `bedrijf_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhxw5khsspd7st1honypwsn4de` (`bedrijf_id`),
  CONSTRAINT `FKhxw5khsspd7st1honypwsn4de` FOREIGN KEY (`bedrijf_id`) REFERENCES `bedrijf` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filialen`
--

LOCK TABLES `filialen` WRITE;
/*!40000 ALTER TABLE `filialen` DISABLE KEYS */;
INSERT INTO `filialen` VALUES (1,'Ringweg','Paramaribo','Ma-Sa 9:00-19:00, Su 11:00-17:00','597 545326 597 545286',1),(2,'Pad van Wanica','Paramaribo','Ma-Sa 9:00-17:00, Su closed','+597 545326 - +597 545286',1),(3,'Havenlaan zuid 1','Paramaribo','Ma-Vr 7:00-15:00','+597 473944',3),(4,'Zonnebloemstraat','Paramaribo','Ma-Do 7:00-18:00, Su Vr 9:00-14:00','+597 494555',3),(5,'Marcel Straat','Paramaribo','Ma-Vr 8:00-16:00','+597 490066',2),(6,'Henck Arronstraat 27','Paramaribo','Ma-Vr 8:00-16:30','+597 462626',1);
/*!40000 ALTER TABLE `filialen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filialen_seq`
--

DROP TABLE IF EXISTS `filialen_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filialen_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filialen_seq`
--

LOCK TABLES `filialen_seq` WRITE;
/*!40000 ALTER TABLE `filialen_seq` DISABLE KEYS */;
INSERT INTO `filialen_seq` VALUES (101);
/*!40000 ALTER TABLE `filialen_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `industrie`
--

DROP TABLE IF EXISTS `industrie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `industrie` (
  `id` bigint NOT NULL,
  `industrieNaam` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `industrie`
--

LOCK TABLES `industrie` WRITE;
/*!40000 ALTER TABLE `industrie` DISABLE KEYS */;
INSERT INTO `industrie` VALUES (1,'Internet Service Providers (ISP)'),(2,'Handel');
/*!40000 ALTER TABLE `industrie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `industrie_seq`
--

DROP TABLE IF EXISTS `industrie_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `industrie_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `industrie_seq`
--

LOCK TABLES `industrie_seq` WRITE;
/*!40000 ALTER TABLE `industrie_seq` DISABLE KEYS */;
INSERT INTO `industrie_seq` VALUES (101);
/*!40000 ALTER TABLE `industrie_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mediafiles`
--

DROP TABLE IF EXISTS `mediafiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mediafiles` (
  `id` bigint NOT NULL,
  `fotos` varchar(255) DEFAULT NULL,
  `videos` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mediafiles`
--

LOCK TABLES `mediafiles` WRITE;
/*!40000 ALTER TABLE `mediafiles` DISABLE KEYS */;
INSERT INTO `mediafiles` VALUES (1,'foto 1','video 1'),(2,'foto 2','video 2'),(3,'foto 3','video 3'),(4,'foto 4','video 4');
/*!40000 ALTER TABLE `mediafiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mediafiles_seq`
--

DROP TABLE IF EXISTS `mediafiles_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mediafiles_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mediafiles_seq`
--

LOCK TABLES `mediafiles_seq` WRITE;
/*!40000 ALTER TABLE `mediafiles_seq` DISABLE KEYS */;
INSERT INTO `mediafiles_seq` VALUES (101);
/*!40000 ALTER TABLE `mediafiles_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-20 17:31:11
