-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: ferreteria
-- ------------------------------------------------------
-- Server version	8.0.43

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
-- Table structure for table `abono`
--

DROP TABLE IF EXISTS `abono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `abono` (
  `id_abono` int NOT NULL AUTO_INCREMENT,
  `id_credito` int NOT NULL,
  `cantidad_abono` double DEFAULT NULL,
  `fecha_abono` date DEFAULT NULL,
  PRIMARY KEY (`id_abono`)
) ENGINE=InnoDB AUTO_INCREMENT=111112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abono`
--

LOCK TABLES `abono` WRITE;
/*!40000 ALTER TABLE `abono` DISABLE KEYS */;
INSERT INTO `abono` VALUES (111111,1221,1500,'2024-11-12');
/*!40000 ALTER TABLE `abono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `Id_categoria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Herramientas de mano'),(2,'Herramienta eléctricas'),(3,'Tornillería y fijaciones'),(4,'Pinturas y acabados'),(5,'Materiales de construcción'),(6,'Fontanería y tuberías'),(7,'Electricidad e iluminación'),(8,'Ferretería y cerrajería'),(9,'Seguridad industrial'),(10,'Jardinería y agricultura'),(11,'Automotriz y mecánica'),(12,'Adhesivos y selladores'),(13,'Abrasivos y lijas'),(14,'Químicos y solventes'),(15,'Cintas adhesivas y embalaje'),(16,'Maderas y tableros'),(17,'Perfil y estructuras metálicas'),(18,'Bisagras y herrajes'),(19,'Cerraduras y candados'),(20,'Grifería y accesorios'),(21,'Tubería y conexiones PVC'),(22,'Accesorios para baño'),(23,'Calentadores y boilers'),(24,'Clavos y taquetes'),(25,'Mallas y alambres'),(26,'Extensiones y multicontactos'),(27,'Lámparas y focos LED'),(28,'Cables eléctricos'),(29,'Tableros eléctricos y breakers'),(30,'Interruptores y apagadores'),(31,'Chapas y manijas'),(32,'Llaves y duplicado'),(33,'Equipos de soldadura'),(34,'Gases y oxígeno'),(35,'Compresores y neumática'),(36,'Mangueras y conexiones'),(37,'Ruedas y rodamientos'),(38,'Escaleras y andamios'),(39,'Ventiladores y extractores'),(40,'Selladores de techo'),(41,'Pegamentos y epóxicos'),(42,'Vidrios y acrílicos'),(43,'Protección personal (EPP)'),(44,'Cajas de herramientas'),(45,'Organización y almacenamiento'),(46,'Sistemas de riego'),(47,'Cortinas metálicas y rejas'),(48,'Equipos de medición'),(49,'Tornillos y pernos'),(50,'manguera');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `usuario` varchar(25) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `primer_apellido` varchar(20) DEFAULT NULL,
  `segundo_apellido` varchar(20) DEFAULT NULL,
  `domicilio` varchar(30) DEFAULT NULL,
  `numero` varchar(6) DEFAULT NULL,
  `cp` varchar(5) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `contrasena` varchar(20) DEFAULT NULL,
  `rfc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'','Juan','Pérez','Gómez','Calle 1','123','44100','3312345678','juan.perez@mail.com','pass123','PEGO123456XYZ'),(2,'','María','López','Hernández','Calle 2','456','44110','3323456789','maria.lopez@mail.com','pass234','LOHE123456XYZ'),(3,'','Carlos','Martínez','Díaz','Calle 3','789','44120','3334567890','carlos.martinez@mail.com','pass345','MADL123456XYZ'),(4,'','Ana','García','Ruiz','Avenida 4','101','44130','3345678901','ana.garcia@mail.com','pass456','GARU123456XYZ'),(5,'','José','Rodríguez','Fernández','Avenida 5','202','44140','3356789012','jose.rodriguez@mail.com','pass567','ROFE123456XYZ'),(6,'','Laura','Hernández','Jiménez','Calle 6','303','44150','3367890123','laura.hernandez@mail.com','pass678','HEJI123456XYZ'),(7,'','Pedro','Díaz','Castro','Calle 7','404','44160','3378901234','pedro.diaz@mail.com','pass789','DICA123456XYZ'),(8,'','Gabriela','Ruiz','Ortega','Calle 8','505','44170','3389012345','gabriela.ruiz@mail.com','pass890','RUOR123456XYZ'),(9,'','Fernando','Torres','Vega','Calle 9','606','44180','3390123456','fernando.torres@mail.com','pass901','TOVE123456XYZ'),(10,'','Sofía','Ramírez','Mendoza','Calle 10','707','44190','3301234567','sofia.ramirez@mail.com','pass012','RAME123456XYZ'),(11,'','Daniel','Medina','Salas','Calle 11','808','44200','3312345670','daniel.medina@mail.com','pass345','MESA123456XYZ'),(12,'','Andrea','Vargas','González','Calle 12','909','44210','3323456701','andrea.vargas@mail.com','pass678','VAGO123456XYZ'),(13,'','Luis','Morales','Herrera','Calle 13','111','44220','3334567012','luis.morales@mail.com','pass901','MOHE123456XYZ'),(14,'','Paula','Ortega','Núñez','Calle 14','222','44230','3345670123','paula.ortega@mail.com','pass234','ORNU123456XYZ'),(15,'','Javier','Gómez','Luna','Calle 15','333','44240','3356701234','javier.gomez@mail.com','pass567','GOLU123456XYZ'),(16,'','Carmen','Flores','Reyes','Calle 16','444','44250','3367012345','carmen.flores@mail.com','pass890','FLRE123456XYZ'),(17,'','Roberto','Gutiérrez','Santos','Calle 17','555','44260','3370123456','roberto.gutierrez@mail.com','pass123','GUSA123456XYZ'),(18,'','Mónica','Chávez','Paredes','Calle 18','666','44270','3381234567','monica.chavez@mail.com','pass456','CHPA123456XYZ'),(19,'','Ricardo','Sánchez','Valdez','Calle 19','777','44280','3392345678','ricardo.sanchez@mail.com','pass789','SAVA123456XYZ'),(20,'','Eleonor','Nava','Cruz','Calle 20','888','44290','3303456789','elenanava@mail.com','pass012','NACR123456XYZ');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compradetalle`
--

DROP TABLE IF EXISTS `compradetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compradetalle` (
  `Id_compra` int NOT NULL AUTO_INCREMENT,
  `id_producto` varchar(10) DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`Id_compra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compradetalle`
--

LOCK TABLES `compradetalle` WRITE;
/*!40000 ALTER TABLE `compradetalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `compradetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compraencabezado`
--

DROP TABLE IF EXISTS `compraencabezado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compraencabezado` (
  `id_compra` int NOT NULL,
  `total` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_compra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compraencabezado`
--

LOCK TABLES `compraencabezado` WRITE;
/*!40000 ALTER TABLE `compraencabezado` DISABLE KEYS */;
INSERT INTO `compraencabezado` VALUES (1,2500.5,'2024-02-01'),(2,1320.75,'2024-02-05'),(3,5870.3,'2024-02-10'),(4,2200,'2024-02-15'),(5,3780.9,'2024-02-18'),(6,6400.25,'2024-02-20'),(7,890,'2024-02-22'),(8,1235.8,'2024-02-25'),(9,4100.5,'2024-02-28'),(10,2999.99,'2024-03-01');
/*!40000 ALTER TABLE `compraencabezado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `creditodetalle`
--

DROP TABLE IF EXISTS `creditodetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `creditodetalle` (
  `Id_credito` int NOT NULL AUTO_INCREMENT,
  `id_cliente` varchar(10) DEFAULT NULL,
  `fecha_credito` date DEFAULT NULL,
  `fecha_limite` date DEFAULT NULL,
  `limite_credito` double DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  PRIMARY KEY (`Id_credito`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creditodetalle`
--

LOCK TABLES `creditodetalle` WRITE;
/*!40000 ALTER TABLE `creditodetalle` DISABLE KEYS */;
/*!40000 ALTER TABLE `creditodetalle` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `actualizar_saldo_cliente` AFTER INSERT ON `creditodetalle` FOR EACH ROW BEGIN
    UPDATE clientes 
    SET saldo = saldo + NEW.saldo
    WHERE id_cliente = NEW.id_cliente;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `creditoencabezado`
--

DROP TABLE IF EXISTS `creditoencabezado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `creditoencabezado` (
  `Id_credito` int NOT NULL AUTO_INCREMENT,
  `id_venta` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Id_credito`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creditoencabezado`
--

LOCK TABLES `creditoencabezado` WRITE;
/*!40000 ALTER TABLE `creditoencabezado` DISABLE KEYS */;
/*!40000 ALTER TABLE `creditoencabezado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id_empleado` int NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `primer_apellido` varchar(20) DEFAULT NULL,
  `segundo_apellido` varchar(20) DEFAULT NULL,
  `imagen` blob,
  `telefono` varchar(12) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `numero_casa` varchar(5) DEFAULT NULL,
  `localidad` varchar(50) DEFAULT NULL,
  `horario` varchar(20) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `id_parentesco` int NOT NULL,
  `nombre_contacto` varchar(50) DEFAULT NULL,
  `telefonoC` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Juan','Pérez','Gómez',NULL,'3312345678','1985-05-12','Calle 1','123','Guadalajara','Matutino','2023-01-10',1,'José Pérez','3311223344'),(2,'María','López','Hernández',NULL,'3323456789','1990-08-25','Calle 2','456','Zapopan','Vespertino','2022-03-15',2,'Ana López','3322334455'),(3,'Carlos','Martínez','Díaz',NULL,'3334567890','1995-11-30','Calle 3','789','Tlaquepaque','Nocturno','2021-07-20',3,'Juan Martínez','3333445566'),(4,'Ana','García','Ruiz',NULL,'3345678901','1988-02-14','Avenida 4','101','Tonalá','Matutino','2020-05-05',4,'Carlos García','3344556677'),(5,'José','Rodríguez','Fernández',NULL,'3356789012','1975-06-22','Avenida 5','202','Guadalajara','Vespertino','2019-09-10',5,'Fernando Rodríguez','3355667788'),(6,'Laura','Hernández','Jiménez',NULL,'3367890123','2000-04-10','Calle 6','303','Zapopan','Nocturno','2023-06-12',6,'Gabriela Hernández','3366778899'),(7,'Pedro','Díaz','Castro',NULL,'3378901234','1965-09-18','Calle 7','404','Tlaquepaque','Matutino','2018-12-20',7,'Alberto Díaz','3377889900'),(8,'Gabriela','Ruiz','Ortega',NULL,'3389012345','1968-07-05','Calle 8','505','Tonalá','Vespertino','2017-11-05',8,'Carmen Ruiz','3388990011'),(9,'Fernando','Torres','Vega',NULL,'3390123456','1982-03-09','Calle 9','606','Guadalajara','Nocturno','2016-08-30',9,'Sofía Torres','3399001122'),(10,'Sofía','Ramírez','Mendoza',NULL,'3301234567','1984-12-12','Calle 10','707','Zapopan','Matutino','2015-04-15',10,'Ricardo Ramírez','3300112233'),(11,'Daniel','Medina','Salas',NULL,'3312345670','1998-10-01','Calle 11','808','Tlaquepaque','Vespertino','2022-09-25',1,'José Medina','3311223344'),(12,'Andrea','Vargas','González',NULL,'3323456701','1996-05-19','Calle 12','909','Tonalá','Nocturno','2021-02-28',2,'Ana Vargas','3322334455'),(13,'gelipe','calderon','valdez',NULL,'3211232323','2004-02-23','abasolo','312','el grullo','Matutino','2024-11-25',5,'juan','7865654543'),(14,'marcela','benites','ef',NULL,'12345','2000-02-12','we','12','el grullo','Matutino','2020-01-01',10,'ak','5678');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `id_factura` int NOT NULL,
  `id_venta` varchar(10) DEFAULT NULL,
  `nombre_cliente` varchar(100) DEFAULT NULL,
  `fecha_emision` date DEFAULT NULL,
  `rfc` varchar(13) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `fecha_compra` date DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id_factura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'33','Carlos','2025-04-07','MADL123456XYZ','carlos.martinez@mail.com','2025-03-28',1650),(2,'32','Carlos','2025-04-08','MADL123456XYZ','carlos.martinez@mail.com','2025-03-26',450);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario`
--

DROP TABLE IF EXISTS `inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario` (
  `id_producto` int NOT NULL,
  `id_categoria` varchar(10) DEFAULT NULL,
  `id_marca` varchar(10) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `precio_compra` double DEFAULT NULL,
  `precio_venta` double DEFAULT NULL,
  `precio_merma` double DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `imagen` blob,
  PRIMARY KEY (`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario`
--

LOCK TABLES `inventario` WRITE;
/*!40000 ALTER TABLE `inventario` DISABLE KEYS */;
INSERT INTO `inventario` VALUES (1,'1','1','Martillo',100,250,120,40,NULL),(2,'1','1','Taladro',200,1200,220,30,NULL),(3,'3','3','Tornillo',10,15,12,90,NULL),(4,'4','4','Pintura',50,75,60,40,NULL),(5,'1','1','Cemento',70,100,80,30,NULL),(6,'6','6','Llave Inglesa',40,60,50,25,NULL),(7,'7','7','Interruptor',15,25,20,60,NULL),(8,'8','8','Cerradura',50,70,55,30,NULL),(9,'9','9','Casco de seguridad',25,40,30,15,NULL),(10,'10','10','Manguera',30,45,35,20,NULL),(11,'11','11','Cinta adhesiva',10,20,15,35,NULL),(12,'12','12','Silicona',8,12,10,25,NULL),(13,'13','13','Lija',5,10,8,50,NULL),(14,'14','14','Solvente',20,30,25,10,NULL),(15,'15','15','Cinta de embalar',6,9,7,45,NULL),(16,'16','16','Tabla de madera',40,70,60,12,NULL),(17,'17','17','Viga metálica',100,150,130,5,NULL),(18,'18','1','Bisagra',15,25,20,30,NULL),(19,'19','2','Candado',20,35,25,40,NULL),(20,'20','5','Grifo',25,40,30,20,NULL),(21,'21','2','Tubo PVC',10,18,15,50,NULL),(22,'22','10','Accesorio de baño',30,50,40,15,NULL),(23,'23','13','Calentador',150,200,180,8,NULL),(24,'24','14','Clavo',1,3,2,200,NULL),(25,'25','15','Alambre',20,30,25,40,NULL),(26,'26','16','Extensión',15,25,20,30,NULL),(27,'27','17','Foco LED',8,12,10,50,NULL),(28,'28','6','Cable eléctrico',10,20,15,50,NULL),(29,'29','2','Tablero eléctrico',100,150,130,10,NULL),(30,'30','3','Interruptor',10,20,15,30,NULL);
/*!40000 ALTER TABLE `inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `Id_marca` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'Trupper'),(2,'Stanley'),(3,'Makita'),(4,'Bosch'),(5,'DeWalt'),(6,'Black & Decker'),(7,'Hilti'),(8,'Milwaukee'),(9,'Klein Tools'),(10,'Irwin'),(11,'Fischer'),(12,'3M'),(13,'WD-40'),(14,'Kärcher'),(15,'Sika'),(16,'soldadura'),(17,'herramienta de mano'),(18,'ATOM');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merma`
--

DROP TABLE IF EXISTS `merma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `merma` (
  `id_merma` int NOT NULL AUTO_INCREMENT,
  `precio_merma` double DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `id_producto` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id_merma`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merma`
--

LOCK TABLES `merma` WRITE;
/*!40000 ALTER TABLE `merma` DISABLE KEYS */;
INSERT INTO `merma` VALUES (1,25,15,7,'Interruptor'),(2,100,12,21,'Tubo PVC'),(3,100,10,1,'Martillo'),(32,25,10,3,'Tornillo');
/*!40000 ALTER TABLE `merma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parentesco`
--

DROP TABLE IF EXISTS `parentesco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parentesco` (
  `id_parentesco` int NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_parentesco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parentesco`
--

LOCK TABLES `parentesco` WRITE;
/*!40000 ALTER TABLE `parentesco` DISABLE KEYS */;
INSERT INTO `parentesco` VALUES (1,'Padre'),(2,'Madre'),(4,'Hija'),(5,'Hermano'),(6,'Hermana'),(8,'Abuelo'),(9,'Esposo'),(10,'Esposa');
/*!40000 ALTER TABLE `parentesco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidodetalle`
--

DROP TABLE IF EXISTS `pedidodetalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidodetalle` (
  `id_pedido` int NOT NULL,
  `id_producto` varchar(10) NOT NULL,
  `cantidad` double DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_pedido`,`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidodetalle`
--

LOCK TABLES `pedidodetalle` WRITE;
/*!40000 ALTER TABLE `pedidodetalle` DISABLE KEYS */;
INSERT INTO `pedidodetalle` VALUES (1,'1',10,1500),(2,'2',20,5000),(3,'3',50,750),(4,'4',30,2250),(5,'5',20,2000),(6,'6',25,1500),(7,'7',60,1500),(8,'8',30,2100),(9,'9',15,600),(10,'10',20,900),(11,'11',35,700),(12,'12',25,300),(13,'13',50,400),(14,'14',10,300),(15,'15',45,405),(16,'16',12,840),(17,'17',5,750),(18,'18',30,600),(19,'19',40,1000),(20,'20',20,600),(21,'21',60,900),(22,'22',25,1250),(23,'23',10,1400),(24,'24',30,1350),(25,'25',40,800),(26,'26',20,480),(27,'27',50,500),(28,'28',35,700),(29,'29',10,1500),(30,'30',15,450),(31,'3',25,15),(32,'4',2,75),(32,'5',3,100),(33,'1',5,150),(33,'29',6,150);
/*!40000 ALTER TABLE `pedidodetalle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidoencabezado`
--

DROP TABLE IF EXISTS `pedidoencabezado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidoencabezado` (
  `id_pedido` int NOT NULL,
  `id_vehiculo` varchar(10) DEFAULT NULL,
  `id_cliente` varchar(10) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `numero_casa` varchar(5) DEFAULT NULL,
  `cp` varchar(5) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidoencabezado`
--

LOCK TABLES `pedidoencabezado` WRITE;
/*!40000 ALTER TABLE `pedidoencabezado` DISABLE KEYS */;
INSERT INTO `pedidoencabezado` VALUES (1,'1','1','555-1234','2025-01-01','Abasolo','742','12345',1500.5),(2,'2','2','555-5678','2025-01-02','Matamoros','123','67890',2300.75),(3,'3','3','555-9101','2025-01-03','Hidalgo','56','54321',3400.2),(4,'1','4','555-1122','2025-01-04','Juárez','743','13579',1800.3),(5,'2','5','555-1314','2025-01-05','Morelos','124','24680',2500.85),(6,'3','6','555-1516','2025-01-06','Zaragoza','57','10101',3600.4),(7,'1','7','555-1718','2025-01-07','Iturbide','744','20202',1900.4),(8,'2','8','555-1920','2025-01-08','Allende','125','30303',2600.95),(9,'3','9','555-2122','2025-01-09','Victoria','58','40404',3800.5),(10,'1','10','555-2324','2025-01-10','Reforma','745','50505',2000.5),(11,'2','11','555-2526','2025-01-11','Independencia','126','60606',2700.05),(12,'3','12','555-2728','2025-01-12','Libertad','59','70707',4000.6),(13,'1','13','555-2930','2025-01-13','Constitución','746','80808',2100.6),(14,'2','14','555-3132','2025-01-14','Madero','127','90909',2800.15),(15,'3','15','555-3334','2025-01-15','Ocampo','60','10010',4200.7),(16,'1','16','555-3536','2025-01-16','Pino Suárez','747','11111',2200.7),(17,'2','17','555-3738','2025-01-17','Venustiano Carranza','128','22222',2900.25),(18,'3','18','555-3940','2025-01-18','Insurgentes','61','33333',4400.8),(19,'1','19','555-4142','2025-01-19','Guerrero','748','44444',2300.8),(20,'2','20','555-4344','2025-01-20','Progreso','129','55555',3000.35),(21,'3','21','555-4546','2025-01-21','Emiliano Zapata','62','66666',4600.9),(22,'1','22','555-4748','2025-01-22','Francisco I. Madero','749','77777',2400.9),(23,'2','23','555-4940','2025-01-23','Benito Juárez','130','88888',3100.45),(24,'3','24','555-5050','2025-01-24','Lázaro Cárdenas','63','99999',4800),(25,'1','25','555-5152','2025-01-25','Miguel Hidalgo','750','10101',2501),(26,'2','26','555-5354','2025-01-26','Ignacio Allende','131','20202',3201.55),(27,'3','27','555-5556','2025-01-27','Ignacio Zaragoza','64','30303',5001.1),(28,'1','28','555-5758','2025-01-28','Francisco Villa','751','40404',2601.1),(29,'2','29','555-5950','2025-01-29','Vicente Guerrero','132','50505',3301.65),(30,'3','30','555-6060','2025-01-30','Álvaro Obregón','65','60606',5201.2),(31,'3','1','3211123222','2025-03-26','abasolo ','312','48740',375),(32,'1','3','4321','2025-03-26','abasolo','3145','1234',450),(33,NULL,'3',NULL,'2025-03-28',NULL,NULL,NULL,1650);
/*!40000 ALTER TABLE `pedidoencabezado` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `asignar_fecha_pedido` BEFORE INSERT ON `pedidoencabezado` FOR EACH ROW BEGIN
    IF NEW.fecha IS NULL THEN
        SET NEW.fecha = CURDATE();
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `actualizar_estado_vehiculo` AFTER INSERT ON `pedidoencabezado` FOR EACH ROW BEGIN
    UPDATE vehiculo
    SET status = 'En uso'
    WHERE id_vehiculo = NEW.id_vehiculo;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `id_vehiculo` int NOT NULL,
  `id_empleado` int NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `peso_soportado` double DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (1,12,'Disponible','Toyota','Hilux 2020',1200.5),(2,13,'En uso','Ford','Ranger 2019',1000),(3,7,'En uso','Chevrolet','Silverado 2021',1500.3),(4,1,'En mantenimiento','Nissan','Frontier 2019',1100);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `id_venta` int NOT NULL,
  `id_pedido` int NOT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT INTO `venta` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15),(16,16),(17,17),(18,18),(19,19),(20,20),(21,21),(22,22),(23,23),(24,24),(25,25),(26,26),(27,27),(28,28),(29,29),(30,30);
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'ferreteria'
--

--
-- Dumping routines for database 'ferreteria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-03  8:07:59
