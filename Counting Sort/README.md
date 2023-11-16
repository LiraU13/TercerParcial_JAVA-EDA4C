<!-- 
- COUNTING SORT -

**Acerca de**
El Counting Sort es un algoritmo de ordenamiento que se utiliza para ordenar una lista de elementos (números) de tipo int (enteros), funciona bien cuando hay un rango limitado de valores de entrada. Es particularmente eficiente cuando el rango de valores de entrada es pequeño en comparación con la cantidad de elementos a ordenar. La idea básica detrás de Counting Sort es contar la frecuencia de cada elemento distinto en la matriz de entrada y usar esa información para colocar los elementos en sus posiciones ordenadas correctas. 
Así funciona el Counting Sort:

https://docs.google.com/presentation/d/1FrKaqWZGY2NM6qxVQgimFwBTpb--97G2MPhcmQZL0P0/edit?usp=sharing

**Enlaces de referencia**
https://www.geeksforgeeks.org/counting-sort/
https://www.programiz.com/dsa/counting-sort
https://www.javatpoint.com/counting-sort

**Versiones y notas**
V1. 
    En mi primera versión, creé el código para el algoritmo Counting Sort únicamente solicitando dos valores:
        1. La cantidad del arreglo.
        2. Los valores de cada elemento del arreglo.
    Para esta versión se muestra como resultado los datos del arreglo ordenado por Counting Sort.

V2. 
    En mi segunda versión, moví la librería Files y utilicé el método archivoAint y arregloArchivo, modificando el código principal de Counting Sort para poder utilizar estos métodos. 
    Obtuvé fallos en esta versión, aunque los datos se ordenaban de acuerdo a lo esperado, faltaron algunos detalles dentro del código.

V3. 
    En mi tercera versión, creé un nuevo método en la librería files.java (leerEnteros). Esto fue hecho para lograr que mi código únicamente leyera datos de tipo int, omitiendo líneas de tipo String, Double o números negativos (del documento de texto seleccionado). Además, para mostrar una alerta y dar indicaciones sobre lo que hará el nuevo método durante el algoritmo.
    Logré que el código ejecutara correctamente el algoritmo Counting Sort, omitiendo líneas de tipos distintos a int. Sin embargo, experimenté un pequeño fallo: cuando se ejecuta y se coloca el nombre de un documento con tipos de datos que deben omitirse, la alerta que se envía para comunicar los datos incorrectos se duplica en la consola, lo cual es un error.

Derechos de autor © 2023 Moredia Lira Ulises. Todos los derechos reservados.
-->