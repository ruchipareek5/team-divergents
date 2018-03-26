-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: testdatabase
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
-- Table structure for table `abassessor`
--
use msde;
DROP TABLE IF EXISTS `abassessor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abassessor` (
  `abassessorId` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL,
  `jobRole` varchar(100) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `educationalQualification` varchar(200) DEFAULT NULL,
  `experience` int(3) DEFAULT NULL,
  `emailId` varchar(200) DEFAULT NULL,
  `contactNo` bigint(11) DEFAULT NULL,
  `abId` int(15) NOT NULL,
  PRIMARY KEY (`abassessorId`),
  KEY `abId` (`abId`),
  CONSTRAINT `abassessor_ibfk_1` FOREIGN KEY (`abId`) REFERENCES `assessmentagencyregistration` (`abId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `abmanagement`
--

DROP TABLE IF EXISTS `abmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abmanagement` (
  `abManagementId` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `ContactNumber` bigint(20) DEFAULT NULL,
  `EducationalQualification` varchar(200) DEFAULT NULL,
  `Experience` int(3) DEFAULT NULL,
  `emailId` varchar(200) DEFAULT NULL,
  `Office` varchar(200) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `PINcode` int(6) DEFAULT NULL,
  `landlineNo` bigint(11) DEFAULT NULL,
  `abId` int(15) NOT NULL,
  PRIMARY KEY (`abManagementId`),
  KEY `abId` (`abId`),
  CONSTRAINT `abmanagement_ibfk_1` FOREIGN KEY (`abId`) REFERENCES `assessmentagencyregistration` (`abId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `agency`
--

DROP TABLE IF EXISTS `agency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agency` (
  `agencyId` int(10) NOT NULL,
  `agencyName` varchar(200) NOT NULL,
  `applicationId` int(20) NOT NULL,
  PRIMARY KEY (`agencyId`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `agency_ibfk_1` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application` (
  `applicationId` int(20) NOT NULL AUTO_INCREMENT,
  `applicationState` varchar(20) NOT NULL,
  `isActive` tinyint(1) DEFAULT NULL,
  `dateOfSubmission` datetime NOT NULL,
  `userId` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`applicationId`),
  KEY `userId` (`userId`),
  CONSTRAINT `application_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `applicationcomments`
--

DROP TABLE IF EXISTS `applicationcomments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `applicationcomments` (
  `commentId` int(10) NOT NULL AUTO_INCREMENT,
  `comment` varchar(200) NOT NULL,
  `applicationId` int(20) NOT NULL,
  `activeFlag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`commentId`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `applicationcomments_ibfk_1` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `assessmentagencyregistration`
--

DROP TABLE IF EXISTS `assessmentagencyregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assessmentagencyregistration` (
  `abId` int(15) NOT NULL AUTO_INCREMENT,
  `address` varchar(500) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `mobileNumber` bigint(11) DEFAULT NULL,
  `landlineNo` bigint(11) DEFAULT NULL,
  `PINcode` int(6) DEFAULT NULL,
  `faxNumber` bigint(15) DEFAULT NULL,
  `yearofEstablishment` year(4) DEFAULT NULL,
  `modelofInstitution` varchar(10) DEFAULT NULL,
  `PAN` varchar(10) DEFAULT NULL,
  `TAN` varchar(10) DEFAULT NULL,
  `turnover` varchar(20) DEFAULT NULL,
  `recognitionWithAnyGovt` tinyint(1) DEFAULT NULL,
  `nameRecognizingBody` varchar(500) DEFAULT NULL,
  `recognitionNumber` varchar(10) DEFAULT NULL,
  `yearOfRecognition` year(4) DEFAULT NULL,
  `validityOfRecognition` date DEFAULT NULL,
  `affiliatedWithAnySSC` tinyint(1) DEFAULT NULL,
  `assessmentExperience` tinyint(1) DEFAULT NULL,
  `years` int(3) DEFAULT NULL,
  `totalNumberOfAssessmentComplete` int(3) DEFAULT NULL,
  `applicationId` int(20) NOT NULL,
  `assessmentAgencyName` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`abId`),
  KEY `assessmentAgencyName` (`assessmentAgencyName`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `assessmentagencyregistration_ibfk_1` FOREIGN KEY (`assessmentAgencyName`) REFERENCES `user` (`organizationName`),
  CONSTRAINT `assessmentagencyregistration_ibfk_2` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `assessor`
--

DROP TABLE IF EXISTS `assessor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assessor` (
  `assessorId` int(10) NOT NULL,
  `assessorName` varchar(200) NOT NULL,
  `district` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `agencyId` int(10) NOT NULL,
  PRIMARY KEY (`assessorId`),
  KEY `agencyId` (`agencyId`),
  CONSTRAINT `assessor_ibfk_1` FOREIGN KEY (`agencyId`) REFERENCES `agency` (`agencyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch` (
  `batchId` int(10) NOT NULL,
  `batchName` varchar(200) NOT NULL,
  `batchType` varchar(10) NOT NULL,
  `trainingPartnerId` varchar(20) DEFAULT NULL,
  `centreId` int(5) DEFAULT NULL,
  `trainerId` int(10) DEFAULT NULL,
  `totalCandidatesInBatch` int(5) NOT NULL,
  `batchStartDate` date NOT NULL,
  `batchEndDate` date NOT NULL,
  `jobRole` varchar(100) NOT NULL,
  `jobRoleCode` varchar(30) NOT NULL,
  `maximumMarksTheory` decimal(5,2) DEFAULT NULL,
  `maximumMarksPractical` decimal(5,2) DEFAULT NULL,
  `level` int(5) NOT NULL,
  `resultApproved` varchar(15) DEFAULT NULL,
  `resultApprovedOnDate` date DEFAULT NULL,
  `totalPass` int(5) DEFAULT NULL,
  `totalFail` int(5) DEFAULT NULL,
  `totalNotAppeared` int(5) DEFAULT NULL,
  `totalCertified` int(5) DEFAULT NULL,
  `batchAssignmentDate` date DEFAULT NULL,
  `assessmentDate` date NOT NULL,
  `agencyId` int(10) DEFAULT NULL,
  `assessorId` int(10) DEFAULT NULL,
  `batchMode` varchar(50) NOT NULL,
  `candidatesPlaced` varchar(10) NOT NULL,
  PRIMARY KEY (`batchId`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  KEY `centreId` (`centreId`),
  KEY `trainerId` (`trainerId`),
  KEY `agencyId` (`agencyId`),
  KEY `assessorId` (`assessorId`),
  CONSTRAINT `batch_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`),
  CONSTRAINT `batch_ibfk_2` FOREIGN KEY (`centreId`) REFERENCES `centre` (`centreId`),
  CONSTRAINT `batch_ibfk_3` FOREIGN KEY (`trainerId`) REFERENCES `trainer` (`trainerId`),
  CONSTRAINT `batch_ibfk_4` FOREIGN KEY (`agencyId`) REFERENCES `agency` (`agencyId`),
  CONSTRAINT `batch_ibfk_5` FOREIGN KEY (`assessorId`) REFERENCES `assessor` (`assessorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `batchassignment`
--

DROP TABLE IF EXISTS `batchassignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batchassignment` (
  `batchAssignmentid` int(10) NOT NULL AUTO_INCREMENT,
  `batchId` int(10) DEFAULT NULL,
  `agencyId` int(10) DEFAULT NULL,
  `timeStamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `responseType` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`batchAssignmentid`),
  KEY `batchId` (`batchId`),
  KEY `agencyId` (`agencyId`),
  CONSTRAINT `batchassignment_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `batchassignment_ibfk_2` FOREIGN KEY (`agencyId`) REFERENCES `agency` (`agencyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `businessaudit`
--

DROP TABLE IF EXISTS `businessaudit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `businessaudit` (
  `auditId` int(10) NOT NULL AUTO_INCREMENT,
  `auditMessage` varchar(500) NOT NULL,
  `userId` varchar(200) NOT NULL,
  PRIMARY KEY (`auditId`),
  KEY `userId` (`userId`),
  CONSTRAINT `businessaudit_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `candidate` (
  `candidateDetailsId` int(10) NOT NULL,
  `candidateName` varchar(200) NOT NULL,
  `enrollmentNumber` varchar(40) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `nameOfFatherOrHusband` varchar(200) NOT NULL,
  `aadharNumber` bigint(12) NOT NULL,
  `mobileNumber` bigint(11) NOT NULL,
  `emailId` varchar(200) NOT NULL,
  `educationLevel` varchar(50) NOT NULL,
  `traineeAddress` varchar(500) NOT NULL,
  `traineePinCode` int(6) NOT NULL,
  `marksObtainedTheory` decimal(5,2) DEFAULT NULL,
  `marksObtainedPractical` decimal(5,2) DEFAULT NULL,
  `result` varchar(5) DEFAULT NULL,
  `certified` varchar(5) DEFAULT NULL,
  `placementStatus` varchar(20) NOT NULL,
  `dateOfJoining` date DEFAULT NULL,
  `employmentType` varchar(50) NOT NULL,
  `batchId` int(10) DEFAULT NULL,
  `employerId` int(10) DEFAULT NULL,
  PRIMARY KEY (`candidateDetailsId`),
  KEY `batchId` (`batchId`),
  KEY `employerId` (`employerId`),
  CONSTRAINT `candidate_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `candidate_ibfk_2` FOREIGN KEY (`employerId`) REFERENCES `employer` (`employerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `centre`
--

DROP TABLE IF EXISTS `centre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `centre` (
  `centreId` int(5) NOT NULL,
  `centreName` varchar(200) NOT NULL,
  `centrePOCContactName` varchar(200) NOT NULL,
  `centreAddress` varchar(500) NOT NULL,
  `district` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `trainingPartnerId` varchar(20) NOT NULL,
  `jobroleId` varchar(30) DEFAULT NULL,
  `block` varchar(80) DEFAULT NULL,
  `contact` bigint(12) DEFAULT NULL,
  PRIMARY KEY (`centreId`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  KEY `jobroleId` (`jobroleId`),
  CONSTRAINT `centre_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`),
  CONSTRAINT `centre_ibfk_2` FOREIGN KEY (`jobroleId`) REFERENCES `jobrole` (`jobRoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `certificate`
--

DROP TABLE IF EXISTS `certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `certificate` (
  `certificateId` int(10) NOT NULL AUTO_INCREMENT,
  `certificateName` varchar(50) DEFAULT NULL,
  `certificateUploadDate` date DEFAULT NULL,
  `batchId` int(10) DEFAULT NULL,
  `userId` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`certificateId`),
  KEY `batchId` (`batchId`),
  KEY `userId` (`userId`),
  CONSTRAINT `certificate_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `certificate_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `csrfunds`
--

DROP TABLE IF EXISTS `csrfunds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `csrfunds` (
  `csrApplicationNumber` int(11) NOT NULL,
  `OrganisationName` varchar(50) NOT NULL,
  `sPocName` varchar(45) NOT NULL,
  `sPOCrEmail` varchar(55) NOT NULL,
  `sPOCPhone` bigint(12) NOT NULL,
  `amountDeposited` bigint(12) NOT NULL,
  `submissionDate` date NOT NULL,
  PRIMARY KEY (`csrApplicationNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `documentsuploaded`
--

DROP TABLE IF EXISTS `documentsuploaded`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documentsuploaded` (
  `documentId` int(10) NOT NULL AUTO_INCREMENT,
  `documentName` varchar(200) NOT NULL,
  `documentLocation` varchar(150) DEFAULT NULL,
  `applicationId` int(20) NOT NULL,
  PRIMARY KEY (`documentId`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `documentsuploaded_ibfk_1` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employer`
--

DROP TABLE IF EXISTS `employer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employer` (
  `employerId` int(10) NOT NULL,
  `employerName` varchar(200) NOT NULL,
  `locationOfEmployer` varchar(500) NOT NULL,
  `locationOfEmployerDistrict` varchar(50) NOT NULL,
  `locationOfEmployerState` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `industrypartnerships`
--

DROP TABLE IF EXISTS `industrypartnerships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `industrypartnerships` (
  `IndustryId` varchar(20) NOT NULL,
  `IndustryName` varchar(45) NOT NULL,
  `IndustryDomain` varchar(100) NOT NULL,
  PRIMARY KEY (`IndustryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `jobrole`
--

DROP TABLE IF EXISTS `jobrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobrole` (
  `jobRoleId` varchar(30) NOT NULL,
  `jobRoleName` varchar(80) DEFAULT NULL,
  `jobRoleDescription` varchar(200) DEFAULT NULL,
  `jobRoleUrl` varchar(100) DEFAULT NULL,
  `ssc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`jobRoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `jobId` varchar(30) NOT NULL,
  `jobTitle` varchar(60) DEFAULT NULL,
  `organization` varchar(50) DEFAULT NULL,
  `location` varchar(60) DEFAULT NULL,
  `ctc` varchar(45) DEFAULT NULL,
  `jobDescription` varchar(200) DEFAULT NULL,
  `jobRoleId` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`jobId`),
  KEY `jobRoleId_idx` (`jobRoleId`),
  CONSTRAINT `jobRoleId` FOREIGN KEY (`jobRoleId`) REFERENCES `jobrole` (`jobRoleId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `placementinformation`
--

DROP TABLE IF EXISTS `placementinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `placementinformation` (
  `id` int(11) NOT NULL,
  `candidatesPlaced` int(10) NOT NULL,
  `jobRole` varchar(45) NOT NULL,
  `placementDate` date NOT NULL,
  `trainingPartnerId` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  CONSTRAINT `placementinformation_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `relevantdocumentstp`
--

DROP TABLE IF EXISTS `relevantdocumentstp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relevantdocumentstp` (
  `policyId` varchar(30) NOT NULL,
  `policyNo` varchar(80) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `policyDocUrl` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`policyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `rpl`
--

DROP TABLE IF EXISTS `rpl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rpl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areaOfOperation` varchar(55) DEFAULT NULL,
  `noOfemployeesTobeCertified` int(10) DEFAULT NULL,
  `companyIncorporationNumber` varchar(55) DEFAULT NULL,
  `hrPocEmail` varchar(55) DEFAULT NULL,
  `organisationName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sectorskillcouncil`
--

DROP TABLE IF EXISTS `sectorskillcouncil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sectorskillcouncil` (
  `sscId` varchar(10) NOT NULL,
  `sscName` varchar(45) NOT NULL,
  `sscDomain` varchar(45) NOT NULL,
  PRIMARY KEY (`sscId`),
  UNIQUE KEY `sscName_UNIQUE` (`sscName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `showinterest`
--

DROP TABLE IF EXISTS `showinterest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `showinterest` (
  `showIntrestId` int(10) NOT NULL AUTO_INCREMENT,
  `batchId` int(10) DEFAULT NULL,
  `agencyId` int(10) DEFAULT NULL,
  `timeStamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`showIntrestId`),
  KEY `batchId` (`batchId`),
  KEY `agencyId` (`agencyId`),
  CONSTRAINT `showinterest_ibfk_1` FOREIGN KEY (`batchId`) REFERENCES `batch` (`batchId`),
  CONSTRAINT `showinterest_ibfk_2` FOREIGN KEY (`agencyId`) REFERENCES `agency` (`agencyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `target`
--

DROP TABLE IF EXISTS `target`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `target` (
  `targetYear` date NOT NULL,
  `trainingTarget` bigint(10) NOT NULL,
  `role` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`targetYear`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tpmanagement`
--

DROP TABLE IF EXISTS `tpmanagement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tpmanagement` (
  `tpManagementId` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `contactNumber` bigint(11) DEFAULT NULL,
  `educationalQualification` varchar(200) DEFAULT NULL,
  `experience` int(3) DEFAULT NULL,
  `emailId` varchar(200) DEFAULT NULL,
  `tpId` int(15) DEFAULT NULL,
  PRIMARY KEY (`tpManagementId`),
  KEY `tpId` (`tpId`),
  CONSTRAINT `tpmanagement_ibfk_1` FOREIGN KEY (`tpId`) REFERENCES `trainingpartnerregistration` (`tpId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tptrainer`
--

DROP TABLE IF EXISTS `tptrainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tptrainer` (
  `teachingStaffrelevantQP` tinyint(1) DEFAULT NULL,
  `name` varchar(500) DEFAULT NULL,
  `designation` varchar(200) DEFAULT NULL,
  `educationalQualification` varchar(200) DEFAULT NULL,
  `experience` int(3) DEFAULT NULL,
  `emailId` varchar(200) DEFAULT NULL,
  `regularVisiting` varchar(10) DEFAULT NULL,
  `abId` int(15) NOT NULL,
  KEY `abId` (`abId`),
  CONSTRAINT `tptrainer_ibfk_1` FOREIGN KEY (`abId`) REFERENCES `assessmentagencyregistration` (`abId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trainer`
--

DROP TABLE IF EXISTS `trainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainer` (
  `trainerId` int(10) NOT NULL,
  `trainerName` varchar(200) NOT NULL,
  `designation` varchar(200) NOT NULL,
  `trainingPartnerId` varchar(20) NOT NULL,
  PRIMARY KEY (`trainerId`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  CONSTRAINT `trainer_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trainingcenter`
--

DROP TABLE IF EXISTS `trainingcenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainingcenter` (
  `trainingCenterId` int(10) NOT NULL AUTO_INCREMENT,
  `centerName` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `district` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `contactNumber` bigint(20) DEFAULT NULL,
  `trainingPartnerId` varchar(20) DEFAULT NULL,
  `isActive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`trainingCenterId`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  CONSTRAINT `trainingcenter_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trainingpartner`
--

DROP TABLE IF EXISTS `trainingpartner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainingpartner` (
  `trainingPartnerId` varchar(20) NOT NULL,
  `organizationName` varchar(200) NOT NULL,
  `sPOCName` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `website` varchar(200) DEFAULT NULL,
  `district` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `contactNumber` bigint(20) DEFAULT NULL,
  `applicationId` int(11) DEFAULT NULL,
  `undertakingPath` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`trainingPartnerId`),
  UNIQUE KEY `organizationName` (`organizationName`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `trainingpartner_ibfk_1` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trainingpartnerqualificationpack`
--

DROP TABLE IF EXISTS `trainingpartnerqualificationpack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainingpartnerqualificationpack` (
  `trainingPartnerQualificationPackId` int(10) NOT NULL AUTO_INCREMENT,
  `trainingPartnerId` varchar(20) DEFAULT NULL,
  `qualificationPack` varchar(200) DEFAULT NULL,
  `jobRole` varchar(200) DEFAULT NULL,
  `scheme` varchar(200) DEFAULT NULL,
  `isActive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`trainingPartnerQualificationPackId`),
  KEY `trainingPartnerId` (`trainingPartnerId`),
  CONSTRAINT `trainingpartnerqualificationpack_ibfk_1` FOREIGN KEY (`trainingPartnerId`) REFERENCES `trainingpartner` (`trainingPartnerId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `trainingpartnerregistration`
--

DROP TABLE IF EXISTS `trainingpartnerregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainingpartnerregistration` (
  `tpId` int(15) NOT NULL AUTO_INCREMENT,
  `jobRole` varchar(100) DEFAULT NULL,
  `totalCenters` int(3) DEFAULT NULL,
  `grantsFromGovernment` tinyint(1) DEFAULT NULL,
  `recognitionOfInstitute` tinyint(1) DEFAULT NULL,
  `priorExperience` int(3) DEFAULT NULL,
  `priorExperienceInSkill` int(3) DEFAULT NULL,
  `officeManagerP` int(3) DEFAULT NULL,
  `officeManagerT` int(3) DEFAULT NULL,
  `officeStaffP` int(3) DEFAULT NULL,
  `officeStaffT` int(3) DEFAULT NULL,
  `labAttendantsP` int(3) DEFAULT NULL,
  `labAttendantsT` int(3) DEFAULT NULL,
  `accountantsP` int(3) DEFAULT NULL,
  `accountantsT` int(3) DEFAULT NULL,
  `supportStaffP` int(3) DEFAULT NULL,
  `supportStaffT` int(3) DEFAULT NULL,
  `othersP` int(3) DEFAULT NULL,
  `othersT` int(3) DEFAULT NULL,
  `processOfAdoption` tinyint(1) DEFAULT NULL,
  `existenceOfFacilitatorsGuide` tinyint(1) DEFAULT NULL,
  `existenceOfTrainerGuide` tinyint(1) DEFAULT NULL,
  `existenceOfParticipantManuals` tinyint(1) DEFAULT NULL,
  `existenceOfAssessmentGuides` tinyint(1) DEFAULT NULL,
  `existenceOfParticipantFeedbackForms` tinyint(1) DEFAULT NULL,
  `existenceOfTrainingDeliveryPlans` tinyint(1) DEFAULT NULL,
  `reviewProcessForApproval` tinyint(1) DEFAULT NULL,
  `timeTable` tinyint(1) DEFAULT NULL,
  `deliveryPlan` tinyint(1) DEFAULT NULL,
  `monitoringAndEvaluation` tinyint(1) DEFAULT NULL,
  `managementEvaluationRecords` tinyint(1) DEFAULT NULL,
  `labWorkShopExposure` tinyint(1) DEFAULT NULL,
  `industryVisits` tinyint(1) DEFAULT NULL,
  `impartingsOftSkills` tinyint(1) DEFAULT NULL,
  `providingGuidanceOnPlacements` tinyint(1) DEFAULT NULL,
  `placementFacilitation` tinyint(1) DEFAULT NULL,
  `areaOfInstitute` varchar(100) DEFAULT NULL,
  `building` varchar(200) DEFAULT NULL,
  `sizeOfClassRoom` varchar(20) DEFAULT NULL,
  `numberOfClassrooms` int(3) DEFAULT NULL,
  `sizeOfLabs` int(3) DEFAULT NULL,
  `numberOfLabs` int(3) DEFAULT NULL,
  `sizeOfWorkshops` varchar(20) DEFAULT NULL,
  `numberOfWorkshops` int(3) DEFAULT NULL,
  `presenceOfToolkit` tinyint(1) DEFAULT NULL,
  `safeDrinkingWater` tinyint(1) DEFAULT NULL,
  `powerBackup` tinyint(1) DEFAULT NULL,
  `separateToilet` tinyint(1) DEFAULT NULL,
  `transportFacility` tinyint(1) DEFAULT NULL,
  `presenceOfLibrary` tinyint(1) DEFAULT NULL,
  `technicalBooks` int(3) DEFAULT NULL,
  `nonTechnicalBooks` int(3) DEFAULT NULL,
  `magazine` int(3) DEFAULT NULL,
  `dailies` int(3) DEFAULT NULL,
  `isIlluminationSufficient` tinyint(1) DEFAULT NULL,
  `isVentilated` tinyint(1) DEFAULT NULL,
  `cleanLiness` tinyint(1) DEFAULT NULL,
  `weatherProtected` tinyint(1) DEFAULT NULL,
  `printedBrochure` tinyint(1) DEFAULT NULL,
  `documentedPolicy` tinyint(1) DEFAULT NULL,
  `concessionsPolicy` tinyint(1) DEFAULT NULL,
  `safeCustodyOfDocuments` tinyint(1) DEFAULT NULL,
  `studentAgreement` tinyint(1) DEFAULT NULL,
  `yearOfEstablishment` year(4) DEFAULT NULL,
  `mediumOfInstructions` varchar(10) DEFAULT NULL,
  `mobileNo` bigint(11) DEFAULT NULL,
  `PAN` varchar(10) DEFAULT NULL,
  `TAN` varchar(10) DEFAULT NULL,
  `turnover` varchar(20) DEFAULT NULL,
  `yearOfRecognition` year(4) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `PINcode` int(6) DEFAULT NULL,
  `district` varchar(80) DEFAULT NULL,
  `city` varchar(80) DEFAULT NULL,
  `landlineNumber` bigint(11) DEFAULT NULL,
  `faxNumber` bigint(15) DEFAULT NULL,
  `nameRecognitionBody` varchar(30) DEFAULT NULL,
  `recognitionNumber` bigint(20) DEFAULT NULL,
  `validityOfRecognition` varchar(20) DEFAULT NULL,
  `modelOfInstitute` varchar(10) DEFAULT NULL,
  `isNSDCfunded` tinyint(1) DEFAULT NULL,
  `applicationId` int(20) NOT NULL,
  `trainingPartnerName` varchar(200) DEFAULT NULL,
  `emailId` varchar(200) NOT NULL,
  PRIMARY KEY (`tpId`),
  KEY `emailId` (`emailId`),
  KEY `trainingPartnerName` (`trainingPartnerName`),
  KEY `applicationId` (`applicationId`),
  CONSTRAINT `trainingpartnerregistration_ibfk_1` FOREIGN KEY (`emailId`) REFERENCES `user` (`userId`),
  CONSTRAINT `trainingpartnerregistration_ibfk_2` FOREIGN KEY (`trainingPartnerName`) REFERENCES `user` (`organizationName`),
  CONSTRAINT `trainingpartnerregistration_ibfk_3` FOREIGN KEY (`applicationId`) REFERENCES `application` (`applicationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `organizationName` varchar(200) NOT NULL,
  `sPOCName` varchar(200) DEFAULT NULL,
  `userId` varchar(200) NOT NULL,
  `password` varchar(30) NOT NULL,
  `userRole` varchar(20) NOT NULL,
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `organizationName` (`organizationName`),
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-26 18:45:29
