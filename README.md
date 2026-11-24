# Ejercicio: Composición y constructores

## 📌 Descripción

Este ejercicio consiste en desarrollar un proyecto llamado `EjercicioComposicion` para trabajar el concepto de **composición en Java** y el encadenamiento de constructores mediante `this()`.

Se crea una clase `Ordenador` que contiene un objeto `Procesador`, demostrando que un ordenador tiene un procesador, pero no hereda de él.

## ⚙️ Funcionamiento

Se crean tres clases:

- **Procesador:** contiene el atributo privado `nucleos`, que debe ser mayor que 0. Si no se cumple, lanza una excepción `IllegalArgumentException`.
- **Ordenador:** contiene los atributos `marca`, `modelo` y `procesador`. Tiene tres constructores:
  - `Ordenador(String marca, String modelo, int nucleos)`: crea el procesador.
  - `Ordenador(String marca, String modelo)`: utiliza `this()` y establece 4 núcleos por defecto.
  - `Ordenador()`: utiliza `this()` con la marca y el modelo "Desconocido".
- **Monitor:** contiene el atributo de pulgadas y únicamente tiene un constructor `Monitor(int pulgadas)`.

El método `toString()` de `Ordenador` muestra la marca, el modelo y el número de núcleos del procesador.

## 🧪 Clase de prueba: Main

Se realizan las siguientes pruebas:

1. Crear un ordenador utilizando el constructor con los tres parámetros.
2. Crear un ordenador utilizando el constructor de dos parámetros, comprobando que tiene 4 núcleos.
3. Crear un ordenador utilizando el constructor sin parámetros, comprobando que la marca y el modelo son "Desconocido".
4. Mostrar los tres ordenadores mediante `toString()`.
5. Intentar crear un objeto `Monitor` mediante `new Monitor()` y comprobar el error de compilación.

## ⚠️ Error de compilación: constructor por defecto

Se intenta ejecutar:

```java
new Monitor();
```

Esto produce un error de compilación porque la clase `Monitor` tiene definido un constructor que necesita un parámetro de tipo `int`.

Java solamente genera automáticamente un constructor sin parámetros cuando no se declara ningún constructor en la clase.

Por tanto, al definir `Monitor(int pulgadas)`, deja de existir el constructor por defecto.

La línea se elimina después de comprobar el error.

## 🔍 Composición y uso de this()

- **Composición:** un ordenador contiene un procesador como atributo, por lo que existe una relación de tipo "tiene un".
- **this():** permite llamar a otro constructor de la misma clase, evitando repetir código y facilitando la inicialización de los objetos.

## ✅ Conclusión

Con este ejercicio se aprende a utilizar la composición para relacionar objetos de diferentes clases sin necesidad de utilizar herencia.

También se practica el encadenamiento de constructores mediante `this()`, el uso de valores por defecto y el funcionamiento de los constructores en Java.
