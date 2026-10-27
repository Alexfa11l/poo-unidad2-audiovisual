# Proyecto: Ampliación de Contenidos Audiovisuales (POO - Unidad 2)

Proyecto desarrollado para la asignatura de **Programación Orientada a Objetos** de la **Universidad Politécnica Salesiana (UPS)**. Su objetivo es aplicar conceptos avanzados de POO como herencia, asociación, agregación y composición mediante la expansión de un sistema de gestión de contenidos audiovisuales en Java.

---

## 🚀 Descripción y Propósito del Proyecto
El sistema gestiona de forma polimórfica una lista de contenidos audiovisuales, permitiendo registrar, estructurar y mostrar detalles detallados de diferentes medios (películas, series, documentales, audiolibros y podcasts) junto con sus entidades asociadas.

---

## 🏗️ Clases y Funcionalidades Nuevas Añadidas

1. **Clases Base Originales (Etapa 1):**
   * `ContenidoAudiovisual` (Clase abstracta principal).
   * `Pelicula`, `SerieDeTV`, `Documental`.

2. **Entidades con Relaciones (Etapa 2):**
   * **`Actor`**: Relacionada con `Pelicula` mediante agregación.
   * **Temporada**: Relacionada con `SerieDeTV` mediante composición.
   * **Investigador**: Relacionada con `Documental` mediante asociación.

3. **Subclases por Iniciativa Propia (Etapa 4):**
   * **`Audiolibro`**: Hereda de `ContenidoAudiovisual` e implementa atributos propios como narrador y duración en páginas/minutos.
   * **`Podcast`**: Hereda de `ContenidoAudiovisual` incorporando atributos de host y número de episodio.

4. **Sistema Funcional y Polimorfismo:**
   * La clase `PruebaAudioVisual` centraliza la ejecución, instanciando un arreglo polimórfico de elementos y ejecutando la sobrescritura del método `mostrarDetalles()`.

---

## 🛠️ Instrucciones de Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Alexfa11l/poo-unidad2-audiovisual.git](https://github.com/Alexfa11l/poo-unidad2-audiovisual.git)
