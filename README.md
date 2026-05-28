# Selenium JUnit Automation Framework

Este proyecto es un framework básico de automatización de pruebas UI utilizando Selenium WebDriver y JUnit 5.  
Se enfoca en la automatización de un flujo de login, validando escenarios positivos, negativos y de validación de formularios.

---

Tecnologías utilizadas

- Java 17
- Selenium WebDriver
- JUnit 5
- Maven

---

 Funcionalidades del proyecto

✔ Login exitoso  
✔ Login con usuario incorrecto  
✔ Validación de mensaje de error  
✔ Validación de login con campos vacíos  
✔ Logout  
✔ Uso de Page Object Model (POM)  
✔ Capturas de pantalla automáticas en ejecución de tests  

---

 Estructura del proyecto


src
└── test
└── java
├── base
├── pages
├── tests
└── utils


---

Cómo ejecutar el proyecto

1. Clonar el repositorio:


git clone https://github.com/franco4000/junit-selenium-automation.git
Importar el proyecto en IntelliJ IDEA como proyecto Maven
Ejecutar los tests desde:
src/test/java/tests/LoginTest3.java

Casos de prueba:
Login correcto
Usuario: student
Password: Password123
Resultado esperado: Login exitoso + validación de URL + botón logout visible
Login incorrecto
Usuario inválido
Password inválido
Resultado esperado: mensaje de error
Login vacío
Sin ingresar usuario ni password
Resultado esperado: mensaje de validación
 Evidencias:
El framework genera screenshots automáticos en la carpeta:
screenshots

git add README.md
git commit -m "add professional README"
git push
AUTOR :DIMITRI FRANCO 
MAIL : dimitrifraanco1@gmail.com
linkedin  : www.linkedin.com/in/franco-dimitri-8137419b


