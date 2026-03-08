# # 💱 Conversor de Monedas en Java

## 👩‍💻 Autor

**Dayanna Ramirez**
Ingeniera en Software

---

## 📌 Descripción del proyecto

Este proyecto consiste en el desarrollo de un **Conversor de Monedas en Java** que consume datos en tiempo real desde una API de tasas de cambio.

El programa permite convertir valores entre diferentes monedas utilizando información actualizada obtenida mediante solicitudes HTTP.

Este reto fue desarrollado como parte de un desafío de programación enfocado en:

* Consumo de APIs
* Manipulación de datos JSON
* Manejo de errores
* Programación orientada a objetos en Java

---

## 🚀 Funcionalidades

El sistema permite realizar las siguientes conversiones:

* USD → ARS
* ARS → USD
* USD → BRL
* BRL → USD
* USD → COP
* COP → USD

El usuario interactúa mediante un menú en consola donde puede seleccionar la conversión deseada e ingresar el valor a convertir.

---

## 🧩 Tecnologías utilizadas

Este proyecto fue desarrollado utilizando las siguientes tecnologías:

* **Java 21**
* **Maven** (gestión de dependencias)
* **Gson** para procesamiento de JSON
* **HTTP Client de Java** para consumir APIs
* **API de Exchange Rate** para obtener tasas de cambio en tiempo real

---

## 🌐 API utilizada

Las tasas de cambio se obtienen desde:

ExchangeRate API

Esta API proporciona información actualizada sobre conversiones entre distintas monedas a nivel mundial.

---

## ⚙️ Cómo ejecutar el proyecto

1. Clonar el repositorio:

```
git clone https://github.com/tuusuario/conversor-monedas-java.git
```

2. Abrir el proyecto en NetBeans o IntelliJ.

3. Configurar tu API Key en la clase:

```
ConsultaAPI.java
```

4. Ejecutar la clase principal.

---

## 🖥️ Ejemplo de ejecución

```
Sea bienvenido/a al Conversor de Moneda

1) Dólar ==> Peso argentino
2) Peso argentino ==> Dólar
3) Dólar ==> Real brasileño
4) Real brasileño ==> Dólar
5) Dólar ==> Peso colombiano
6) Peso colombiano ==> Dólar
7) Salir
```

---

## 📚 Aprendizajes del proyecto

Durante el desarrollo de este proyecto se aplicaron conceptos importantes como:

* Consumo de servicios REST
* Procesamiento de respuestas JSON
* Uso de dependencias con Maven
* Organización de código en múltiples clases
* Manejo de excepciones en Java

---

## 📌 Estado del proyecto

Proyecto finalizado y funcional.
