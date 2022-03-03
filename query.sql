CREATE DATABASE Agencia_Viajes;

CREATE TABLE destino(
    id_destino INT AUTO_INCREMENT NOT NULL,
    pais VARCHAR(255) NOT NULL,
    ciudad VARCHAR(255) NOT NULL,
    precio INT NOT NULL,
    puntuacion VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    PRIMARY KEY(id_destino)
);

CREATE TABLE cliente(
    id_cliente INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    telefono VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_cliente)
)