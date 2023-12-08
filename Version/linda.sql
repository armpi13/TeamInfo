-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Εξυπηρετητής: 127.0.0.1
-- Χρόνος δημιουργίας: 08 Δεκ 2023 στις 10:38:50
-- Έκδοση διακομιστή: 10.4.32-MariaDB
-- Έκδοση PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `linda`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `login`
--

CREATE TABLE `login` (
  `Username` text NOT NULL,
  `Password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('armpi', 2002),
('gkokas', 2002),
('kikkk', 2468),
('marios', 2002);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `logininfo`
--

CREATE TABLE `logininfo` (
  `Username` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `logininfo`
--

INSERT INTO `logininfo` (`Username`) VALUES
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
('rrew'),
('rwrw'),
('Armpi'),
('Gkokas'),
('stelios'),
('test'),
('kitso'),
('new');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `pendingaccounts`
--

CREATE TABLE `pendingaccounts` (
  `Username` text NOT NULL,
  `Password` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `pendingaccounts`
--

INSERT INTO `pendingaccounts` (`Username`, `Password`) VALUES
('effer', 2234);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `record`
--

CREATE TABLE `record` (
  `TeamName` varchar(255) NOT NULL,
  `Year` int(15) NOT NULL,
  `Cups` text DEFAULT NULL,
  `Owner` text DEFAULT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `record`
--

INSERT INTO `record` (`TeamName`, `Year`, `Cups`, `Owner`, `ID`) VALUES
('barcelona', 2002, NULL, NULL, 70),
('real', 2002, '5', 'marios', 73);

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `record`
--
ALTER TABLE `record`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `record`
--
ALTER TABLE `record`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
