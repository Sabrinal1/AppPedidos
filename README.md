# 🧾 Sistema de Gestión de Pedidos - Cadena de Comida Rápida 🍔🥤

Este proyecto fue desarrollado como parte de un parcial de la materia **Taller de Programación 1** de la carrera de Analista en Sistemas (Instituto ORT). El objetivo es implementar un sistema de gestión de pedidos para una cadena de comida rápida, incorporando conceptos de Programación Orientada a Objetos (POO) como herencia, interfaces, composición y encapsulamiento.

## 📋 Enunciado

Una empresa nos encargó el desarrollo de un sistema que permita gestionar pedidos compuestos por ítems como **Comidas**, **Bebidas** y **Combos**, con la posibilidad de:

- Calcular precio y peso de cada ítem.
- Aplicar descuentos en combos.
- Registrar cantidades de cada ítem sin duplicarlos.
- Mostrar detalles de cada ítem mediante un método `mostrar()`.
- Evaluar un pedido completo y calcular su precio total con una **forma de envío** asociada.

## 🚚 Formas de Envío

Cada pedido debe contar con una forma de envío que influye en el cálculo del costo total. Se implementaron tres tipos:

- **Envío Normal**: $150 por km.
- **Envío Privado**: $300 por km si el peso ≤ 100kg, $750 si el peso > 100kg.
- **Envío Privado Express**: el doble del Envío Privado.

## 🔧 Funcionalidades implementadas

- Agregar y quitar ítems con control de cantidades.
- Manejo de ítems duplicados.
- Evita agregar ítems nulos.
- Asignación de `id` único a cada ítem.
- Cálculo del precio total del pedido con y sin envío.
- Salida por consola con mensajes descriptivos (según se indica en el enunciado).

## 💻 Tecnologías y herramientas

- Lenguaje: **Java**
- IDE: **Eclipse**
- Paradigma: **Programación Orientada a Objetos**

## 🧪 Tests

El archivo `Test.java` incluye múltiples casos de prueba para verificar la funcionalidad del sistema.

