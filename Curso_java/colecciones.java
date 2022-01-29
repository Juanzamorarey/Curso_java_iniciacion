public class colecciones {
    
}
/*Las colecciones  se diferencian de los arrays en que su tamaño no es fijo.
En el código java se trata de una interfaz 

List se utiliza para almacenar colecciones de objetos.

No se pueden tener colecciones de datos primitivos. Es decir no podríamos tener una colección de int pero sí de Integer. Los colections solo fncioanan con objetos y prvienen del paquete utils.
Estas colecciones están ordenadas y pueden tener elementos repetidos. 

En el set() es lo contarrio. No tienene que star ordenados y los elementos no pueden repetirse.

Los métodos más conocidos y utilizados son: 

add(object)--> Añade un objeto al final de una lista

add(int indice, object) --> Añade un objeto en el índice indicado de la lista.

get(int indice) --> devuelve el objeto de la posición idnicada

remove(int indice) --> elimina el objeto de la lista pasado por el parámetro

clear() --> elimina todos los elementos de la lista

indexOf(object o) --> devuelve la posición de la primera vez que un elemento coincida con el objeto pasado por parámetro. Si no se encuentra devuelve -1.

lastindexof (object o) --> devuelve la última vez que un objeto de la lista coincide con el parámetro pasado. Es similar a index of pero funciona
recorriendo la lista al revés

size() --> devuelve el número de elementos dentro de la lista

contains(object) --> devuelve verdadero si en la lista aparece el pobjeto pasado por parámetro. Utiliza intínsecamente el método equals. 

Así vamos a centrarnos en ArrayLists:

    ArrayList<String> andriods = new ArrayList<String>();
    Recordemos que siempre se pueden añadir elementos a este arrayList y que entre <> irá siempre el nombre de una clase. 

y en Vector:

    la diferencia es que usa hilos y estos están sincronizados. 
*/