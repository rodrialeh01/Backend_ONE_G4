# Ejemplo 1

## Empresa de jugos

### Script Inicial

```sql
CREATE DATABASE JUGOS;
USE JUGOS;
```

### Enunciado PT1

Conversando con las personas en el área de registro de clientes, nos dicen que la información más importante para el cliente es DNI, nombre completo, dirección, edad, sexo, límite de crédito, volumen mínimo de jugo que puede comprar y si ya hizo la primera compra.

### Columnas a crear

- DNI
- Nombre completo
- Dirección 1
- Dirección 2
- Barrio
- Ciudad
- Estado
- CP
- Edad
- Sexo
- Límite de crédito
- Volumen de compra
- Primera compra

### Script

```sql
CREATE TABLE TBCLIENTES(
DNI VARCHAR(20),
NOMBRE VARCHAR(150),
DIRECCION1 VARCHAR(150),
DIRECCION2 VARCHAR(150),
BARRIO VARCHAR(50),
CIUDAD VARCHAR(50),
ESTADO VARCHAR(50),
CP VARCHAR(10),
EDAD SMALLINT,
SEXO VARCHAR(1),
LIMITE_CREDITO FLOAT,
VOLUMEN_COMPRA FLOAT,
PRIMERA_COMPRA BIT(1));
```

### Enunciado PT2

A los clientes les vamos a vender productos. En la tabla de productos tendremos los jugos de frutas que vendemos en la empresa. Hablando con los usuarios de la empresa, me presentaron los campos de código de producto, nombre del producto, envase, tamaño, sabor y precio de lista.

### Columnas a crear

- Producto
- Nombre
- Envase
- Volumen
- Sabor
- Precio

### Script

```sql
CREATE TABLE TBPRODUCTOS(
PRODUCTO VARCHAR(20),
NOMBRE VARCHAR(150),
ENVASE VARCHAR(50),
VOLUMEN VARCHART(20),
SABOR VARCHAR(50),
PRECIO FLOAT);
```