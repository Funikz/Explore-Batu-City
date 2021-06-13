-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2021 at 03:03 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `explorebatucity`
--

-- --------------------------------------------------------

--
-- Table structure for table `kuliner`
--

CREATE TABLE `kuliner` (
  `idtempat` int(11) NOT NULL,
  `namatempat` varchar(255) NOT NULL,
  `info` varchar(2000) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jambuka` varchar(255) NOT NULL,
  `notelp` int(25) NOT NULL,
  `menukhas` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kuliner`
--

INSERT INTO `kuliner` (`idtempat`, `namatempat`, `info`, `alamat`, `jambuka`, `notelp`, `menukhas`) VALUES
(1, 'Warung Sate Hotplet', 'Di sini sate akan disajikan di atas hot plate,\nsehingga tetap panas dan wangi sate akan tercium semerbak. \nKamu bisa memesan sate kambing atau sate ayam.\n', 'Jalan Patimura Nomor 40', '08.00 - 23.00', 82154758, 'Daging ayam yang disajikan tanpa lemak, \nsehingga benar-benar murni daging. \nSelain sate, kamu juga bisa memesan olahan tongseng\ndan gule serta berbagai menu lain yang cukup berbeda.\n');

-- --------------------------------------------------------

--
-- Table structure for table `pariwisata`
--

CREATE TABLE `pariwisata` (
  `idtempat` int(11) NOT NULL,
  `namatempat` varchar(255) NOT NULL,
  `info` varchar(2000) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jambuka` varchar(255) NOT NULL,
  `notelp` int(25) NOT NULL,
  `keunikan` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pariwisata`
--

INSERT INTO `pariwisata` (`idtempat`, `namatempat`, `info`, `alamat`, `jambuka`, `notelp`, `keunikan`) VALUES
(1, 'Alun - Alun Kota Batu', 'Alun-alun Kota Batu ini selain berfungsi sebagai taman kota \njuga banyak di kunjungi wisatawan untuk berekreasi. \nHal ini karena fasilitas dan wahana yang ada di taman cukup lengkap. \nMulai dari wahana permainan sampai wisata kuliner bisa dilakukan di sini.\n', 'Jl. Diponegoro, Sisir, Kec.Batu', 'Setiap saat', 0, 'Bianglala, Wahana Bermain anak - anak,\nAir Mancur, Kereta kelinci, Mobil Hias');

-- --------------------------------------------------------

--
-- Table structure for table `sekolah`
--

CREATE TABLE `sekolah` (
  `idtempat` int(11) NOT NULL,
  `namatempat` varchar(255) NOT NULL,
  `info` varchar(2000) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jambuka` varchar(255) NOT NULL,
  `notelp` int(25) NOT NULL,
  `programunggulan` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sekolah`
--

INSERT INTO `sekolah` (`idtempat`, `namatempat`, `info`, `alamat`, `jambuka`, `notelp`, `programunggulan`) VALUES
(2, 'Mi Miftahul Ulum', 'Terbentuknya kader Muslim yang berbekal \r\nIMTAQ, IPTEK dan berwawasan lingkungan agar \r\nmenjadi insan kamil dan rahmatan Lil’alamin\r\n', 'Jl Dorowati', '08.00 - 09.00', 341511802, 'Unggul dalam aktivitas menjalankan syariat Islam dan berakhlaqul karimah\n'),
(5, 'SMP MAJU JAYA', 'MAJUM MAJ', 'ASDSADSDASDAS', '123445', 567788, 'ZXSAGRGR');

-- --------------------------------------------------------

--
-- Table structure for table `userole`
--

CREATE TABLE `userole` (
  `id` int(10) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` enum('0','1') NOT NULL,
  `akses` enum('tamu','admin') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userole`
--

INSERT INTO `userole` (`id`, `email`, `username`, `password`, `status`, `akses`) VALUES
(1, 'zidan5402@gmail.com', 'zidanius', 'zidan51', '1', 'admin'),
(2, 'mustofa218@gmail.com', 'cakmustofa', 'mustof21', '0', 'tamu'),
(10, 'masucup21@gmail.com', 'ucup31', 'ucup', '0', 'tamu'),
(11, 'masucup21@gmail.com', 'ucup21', 'ucup', '0', 'tamu');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kuliner`
--
ALTER TABLE `kuliner`
  ADD PRIMARY KEY (`idtempat`);

--
-- Indexes for table `pariwisata`
--
ALTER TABLE `pariwisata`
  ADD PRIMARY KEY (`idtempat`);

--
-- Indexes for table `sekolah`
--
ALTER TABLE `sekolah`
  ADD PRIMARY KEY (`idtempat`);

--
-- Indexes for table `userole`
--
ALTER TABLE `userole`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kuliner`
--
ALTER TABLE `kuliner`
  MODIFY `idtempat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pariwisata`
--
ALTER TABLE `pariwisata`
  MODIFY `idtempat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sekolah`
--
ALTER TABLE `sekolah`
  MODIFY `idtempat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `userole`
--
ALTER TABLE `userole`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
