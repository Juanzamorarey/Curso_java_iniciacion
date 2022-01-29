public class Arrays {
    public static void main(String[] args){
        System.out.println("Hola mundo :)");
        // Un array es una lista en la que podemos almacenar variables. En java siempre será un objeto. 
        // En java los arrays pueden tener varias dimensiones, pòr ejemplo:

        // 1    X 
        // 2    X 
        // 3    X 

        // Este tiene una dimensión. Almacenamos datos en una disposición 1-1

        // 1   X   X
        // 2   X   X
        // 3   X   X
        // Este tiene dos dimensiones. Almacenamos datos en una disposición 1- X

        // 1   X(a,b)   X
        // 2   X        X
        // 3   X        X
        // Este tiene tres dimensiones. Almacenamos datos en una diposición 1 -X en el que cada X almacena a su vez X - a,b,c,d...

        // Si subdividimos en el caso anterior a,b,c etc por mas subíndices podríamos llegar a un array con "n" dimensiones. Es infinitamente anidable. 
        // para declarar arreglos hay dos maneras:

        // TipoDato[] nombrevariable;
        // TipoDato nombrevariable[];

        // Es importante tener en cuenta que no podemos mezclar diferentes tipos de variables en una lista. Es decir, no podemos tener strings y enteros en una lista, ya que daría error. 
        // Debemkos para los arrays definir el tamaño y ponerle la palabra reservada "new":

        int[] arrayInt = new int[3];
        // En el caso superior tenemos un arreglo de 3 elementos dispuestos en 1 dimensión, es decir:
        // 1   X   X   X
        // Es una dimensión porque no hemos colocado nada en los corchetes del lado izquierdo. Si quisiéramos usar más dimensiones lo haríamos del siguiente modo:
        int [][] arrayBidimensional = new int[3][2];
        // Ahora el esquema ha cambiado, el pirmer corchete indica las filas y el segundo indica las columnas, tendría el siguiente formato:
        // 1   X   X
        // 2   X   X
        // 3   X   X
        // Vmos a hacer uno de tres dimensiones, la última será la altura:
        int [][][] arraytriDimensional = new int[3][3][2];
        // 1   X(a,b)   X(g,h)    X(m,n)
        // 2   X(c,d)   X(i,j)    X(ñ,o)
        // 3   X(e,f)   X(k,l)    X(p,q)
        // La capacidad es de 18 elementos.

        // Otra manera de crear estos arrays sería con {} dentro de {} de tal modo que las dimensiones se crean igual en la parte izquierda pero se hacen diferente en la derecha.
        // Por ejemplo:
        char[][] days = {{'M','T','W'},{'M','T','W'}};
        // Si quisiéramos crear más dimensiones deberíamos ir añadiendo más {}, siempre correspondientes el número de [] al número de {}
        char[][][] letters = {{{'a','b'},{'a','b'},{'a','b'}},{{'a','b'},{'a','b'},{'a','b'}}};

        // Vamos a probar ahora a ubicar los elementos dentro de las arrays. Para localizar elementos usamos índices. Por ejemplo:

        // 1   X   X
        // 2   $   X
        // 3   X   X

        // Si yo quisiera ubicar el "$" diría que está ubicada en la fila 2 columna 1

        // 1   X(a,b)   X(g,h)    X(m,n)
        // 2   X(c,d)   X($,j)    X(ñ,o)
        // 3   X(e,f)   X(k,l)    X(p,q)

        // En este caso diría que está en la fila 2 columna 2 interior 1. Podemos asignar valor o encontrar un valor:
        char[] names = new char[4];
        names[0] = 'h';
        names[1] = 'o';
        names[2] = 'l';
        names[3] = 'a';
        // CUIDADO: CON char USAR SOLAMENTE UN CARACTER, SI SE USAN MAS SERÁ UN STRING

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        // Para asignar un valor a uno de los espacios dentro del array lo hacmos de la siguiente manera:
        char[][][][] monkey = new char[2][3][2][2];
        // Creamos una array
        monkey[1][0][0][1] = 'm';
        // Establecemos el valor 'm' para la posición designada
        System.out.println(monkey[1][0][0][1]);

        int a = 1;
        int aa = a+a;
        System.out.println(aa);
    }
}
