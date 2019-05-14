-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 14-05-2019 a las 03:16:01
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `elquesea`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `amigos`
--

DROP TABLE IF EXISTS `amigos`;
CREATE TABLE IF NOT EXISTS `amigos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_u` int(11) NOT NULL,
  `id_a` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_u` (`id_u`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

DROP TABLE IF EXISTS `grupo`;
CREATE TABLE IF NOT EXISTS `grupo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

DROP TABLE IF EXISTS `historial`;
CREATE TABLE IF NOT EXISTS `historial` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_amigos` int(11) NOT NULL,
  `mensaje` longtext NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_amigos` (`id_amigos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_grupo`
--

DROP TABLE IF EXISTS `historial_grupo`;
CREATE TABLE IF NOT EXISTS `historial_grupo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mensaje` longtext NOT NULL,
  `id_u` int(11) NOT NULL,
  `id_g` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_g` (`id_g`),
  KEY `id_u` (`id_u`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `username`, `password`, `nombre`, `estado`) VALUES
(1, 'test', 'test', 'test', 1),
(2, 'Mariana', 'crack', 'Algundia', 1),
(3, 'Username', 'Password', 'Nombre', 1),
(4, 'Username', 'Password', 'Nombre', 1),
(5, 'Username', 'Password', 'Nombre', 1),
(6, 'ickkck', 'ickkck', 'Hola', 1),
(7, 'test', 'test', 'cualquiercosa', 1),
(8, 'k', 'k', 'ke', 1),
(9, 'm', 'a', 'riana', 1),
(10, 'M', 'a', 'riana', 1),
(11, 'J', 'o', 'Gio', 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `amigos`
--
ALTER TABLE `amigos`
  ADD CONSTRAINT `amigos_ibfk_1` FOREIGN KEY (`id_u`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`id_amigos`) REFERENCES `amigos` (`id`);

--
-- Filtros para la tabla `historial_grupo`
--
ALTER TABLE `historial_grupo`
  ADD CONSTRAINT `historial_grupo_ibfk_1` FOREIGN KEY (`id_g`) REFERENCES `grupo` (`id`),
  ADD CONSTRAINT `historial_grupo_ibfk_2` FOREIGN KEY (`id_u`) REFERENCES `usuario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
