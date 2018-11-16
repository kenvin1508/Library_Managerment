-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: librarydata
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `ID` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `MASACH` varchar(7) DEFAULT NULL,
  `TENSACH` varchar(45) NOT NULL,
  `THELOAI` varchar(20) NOT NULL,
  `TACGIA` varchar(20) NOT NULL,
  `NHAXB` varchar(20) NOT NULL,
  `NAMXB` varchar(5) NOT NULL,
  `GIATIEN` varchar(8) NOT NULL,
  `SOLUONG` int(4) NOT NULL,
  `LINKANH` varchar(150) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (0001,'S0001','Tin Học Cơ Sở 1','Tin Học','Nguyễn Hữu Cảnh','Giáo Dục','2000','20000',4,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Tin Học Cơ Sở 1.jpg'),(0002,'S0002','Kế Toán Ngân Hàng','Toán Học','Nguyễn Thị Loan ','Kinh Tế TP.HCM','1998','30000',10,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Kế Toán Ngân Hàng.jpg'),(0003,'S0003','Truyền Thông Quốc Tế','Triết Học','Nguyễn Duy Thương','Chính Trị Quốc Gia','2004','20000',10,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\image1\\Truyền Thông Quốc Tế.jpg'),(0004,'S0004','Chủ Nghĩa Mac-Lênin','Triết Học','Tô Văn Sông','Chính Trị Quốc Gia','2008','20000',10,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Chủ Nghĩa Mac-Lênin.jpg'),(0005,'S0005','Giải Tích 1','Toán Học','Bùi Xuân Diệu','ĐHBK - HN','2009','18000',9,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Giải Tích 1.jpg'),(0006,'S0006','Giải Tích 2 ','Toán Học','Dương Tôn Đảm','ĐHQG - UIT','2010','20000',14,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Giải Tích 2 .jpg'),(0007,'S0007','Tin Học Cơ Sở 2','Tin Học','Nguyễn Văn B','Giáo Dục','2001','20000',11,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\image1\\Tin Học Cơ Sở 2.jpg'),(0008,'S0008','Xác Suất Thống Kê','Toán Học','Tống Đình Quỳ','ĐHBK - HN','2011','25000',17,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Xác Suất Thống Kê.jpg'),(0009,'S0009','Vật Lý Và Thí Nghiệm','Vật lý ','Lê Thị Minh Thanh','PTIT- HCM','2013','26000',13,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Vật Lý Và Thí Nghiệm.jpg'),(0010,'S0010','Ngôn ngữ C++','Lập Trình','Trần Minh Châu','ĐHBK - HN','2009','30000',11,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Ngôn ngữ C++.jpg'),(0011,'S0011','Toán Rời Rạc 1','Toán Học','Nguyễn Viết Đông','ĐH KHTN','2011','33000',7,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\image1\\Toán Rời Rạc 1.jpg'),(0012,'S0012','Toán Rời Rạc 2','Toán Học','Lê Thị Thảo','ĐHQG - UIT','2008','30000',6,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Toán Rời Rạc 2.png'),(0013,'S0013','Kiến Trúc Máy Tính','Toán Học','Võ Đức Khánh','ĐHQG - HCM ','2014','35000',6,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Kiến Trúc Máy Tính.jpg'),(0014,'S0014','Lý Thuyết Thông Tin','Toán Học','Lê Thị Thanh','PTIT- HCM','2013','28000',10,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\image1\\Lý Thuyết Thông Tin.jpg'),(0015,'S0015','Xử Lý Tín Hiệu Số','Toán Học','Nguyễn Quốc Trung','Giáo Dục','2007','37000',0,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Xử Lý Tín Hiệu Số.jpg'),(0016,'S0016','Cơ Sở Dữ Liệu','Lập Trình','Phan Tấn Quốc','ĐHQG - UIT','2005','28000',9,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Cơ Sở Dữ Liệu.jpg'),(0017,'S0017','Cấu Trúc Dữ Liệu Và Giải Thuật','Lập Trình','Trần Cảnh Dinh','PTIT - HCM','2017','50000',9,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Cấu Trúc Dữ Liệu Và Giải Thuật.jpg'),(0018,'S0018','Mạng Máy Tính','Tin Học','Phạm Thế Quế','PTIT- HCM','2009','40000',14,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Mạng Máy Tính.jpg'),(0019,'S0019','Nhập Môn Trí Tuệ Nhân Tạo','Tin Học','Từ Minh Phương','ĐHQG - HCM ','2008','35000',6,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Nhập Môn Trí Tuệ Nhân Tạo.jpg'),(0020,'S0020','Kỹ Năng Làm Việc Nhóm','Kỹ Năng','Huỳnh Văn Sơn','Giáo Dục','2012','20000',8,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Kỹ Năng Làm Việc Nhóm.jpg'),(0021,'S0021','Kỹ Năng Thuyết Trình','Kỹ Năng','Dương Thị Liễu','Giáo Dục','2013','25000',9,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Kỹ Năng Thuyết Trình.jpg'),(0022,'S0022','Xử Lý Ảnh','Đồ Họa','Nguyễn Thanh Hải','ĐHQG - HCM','2009','32000',8,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Xử Lý Ảnh.jpg'),(0023,'S0023','Kỹ Thuật Đồ Họa','Đồ Họa','Trịnh Thị Văn Anh','PTIT - HCM','2011','28000',13,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Kỹ Thuật Đồ Họa.jpg'),(0024,'S0024','Lập Trình Hướng Đối Tượng','Lập Trình','Trần Đan Thư','ĐHQG - UIT','2014','37000',1,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Lập Trình Hướng Đối Tượng.jpg'),(0025,'S0025','Xử Lý Tín Hiệu Số','Toán Học','Nguyễn Quốc Trung','Giáo Dục','2007','40000',8,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Xử Lý Tín Hiệu Số.jpg'),(0026,'S0026','Xử Lý Tín Hiệu Số','Toán Học','Nguyễn Quốc Trung','Giáo Dục','2007','40000',0,'C:\\Users\\votun\\Documents\\NetBeansProjects\\LibraryManage\\src\\Image1\\Xử Lý Tín Hiệu Số.jpg');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowbill`
--

DROP TABLE IF EXISTS `borrowbill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `borrowbill` (
  `ID` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `MAPHIEU` varchar(45) DEFAULT NULL,
  `MASV` varchar(45) NOT NULL,
  `MANV` varchar(45) NOT NULL,
  `MASACH` varchar(45) NOT NULL,
  `NGAYMUON` date NOT NULL,
  `NGAYHENTRA` date NOT NULL,
  `TRANGTHAI` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowbill`
--

LOCK TABLES `borrowbill` WRITE;
/*!40000 ALTER TABLE `borrowbill` DISABLE KEYS */;
INSERT INTO `borrowbill` VALUES (0067,'MP0067','SV0001','NV0002','S0017','2018-04-20','2018-05-14','Đã Mượn'),(0069,'MP0069','SV0005','NV0002','S0011','2018-05-05','2018-05-21','Đã Mượn'),(0070,'MP0070','SV0005','NV0002','S0012','2018-05-02','2018-05-13','Đã Mượn'),(0071,'MP0071','SV0009','NV0002','S0023','2018-04-15','2018-05-07','Đã Mượn'),(0074,'MP0074','SV0006','NV0001','S0007','2018-04-06','2018-04-05','Đã Mượn'),(0075,'MP0075','SV0006','NV0001','S0004','2018-05-05','2018-05-18','Đã Mượn'),(0076,'MP0076','SV0001','NV0001','S0001','2018-04-20','2018-04-30','Đã Mượn'),(0077,'MP0077','SV0002','NV0001','S0010','2018-04-13','2018-05-05','Đã Mượn');
/*!40000 ALTER TABLE `borrowbill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `latebill`
--

DROP TABLE IF EXISTS `latebill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `latebill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `MAPHIEU` varchar(45) NOT NULL,
  `MASV` varchar(45) NOT NULL,
  `MASACH` varchar(45) NOT NULL,
  `NGAYHENTRA` date NOT NULL,
  `SONGAYTREHAN` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1694 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `latebill`
--

LOCK TABLES `latebill` WRITE;
/*!40000 ALTER TABLE `latebill` DISABLE KEYS */;
INSERT INTO `latebill` VALUES (1686,'MP0067','SV0001','S0017','2018-05-14',186),(1687,'MP0069','SV0005','S0011','2018-05-21',179),(1688,'MP0070','SV0005','S0012','2018-05-13',187),(1689,'MP0071','SV0009','S0023','2018-05-07',193),(1690,'MP0074','SV0006','S0007','2018-04-05',225),(1691,'MP0075','SV0006','S0004','2018-05-18',182),(1692,'MP0076','SV0001','S0001','2018-04-30',200),(1693,'MP0077','SV0002','S0010','2018-05-05',195);
/*!40000 ALTER TABLE `latebill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `returnbill`
--

DROP TABLE IF EXISTS `returnbill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `returnbill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `MAPHIEU` varchar(45) NOT NULL,
  `MASV` varchar(45) NOT NULL,
  `MANV` varchar(45) NOT NULL,
  `MASACH` varchar(45) NOT NULL,
  `NGAYMUON` date NOT NULL,
  `NGAYHENTRA` date NOT NULL,
  `NGAYTRA` date NOT NULL,
  `TRANGTHAI` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `returnbill`
--

LOCK TABLES `returnbill` WRITE;
/*!40000 ALTER TABLE `returnbill` DISABLE KEYS */;
INSERT INTO `returnbill` VALUES (44,'MP0001','SV0001','NV0004','S0001','2018-03-06','2018-03-14','2018-03-20','Đã Trả'),(45,'MP0008','SV0004','NV0003','S0008','2018-03-14','2018-03-17','2018-03-20','Đã Trả'),(46,'MP0009','SV0007','NV0003','S0008','2018-03-08','2018-03-14','2018-03-20','Đã Trả'),(47,'MP0008','SV0004','NV0003','S0003','2018-03-14','2018-03-17','2018-03-20','Đã Trả'),(48,'MP0008','SV0004','NV0003','S0001','2018-03-14','2018-03-17','2018-03-20','Đã Trả'),(49,'MP0005','SV0002','NV0003','S0001','2018-03-06','2018-03-15','2018-03-20','Đã Trả'),(50,'MP0004','SV0001','NV0003','S0003','2018-03-06','2018-03-14','2018-03-20','Đã Trả'),(51,'MP0011','SV0002','NV0003','S0002','2018-03-01','2018-03-06','2018-03-20','Đã Trả'),(52,'MP0010','SV0001','NV0003','S0001','2018-03-06','2018-03-14','2018-03-22','Đã Trả'),(53,'MP0015','SV0005','NV0004','S0004','2018-03-08','2018-03-20','2018-03-22','Đã Trả'),(54,'MP0021','SV0005','NV0004','S0016','2018-03-08','2018-03-20','2018-03-23','Đã Trả'),(55,'MP0018','SV0001','NV0003','S0003','2018-03-06','2018-03-14','2018-03-23','Đã Trả'),(56,'MP0022','SV0005','NV0004','S0014','2018-03-08','2018-03-20','2018-04-03','Đã Trả'),(57,'MP0018','SV0001','NV0003','S0005','2018-03-06','2018-03-14','2018-04-03','Đã Trả'),(58,'MP0025','SV0009','NV0003','S0019','2018-03-27','2018-03-31','2018-04-03','Đã Trả'),(59,'MP0022','SV0005','NV0004','S0013','2018-03-08','2018-03-20','2018-04-03','Đã Trả'),(60,'MP0018','SV0001','NV0003','S0002','2018-03-06','2018-03-14','2018-04-03','Đã Trả'),(61,'MP0022','SV0005','NV0004','S0017','2018-03-08','2018-03-20','2018-04-03','Đã Trả'),(62,'MP0031','SV0003','NV0002','S0017','2018-04-03','2018-04-07','2018-04-03','Đã Trả'),(63,'MP0031','SV0003','NV0002','S0014','2018-04-03','2018-04-07','2018-04-03','Đã Trả'),(64,'MP0032','SV0009','NV0003','S0020','2018-03-27','2018-03-31','2018-04-04','Đã Trả'),(65,'MP0031','SV0003','NV0002','S0015','2018-04-03','2018-04-07','2018-04-04','Đã Trả'),(66,'MP0028','SV0002','NV0002','S0004','2018-04-03','2018-04-09','2018-04-04','Đã Trả'),(67,'MP0032','SV0009','NV0003','S0016','2018-03-27','2018-03-31','2018-04-04','Đã Trả'),(68,'MP0035','SV0003','NV0003','S0018','2018-03-06','2018-03-29','2018-04-10','Đã Trả'),(69,'MP0034','SV0009','NV0003','S0013','2018-03-27','2018-03-31','2018-04-10','Đã Trả'),(70,'MP0038','SV0003','NV0003','S0010','2018-03-06','2018-03-16','2018-04-12','Đã Trả'),(71,'MP0018','SV0001','NV0003','S0004','2018-03-06','2018-03-14','2018-04-12','Đã Trả'),(72,'MP0041','SV0002','NV0001','S0016','2018-04-14','2018-04-20','2018-04-14','Đã Trả'),(73,'MP0047','SV0008','NV0003','S0007','2018-04-14','2018-04-19','2018-04-14','Đã Trả'),(74,'MP0043','SV0003','NV0001','S0015','2018-04-14','2018-04-23','2018-04-29','Đã Trả'),(75,'MP0043','SV0003','NV0001','S0016','2018-04-14','2018-04-23','2018-04-29','Đã Trả'),(76,'MP0049','SV0003','NV0001','S0015','2018-04-29','2018-05-19','2018-05-09','Đã Trả'),(77,'MP0052','SV0006','NV0001','S0023','2018-04-29','2018-05-11','2018-05-09','Đã Trả'),(78,'MP0059','SV0001','NV0001','S0001','2018-05-09','2018-05-15','2018-05-10','Đã Trả'),(79,'MP0060','SV0001','NV0001','S0001','2018-05-09','2018-05-15','2018-05-10','Đã Trả'),(80,'MP0054','SV0003','NV0002','S0013','2018-05-09','2018-05-12','2018-05-10','Đã Trả'),(81,'MP0062','SV0003','NV0002','S0018','2018-05-09','2018-05-12','2018-05-10','Đã Trả'),(82,'MP0063','SV0003','NV0002','S0018','2018-05-09','2018-05-12','2018-05-10','Đã Trả'),(83,'MP0064','SV0003','NV0002','S0018','2018-05-09','2018-05-12','2018-05-10','Đã Trả'),(84,'MP0065','SV0003','NV0002','S0018','2018-05-09','2018-05-12','2018-05-10','Đã Trả'),(85,'MP0077','SV0001','NV0001','S0001','2018-05-10','2018-05-12','2018-05-10','Đã Trả'),(86,'MP0072','SV0002','NV0001','S0005','2018-05-10','2018-05-04','2018-05-10','Đã Trả'),(87,'MP0073','SV0003','NV0001','S0006','2018-05-10','2018-04-18','2018-05-10','Đã Trả'),(88,'MP0079','SV0002','NV0001','S0012','2018-05-13','2018-05-15','2018-05-13','Đã Trả'),(89,'MP0078','SV0002','NV0001','S0011','2018-05-13','2018-05-15','2018-05-13','Đã Trả'),(90,'MP0068','SV0005','NV0002','S0010','2018-05-09','2018-05-14','2018-08-04','Đã Trả'),(91,'MP0066','SV0003','NV0002','S0018','2018-05-02','2018-05-13','2018-08-04','Đã Trả');
/*!40000 ALTER TABLE `returnbill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `ID` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `MANV` varchar(7) DEFAULT NULL,
  `TENNV` varchar(45) NOT NULL,
  `GIOITINH` varchar(5) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `CMND` int(11) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `DIACHI` varchar(45) NOT NULL,
  `TENDN` varchar(10) NOT NULL,
  `MATKHAU` varchar(10) NOT NULL,
  `TYPE` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (0001,'NV0001','Võ Tùng Nghĩa','Nam','1997-08-15',272513468,'0123425067','61 Bùi Thị Xuân','admin','admin','Admin'),(0002,'NV0002','Trần Mạnh Tuấn','Nam','1996-03-20',376589472,'0925874673','23 Hai Bà Trưng','tuan','1234','Staff'),(0003,'NV0003','Trần Phương Dung','Nữ','1995-10-29',247285834,'0979126084','61 Nguyễn An Ninh','dung','1234','Staff'),(0004,'NV0004','Nguyễn Thị Thanh Thảo','Nữ','1994-08-31',265487695,'0123425067','61 Bùi Thị Xuân','thao','1234','Staff'),(0005,'NV0005','Trần Phương Dung','Nữ','1995-10-29',247285834,'0979126084','61 Nguyễn An Ninh','dung','1234','Staff'),(0006,'NV0006','Trần Phương Dung','Nữ','1995-10-29',247285834,'0979126084','61 Nguyễn An Ninh','dung','1234','Staff'),(0007,'NV0007','Trần Phương Dung','Nữ','1995-10-29',247285834,'0979126084','61 Nguyễn An Ninh','dung','1234','Staff');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `ID` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `MASV` varchar(7) DEFAULT NULL,
  `TENSV` varchar(45) NOT NULL,
  `GIOITINH` varchar(5) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `CMND` int(10) unsigned NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `DIACHI` varchar(45) NOT NULL,
  `NGAYCAPTHE` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (0001,'SV0001','Võ Tùng Nghĩa','Nam','1997-08-15',272513468,'01234250678','61 Bùi Thị Xuân','2018-07-14'),(0002,'SV0002','Nguyễn Thị Ngọc Mai','Nữ','1997-07-16',290371023,'01219872787','285 Lũng Cú','2018-09-07'),(0003,'SV0003','Hồ Quang Việt','Nam','1997-03-16',361402178,'0929182345','123 Phạm Văn Đồng','2018-06-14'),(0004,'SV0004','Phạm Duy Thương','Nam','1997-04-16',341289781,'01685434525','76 Cách Mạng Tháng 8','2017-02-15'),(0005,'SV0005','Vũ Văn Phong','Nam','1997-07-16',280498751,'01284902765','267 Hùng Vương','2016-03-07'),(0006,'SV0006','Nguyễn Thị Quỳnh Mai','Nữ','1997-01-20',233259790,'0979123376','135 Hòa Bình','2018-05-10'),(0007,'SV0007','Nguyễn Thái Bảo','Nam','1995-01-10',213454574,'0123452342','78 Hai Bà Trưng','2017-05-04'),(0008,'SV0008','Tôn Thất Thông','Nam','1997-11-22',290371050,'01219872237','285 Tôn Đức Thắng','2016-10-07'),(0009,'SV0009','Nguyễn Quốc Tuấn','Nam','1995-08-16',370868386,'0946567857','167 Hùng Vương','2018-06-29'),(0010,'SV0010','Nguyễn Huỳnh Xuân Vi','Nữ','1997-01-31',371407330,'0979478656','78 Hai Bà Trưng','2016-02-07'),(0011,'SV0011','Nguyễn Huỳnh Xuân Vi','Nữ','1997-01-31',371407330,'0979478656','78 Hai Bà Trưng','2018-02-07'),(0012,'SV0012','Nguyễn Huỳnh Xuân Vi','Nữ','1997-01-31',371407330,'0979478656','78 Hai Bà Trưng','2018-02-07'),(0013,'SV0013','Nguyễn Huỳnh Xuân Vi','Nữ','1997-01-31',371407330,'0979478656','78 Hai Bà Trưng','2018-02-07');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-16 14:08:53
