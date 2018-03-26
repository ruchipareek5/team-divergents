-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: msde
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
INSERT INTO `agency` VALUES (1,'abesit',1),(2,'abes',2);
/*!40000 ALTER TABLE `agency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES (1,'approved',1,'2012-02-02 00:00:00','pravek@gmail.com'),(2,'approved',1,'2012-02-13 00:00:00','ashu@abesit.in');
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
INSERT INTO `assessor` VALUES (1,'Pravek','Ghaziabad','UP',1),(2,'Ashu','gzb','UP',2);
/*!40000 ALTER TABLE `assessor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES (1,'test','start','1',1,1,150,'2018-01-24','2018-03-24','Safai karamchari','1',100.00,50.00,1,'approved','2018-03-20',140,10,0,40,'2018-01-01','2018-03-10',1,1,'PMKVY','placed'),(2,'abes','star','2',2,2,140,'2018-01-14','2018-03-22','Safai karamchary','1',100.00,50.00,2,'approved','2018-03-20',115,15,NULL,115,'2018-08-02','2018-03-00',2,2,'PMKVY','placed');
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
INSERT INTO `candidate` VALUES (1,'Priyanka','123','female','1996-11-15','Ajay Pal',1230545252,1234567890,'priyanka@gmail.com','Graduate','chipyana',201001,50.00,50.00,'pass','true','placed','2017-01-14','full time',1,1),(2,'arjita','134','female','1996-11-15','bhargava',1252525252,1236547890,'arjita@gmail.com','UG','nehru nagar',201002,55.00,45.00,'pass','true','placed','2017-02-15','full time',2,1);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `centre`
--

LOCK TABLES `centre` WRITE;
/*!40000 ALTER TABLE `centre` DISABLE KEYS */;
INSERT INTO `centre` VALUES (1,'abesit','pravek','vijay nagar','ghaziabad','UP','1',NULL,NULL,NULL),(2,'abesit','ashu','vijay nagar','gzb','UP','2',NULL,NULL,NULL);
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
-- Dumping data for table `csrfunds`
--

LOCK TABLES `csrfunds` WRITE;
/*!40000 ALTER TABLE `csrfunds` DISABLE KEYS */;
INSERT INTO `csrfunds` VALUES (1,'Smalt and Beryl','Pravek','pravek@gmail.com',99999999,1000000,'2018-02-22'),(2,'Infosys','ram','ram@gmail.com',98988998,2000000,'2017-02-22'),(3,'Wipro','Ruchi','ruchi@gmail.com',89889998,4000000,'2017-02-22'),(4,'Wipro','ruchi','ruchi@gmail.com',85858585,1500000,'2015-02-22'),(5,'Hestabit','prateek','prateek@gmail.com',85858585,3000000,'2017-02-22'),(6,'Fluper','priyanka','priyanka@gmail.com',78788454,4500000,'2016-02-22');
/*!40000 ALTER TABLE `csrfunds` ENABLE KEYS */;
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
INSERT INTO `employer` VALUES (1,'Smalt and Beryl','Noida','NCR','UP');
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `industrypartnerships`
--

LOCK TABLES `industrypartnerships` WRITE;
/*!40000 ALTER TABLE `industrypartnerships` DISABLE KEYS */;
INSERT INTO `industrypartnerships` VALUES ('1','Smalt and Beryl','Education'),('2','QA Infotech','IT'),('3','Kapson Tools ','Manufacturing'),('4','JBM Group','Manufacturing');
/*!40000 ALTER TABLE `industrypartnerships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `jobrole`
--

LOCK TABLES `jobrole` WRITE;
/*!40000 ALTER TABLE `jobrole` DISABLE KEYS */;
INSERT INTO `jobrole` VALUES ('1','Safai karamchari','safaai karamchari gov','www.safaikaramchari.in','NSDC'),('2','solar pv installer','solar','www.spv.in','scgj'),('3','Mining','mining karamchari','www.mining.com','Mining');
/*!40000 ALTER TABLE `jobrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `placementinformation`
--

LOCK TABLES `placementinformation` WRITE;
/*!40000 ALTER TABLE `placementinformation` DISABLE KEYS */;
INSERT INTO `placementinformation` VALUES (1,200,'Water Management','2016-04-16','1'),(2,252,'Safai karamchari','2017-04-16','1'),(3,302,'Water Management','2016-04-16','2'),(4,152,'Safai karamchari','2017-02-19','2');
/*!40000 ALTER TABLE `placementinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rpl`
--

LOCK TABLES `rpl` WRITE;
/*!40000 ALTER TABLE `rpl` DISABLE KEYS */;
INSERT INTO `rpl` VALUES (1,'IT',25,'1234569658','prateek@gmail.com','Smalt and Beryl'),(2,'IT',25,'1234569658','prateek@gmail.com','Smalt and Beryl');
/*!40000 ALTER TABLE `rpl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sectorskillcouncil`
--

LOCK TABLES `sectorskillcouncil` WRITE;
/*!40000 ALTER TABLE `sectorskillcouncil` DISABLE KEYS */;
INSERT INTO `sectorskillcouncil` VALUES ('1','SCGJ','Renewable Energy'),('2','SSCM','Mining'),('3','SDMS','Management'),('4','Mining','mine');
/*!40000 ALTER TABLE `sectorskillcouncil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `showinterest`
--

LOCK TABLES `showinterest` WRITE;
/*!40000 ALTER TABLE `showinterest` DISABLE KEYS */;
/*!40000 ALTER TABLE `showinterest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `target`
--

LOCK TABLES `target` WRITE;
/*!40000 ALTER TABLE `target` DISABLE KEYS */;
INSERT INTO `target` VALUES ('2012-04-01',20000,NULL),('2013-04-01',30000,NULL),('2017-03-01',6000,NULL),('2018-04-05',8000,NULL);
/*!40000 ALTER TABLE `target` ENABLE KEYS */;
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
INSERT INTO `trainer` VALUES (1,'Pravek','Trainer','1'),(2,'Ashu','Trainer','2');
/*!40000 ALTER TABLE `trainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingcenter`
--

LOCK TABLES `trainingcenter` WRITE;
/*!40000 ALTER TABLE `trainingcenter` DISABLE KEYS */;
INSERT INTO `trainingcenter` VALUES (1,'LaxmiBai Training Institute','A-312 noida','ghaziabad','UP',965401365,'1',1),(2,'LaxmiBai Training Institute','B-216','noida','UP',1234567890,'1',1),(3,'LaxmiBai Training Institute','C-216','Delhi','Delhi',1230654789,'2',1);
/*!40000 ALTER TABLE `trainingcenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartner`
--

LOCK TABLES `trainingpartner` WRITE;
/*!40000 ALTER TABLE `trainingpartner` DISABLE KEYS */;
INSERT INTO `trainingpartner` VALUES ('1','smalt and beryl','pravek','abesit','smaltandberyl.com','gzb','UP',9654019428,1,NULL),('2','abesit','ashu','abesit','abesit.in','gzb','UP',9213842320,2,NULL);
/*!40000 ALTER TABLE `trainingpartner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartnerqualificationpack`
--

LOCK TABLES `trainingpartnerqualificationpack` WRITE;
/*!40000 ALTER TABLE `trainingpartnerqualificationpack` DISABLE KEYS */;
INSERT INTO `trainingpartnerqualificationpack` VALUES (1,'1','safai','Safai','PMKVY',1),(2,'1','water','Water Management','PMKVY',1);
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
INSERT INTO `user` VALUES ('smalt and beryl','pravek','pravek@gmail.com','pravek','TP',1),('abesit','ashu','ashu@abesit.in','ashu','TP',2);
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

-- Dump completed on 2018-03-26 18:55:42
