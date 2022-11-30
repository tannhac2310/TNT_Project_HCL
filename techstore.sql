DROP DATABASE IF EXISTS techstore;
create database techstore;
use techstore;

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `id` bigint NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` bigint NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `parent_category_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4wqwi3wgsrq5kka9k94vc5u2i` (`parent_category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `id` bigint NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `evaluate` varchar(255) DEFAULT NULL,
  `customer_id` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKk70yr2gxrskwjps661ifv5q69` (`customer_id`),
  KEY `FKlo59icyee0u6jucfb68x22o3v` (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` bigint NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` int DEFAULT NULL,
  `account_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKauxmhcwj8pwtju2xah9viynt7` (`account_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (12);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `id` bigint NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `payment_type` int DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `safe_off` double DEFAULT NULL,
  `state` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `vat` double DEFAULT NULL,
  `account_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt1vr175eqvalqdmx5x8ol0jo9` (`account_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetail` (
  `id` bigint NOT NULL,
  `amount` int DEFAULT NULL,
  `product_price` double DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt5tduhnftv4ak9fff8kjhpfo7` (`order_id`),
  KEY `FKbwstmjq5vwnhyk42guy4ptq1t` (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `sale_off` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `category_id` bigint DEFAULT NULL,
  `supplier_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7l29ekt1x29jup80y2iigimyy` (`category_id`),
  KEY `FKouxxq7leu3ubng5ei1qy6peym` (`supplier_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `id` bigint NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


#Account
#password admin123
Insert into `account` values (1,'admin','$2a$10$OSYCi46j/gloVT688VoPbecsUwF3MwNpOf7QSzG8bwYImSLoHvJDW','admin','Active');
#password thanh123
Insert into `account` values (2,'thanh123','$2a$10$DSBUnz5voH1WZarLg/IsRu8nywU98tPSuRehQ.HrpYdb/PJx8kOJi','user','Active');

#Customer
#type: 0:normal; 1-VIP
Insert into `customer` values (1,'Ha Noi, Viet Nam', 18,'mradmin@gmail.com', 'Male', 'Mr Admin','0125458744','Active',0,1);
Insert into `customer` values (2,'110, Le Vam Chi, Thu Duc City, Viet Nam', 21 ,'thanh@gmail.com', 'Male','Tran Trung Thanh','0125098737','Active', 0,2);

#category
Insert into `category` values (1,'Keyboard','Keyboard for gamers','Available', NULL);
Insert into `category` values (2,'Laptop','Laptop for gamers','Available', NULL);
Insert into `category` values (3,'Mouse','Mouse type wireless use for gaming','Available', NULL);
Insert into `category` values (4,'Watch','Apple Watch - Modern Apple Product for life','Available', NULL);
Insert into `category` values (5,'Iphone','Iphone - Say hello to future','Available', NULL);
Insert into `category` values (6,'Samsung','Samsung - With SAMSUNG, we are imagination','Available', NULL);


#product
Insert into `product` values (1,'Logitech G Pro X Superlight Wireless Red',176,0.0,'Unavailable','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308392/IMG/chuot_logitech_do_xb5bjj.jpg',0,'Logitech G Pro X Superlight Wireless Red',3, NULL);
Insert into `product` values (2,'Fuhlen G90 Pro X',18.1,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308392/IMG/chuot_fulhen_sbxsuw.jpg',100,'Fuhlen, a gaming gear brand that is trusted by many gamers thanks to its perfection and affordable price segment. And in the gaming mouse segment, Fuhlen made a strong impression with G90 and G90 Pro products',3, NULL);
Insert into `product` values (3,'Laptop ASUS TUF Gaming F15 FX506HC HN144W',899.95,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308394/IMG/lapASus_pbw3xf.jpg',10,'ASUS TUF Gaming F15 FX506HC HN144W laptop has a very unique design with mysterious Graphite Black color. Equipped with a great configuration from top components for a great product. This promises to be a product that bombards the upcoming gamer market.',2, NULL);
Insert into `product` values (4,'CoolerMaster MM711 Retro',59.99,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308392/IMG/chuot_coolermt_mtzjuw.jpg',1,'Limited production',3, NULL);
Insert into `product` values (5,'AKKO RG325 Dragon Ball Z – Goku',49,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308392/IMG/chuot_aku_goku_lib8jy.jpg',50,'Akko\"s collaboration with Toei Animation author on the character Goku. The cheap gaming mouse model RG325 with SONGOKU version brings the color tone of the extremely lovely Songoku baby monkey.',3, NULL);
Insert into `product` values (6,'HyperX Alloy Origins 60 Pink Machanical Keyboard',99.95,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308393/IMG/hypex1_uk4clx.jpg',50,'Manufacturer Kingston, Model HyperX Alloy Origins 60 Pink Layout 60% key Pink',1, NULL);
Insert into `product` values (7,'Laptop gaming MSI GF63 Thin 11SC 665VN',683.99,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308394/IMG/lapmsi_hrhmoh.jpg',5,'The MSI GF63 Thin 11SC=665VN gaming laptop has a surprisingly thin and light design, which is rare on conventional gaming laptops. This helps to strip away the aggressive look and replace it with a luxurious and gaming beauty.',2, NULL);
Insert into `product` values (8,'Laptop gaming Acer Aspire 7 A715 75G 58U4',800,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308393/IMG/lapacer_kkd2u3.jpg',3,'As the best cheap gaming laptop in the segment, Acer Aspire 7 A715 75G 58U4 is equipped with GTX 1650 4GB GDDR6 graphics card, 10th generation Intel Core i5 processor',2, NULL);
Insert into `product` values (9,'Fuhlen Eraser Mechanical Keyboard',31.77,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308393/IMG/fulen_2_r3hhfz.png',20,'Fuhlen is one of the famous brands when it comes to bringing to consumers genuine, quality gaming gear products at very reasonable prices. With product lines that have created brands such as fuhlen mice, gaming headsets, mouse pads and keyboard lines',1, NULL);
Insert into `product` values (10,'Mechanical Keyboard Fuhlen D87s RGB',33.5,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308392/IMG/fulen_1_tosgtp.png',11,'Fuhlen D87s RGB is one of the cheap mechanical keyboards for students = students and general users. With a compact Tenkeyless design, RGB led lighting system with many different sparkling effects, etc. To fully immerse players in the game Fuhlen D87s RGB ',1, NULL);
Insert into `product` values (11,'Laptop gaming HP Victus 16 d0294TX 5Z9R5PA',850,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308394/IMG/laphp_cipvyj.jpg',8,'HP Victus 16 d0294TX 5Z9R5PA gaming laptop has just released technology with an impressive appearance and super performance.',2, NULL);
Insert into `product` values (12,'Machanical Keyboard Corsair K100 RGB',249.5,0.0,'Available','https://res.cloudinary.com/doj6jxrnf/image/upload/v1667308393/IMG/KB_consair_hozsj7.jpg',30,'Corsair K100 RGB mechanical gaming keyboard has a metal keyboard frame, the surface is covered with a layer of scratched aluminum, skillfully and delicately machined to fit the switch pins, creating a comfortable and solid feeling. , good protection for ',1, NULL);
#add
Insert into `product` values (13, 'ZAGG InvisibleShield Ultra Clear',1499,0.0,'Available','https://m.media-amazon.com/images/I/71KHrMHx9eL._AC_UL320_.jpg',40,'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.',4, NULL);
Insert into `product` values (14, 'Fullmosa Compatible Apple Watch Band',1899,0.0,'Available','https://m.media-amazon.com/images/I/61pe9snOqtL._AC_UL320_.jpg',40,'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing.',4, NULL);
Insert into `product` values (15, 'iPhone 13 Pro Max, 256GB, Graphite',1069,0.0,'Available','https://m.media-amazon.com/images/I/61IJBsHm97L._AC_UY218_.jpg',40,'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing',5, NULL);
Insert into `product` values (16, 'iPhone 13 Pro, 512GB, Sierra Blue',999,0.0,'Available','https://m.media-amazon.com/images/I/61jLiCovxVL._AC_UY218_.jpg',40,'Products with electrical plugs are designed for use in the US. Outlets and voltage differ internationally and this product may require an adapter or converter for use in your destination. Please check compatibility before purchasing',5, NULL);
Insert into `product` values (17, 'Galaxy S22 Ultra',600,0.0,'Available','https://image-us.samsung.com/us/smartphones/galaxy-s22-ultra/images/gallery/B0-PhantomBlack/FLRC-214-B0-PhantomBlack-01-PDP-GALLERY-1600x1200.jpg?$product-card-small-jpg$',40,'Imagination for bright future',6, NULL);
Insert into `product` values (18, 'Galaxy Z Fold4',570,0.0,'Available','https://image-us.samsung.com/us/smartphones/galaxy-z-fold4/gallery-images/08042022/Gallery-Q4-Green-01-1600x1200.jpg?$product-card-small-jpg$',40,'Imagination for bright future',6, NULL);

#order


#orderdetail
Insert into `orderdetail` values (1,1,18.1,2,1);
Insert into `orderdetail` values (2,2,31.77,9,4);
Insert into `orderdetail` values (3,1,49,5,1);
Insert into `orderdetail` values (4,1,59.99,4,1);
Insert into `orderdetail` values (5,1,176,1,1);
Insert into `orderdetail` values (6,1,800,8,3);
Insert into `orderdetail` values (7,1,850,11,3);

#comment
Insert into `comment` values (1,'i love it','Very good',1,1);
Insert into `comment` values (2,'It works very well','Good',7,2);
Insert into `comment` values (3,'Its so bad to me','Bad',12,1);



-- Dump completed on 2022-11-15 18:14:43