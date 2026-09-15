CREATE DATABASE  IF NOT EXISTS `gaming_smart_sell` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gaming_smart_sell`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gaming_smart_sell
-- ------------------------------------------------------
-- Server version	8.0.44

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
-- Table structure for table `estoque`
--

DROP TABLE IF EXISTS `estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estoque` (
  `idEstoque` int NOT NULL AUTO_INCREMENT,
  `idProduto` int NOT NULL,
  `quantidadeEstoque` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`idEstoque`),
  UNIQUE KEY `idProduto` (`idProduto`),
  CONSTRAINT `fk_estoque_produto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estoque`
--

LOCK TABLES `estoque` WRITE;
/*!40000 ALTER TABLE `estoque` DISABLE KEYS */;
INSERT INTO `estoque` VALUES (1,1,3),(2,2,6),(3,3,25),(4,4,5),(5,6,8),(6,7,1),(7,8,2),(8,9,1);
/*!40000 ALTER TABLE `estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `idFornecedor` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `ativo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idFornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (1,'Tech Distribuidora','Periféricos',1),(2,'Game Supply','Acessórios Gamer',1),(3,'Mega Hardware','Hardware',1),(4,'Alpha Tech','Hardware e Componentes',0),(5,'teste','teste2',0),(6,'teste','teste',0),(7,'ew34','3dsfs2131',0);
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `idProduto` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `quantidade` int NOT NULL DEFAULT '0',
  `idFornecedor` int NOT NULL,
  `ativo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idProduto`),
  KEY `fk_produto_fornecedor` (`idFornecedor`),
  CONSTRAINT `fk_produto_fornecedor` FOREIGN KEY (`idFornecedor`) REFERENCES `fornecedor` (`idFornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Mouse Gamer','Periféricos',3,1,1),(2,'Teclado Mecânico','Periféricos',6,1,1),(3,'Headset Gamer','Acessórios Gamer',25,2,1),(4,'Monitor Gamer','Hardware',5,3,1),(5,'Mousepad Gamer RGB','Acessórios Gamer',25,2,0),(6,'teste','teste',8,1,0),(7,'234234','234234',1,1,0),(8,'teste3','teste3',2,1,0),(9,'teste','teste',1,1,0);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relatorio`
--

DROP TABLE IF EXISTS `relatorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `relatorio` (
  `idRelatorio` int NOT NULL AUTO_INCREMENT,
  `nomeRelatorio` varchar(100) NOT NULL,
  `dataGeracao` datetime NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idRelatorio`),
  KEY `fk_relatorio_usuario` (`idUsuario`),
  CONSTRAINT `fk_relatorio_usuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relatorio`
--

LOCK TABLES `relatorio` WRITE;
/*!40000 ALTER TABLE `relatorio` DISABLE KEYS */;
INSERT INTO `relatorio` VALUES (1,'Relatório de Vendas','2026-09-07 15:54:29',1),(2,'Relatório de Estoque','2026-09-07 15:54:29',1),(3,'Relatório de Vendas','2026-09-14 18:46:47',1),(4,'Relatório de Vendas','2026-09-14 20:22:35',1),(5,'Relatório de Estoque','2026-09-14 20:22:42',1),(6,'Relatório de Produtos','2026-09-14 20:22:45',1),(7,'Relatório de Usuários','2026-09-14 20:22:49',1),(8,'Relatório de Estoque','2026-09-14 20:22:55',1);
/*!40000 ALTER TABLE `relatorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `ativo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Adriana Sanclart','adriana@gamingsmartsell.com','12345678901','Administrador','1234',1),(2,'Carlos Silva','carlos@gamingsmartsell.com','98765432100','Vendedor','1234',1),(3,'Vinícius Sanclart','vinicius@gamingsmartsell.com','13456745800','Gerente','12345',0),(6,'teste','teste@teste.com','23456789012','Vendedor','12345',0),(7,'324234','4234234','76849374857','Administrador','23423',0),(8,'teste','teste2@teste.com','35674332563','Administrador','1234',0),(10,'eqwe','teste45@teste.com','04985762980','Administrador','1234',0),(12,'Vinícius Souza','viniciussouza@gamingsmartsell.com','94837465028','Gerente','1234',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `idVenda` int NOT NULL AUTO_INCREMENT,
  `quantidade` int NOT NULL,
  `pagamento` varchar(50) NOT NULL,
  `valorUnitario` decimal(10,2) NOT NULL,
  `valorTotal` decimal(10,2) NOT NULL,
  `dataVenda` datetime NOT NULL,
  `idProduto` int NOT NULL,
  `idUsuario` int NOT NULL,
  `estornada` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idVenda`),
  KEY `fk_venda_produto` (`idProduto`),
  KEY `fk_venda_usuario` (`idUsuario`),
  CONSTRAINT `fk_venda_produto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`),
  CONSTRAINT `fk_venda_usuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,2,'PIX',79.90,159.80,'2026-09-07 15:53:52',1,1,0),(2,1,'Cartão de Crédito',249.90,249.90,'2026-09-07 15:53:52',2,1,1),(3,1,'PIX',79.90,79.90,'2026-09-14 14:12:33',1,1,1),(4,1,'Cartão de Débito',1000.50,1000.50,'2026-09-14 20:20:28',4,1,1),(5,3,'Dinheiro',50.00,150.00,'2026-09-14 21:55:48',2,1,0);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-09-14 23:53:08
