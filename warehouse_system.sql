-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2021 at 08:11 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `warehouse_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `addedstoragejobs`
--

CREATE TABLE `addedstoragejobs` (
  `Storage_Job_ID` int(20) NOT NULL,
  `Client_ID` varchar(225) NOT NULL,
  `Client_Name` varchar(225) NOT NULL,
  `Slot_Given` varchar(25) NOT NULL,
  `Start_Date` date NOT NULL,
  `Duration` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addedstoragejobs`
--

INSERT INTO `addedstoragejobs` (`Storage_Job_ID`, `Client_ID`, `Client_Name`, `Slot_Given`, `Start_Date`, `Duration`) VALUES
(1, 'C002', 'wddd', 'A2', '2021-10-01', '2'),
(2, 'c001', 'aaa', 'A6', '2021-10-18', '4'),
(3, 'C003', 'abcd', 'B1', '2021-09-01', '5'),
(4, 'C004', 'Harry', 'A4', '2021-08-01', '10');

-- --------------------------------------------------------

--
-- Table structure for table `billtable`
--

CREATE TABLE `billtable` (
  `Bill_Number` int(10) NOT NULL,
  `Client_id` varchar(225) NOT NULL,
  `Duration` int(50) NOT NULL,
  `Slot` varchar(225) NOT NULL,
  `Bill_Amount` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billtable`
--

INSERT INTO `billtable` (`Bill_Number`, `Client_id`, `Duration`, `Slot`, `Bill_Amount`) VALUES
(1, 'C002', 2, 'A2', 20000),
(2, 'C004', 10, 'A4', 100000);

-- --------------------------------------------------------

--
-- Table structure for table `clientsregistration`
--

CREATE TABLE `clientsregistration` (
  `CRID` int(10) NOT NULL,
  `Client_ID` varchar(255) NOT NULL,
  `Client_Name` varchar(225) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `Company_Name` varchar(225) NOT NULL,
  `Address` varchar(225) NOT NULL,
  `Phone_Number` int(20) NOT NULL,
  `Category` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clientsregistration`
--

INSERT INTO `clientsregistration` (`CRID`, `Client_ID`, `Client_Name`, `NIC`, `Company_Name`, `Address`, `Phone_Number`, `Category`) VALUES
(1, 'c001', 'aaa', '111', 'bbb', 'a10', 111, '1'),
(2, 'C002', 'wddd', 'swdwd', 'ferf', 'dfref', 11111111, 'Food Items'),
(3, 'C003', 'abcd', '9999', 'abcdef', '123abcd', 77999999, 'Spare Parts'),
(4, 'C004', 'Harry', '12345', 'Harry products', '12345reds', 677644, 'Raw Materials');

-- --------------------------------------------------------

--
-- Table structure for table `logincredentials`
--

CREATE TABLE `logincredentials` (
  `LID` int(10) NOT NULL,
  `User_ID` varchar(255) NOT NULL,
  `User_Name` varchar(255) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `Phone_Number` int(10) NOT NULL,
  `User_Handle` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logincredentials`
--

INSERT INTO `logincredentials` (`LID`, `User_ID`, `User_Name`, `NIC`, `Phone_Number`, `User_Handle`, `Password`) VALUES
(1, 'abc', 'abcManager', '123456789V', 123456789, 'Manager', 'abc'),
(3, 'xyz', 'xyzOperator', '12345', 7799, 'Operator', 'xyz'),
(7, 'mmm', 'jake', '1111', 3333, 'Manager', 'mmm');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addedstoragejobs`
--
ALTER TABLE `addedstoragejobs`
  ADD PRIMARY KEY (`Storage_Job_ID`);

--
-- Indexes for table `billtable`
--
ALTER TABLE `billtable`
  ADD PRIMARY KEY (`Bill_Number`);

--
-- Indexes for table `clientsregistration`
--
ALTER TABLE `clientsregistration`
  ADD PRIMARY KEY (`CRID`);

--
-- Indexes for table `logincredentials`
--
ALTER TABLE `logincredentials`
  ADD PRIMARY KEY (`LID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addedstoragejobs`
--
ALTER TABLE `addedstoragejobs`
  MODIFY `Storage_Job_ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `billtable`
--
ALTER TABLE `billtable`
  MODIFY `Bill_Number` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `clientsregistration`
--
ALTER TABLE `clientsregistration`
  MODIFY `CRID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `logincredentials`
--
ALTER TABLE `logincredentials`
  MODIFY `LID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
