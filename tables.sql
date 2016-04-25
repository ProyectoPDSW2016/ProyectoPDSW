
CREATE TABLE Equipo (
    Placa int NOT NULL,
    Observaciones varchar(500) NOT NULL,
    Serial int NOT NULL,
    Estado char(2) NOT NULL,
    Tipo_Equipo_Modelo int NOT NULL,
    prestamo_solicitud_id int NOT NULL,
    CONSTRAINT Equipo_pk PRIMARY KEY (Placa)
) ENGINE=InnoDB;


CREATE TABLE Equipo_Sencillo (
    nombre varchar(50) NOT NULL,
    cantidad int NOT NULL,
    id int NOT NULL,
    CONSTRAINT Equipo_Sencillo_pk PRIMARY KEY (id)
) ENGINE=InnoDB;


CREATE TABLE Tipo_Equipo (
    Modelo int NOT NULL,
    nombre_Equipo varchar(255) NOT NULL,
    imagen blob NOT NULL,
    marca varchar(50) NOT NULL,
    vida_util int NOT NULL,
    valor_comercial int NOT NULL,
    CONSTRAINT Tipo_Equipo_pk PRIMARY KEY (Modelo)
) ENGINE=InnoDB;


CREATE TABLE Usuario (
    id_carnet int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    carrera varchar(255) NOT NULL,
    semestre int NOT NULL,
    cargo varchar(50) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (id_carnet)
) ENGINE=InnoDB;


CREATE TABLE prestamo_solicitud (
    id int NOT NULL,
    hora_entrega date NOT NULL,
    hora_devolucion date NOT NULL,
    Equipo_Sencillo_id int NOT NULL,
    Usuario_id_carnet int NOT NULL,
    nombre_Usuario int NOT NULL,
    CONSTRAINT prestamo_solicitud_pk PRIMARY KEY (id)
) ENGINE=InnoDB;

ALTER TABLE Equipo ADD CONSTRAINT Equipo_Tipo_Equipo FOREIGN KEY Equipo_Tipo_Equipo (Tipo_Equipo_Modelo)
    REFERENCES Tipo_Equipo (Modelo);

ALTER TABLE Equipo ADD CONSTRAINT Equipo_prestamo_solicitud FOREIGN KEY Equipo_prestamo_solicitud (prestamo_solicitud_id)
    REFERENCES prestamo_solicitud (id);


ALTER TABLE prestamo_solicitud ADD CONSTRAINT prestamo_solicitud_Equipo_Sencillo FOREIGN KEY prestamo_solicitud_Equipo_Sencillo (Equipo_Sencillo_id)
    REFERENCES Equipo_Sencillo (id);


ALTER TABLE prestamo_solicitud ADD CONSTRAINT prestamo_solicitud_Usuario FOREIGN KEY prestamo_solicitud_Usuario (Usuario_id_carnet)
    REFERENCES Usuario (id_carnet);


