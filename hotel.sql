-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-09-2018 a las 23:18:03
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

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
-- Estructura de tabla para la tabla `cama`
--

CREATE TABLE `cama` (
  `idCama` int(11) NOT NULL,
  `cantidadCama` int(11) DEFAULT NULL,
  `TipoCama_idTipoCama` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `pisoHabitacion` int(11) DEFAULT NULL,
  `estadoHabitacion` tinyint(4) DEFAULT NULL,
  `TipoHabitacion_idTipoHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `fechaInicioReserva` datetime DEFAULT NULL,
  `fechaFinReserva` datetime DEFAULT NULL,
  `estadoReserva` tinyint(4) DEFAULT NULL,
  `Huesped_dniHuesped` int(11) NOT NULL,
  `Habitacion_idHabitacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocama`
--

CREATE TABLE `tipocama` (
  `idTipoCama` int(11) NOT NULL,
  `CategoriaTipoCama` varchar(45) DEFAULT NULL,
  `cantPlazaTipoCama` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `categoriaTipoHabitacion` varchar(45) DEFAULT NULL,
  `cantPersonasTipoHabitacion` int(11) DEFAULT NULL,
  `precioNocheTipoHabitacion` double DEFAULT NULL,
  `TipoCama_idTipoCama` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cama`
--
ALTER TABLE `cama`
  ADD PRIMARY KEY (`idCama`),
  ADD KEY `fk_Cama_TipoCama1_idx` (`TipoCama_idTipoCama`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `fk_Habitacion_TipoHabitacion1_idx` (`TipoHabitacion_idTipoHabitacion`);

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
  ADD KEY `fk_Reserva_Huesped1_idx` (`Huesped_dniHuesped`),
  ADD KEY `fk_Reserva_Habitacion1_idx` (`Habitacion_idHabitacion`);

--
-- Indices de la tabla `tipocama`
--
ALTER TABLE `tipocama`
  ADD PRIMARY KEY (`idTipoCama`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`),
  ADD KEY `fk_TipoHabitacion_TipoCama1_idx` (`TipoCama_idTipoCama`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cama`
--
ALTER TABLE `cama`
  MODIFY `idCama` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipocama`
--
ALTER TABLE `tipocama`
  MODIFY `idTipoCama` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `idTipoHabitacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cama`
--
ALTER TABLE `cama`
  ADD CONSTRAINT `fk_Cama_TipoCama1` FOREIGN KEY (`TipoCama_idTipoCama`) REFERENCES `tipocama` (`idTipoCama`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `fk_Habitacion_TipoHabitacion1` FOREIGN KEY (`TipoHabitacion_idTipoHabitacion`) REFERENCES `tipohabitacion` (`idTipoHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_Reserva_Habitacion1` FOREIGN KEY (`Habitacion_idHabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Reserva_Huesped1` FOREIGN KEY (`Huesped_dniHuesped`) REFERENCES `huesped` (`dniHuesped`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD CONSTRAINT `fk_TipoHabitacion_TipoCama1` FOREIGN KEY (`TipoCama_idTipoCama`) REFERENCES `tipocama` (`idTipoCama`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
