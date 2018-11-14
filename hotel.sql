-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 14-11-2018 a las 04:49:30
-- Versión del servidor: 10.1.34-MariaDB
-- Versión de PHP: 5.6.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `numeroHabitacion` int(11) NOT NULL,
  `pisoHabitacion` int(11) DEFAULT NULL,
  `estadoHabitacion` tinyint(4) DEFAULT NULL,
  `idTipoHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`numeroHabitacion`, `pisoHabitacion`, `estadoHabitacion`, `idTipoHabitacion`) VALUES
(1, 0, 1, 1),
(2, 0, 1, 2),
(3, 0, 0, 3),
(4, 0, 0, 4),
(5, 0, 0, 5),
(6, 0, 0, 6),
(7, 0, 1, 1),
(8, 0, 1, 2),
(9, 0, 0, 3),
(10, 0, 0, 4),
(11, 0, 0, 5),
(12, 0, 0, 6),
(13, 0, 0, 1),
(14, 0, 0, 2),
(15, 0, 0, 3),
(16, 0, 0, 4),
(17, 0, 0, 5),
(18, 0, 0, 6),
(19, 0, 0, 1),
(20, 0, 1, 2),
(21, 0, 0, 3),
(22, 0, 1, 4),
(23, 0, 0, 5),
(24, 0, 0, 6),
(25, 0, 0, 1),
(26, 0, 0, 2),
(27, 0, 0, 3),
(28, 0, 0, 4),
(29, 0, 0, 5),
(30, 0, 0, 6),
(31, 0, 0, 1),
(32, 0, 0, 2),
(33, 0, 0, 3),
(34, 0, 0, 4),
(35, 0, 0, 5),
(36, 0, 1, 6),
(37, 0, 0, 1),
(38, 0, 0, 2),
(39, 0, 0, 3),
(40, 0, 1, 4),
(41, 0, 0, 5),
(42, 0, 0, 6),
(43, 0, 0, 1),
(44, 0, 0, 2),
(45, 0, 0, 3),
(46, 0, 0, 4),
(47, 0, 0, 5),
(48, 0, 0, 6),
(49, 0, 0, 1),
(50, 0, 0, 2),
(51, 1, 0, 3),
(52, 1, 0, 4),
(53, 1, 0, 5),
(54, 1, 0, 6),
(55, 1, 0, 1),
(56, 1, 0, 2),
(57, 1, 0, 3),
(58, 1, 0, 4),
(59, 1, 0, 5),
(60, 1, 0, 6),
(61, 1, 0, 1),
(62, 1, 0, 2),
(63, 1, 0, 3),
(64, 1, 0, 4),
(65, 1, 0, 5),
(66, 1, 0, 6),
(67, 1, 0, 1),
(68, 1, 0, 2),
(69, 1, 0, 3),
(70, 1, 0, 4),
(71, 1, 0, 5),
(72, 1, 0, 6),
(73, 1, 0, 1),
(74, 1, 0, 2),
(75, 1, 0, 3),
(76, 1, 0, 4),
(77, 1, 0, 5),
(78, 1, 0, 6),
(79, 1, 0, 1),
(80, 1, 0, 2),
(81, 1, 0, 3),
(82, 1, 0, 4),
(83, 1, 0, 5),
(84, 1, 0, 6),
(85, 1, 0, 1),
(86, 1, 0, 2),
(87, 1, 0, 3),
(88, 1, 0, 4),
(89, 1, 0, 5),
(90, 1, 0, 6),
(91, 1, 0, 1),
(92, 1, 0, 2),
(93, 1, 0, 3),
(94, 1, 0, 4),
(95, 1, 0, 5),
(96, 1, 0, 6),
(97, 1, 0, 1),
(98, 1, 0, 2),
(99, 1, 0, 3),
(100, 1, 0, 4),
(101, 2, 0, 5),
(102, 2, 0, 6),
(103, 2, 0, 1),
(104, 2, 0, 2),
(105, 2, 0, 3),
(106, 2, 0, 4),
(107, 2, 0, 5),
(108, 2, 0, 6),
(109, 2, 0, 1),
(110, 2, 0, 2),
(111, 2, 0, 3),
(112, 2, 0, 4),
(113, 2, 0, 5),
(114, 2, 0, 6),
(115, 2, 0, 1),
(116, 2, 0, 2),
(117, 2, 0, 3),
(118, 2, 0, 4),
(119, 2, 0, 5),
(120, 2, 0, 6),
(121, 2, 0, 1),
(122, 2, 0, 2),
(123, 2, 0, 3),
(124, 2, 0, 4),
(125, 2, 0, 5),
(126, 2, 0, 6),
(127, 2, 0, 1),
(128, 2, 0, 2),
(129, 2, 0, 3),
(130, 2, 0, 4),
(131, 2, 0, 5),
(132, 2, 0, 6),
(133, 2, 0, 1),
(134, 2, 0, 2),
(135, 2, 0, 3),
(136, 2, 0, 4),
(137, 2, 0, 5),
(138, 2, 0, 6),
(139, 2, 0, 1),
(140, 2, 0, 2),
(141, 2, 0, 3),
(142, 2, 0, 4),
(143, 2, 0, 5),
(144, 2, 0, 6),
(145, 2, 0, 1),
(146, 2, 0, 2),
(147, 2, 0, 3),
(148, 2, 0, 4),
(149, 2, 0, 5),
(150, 2, 0, 6),
(151, 3, 0, 1),
(152, 3, 0, 2),
(153, 3, 0, 3),
(154, 3, 0, 4),
(155, 3, 0, 5),
(156, 3, 0, 6),
(157, 3, 0, 1),
(158, 3, 0, 2),
(159, 3, 0, 3),
(160, 3, 0, 4),
(161, 3, 0, 5),
(162, 3, 0, 6),
(163, 3, 0, 1),
(164, 3, 0, 2),
(165, 3, 0, 3),
(166, 3, 0, 4),
(167, 3, 0, 5),
(168, 3, 0, 6),
(169, 3, 0, 1),
(170, 3, 0, 2),
(171, 3, 0, 3),
(172, 3, 0, 4),
(173, 3, 0, 5),
(174, 3, 0, 6),
(175, 3, 0, 1),
(176, 3, 0, 2),
(177, 3, 0, 3),
(178, 3, 0, 4),
(179, 3, 0, 5),
(180, 3, 0, 6),
(181, 3, 0, 1),
(182, 3, 0, 2),
(183, 3, 0, 3),
(184, 3, 0, 4),
(185, 3, 0, 5),
(186, 3, 0, 6),
(187, 3, 0, 1),
(188, 3, 0, 2),
(189, 3, 0, 3),
(190, 3, 0, 4),
(191, 3, 0, 5),
(192, 3, 0, 6),
(193, 3, 0, 1),
(194, 3, 0, 2),
(195, 3, 0, 3),
(196, 3, 0, 4),
(197, 3, 0, 5),
(198, 3, 0, 6),
(199, 3, 0, 1),
(200, 3, 0, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `dniHuesped` int(11) NOT NULL,
  `nombreHuesped` varchar(45) DEFAULT NULL,
  `domicilioHuesped` varchar(45) DEFAULT NULL,
  `correoHuesped` varchar(45) DEFAULT NULL,
  `celularHuesped` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`dniHuesped`, `nombreHuesped`, `domicilioHuesped`, `correoHuesped`, `celularHuesped`) VALUES
(11111111, 'Maniana Saber', 'Guayaquil 29', 'msarg@gmail.com', '23897656'),
(22222222, 'Manuel Cristobal', 'Las heras 87', 'manu@hotmail.com.ar', '432212'),
(33333333, 'Florencia Gomes', 'Montevideo 300', 'florg@gmail.com', '23432123'),
(44444444, 'Carlos Pizarro', 'Colombia 1100', 'cp01@yahoo.es', '24343221'),
(55555555, 'Arturo Icardi', 'Las uvas 32', 'icardia@gmail.com', '2664323231'),
(66666666, 'Claudio Lombardi', 'Buena vista 333', 'claudio22@gmail.com', '2664212311'),
(88888821, 'Miguel Cruz', 'Riobamba 22', 'migue93@hotmail.es', '54232123'),
(99999999, 'Juan Pierre', 'Ayacucho 300', 'jp2019@yahoo.com.ar', '2311111111');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `fechaInicioReserva` datetime DEFAULT NULL,
  `fechaFinReserva` datetime DEFAULT NULL,
  `estadoReserva` tinyint(4) DEFAULT NULL,
  `dniHuesped` int(11) NOT NULL,
  `numeroHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `fechaInicioReserva`, `fechaFinReserva`, `estadoReserva`, `dniHuesped`, `numeroHabitacion`) VALUES
(1, '2018-09-03 00:00:00', '2018-09-06 00:00:00', 0, 33333333, 1),
(2, '2018-10-15 00:00:00', '2018-10-16 00:00:00', 0, 22222222, 2),
(3, '2018-09-15 00:00:00', '2018-10-15 00:00:00', 0, 33333333, 3),
(4, '2018-11-14 00:00:00', '2018-11-15 00:00:00', 1, 33333333, 2),
(5, '2018-11-14 00:00:00', '2018-11-17 00:00:00', 1, 88888821, 8),
(6, '2018-11-15 00:00:00', '2018-11-16 00:00:00', 1, 99999999, 40),
(7, '2018-11-14 00:00:00', '2018-11-15 00:00:00', 1, 55555555, 36),
(8, '2018-11-14 00:00:00', '2018-11-16 00:00:00', 1, 66666666, 22),
(9, '2018-11-14 00:00:00', '2018-11-15 00:00:00', 1, 44444444, 1),
(10, '2018-11-29 00:00:00', '2018-11-30 00:00:00', 1, 66666666, 7),
(11, '2018-11-14 00:00:00', '2018-11-17 00:00:00', 1, 11111111, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `categoriaTipoHabitacion` varchar(45) DEFAULT NULL,
  `cantPersonasTipoHabitacion` int(11) DEFAULT NULL,
  `precioNocheTipoHabitacion` double DEFAULT NULL,
  `tipoCamaTipoHabitacion` varchar(45) DEFAULT NULL,
  `cantCamasTipoHabitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`idTipoHabitacion`, `categoriaTipoHabitacion`, `cantPersonasTipoHabitacion`, `precioNocheTipoHabitacion`, `tipoCamaTipoHabitacion`, `cantCamasTipoHabitacion`) VALUES
(1, 'Estandar Simple', 1, 500, 'Simples', 1),
(2, 'Estandar Doble Matrimonial', 2, 1000, 'Queen Size', 1),
(3, 'Estandar Doble', 2, 1000, 'Simples', 2),
(4, 'Estandar Triple', 3, 1500, 'Simples', 3),
(5, 'Estandar Triple Matrimonial', 3, 1500, 'Queen Size y simple', 2),
(6, 'Suite Lujo', 2, 5000, 'King Size', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`numeroHabitacion`),
  ADD KEY `fk_Habitacion_TipoHabitacion1_idx` (`idTipoHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`dniHuesped`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `fk_Reserva_Huesped1_idx` (`dniHuesped`),
  ADD KEY `fk_Reserva_Habitacion1_idx` (`numeroHabitacion`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `idTipoHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `fk_Habitacion_TipoHabitacion1` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `tipohabitacion` (`idTipoHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_Reserva_Habitacion1` FOREIGN KEY (`numeroHabitacion`) REFERENCES `habitacion` (`numeroHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Reserva_Huesped1` FOREIGN KEY (`dniHuesped`) REFERENCES `huesped` (`dniHuesped`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
