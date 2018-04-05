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
use msde;

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
INSERT INTO `agency` VALUES (1,'Tripura Institute',25),(2,'Mahamaya Institute',26),(3,'Lakshmi Institute',27),(4,'Veerbhan Institute',28);
/*!40000 ALTER TABLE `agency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES (1,'Approved',1,'2015-04-18 00:00:00','1'),(2,'Approved',1,'2015-05-18 00:00:00','2'),(3,'Approved',1,'2015-06-18 00:00:00','3'),(4,'approved ',1,'2015-06-18 00:00:00','4'),(5,'approved',1,'2015-06-18 00:00:00','5'),(6,'approved',1,'2015-06-18 00:00:00','6'),(7,'approved',1,'2015-06-18 00:00:00','7'),(8,'approved',1,'2015-07-18 00:00:00','8'),(9,'approved',1,'2015-07-21 00:00:00','9'),(10,'approved',1,'2016-01-01 00:00:00','10'),(11,'approved',1,'2016-01-10 00:00:00','11'),(12,'approved',1,'2016-01-15 00:00:00','12'),(13,'approved',1,'2016-01-20 00:00:00','13'),(14,'approved',1,'2016-02-21 00:00:00','14'),(15,'approved',1,'2016-04-25 00:00:00','15'),(16,'approved',1,'2016-04-26 00:00:00','16'),(17,'approved',1,'2016-04-26 00:00:00','17'),(18,'approved',1,'2016-04-27 00:00:00','18'),(19,'approved',1,'2017-04-28 00:00:00','19'),(20,'approved',1,'2017-04-30 00:00:00','20'),(21,'approved',1,'2017-05-22 00:00:00','21'),(22,'approved',1,'2017-09-25 00:00:00','22'),(23,'approved',1,'2017-11-26 00:00:00','23'),(24,'approved',1,'2017-12-11 00:00:00','24'),(25,'approved',1,'2018-02-22 00:00:00','25'),(26,'approved',1,'2018-02-12 00:00:00','26'),(27,'approved',1,'2017-04-12 00:00:00','27'),(28,'approved',1,'2017-12-10 00:00:00','28');
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
INSERT INTO `assessor` VALUES (1,'Pravek','Ghaziabad','UP',1),(2,'Ruchi','Noida','UP',2),(3,'Ram','Delhi ','Delhi',3),(4,'Priyanka','Ghaziabad','UP',4);
/*!40000 ALTER TABLE `assessor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `batch`
--

LOCK TABLES `batch` WRITE;
/*!40000 ALTER TABLE `batch` DISABLE KEYS */;
INSERT INTO `batch` VALUES (1,'batch1','stra','1',1,1,5000,'2017-01-22','2017-04-22','Animal and Health Worker','JR1',100.00,50.00,1,'approved','2017-06-22',4800,100,100,4800,'2016-08-12','2017-04-30',1,1,'PMKVY','240'),(2,'batch2','stra','2',2,2,2000,'2017-10-22','2018-01-22','Micro Irrigation Technician','JR2',100.00,50.00,2,'approved','2018-02-22',1800,100,100,1800,'2017-09-22','2018-01-28',2,2,'Non PMKVY','280');
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
INSERT INTO `candidate` VALUES (12,'Prateek','12065','Male','1996-08-14','Anup Kapoor',1203651028,9654019428,'orateek@gmail.com','graduate','kg-48',201001,90.00,45.00,'pass','true','placed','2018-02-01','full time',1,1,22,'Ghaziabad',9654019428,'prateek@mail.cpm','Uttar Pradesh'),(13,'priyanka','10565','Female','1996-02-01','Ranjeet Singh',1236547989,9658958933,'priyanka@gmail.com','graduate','kj-09',201365,85.00,50.00,'pass','true','placed','2018-02-01','full time',1,2,22,'chipyana',9659922236,'priyanka@gmail.com','Uttar Pradesh');
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `centre`
--

LOCK TABLES `centre` WRITE;
/*!40000 ALTER TABLE `centre` DISABLE KEYS */;
INSERT INTO `centre` VALUES (1,'Lakshmi Bai Centre','Prateek Kapoor','KG-48,Kavi Nagar','Ghaziabad','UP','1','JR1','ITI',9654019428),(2,'Aptech','Ruchi Pareek','H-261,Patel Marg','Ghaziabad','UP','2','JR1','AITI',9654203258),(3,'Raman Institute','Ram ','I-12, Lajpat Nagar','Lajpat Nagar','Delhi','3','JR2','RVTI',9810811444),(4,'Maharana Centre of Agriculture','Prateek Kapoor','KG-48,Kavi Nagar','Ghaziabad','UP','1','JR1','ITI',9654019428),(5,'Krishna Institute','Prateek Kapoor','KG-48,Kavi Nagar','Ghaziabad','UP','1','JR1','ITI',9654019428);
/*!40000 ALTER TABLE `centre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
INSERT INTO `certificate` VALUES ('1',12,'JR1'),('2',13,'JR2');
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `csrfunds`
--

LOCK TABLES `csrfunds` WRITE;
/*!40000 ALTER TABLE `csrfunds` DISABLE KEYS */;
INSERT INTO `csrfunds` VALUES (1,'Smalt and Beryl','Pravek','pravek@gmail.com',9654019428,200000,'2017-02-12'),(2,'Cognizant','Anuj','anuj@cognizant.com',9213423200,300000,'2017-02-24'),(3,'IBM','Ajay','ajay@ibm.com',9810811444,450000,'2017-02-24'),(4,'Torry Harris','Mahesh','mahesh@torryharris.com',9654019427,500000,'2017-02-24'),(5,'Fluper','Mathur','mathur@fluper.com',9815552525,150000,'2017-04-28'),(6,'Smalt and Beryl','Pravek','pravek@smaltandberyl.com',9842525302,500000,'2016-04-18'),(7,'Cognizant','Anuj','anuj@cognizant.com',9213423200,400000,'2016-04-25'),(8,'IBM','Ajay','ajay@ibm.com',9810811444,300000,'2016-04-28'),(9,'Torry Harris','Mahesh','mahesh@torryharris.com',9658422325,150000,'2016-08-12'),(10,'Fluper','Mathur','mathur@fluper.com',9658946952,200000,'2016-09-12');
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
INSERT INTO `employer` VALUES (1,'infosys','gurgaon','Gurgaon','Delhi'),(2,'Smalt and Beryl','Noida','Noida','UP');
/*!40000 ALTER TABLE `employer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,'Priyanka',417721224522,'priyanka@gmail.com','New suggestion');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `industrypartnerships`
--

LOCK TABLES `industrypartnerships` WRITE;
/*!40000 ALTER TABLE `industrypartnerships` DISABLE KEYS */;
INSERT INTO `industrypartnerships` VALUES ('1','Smalt and Beryl','Education'),('10','Blue Mix','IT'),('11','BlueStraws','IT'),('12','Fluper','IT'),('13','Hestabit','IT'),('14','Bhilwara','IT'),('15','Hexaview','IT'),('2','Infosys','IT'),('3','wipro','IT'),('4','Cognizant','IT'),('5','Shree Ram Pistons','Manufacturing'),('6','Continental Carbon','Manufacturing'),('7','Torrey Harris','IT'),('8','IBM','IT'),('9','Microsoft','IT');
/*!40000 ALTER TABLE `industrypartnerships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `interestedtp`
--

LOCK TABLES `interestedtp` WRITE;
/*!40000 ALTER TABLE `interestedtp` DISABLE KEYS */;
/*!40000 ALTER TABLE `interestedtp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `jobrole`
--

LOCK TABLES `jobrole` WRITE;
/*!40000 ALTER TABLE `jobrole` DISABLE KEYS */;
INSERT INTO `jobrole` VALUES ('JR1','Agriculture','Worker for taking care of animal health',NULL,'Agriculture',40),('JR2','Micro Irrigation Technician','Taking care of irrigation facilities',NULL,'Agriculture',43),('JR3','Small poultry farmer','Small pouultry farmer for farms',NULL,'Agriculture',38),('JR4','Machining and Quality Technician','Mechanic and Quality Technician',NULL,'Automotive',60),('JR5','Welding and Quality Technician','Welding and Quality Technician',NULL,'Automotive',50),('JR6','Assistant Hair Stylist','Assistant Hair Stylist',NULL,'Beauty and Wellness',30);
/*!40000 ALTER TABLE `jobrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
INSERT INTO `jobs` VALUES ('1','Animal and Health Worker','Organisation for Animal Health Care','Delhi','250000','Animal and Health Worker','JR1'),('2','Micro Irrigation Technician','Organisation for Micro Irrigation','Noida','300000','Need a micro irrigation technician ','JR2'),('3','Small poultry farmer','Kanha Dairy and Poultry Farm','Dehradun','200000','Small poultry farmer','JR3'),('4','Machining and Quality Technician','Need a machining and quality technician','Noida','150000','Machining and Quality Technician','JR4'),('5','Welding and Quality Technician','Shree Ram Pistons','Gurgaon','200000','Welding and Quality Technician','JR5'),('6','Assistant Hair Stylist','Habibs ','Gurgaon','200000','Assistant Hair Stylist','JR6');
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `placementinformation`
--

LOCK TABLES `placementinformation` WRITE;
/*!40000 ALTER TABLE `placementinformation` DISABLE KEYS */;
INSERT INTO `placementinformation` VALUES (1,250,'Animal and Health Worker','2017-08-12','1'),(2,100,'Micro Irrigation Technician','2017-04-22','1'),(3,150,'Micro Irrigation Technician','2017-04-22','2'),(4,175,'Micro Irrigation Technician','2017-04-22','3'),(5,125,'Micro Irrigation Technician','2017-04-22','4'),(6,120,'Micro Irrigation Technician','2017-04-22','5'),(7,140,'Animal and Health Worker','2017-08-12','2'),(8,125,'Animal and Health Worker','2017-08-12','3'),(9,130,'Animal and Health Worker','2016-12-22','4'),(10,125,'Animal and Health Worker','2017-09-12','5'),(11,100,'Small poultry farmer','2017-09-11','1'),(12,123,'Small poultry farmer','2018-02-22','2'),(13,120,'Small poultry farmer','2018-01-22','3'),(14,160,'Small poultry farmer','2017-11-22','4'),(15,145,'Small poultry farmer','2017-08-22','5'),(16,125,'Machining and Quality Technician','2017-08-22','1'),(17,120,'Machining and Quality Technician','2017-04-22','2'),(18,190,'Machining and Quality Technician','2017-03-21','3'),(19,142,'Machining and Quality Technician','2017-12-12','4'),(20,168,'Machining and Quality Technician','2017-10-15','5'),(21,147,'Welding and Quality Technician','2017-08-11','1'),(22,149,'Welding and Quality Technician','2017-02-01','2'),(23,152,'Welding and Quality Technician','2018-01-22','3'),(24,165,'Welding and Quality Technician','2018-02-22','4'),(25,120,'Welding and Quality Technician','2018-03-12','5'),(26,136,'Assistant Hair Stylist','2018-02-22','1'),(27,123,'Assistant Hair Stylist','2018-03-22','2'),(28,124,'Assistant Hair Stylist','2017-12-20','3'),(29,136,'Assistant Hair Stylist','2017-10-11','4'),(30,145,'Assistant Hair Stylist','2018-01-22','5');
/*!40000 ALTER TABLE `placementinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `policygovernment`
--

LOCK TABLES `policygovernment` WRITE;
/*!40000 ALTER TABLE `policygovernment` DISABLE KEYS */;
INSERT INTO `policygovernment` VALUES ('1','P1025','Digital India','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('2','P1026','Skill India','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('3','P1027','Make in India ','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('4','P1028','Swachh Bharat Abhiyaan','http://thdc.gov.in/Writereaddata/English/schemePM.pdf');
/*!40000 ALTER TABLE `policygovernment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `relevantdocumentsindustry`
--

LOCK TABLES `relevantdocumentsindustry` WRITE;
/*!40000 ALTER TABLE `relevantdocumentsindustry` DISABLE KEYS */;
INSERT INTO `relevantdocumentsindustry` VALUES ('1','102','Skill India','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('2','103','Make in India','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('3','104','Swachh Bharat Abhiyaan','http://thdc.gov.in/Writereaddata/English/schemePM.pdf'),('4','105','Digital India','http://thdc.gov.in/Writereaddata/English/schemePM.pdf');
/*!40000 ALTER TABLE `relevantdocumentsindustry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `relevantdocumentstp`
--

LOCK TABLES `relevantdocumentstp` WRITE;
/*!40000 ALTER TABLE `relevantdocumentstp` DISABLE KEYS */;
INSERT INTO `relevantdocumentstp` VALUES ('1','101','Training Partner Guidelines','http://www.bssskillmission.in/nsdc/MONITORING%20POLICY.pdf'),('2','102','Skilling Guidelines','http://www.bssskillmission.in/nsdc/MONITORING%20POLICY.pdf'),('3','103','Affiliation Policy','http://www.bssskillmission.in/nsdc/MONITORING%20POLICY.pdf');
/*!40000 ALTER TABLE `relevantdocumentstp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `reportedissues`
--

LOCK TABLES `reportedissues` WRITE;
/*!40000 ALTER TABLE `reportedissues` DISABLE KEYS */;
INSERT INTO `reportedissues` VALUES (1,'Training Partner','Prateek','123CSE','Lakshmi Bai Training Institute','LK12453','Electricity','No proper electricity supply at the venue',1,'2018-03-29');
/*!40000 ALTER TABLE `reportedissues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `reportgovernment`
--

LOCK TABLES `reportgovernment` WRITE;
/*!40000 ALTER TABLE `reportgovernment` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportgovernment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `rpl`
--

LOCK TABLES `rpl` WRITE;
/*!40000 ALTER TABLE `rpl` DISABLE KEYS */;
/*!40000 ALTER TABLE `rpl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sectorskillcouncil`
--

LOCK TABLES `sectorskillcouncil` WRITE;
/*!40000 ALTER TABLE `sectorskillcouncil` DISABLE KEYS */;
INSERT INTO `sectorskillcouncil` VALUES ('1','Automotive Skills Development Council','Automation'),('10','Agriculture','Agriculture'),('11','Telecom Sector Skill Council','Telecom'),('12','BFSI Sector Skill Council','BFSI'),('13','Leather Sector Skill Council','Leather'),('14','Food Industry Cappacity ','Food'),('15','Logistics Sector Skill Council','Logistics'),('16','Indian Plumbing Sector Skill Council','Plumbing'),('17','Capital Goods','Goods'),('18','Construction Skill Development','Construction'),('19','Life Science Sector Skill Council','Life Science'),('2','Security Sector Skill Development Council','Security'),('20','Iron and Steel ','Iron and Steel'),('21','Textile and Handloom ','textile'),('22','Apparels, Madeup and HomeFurnishing','Appareel'),('23','Beauty and Wellness','beauty'),('24','Tourism and Hospitality','Tourism'),('25','Furniture and Fitting Sector Skill Council','Furniture'),('3','Retailers Association Skill Council of India','Retail'),('4','IT-ITes Sector Skill Council','IT'),('5','Media and Entertainment Skill Council','Media and Entertainment'),('6','Rubber Sector Skill Council','Rubber'),('7','Health Care Sector Skill Council','Health Care'),('8','Gems and Jewellery','Germs and Jewellery'),('9','Electronics Sector Skill Council','Electronics');
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
INSERT INTO `target` VALUES ('2015-02-18',20000,'TP'),('2016-02-12',20000,'TP'),('2018-02-12',2000000,'TP');
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
INSERT INTO `trainer` VALUES (1,'Pravek','Associate Professor','1'),(2,'Ruchi','Associate Professor','2'),(3,'Ram','Associate Professor','3'),(4,'Priyanka','Associate Professor','4'),(5,'Prateek','Associate Professor','5'),(6,'Akhil','Associate Professor','6'),(7,'Achin','Associate Professor','7'),(8,'Jaya','Associate Professor','8'),(9,'Divyanshu','Associate Professor','9'),(10,'Sunil','Associate Professor','10');
/*!40000 ALTER TABLE `trainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingcenter`
--

LOCK TABLES `trainingcenter` WRITE;
/*!40000 ALTER TABLE `trainingcenter` DISABLE KEYS */;
INSERT INTO `trainingcenter` VALUES (1,'Mentorship Labs','noida','noida','UP',9810811444,'1',1),(2,'Mentorship Labs','delhi','delhi','delhi',9865892522,'1',1),(3,'Mentorship Lab','vasant vihar','Delhi','Delhi',9185872536,'1',1),(4,'Mentorship Lab','Arunachal Pradesh','Arunachal Pradesh','Arunachal Pradesh',9684825620,'1',1),(5,'Mentorship Lab','Dehradun','Dehradun','Uttrakhand',9654019427,'1',1),(6,'CETPA','Lajpat Nagar','delhi','delhi',9658754820,'2',1),(7,'CETPA','Lajpat Nagar','delhi','delhi',9658754820,'2',1),(8,'GERMI','Kavi Nagar','Ghaziabad','Ghaziabad',9685987220,'2',1),(9,'Lakshmi Bai Training Institute','pritampura','Delhi','Delhi',9685948252,'2',1),(10,'Lakshmi Bai Training Institute','preet vihar','Delhi','Delhi',9658925892,'2',1),(11,'Lakshmi Bai Training Institute','anand vihar','Delhi','Delhi',9686320315,'3',1),(12,'Lakshmi Bai Training Institute','bhubneswar','Orissa','Orissa',9582468253,'3',1),(13,'Lakshmi Bai Training Institute','okhla','Delhi','Delhi',9685745032,'3',1),(14,'Lakshmi Bai Training Institute','Jangpura','Delhi','Delhi',9658032621,'3',1),(15,'Ram Vansh Training Institute','Anand vihar','Delhi','Delhi',9689874201,'4',1),(16,'Ram Vansh Training Institute','Okhla','Delhi','Delhi',9658974210,'4',1),(17,'Ram Vansh Training Institute','Manas Nagar','Tripura','Tripura',9658920504,'4',1),(18,'DUCAT','Noida','Noida','UP',8579820268,'4',1),(19,'DUCAT','Murad Nagar','Murad Nagar','UP',8285779036,'5',1),(20,'DUCAT','Mohan Nagar ','Mohan Nagar','UP',8285779044,'5',1),(21,'DUCAT','Gauhati','Gauhaati','Gauhati',8795682525,'6',1),(22,'Faruk Chand Training Institute','Delhi','Delhi','Delhi',9658989510,'12',1),(23,'Faruk Chand Training Institute','okhla ','Delhi','Delhi',9968952012,'12',1),(24,'Faruk Chand Training Institute','Faridabad','Haryana','Haryana',9689572031,'13',1),(25,'Faruk Chand Training Institute','Ram Nagar','Moradabad','Delhi',7042473308,'14',1);
/*!40000 ALTER TABLE `trainingcenter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingmaterial`
--

LOCK TABLES `trainingmaterial` WRITE;
/*!40000 ALTER TABLE `trainingmaterial` DISABLE KEYS */;
INSERT INTO `trainingmaterial` VALUES (1021,'Quality Technician','http://indiaskillsonline.com/','images/trainingpartner.png','JR2'),(1101,'Agriculture and farming','http://indiaskillsonline.com/','images/goverment background.png','JR1'),(1102,'Agriculture Tools','https://www.nsdcindia.org/sites/default/files/MC_AGR%20Q0301_Banana%20Farmer_30.10.2017.pdf','images/goverment background.png','JR1'),(1103,'Small poultry farmer','https://www.nsdcindia.org/sites/default/files/MC_AGR-Q0101_Paddy_Farmer_20-06-2017.pdf','images/goverment background.png','JR1'),(1301,'Hair Stylist','http://indiaskillsonline.com/','images/goverment background.png','JR6');
/*!40000 ALTER TABLE `trainingmaterial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartner`
--

LOCK TABLES `trainingpartner` WRITE;
/*!40000 ALTER TABLE `trainingpartner` DISABLE KEYS */;
INSERT INTO `trainingpartner` VALUES ('1','Smalt and Beryl','Pravek','A-103 Eco Towers','www.smaltandberyl.com','Nodia','UP',9654019428,1,NULL),('10','De Unique Educational Society','Amit Rai','Mumbai ','www.dues.com','Roppar','Punjab',9587457565,10,NULL),('11','Mentor Skills India ','Rajesh','Lajpat Nagar','www.msi.edu','Lajpat nagar','Delhi',9911312456,11,NULL),('12','Manav Kalyan Avam Vikas Sanstha','Manva','Arunachal Pradesh','www.manavkalyan.com','Damadari','Arunachal Pradesh',9875482130,12,NULL),('13','Care Educational Trust','Mukesh','vijay nagar','www.caretrust.com','Ghaziabad','UP',9654019427,13,NULL),('14','Care College','Manish','pratap vihar','www.carecollege.com','Delhi','Delhi',9658712525,14,NULL),('15','Frontline Business Solutions','Sumit','yashoda nagar','www.frontline.com','Ghaziabad','UP',8582548779,15,NULL),('16','National Yuva Corporation','Sidharth','kavi nagar ','www.nyc.com','Ghaziabad','UP',8579458256,16,NULL),('17','Cosmos Man Power','Manas','patel marg','www.cosmos.com','Ghaziabad','UP',9658987210,17,NULL),('18','UTL Technologies','Akshay','parpar ganj','www.utltechnologies.com','Delhi','Delhi',7285879602,18,NULL),('19','Wayline Management Consultants','Pulkit','prakash vihar','www.waveline.com','Bhubneswar','Orissa',9685872560,19,NULL),('2','ABESIT','Ashu Goel','NH-24 ','www.abesit.in','Ghaziabad','UP',9810811444,2,NULL),('20','Reep Trust','Kamal','anand vihar','www.reeptrust.com','Ghaziabad','UP',8285779036,20,NULL),('21','Navodya Institute','Prashant','vasant vihar','www.nvodya.com','Delhi','Delhi',8285779658,21,NULL),('22','SWACA','Kamal ','nehru Nagar','www.swaca.com','Ghaziabad','UP',9213842320,22,NULL),('23','Watrana Traction','Ayush','preetam nagar','www.watrana.com','Allahabad','UP',9685742535,23,NULL),('24','ACCEDE','Pranjal','Baggar','www.accede.com','JhunJhun','Rajasthan',8587956825,24,NULL),('25','GIMIT','Nimit','mannat nagar','www.gimit.com','Ghaziabad','UP',9658901205,25,NULL),('3','ABESEC','Ashok Puri','NH-24','www.abesec.in','Ghaziabad','UP',9901025254,3,NULL),('4','AKG','Amit Garg','NH-24','www.akg.in','Ghaziabad','UP',9810811444,4,NULL),('5','KIET','Anil','NH-26','www.kiet.com','Ghaziabad','UP',9654019427,5,NULL),('6','HRIT','Ajay','Meerut Road','www.hrit.com','Ghaziabad','UP',9654878520,6,NULL),('7','Hi-Tech','Amit Kumar','Meerut','www.hitech.com','Ghaziabad','UP',9810811444,7,NULL),('8','CVRCE','Ashok','Delhi','www.cvrce.com','Delhi','Delhi',9658471025,8,NULL),('9','Possit Skill Organisation','Anup','Orissa','www.pso.com','Bhubneswar','Orissa',9687854302,9,NULL);
/*!40000 ALTER TABLE `trainingpartner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `trainingpartnerqualificationpack`
--

LOCK TABLES `trainingpartnerqualificationpack` WRITE;
/*!40000 ALTER TABLE `trainingpartnerqualificationpack` DISABLE KEYS */;
INSERT INTO `trainingpartnerqualificationpack` VALUES (102,'1','Airline High Lift Truck Operator','Airman ','PMKVY',1),(103,'1','Airline Cargo Assistant','Cargo Assistant','PMKVY',1),(104,'4','Rooftop Solar PV Entrepreneur','Rooftop Solar PV Entrepreneur','Non-PMKVY',1),(105,'5','Solar Proposal Evaluation Specialist','Solar Proposal Evaluation Specialist','Non-PKVY',1),(106,'5','Rooftop Solar Grid Engineer','Rooftop Solar Grid Engineer','PMKVY ',1),(107,'6','Solar PV Business Development Executive','Solar PV Business Development Executive','PMKVY',1),(108,'6','Solar PV Site Surveyor','Solar PV Site Surveyor','MPKVY',1),(601,'6','Solar Domestic Water Heater Technician','Solar Domestic Water Heater Technician','PMKVY',1),(1041,'1','Airline Baggage Handler','Baggage Handler','PMKVY',1),(1109,'2','Farm Workshop Foreman/Supervisor','Farm Workshop Foreman/Supervisor','PMKVVY',1),(1110,'2','Farm Workshop/Service Manager','Farm Workshop/Service Manager','PMKVY',1),(2101,'5','Improved Cook stove Installer','Improved Cook stove Installer','PMKVY',1),(4102,'1','Dairy Worker','Dairy Worker','Non-PMKVY',1),(4307,'1','Layer Farm Worker','Layer Farm Worker','Non-PMKVY',1),(5109,'2','Feed Technician','Feed Technician','PMKVY',1),(5602,'2','Pre Sales Solar Technical Support Engineer','Pre Sales Solar Technical Support Engineer','PMKVY',1),(5801,'4','Solar Module Assembly Technician','Solar Module Assembly Technician','PMKVY',1),(5901,'3','Solar Panel Installation Technician','Solar Panel Installation Technician','PMKVY',1),(5902,'3','Solar PV System Installation Engineer ','Solar PV System Installation Engineer ','PMKVY',1),(6101,'5','Recyclable Waste Collector & Segregator','Recyclable Waste Collector & Segregator','PMKVY',1),(6102,'5','Safai Karmachari ','Safai Karmachari ','PMKVY',1),(6103,'6','Waste Picker','Waste Picker','PMKVY',1),(6601,'4','Wastewater Treatment Plant Technician ','Wastewater Treatment Plant Technician ','PMKVY',1),(6602,'4','Wastewater Treatment Plant Helper','Wastewater Treatment Plant Helper','PMKVY',1),(6701,'2','Solar Pump technician ','Solar Pump technician ','PMKVY',1),(7101,'4','Wholesale Sales Executive - Gemstone Processing ','Wholesale Sales Executive - Gemstone Processing ','PMKVY',1);
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
-- Dumping data for table `upcomingtraining`
--

LOCK TABLES `upcomingtraining` WRITE;
/*!40000 ALTER TABLE `upcomingtraining` DISABLE KEYS */;
INSERT INTO `upcomingtraining` VALUES ('AB101','Mechanical Aggregates Repairing','Automotive Skills Development Council','2018-08-02','2018-06-30','evdcsgv','AB'),('TP101','Platform Skills','Tourism & Hospitality','2018-04-11','2018-06-30','whdfbh','TP');
/*!40000 ALTER TABLE `upcomingtraining` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('Smalt and Beryl','Pravek','1','pravek','TP',1),('ABESIT','Ashu Goel','2','ashu','TP',2),('ABESEC','Ashok Puri','3','ashok','TP',3),('AKG','Amit Garg','4','amit','TP',4),('KIET','Anil','5','anil','TP',5),('HRIT','Ajay','6','ajay','TP',6),('Hi-Tech','Amit Kumar','7','amit','TP',7),('CVRCE','Ashok','8','ashok','TP',8),('Possit Skill Organisation','Anup','9','anup','TP',9),('De Unique Educational Society','Amit Rai','10','amit','TP',10),('Mentor Skills India ','Rajesh','11','rajesh','TP',11),('Manav Kalyan Avam Vikas Sanstha','Manva','12','manav','TP',12),('Care Educational Trust','Mukesh','13','mukesh','TP',13),('Care College','Manish','14','manish','TP',14),('Frontline Business Solutions','Sumit','15','sumit','TP',15),('National Yuva Corporation','Sidharth','16','sidharth','TP',16),('Cosmos Man Power','Manas','17','manas','TP',17),('UTL Technologies','Akshay','18','akshay','TP',18),('Wayline Management Consultants','Pulkit','19','pulkit','TP',19),('Reep Trust','Kamal','20','kamal','TP',20),('Navodya Institute','Prashant','21','prashant','TP',21),('SWACA','Kamal ','22','kamal','TP',22),('Watrana Traction','Ayush','23','Ayush','TP',23),('ACCEDE','Pranjal','24','pranjal','TP',24),('GIMIT','Nimit','25','nimit','TP',25),('Lakshmi Institute','Akhand','26','akhand','AB',26),('Tarneged Institute','Arjita','27','arjita','AB',27),('KPIT Academy','Pranjal','28','pranjal','AB',28);
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

-- Dump completed on 2018-03-31  8:41:34
