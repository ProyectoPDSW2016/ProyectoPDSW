-- tables
-- Table: Equipo
-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-04-28 01:42:19.713

-- tables
-- Table: Detalle_Prestamo
CREATE TABLE Detalle_Prestamo (
    id int NOT NULL,
    prestamo_Id int NOT NULL,
    Equipo_Placa int NOT NULL,
    CONSTRAINT Detalle_Prestamo_pk PRIMARY KEY (id)
)ENGINE = InnoDB;

-- Table: Equipo
CREATE TABLE IF NOT EXISTS `Equipo` (
    Placa int NOT NULL,
     Seria int NOT NULL,
    Modelo varchar NOT NULL,
    Observaciones varchar(500) NOT NULL,
   
    Estado char(2) NOT NULL,
   
    CONSTRAINT Equipo_pk PRIMARY KEY (Placa)
)ENGINE = InnoDB;

-- Table: Equipo_Sencillo
CREATE TABLE Equipo_Sencillo (
    nombre varchar(50) NOT NULL,
    cantidad int NOT NULL,
    id int NOT NULL,
    CONSTRAINT Equipo_Sencillo_pk PRIMARY KEY (id)
)ENGINE = InnoDB;

-- Table: Tipo_Equipo
CREATE TABLE IF NOT EXISTS `Tipo_Equipo` (
    Modelo varchar(255) NOT NULL,
    nombre_Equipo varchar(255) NOT NULL,
    imagen varchar(255) NOT NULL,
    marca varchar(50) NOT NULL,
    vida_util int NOT NULL,
    precio  int NOT NULL,
    CONSTRAINT Tipo_Equipo_pk PRIMARY KEY (Modelo)
)ENGINE = InnoDB;

-- Table: Usuario
CREATE TABLE Usuario (
    carnet int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    carrera varchar(255) NOT NULL,
    semestre int NOT NULL,
    cargo varchar(50) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (carnet)
)ENGINE = InnoDB;

-- Table: prestamo_solicitud
CREATE TABLE prestamo_solicitud (
    prestamo_Id int NOT NULL,
    hora_entrega date NOT NULL,
    hora_devolucion date NOT NULL,
    Equipo_Sencillo_id int NOT NULL,
    Usuario int NOT NULL,
    CONSTRAINT prestamo_solicitud_pk PRIMARY KEY (prestamo_Id)
)ENGINE = InnoDB;
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




