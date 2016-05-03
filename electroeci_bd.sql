-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-04-25 02:14:17.525

-- tables
-- Table: Equipo
CREATE TABLE IF NOT EXISTS `Equipo`(
    `Placa` int NOT NULL,
    `Seria` int NULL,
    `Tipo_Equipo_Modelo` int  NULL,
    `Precio` int NOT NULL,
   
    `Observaciones` varchar(500) NOT NULL,
     `Estado` char(2) NULL,

    
    `prestamo_solicitud_id` int  NULL,
    CONSTRAINT Equipo_pk PRIMARY KEY (Placa)
)ENGINE = InnoDB;

-- Table: Equipo_Sencillo
CREATE TABLE IF NOT EXISTS `Equipo_Sencillo` (
    nombre varchar(50) NOT NULL,
    cantidad int NOT NULL,
    id int NOT NULL,
    CONSTRAINT Equipo_Sencillo_pk PRIMARY KEY (id)
)ENGINE = InnoDB ;

-- Table: Tipo_Equipo
CREATE TABLE IF NOT EXISTS `Tipo_Equipo` (
    Modelo int NOT NULL,
    nombre_Equipo varchar(255) NOT NULL,
    imagen varchar NOT NULL,
    marca varchar(50) NOT NULL,
    vida_util int NOT NULL,
    valor_comercial int NOT NULL,
    CONSTRAINT Tipo_Equipo_pk PRIMARY KEY (Modelo)
)ENGINE = InnoDB ;

-- Table: Usuario
CREATE TABLE IF NOT EXISTS `Usuario` (
    id_carnet int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    carrera varchar(255) NOT NULL,
    semestre int NOT NULL,
    cargo varchar(50) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (id_carnet)
)ENGINE = InnoDB ;

-- Table: prestamo_solicitud
CREATE TABLE IF NOT EXISTS `prestamo_solicitud`(
    id int NOT NULL,
    hora_entrega date NOT NULL,
    hora_devolucion date NOT NULL,
    Equipo_Sencillo_id int NOT NULL,
    Usuario_id_carnet int NOT NULL,
    nombre_Usuario int NOT NULL,
    CONSTRAINT prestamo_solicitud_pk PRIMARY KEY (id)
)ENGINE = InnoDB ; 

-- foreign keys
-- Reference: Equipo_Tipo_Equipo (table: Equipo)
--ALTER TABLE Equipo ADD CONSTRAINT Equipo_Tipo_Equipo FOREIGN KEY Equipo_Tipo_Equipo (Tipo_Equipo_Modelo)
  --  REFERENCES Tipo_Equipo (Modelo);

-- Reference: Equipo_prestamo_solicitud (table: Equipo)
--ALTER TABLE Equipo ADD CONSTRAINT Equipo_prestamo_solicitud FOREIGN KEY Equipo_prestamo_solicitud (prestamo_solicitud_id)
   --REFERENCES prestamo_solicitud (id);

-- Reference: prestamo_solicitud_Equipo_Sencillo (table: prestamo_solicitud)
--A--LTER TABLE prestamo_solicitud ADD CONSTRAINT prestamo_solicitud_Equipo_Sencillo FOREIGN KEY prestamo_solicitud_Equipo_Sencillo (Equipo_Sencillo_id)
   -- REFERENCES Equipo_Sencillo (id);

-- Reference: prestamo_solicitud_Usuario (table: prestamo_solicitud)
--ALTER TABLE prestamo_solicitud ADD CONSTRAINT prestamo_solicitud_Usuario FOREIGN KEY prestamo_solicitud_Usuario (Usuario_id_carnet)
   -- REFERENCES Usuario (id_carnet);



-- End of file.

