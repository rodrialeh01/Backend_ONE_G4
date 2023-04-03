# Introducción a SQL con MySQL: Manipule y consulte datos

# MySQL 🐬 - Bases de Datos

## Conceptos Iniciales

## Tablas

### Campos

Tipos de datos:

#### Números enteros:

| Tipo | Valor en Bytes | Menor valor (signed) | Menor valor (unsigned*) | Mayor valor (signed) | Mayor valor (unsigned*) |
| ---- | -------------- | -------------------- | ----------------------- | -------------------- | ----------------------- |
| TINYINT | 1 | -128 | 0 | 127 | 255 |
| SMALLINT | 2 | -32768 | 0 | 32767 | 65535 |
| MEDIUMINT | 3 | -8388608 | 0 | 8388607 | 16777215 |
| INT | 4 | -2147483648 | 0 | 2147483647 | 4294967295 |
| BIGINT | 8 | -2E63 | 0 | 2E63(-1) | 18446744073709551615 |

\* Unsigned: No admite valores negativos.

#### Números decimales:

| Tipo | Precisión en Bytes | Tipo |
| ---- | ------------------ | ---- |
| FLOAT* | 4 | Simple |
| DOUBLE* | 8 | Doble |

\* coma flotante

Si declaramos un FLOAT(6,4) e incluímos el número 76.00009 el valor almacenado será 76.0001.

| Tipo | Cantidad de dígitos |
| ---- | ------------------- |
| DECIMAL o NUMERIC | 65 |

Es un número fijo, si declaramos DECIMAL(5,3) solo podemos almacenar desde -99.999 hasta 99.999

- Bit:

| Tipo | Cantidad de Bits |
| ---- | ---------------- |
| BIT | 64 |

BIT(1) solo puede almacenar 0 o 1.
BIT(3) puede ser 000,001,010,011,100,101,110,111

- #### Atributos de los campos numéricos

| Atributo | Descripción |
| -------- | ----------- |
| SIGNED ó UNSIGNED | Con signo o sin signo |
| ZEROFILL | Llena los espacios con cero. Ej. INT(5): si almacenamos 54, el campo va a quedar 00054 |
| AUTO_INCREMENT | Hay un incremento secuencial. Ej. 1,2,3,4,5...; 2,4,8,10... |
| OUT OF RANGE | Es un error que se presenta cuando los valores se salen de los límites |   

#### Fecha y hora:

| Tipo | Fornato | Rango |
| ---- | ----------- | ----- |
| DATE | Año, mes y día | Desde 1000-01-01 hasta 9999-12-31 |
| DATETIME | Año, mes, día, hora, minuto y segundo | Desde 1000-01-01 00:00:00 hasta 9999-12-31 23:59:59 |
| TIMESTAMP | Año, mes, día, hora, minuto y segundo UTC | Desde 1970-01-01 00:00:01 UTC hasta 2038-01-19 03:14:07 UTC |
| TIME | Hora, minuto y segundo | Desde -838:59:59 hasta 838:59:59 |
| YEAR | Año | Desde 1901 hasta 2155 (2 o 4 dígitos) |

#### Texto: 

| Tipo | Descripción | Ejemplo |
| ---- | ----------- | ------- |
| CHAR | Cadena de caracteres con valor fijo de 0 a 255 | CHAR(4) = "aa" -> "  aa" |
| VARCHAR | Cadena de caracteres con valor variable de 0 a 255 | VARCHAR(4) = "aa" -> "aa" |
| BYNARY | Cadena de caracteres binarios con valor fijo de 0 a 255 (Con números binarios - bits) |  |
| VARBINARY | Cadena de caracteres binarios con valor variable de 0 a 255 (Con números binarios - bits) |  |
| BLOB | Binarios largos (TINYBLOB, MEDIUMBLOB, LONGBLOB)|  |
| TEXT | Texto largo (TINYTEXT, MEDIUMTEXT, LONGTEXT) |  |
| ENUM | Definir opciones en una lista predefinida | Talla ENUM('pequeño','medio','grande') |

- #### Atributos de los campos de texto

| Atributo | Descripción | Ejemplo |
| -------- | ----------- | ------- |
| SET y COLLATE | El tipo de conjunto de carateres que va a aceptar | utf-8, utf-16 ...|

- #### Campos espaciales (GPS)

| Tipo | Descripción |
| ---- | ----------- |
| GEOMETRY | Área |
| POINT | Línea |
| LINESTRING | Punto |
| POLYGON | Área |


Características:
- Definido al momento de crear la tabla.
- Número ilimitado.
- No admite datos que no fueron especificados.

### Registros

Caracteríasticas:

- Son los datos contenidos en los campos.
- Número ilimitado.
- Límite máximo dado por la capacidad de almacenamiento disponible en el disco.
- Al momento de la creación de la base de datos se pueden establecer políticas de crecimiento.

### Índices

Facilitan la búsqueda de registros en una tabla.

### Clave primaria
- No es obligatorio
- Su combinación no se puede repetir en ningun otro registro de la tabla.

### Clave foránea

- Campo que relaciona las tablas.
- Garantiza la integridad de datos.


## Esquema

Facilita la agrupación de tablas por temas.

## View (vista)

- Consultas de n tablas al mismo tiempo
- Alto costo de procesamiento

## Consulta (Query)

- Unir tablas a través de JOIN
- Creamos filtros

## Procedimientos (Procedures)

- Lógica estructurada con lenguaje nativo del mismo SQL (if, for, while, etc)
- Podemos crear funciones:

```sql
IF a > 0 THEN
X = y + z
z = INSTR(z + 1)
SELECT * FROM alpha
PUT alpha IN TABLE X
```

## Trigger (Disparador)

- Avisos automáticos cuando hay algún tipo de cambio en la base de datos.
- Ejecuta una función o procedimiento cuando la condición del trigger es satisfecha.

---

## Comandos MySQL

### CREATE DATABASE
Crea una base de datos.

```sql
CREATE DATABASE nombre_base_de_datos;
```

Crear una base de datos con utf8:

```sql
CREATE DATABASE nombre_base_de_datos DEFAULT CHARACTER SET utf8;
```

### DROP DATABASE
Elimina una base de datos.

```sql
DROP DATABASE nombre_base_de_datos;
```

### USE
Selecciona una base de datos.

```sql
USE nombre_base_de_datos;
```

### CREATE TABLE
Crea una tabla junto con los campos necesarios para crear la tabla.

```sql
CREATE TABLE nombre_tabla (
    nombre_campo tipo_dato,
    nombre_campo tipo_dato,
    nombre_campo tipo_dato,
    ...
);
```

### INSERT
Inserta un registro en una tabla.

```sql
INSERT INTO nombre_tabla (nombre_campo, nombre_campo, nombre_campo, ...) VALUES (valor, valor, valor, ...);
```

### SELECT
Muestra todos los registros de una tabla.

```sql
SELECT * FROM nombre_tabla;
```
Muestra ciertos registros de una tabla.

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla;
```

Se puede poner un alias a los campos:

```sql
SELECT nombre_campo AS alias, nombre_campo AS alias, nombre_campo AS alias, ... FROM nombre_tabla;
```

Se limita la cantidad de registros que se muestran:

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla LIMIT cantidad_limite;
```


### UPDATE
Actualiza los registros de una tabla.

```sql
UPDATE nombre_tabla SET nombre_campo = valor, nombre_campo = valor, nombre_campo = valor, ... WHERE condición;
```

### DELETE

Elimina los registros de una tabla.

```sql
DELETE FROM nombre_tabla WHERE condición;
```

Si borra todos los registros de una tabla:

```sql
DELETE FROM nombre_tabla;
```

### ALTER TABLE

Modifica una tabla.

```sql
ALTER TABLE nombre_tabla ADD nombre_campo tipo_dato;
```

### ADD PRIMARY KEY

Crea una llave Primaria.

```sql
ALTER TABLE nombre_tabla ADD PRIMARY KEY (nombre_campo);
```

### ADD COLUMN

Agrega una columna a una tabla.

```sql
ALTER TABLE nombre_tabla ADD COLUMN (nombre_campo tipo_dato);
```

### FILTROS

#### WHERE

Filtra los registros de una tabla.

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla WHERE condición;
```

#### AND

Filtra los registros de una tabla con dos condiciones.

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla WHERE condición AND condición;
```

#### OR

Filtra los registros de una tabla con dos condiciones.

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla WHERE condición OR condición;
```

#### BETWEEN

Filtra los registros de una tabla con un rango de valores.

```sql
SELECT nombre_campo, nombre_campo, nombre_campo, ... FROM nombre_tabla WHERE nombre_campo BETWEEN valor1 AND valor2;
```
