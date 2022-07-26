# Caso-Simulado-Calidad-Software
## Se realizaron 4 test unitarios (1 por estudiante) para probar una parte en específico del código.
## La ruta para su revisión es: src/test/java/Proyecto/Services ahí se encuentran los test que realizó cada estudiante.


# Instalación del framework "Mockito"

## 1. Nos vamos a esta página de internet:
## ➢ https://mvnrepository.com/artifact/org.mockito/mockito-core

## 2. En dicha página se encuentran las dependencias de Maven, de manera actualizada.

## 3. Escogemos la versión que necesitemos y ponemos en nuestro pom.xml del proyecto la siguiente dependencia:

<!--
https://mvnrepository.com/artifact/org.mocki
to/mockito-core -->
<dependency>
<groupId>org.mockito</groupId>
<artifactId>mockito-core</artifactId>
<version>4.6.1</version>
<scope>test</scope>
</dependency>

## 4. Al hacer esto ya el proyecto está listo para realizar las pruebas unitarias y los mocks utilizando Mockito.
