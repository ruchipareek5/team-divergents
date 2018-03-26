-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: msde
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `abassessor`
--

LOCK TABLES `abassessor` WRITE;
/*!40000 ALTER TABLE `abassessor` DISABLE KEYS */;
/*!40000 ALTER TABLE `abassessor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `abmanagement`
--

LOCK TABLES `abmanagement` WRITE;
/*!40000 ALTER TABLE `abmanagement` DISABLE KEYS */;
/*!40000 ALTER TABLE `abmanagement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `agency`
--

LOCK TABLES `agency` WRITE;
/*!40000 ALTER TABLE `agency` DISABLE KEYS */;
/*!40000 ALTER TABLE `agency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES (1,'Submit',1,'2017-11-21 00:00:00','abc@gmail.com'),(2,'Submit',1,'2017-11-21 00:00:00','user@gmail.com');
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `applicationcomments`
--

LOCK TABLES `applicationcomments` WRITE;
/*!40000 ALTER TABLE `applicationcomments` DISABLE KEYS */;
/*!40000 ALTER TABLE `applicationcomments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `assessmentagencyregistration`
--

LOCK TABLES `assessmentagencyregistration` WRITE;
/*!40000 ALTER TABLE `assessmentagencyregistration` DISABLE KEYS */;
/*!40000 ALTER TABLE `assessmentagencyregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `assessor`
--

LOCK TABLES `assessor` WRITE;
/*!40000 ALTER TABLE `assessor` DISABLE KEYS */;
/*!40000 ALTER TABLE `assessor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
/*!40000 ALTER TABLE `batch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `batchassignment`
--

LOCK TABLES `batchassignment` WRITE;
/*!40000 ALTER TABLE `batchassignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `batchassignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `businessaudit`
--

LOCK TABLES `businessaudit` WRITE;
/*!40000 ALTER TABLE `businessaudit` DISABLE KEYS */;
/*!40000 ALTER TABLE `businessaudit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `center`
--

LOCK TABLES `center` WRITE;
/*!40000 ALTER TABLE `center` DISABLE KEYS */;
/*!40000 ALTER TABLE `center` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `centre`
--

LOCK TABLES `centre` WRITE;
/*!40000 ALTER TABLE `centre` DISABLE KEYS */;
INSERT INTO `centre` VALUES (1,'AP','asp','abc','abv','Uttar Pradesh','1','bxjb',44851,'Qp123'),(2,'CA','cas','abc','vdgh','Haryana','1','jhdcb',55223,'Qp123'),(3,'KP','ksp','abc','whd','Bihar','1','dcdgvc',523,'Qp4561');
/*!40000 ALTER TABLE `centre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `documentsuploaded`
--

LOCK TABLES `documentsuploaded` WRITE;
/*!40000 ALTER TABLE `documentsuploaded` DISABLE KEYS */;
/*!40000 ALTER TABLE `documentsuploaded` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `employer`
--

LOCK TABLES `employer` WRITE;
/*!40000 ALTER TABLE `employer` DISABLE KEYS */;
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `jobrole`
--

LOCK TABLES `jobrole` WRITE;
/*!40000 ALTER TABLE `jobrole` DISABLE KEYS */;
INSERT INTO `jobrole` VALUES ('Qp123','Renewable Energy','jdcbdgbcdbcj','sdhcbh','Green Jobs'),('Qp4561','Waste Management','scgvcgs','udcsgdv','Green Jobs');
/*!40000 ALTER TABLE `jobrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES ('1','waste mgmt','jakson ltd.','Noida','1L-2L','this is the job for trained candidates','Qp4561');
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `showinterest`
--

LOCK TABLES `showinterest` WRITE;
/*!40000 ALTER TABLE `showinterest` DISABLE KEYS */;
/*!40000 ALTER TABLE `showinterest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tpmanagement`
--

LOCK TABLES `tpmanagement` WRITE;
/*!40000 ALTER TABLE `tpmanagement` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpmanagement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tptrainer`
--

LOCK TABLES `tptrainer` WRITE;
/*!40000 ALTER TABLE `tptrainer` DISABLE KEYS */;
/*!40000 ALTER TABLE `tptrainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainer`
--

LOCK TABLES `trainer` WRITE;
/*!40000 ALTER TABLE `trainer` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingcenter`
--

LOCK TABLES `trainingcenter` WRITE;
/*!40000 ALTER TABLE `trainingcenter` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainingcenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartner`
--

LOCK TABLES `trainingpartner` WRITE;
/*!40000 ALTER TABLE `trainingpartner` DISABLE KEYS */;
INSERT INTO `trainingpartner` VALUES ('1','abc','abc','abc','abc.in','abc','abc',7894561330,1,'pan.pdf');
/*!40000 ALTER TABLE `trainingpartner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartnerqualificationpack`
--

LOCK TABLES `trainingpartnerqualificationpack` WRITE;
/*!40000 ALTER TABLE `trainingpartnerqualificationpack` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainingpartnerqualificationpack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartnerregistration`
--

LOCK TABLES `trainingpartnerregistration` WRITE;
/*!40000 ALTER TABLE `trainingpartnerregistration` DISABLE KEYS */;
/*!40000 ALTER TABLE `trainingpartnerregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('AAA','aa','abc@gmail.com','abc','TP',1),('AAAA','aa','user@gmail.com','user','TP',2),('BBB','qqq','new@gmail.com','new','TP',3),('CCC',NULL,'hi@gmail.com','hi','TP',4);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-26 16:21:34
