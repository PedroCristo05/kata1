# Kata 1 - Familiarización con IntelliJ IDEA y flujo de trabajo

El objetivo de esta kata es asimilar el uso del entorno de desarrollo IntelliJ IDEA, practicar el flujo de trabajo en Git/GitHub con la política estricta de cero binarios, y aplicar diseño orientado a objetos e inmutabilidad en un dominio básico.

---

## Enlace al vídeo explicativo

* **Vídeo:** https://youtu.be/niPBSPN9xRM

---

## Entorno y Requisitos

* **Lenguaje:** Java 26
* **Gestor de dependencias y construcción:** Maven
* **Entorno de desarrollo:** IntelliJ IDEA
* **Control de versiones:** Git & GitHub

---

## Estructura del Proyecto

El código fuente se encuentra organizado bajo el paquete base `software.ulpgc.katas`:

* **`Person` (`record`):** Entidad de dominio inmutable que representa a una persona con atributos `name` (`String`) y `birthDate` (`LocalDate`). Incluye el método derivado `calculateAge()` (o `getAge()`) que calcula los años transcurridos a partir de una constante de días por año (`DAYS_PER_YEAR`).
* **`Main`:** Punto de entrada que orquesta la ejecución del programa instanciando objetos del dominio e imprimiendo los resultados por consola.
* **`.gitignore`:** Configuración estricta que excluye artefactos de compilación, archivos de metadatos de IDEs para garantizar un repositorio libre de binarios.

---

## Shortcuts de IntelliJ IDEA Utilizados

Durante el desarrollo y en la demostración en vídeo se emplearon los siguientes atajos de teclado para reducir fricción en el IDE:

* `Alt + Insert`: Generación de clases, paquetes, constructores y métodos.
* `Ctrl + Alt + C`: Extracción de valores literales a constantes estáticas (`DAYS_PER_YEAR`).
* `Shift + F6`: Refactorización automática de nombres (renombrado seguro de métodos y clases propagado en todo el proyecto).
* `Ctrl + F8`: Inserción y eliminación de puntos de ruptura (breakpoints).
* `Shift + F9`: Ejecución del programa en modo depuración (Debug).
* `Shift + F10` / `Ctrl + Shift + F10`: Compilación y ejecución de la clase principal.
* `Ctrl + K` / `Ctrl + Enter`: Apertura del panel de Git y confirmación de commit.
* `Ctrl + Shift + K`: Envío de cambios al repositorio remoto (Push).

---

## Repetición Deliberada y Flujo Git

Para cumplir el requisito de repetición deliberada, el ejercicio se reconstruyó en tres sesiones independientes para automatizar los atajos y el flujo de Git:

1. **`develop` (Repetición 1):** Creación del proyecto base, configuración del `.gitignore`, implementación de `Person` como clase convencional con atributos privados, cálculo derivado con constante y clase `Main`.
2. **`develop2` (Repetición 2):** Reconstrucción del microproyecto desde el commit inicial para ganar soltura en la navegación, generación de código con atajos y depuración.
3. **`develop3` (Repetición 3 / Grabación):** Implementación final refactorizada, conversión de la clase de dominio `Person` a un `record` de Java para garantizar inmutabilidad sin código redundante, e integración final.

### Integración en la rama principal:
El trabajo se realizó en ramas de desarrollo e integró finalmente en `master`
