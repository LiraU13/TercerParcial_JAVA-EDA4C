<!-- 
- COUNTING SORT -

** Acerca de **
El Counting Sort es un algoritmo de ordenamiento que se utiliza para ordenar una lista de elementos (números) de tipo int (enteros). Así funciona el Counting Sort:

1. Crear un arreglo.
    Lo primero que hace el Counting Sort es crear un arreglo de conteo que almacena la frecuencia de cada elemento en la lista original. La longitud de este arreglo se determina según el rango de valores presentes en la lista original.

2. Contar elementos.
    Recorre la lista original y, para cada elemento, incrementa el valor correspondiente en el arreglo de conteo. Esto se hace para contar cuántas veces aparece cada elemento en la lista original.

3. Calcular posiciones.
    El algoritmo calcula las posiciones finales de los elementos ordenados. Esto se hace sumando el valor del elemento actual en el arreglo de conteo con el valor anterior. El resultado es la posición final de ese elemento en la lista ordenada.

4. Lista ordenada.
    Se crea un nuevo arreglo (lista de salida) del mismo tamaño que la lista original. Se recorre la lista original nuevamente, y para cada elemento, se encuentra su posición final en el arreglo de conteo y se coloca en la posición correspondiente del nuevo arreglo.

¬ Su complejidad.
    El Counting Sort es eficiente cuando el rango de valores de la lista es pequeño en comparación con el tamaño de la lista. Su complejidad temporal es lineal; 
        O(n + k)
        Donde: 
            'n' es el número de elementos en la lista.
            'k' es el rango de valores.

¬ Sus limitaciones.
    Aunque el Counting Sort es eficiente en ciertas condiciones, no es adecuado para listas con un rango de valores muy grande o elementos no enteros.

** Versiones y notas **
V1. 
    En mi primer versión, cree el código para el algoritmo Counting Sort unicamente solicitando dos valores:
        1. La cantidad del arreglo.
        2. Los valores de cada elemento del arreglo.
    Para esta versión se muestra como resultado los datos del arreglo ordenado por Counting Sort.

-->