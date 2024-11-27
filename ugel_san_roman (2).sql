-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2024 a las 19:32:46
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ugel_san_roman`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia`
--

CREATE TABLE `asistencia` (
  `id` int(11) NOT NULL,
  `id_institucion` int(20) NOT NULL DEFAULT 0,
  `id_director` int(55) NOT NULL DEFAULT 0,
  `mes` int(60) NOT NULL DEFAULT 0,
  `año` int(20) NOT NULL DEFAULT 0,
  `id_de_detalle_de_asistencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_nopad_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_asistencia`
--

CREATE TABLE `detalles_asistencia` (
  `id` int(11) NOT NULL,
  `id_docente` int(30) NOT NULL DEFAULT 0,
  `faltas` varchar(30) NOT NULL DEFAULT '',
  `tardanzas` varchar(35) NOT NULL DEFAULT '',
  `permisos` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_nopad_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directores`
--

CREATE TABLE `directores` (
  `id` int(11) NOT NULL,
  `dni` int(60) NOT NULL DEFAULT 0,
  `nombre` varchar(30) NOT NULL DEFAULT '',
  `apellido` varchar(60) NOT NULL DEFAULT '',
  `especialidad` varchar(13) NOT NULL DEFAULT '',
  `condición` varchar(50) NOT NULL DEFAULT '',
  `user` int(20) NOT NULL DEFAULT 0,
  `password` varchar(70) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_nopad_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docentes`
--

CREATE TABLE `docentes` (
  `id` int(11) NOT NULL,
  `dni` int(20) NOT NULL DEFAULT 0,
  `nombre` varchar(40) NOT NULL DEFAULT '',
  `apellidos` varchar(55) NOT NULL DEFAULT '',
  `especialidad` varchar(44) NOT NULL DEFAULT '',
  `condicion` varchar(33) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_nopad_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `institucion`
--

CREATE TABLE `institucion` (
  `id` int(11) NOT NULL,
  `codigo` int(4) NOT NULL DEFAULT 0,
  `nombre` varchar(55) NOT NULL DEFAULT '',
  `direccion` varchar(60) NOT NULL DEFAULT '',
  `distrito` varchar(20) NOT NULL DEFAULT '',
  `nivel` varchar(50) NOT NULL,
  `gestion` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_nopad_ci;

--
-- Volcado de datos para la tabla `institucion`
--

INSERT INTO `institucion` (`id`, `codigo`, `nombre`, `direccion`, `distrito`, `nivel`, `gestion`) VALUES
(1, 1212, '1212', 'ASDGASDG', ' Juan', 'San Juan', 'jualica'),
(2, 2, 'Colegio Nacional María Reyna', 'Calle de los Abuelos 456, María Reyna', 'María Reyna', 'Sec', 'Privada'),
(3, 3, '3', 'cesar vallejo', 'plaza de armas ', 'san miguiel', 'secuandario'),
(14, 86, 'sdg', 'sdfg', 'sdfg', 'sdg', 'sdg'),
(15, 566, '566', 'juliaca', 'lucas', 'san mugil', 'primario'),
(16, 5027, '5027', 'politecbico de los andes ', 'av ciercunvalkcaion ', 'san miguel', '3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalles_asistencia`
--
ALTER TABLE `detalles_asistencia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `directores`
--
ALTER TABLE `directores`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `institucion`
--
ALTER TABLE `institucion`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistencia`
--
ALTER TABLE `asistencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalles_asistencia`
--
ALTER TABLE `detalles_asistencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `directores`
--
ALTER TABLE `directores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `docentes`
--
ALTER TABLE `docentes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `institucion`
--
ALTER TABLE `institucion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
