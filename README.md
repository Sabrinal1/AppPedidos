# 🧾 Sistema de Gestión de Pedidos – Cadena de Comida Rápida 🍔🥤

Este proyecto fue desarrollado como parte de un **parcial de la materia Taller de Programación 1** (carrera **Analista en Sistemas – Instituto ORT**).  
El objetivo es implementar un **sistema de gestión de pedidos** para una cadena de comida rápida, aplicando conceptos de **Programación Orientada a Objetos**: herencia, interfaces, composición y encapsulamiento.

---

## 📋 Enunciado

Una empresa necesita un sistema que permita gestionar **pedidos** compuestos por ítems de tipo **Comida**, **Bebida** y **Combo**, con las siguientes capacidades:

* Calcular **precio** y **peso** de cada ítem.  
* Aplicar **descuentos** en los combos.  
* Registrar la **cantidad** de cada ítem sin duplicarlos.  
* Mostrar detalles mediante un método `mostrar()`.  
* Evaluar un **pedido completo** y calcular su precio total considerando una **forma de envío**.

---

## 🚚 Formas de envío implementadas

| Tipo                         | Regla de cálculo |
|------------------------------|------------------|
| **Envío Normal**            | `$150` por km |
| **Envío Privado**           | `$300` por km si el peso ≤ 100 kg, `$750` por km si el peso > 100 kg |
| **Envío Privado Express**   | Doble del costo del Envío Privado |

---

## 🔧 Funcionalidades principales

* Agregar y quitar ítems con control de cantidades.  
* Manejo de ítems duplicados y prevención de ítems nulos.  
* Asignación de **ID único** a cada ítem.  
* Cálculo del **precio total** del pedido, con y sin envío.  
* Salida por consola con mensajes descriptivos (según el enunciado).

---

## 💻 Tecnologías y herramientas

* **Lenguaje:** Java  
* **IDE recomendado:** Eclipse (también funciona en IntelliJ IDEA)  
* **Paradigma:** Programación Orientada a Objetos  

---

## 🧪 Tests

El archivo `Test.java` contiene casos de prueba que validan toda la lógica del sistema.  
Basta con **ejecutarlo** desde el IDE para ver el programa en funcionamiento, sin necesidad de ingresar datos manualmente.

---

## ⚙️ Cómo probar el proyecto

1. **Descargar el proyecto**  
   [Descargar ZIP (rama master)](https://github.com/Sabrinal1/AppPedidos/archive/refs/heads/master.zip)

2. **Importar en Eclipse**  
   * `File ▸ Import ▸ Existing Projects into Workspace`  
   * Seleccionar la carpeta descomprimida.

3. **Ejecutar los tests**  
   * Desde el `Package Explorer`, ubicá `src/Test.java`.  
   * Hacé clic derecho ► **Run As ▸ Java Application**.

---

## 📬 Contacto

Desarrollado por **Sabrina Lax**  
[LinkedIn](https://www.linkedin.com/in/sabrinalax/)
