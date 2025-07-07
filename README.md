<details>
# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---
</details>

# Estructuras No Lineales – Ejercicios Árboles  
📌 *Información General*  
- *Título:* Ejercicios de Árboles Binarios  
- *Tema:* Estructuras No Lineales  
- *Objetivo:* Implementar operaciones sobre árboles binarios  
- *Desarrolladores:* Pedro Panjón
- *Fecha:* 06/07/2025

🛠 *Descripción*  
Este proyecto implementa diferentes operaciones sobre árboles binarios, utilizando estructuras y algoritmos fundamentales de las estructuras de datos no lineales.

📘 *Descripción de Ejercicios*  

### 🟩 Ejercicio 01 – Insertar en Árbol Binario de Búsqueda (BST)  
🔧 **Clase:** `BinarySearchTree`  
📌 **Descripción:**  
Este ejercicio implementa un árbol binario de búsqueda (BST) y permite insertar nodos respetando las reglas del BST:  
- Los valores menores al nodo van a la izquierda.  
- Los valores mayores van a la derecha.  

🧠 **Lógica usada:**  
Se utiliza recursión para encontrar la posición correcta donde insertar un nuevo nodo, comparando su valor con el nodo actual.

📥 **Entrada:** Número entero a insertar.  
📤 **Salida:** Árbol binario actualizado.

---

### 🟩 Ejercicio 02 – Invertir un Árbol Binario  
🔧 **Clase:** `InvertBinaryTree`  
📌 **Descripción:**  
Invierte un árbol binario transformándolo en su imagen en espejo, intercambiando los hijos izquierdo y derecho de cada nodo.

🧠 **Lógica usada:**  
Se utiliza una función recursiva que:  
- Guarda el hijo izquierdo en una variable temporal.  
- Llama recursivamente al hijo derecho y lo asigna al hijo izquierdo.  
- Asigna el temporal (original izquierdo) como hijo derecho.  

📥 **Entrada:** Raíz del árbol binario.  
📤 **Salida:** Árbol binario invertido.

---

### 🟩 Ejercicio 03 – Listar Niveles del Árbol (BFS)  
🔧 **Clase:** `ListLevels`  
📌 **Descripción:**  
Este ejercicio recorre un árbol binario por niveles (BFS – Breadth First Search) y agrupa los valores de cada nivel en una lista enlazada.

🧠 **Lógica usada:**  
- Se usa una cola (`Queue`) para mantener el orden del recorrido.  
- En cada iteración se recorre un nivel completo y se guarda en una `LinkedList`.  
- Cada nivel se agrega a una lista principal de niveles.  

📥 **Entrada:** Árbol binario.  
📤 **Salida:** Lista de niveles con los valores de cada nodo.

---

### 🟩 Ejercicio 04 – Calcular Profundidad Máxima  
🔧 **Clase:** `Depth`  
📌 **Descripción:**  
Calcula la profundidad máxima de un árbol binario, es decir, cuántos niveles tiene el árbol desde la raíz hasta la hoja más profunda.

🧠 **Lógica usada:**  
Función recursiva que:  
- Retorna 0 si el nodo es nulo.  
- Calcula la profundidad del subárbol izquierdo y derecho.  
- Retorna el máximo de ambas + 1 (nivel actual).  

📥 **Entrada:** Raíz del árbol binario.  
📤 **Salida:** Número entero representando la profundidad.

🧪 **Prueba:**  
El archivo `DepthTest` incluye una prueba automatizada con `JUnit` que verifica que la profundidad retornada es correcta en un árbol de ejemplo.

---




<details>
## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

</details>