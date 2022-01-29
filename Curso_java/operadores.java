   // Recordar que tenemos una clase principal dentro de la cual van otras clases con métodos
   public class operadores {
        public static void main(String[] args){
        // tenemos diferentes operadores:
        // + -> suma o concatenación
        // - -> resta
        // * -> multiplicación
        // / -> división
        // % -> módulo

        int a = 1;
        int aa = a+a;
        System.out.println("El valor de sumar a con a es:" + aa);

        double x = 2.56;
        int y = 9;

        float sumasion = (float)x + y;
        //para que funcione deberíamos hacer un casteo de x. Esto es sumamente importante de cara a poder realizar sumas entre diferentes tipos de datos. 
        System.out.println(sumasion);
        // dentro de otros metodos podemos realizar también operaciones, por ejemplo multiplicar sumasion por 2 al mismo tiempo que lo impirimimos.
        System.out.println(sumasion*2);  

        // Además de los operadores aritméticos tenemos los operadores de asignación. Estos operadores se utilizan especialmente en bucles
        // += -> suma o concatenación
        // -= -> resta
        // *= -> multiplicación
        // /= -> división
        // %= -> módulo
        // Veamos algún ejemplo:

        int f = 2;
        int g = 3;
        f = f + g;
        //System.out.println(f); 

        // una forma equivalente a esto que hemos hecho es con un operador en asignación. Estas dos cosas son completamente equivalentes. podríamos poner cualquier de los operadores
        // de asignación.
        f += g;
        //System.out.println(f); 

        // Respecto a los operadores incrementales tenemos dos.
        // ++ -> operador inceremental
        // -- -> operador decremental
        // == -> igual
        // != -> diferente de
        // Estos operadores se pueden escribir delante o detrás de la "i" es decir ++i o i++

        int l = 3;
        l++;
        ++l;
        System.out.println(l);

        // Con el prefijo la pirmera operación que hace es incrementar el valor y la segunda operación que hace es asignar el valor a la variable o sea ++l es lo mismo que:
        // l + 1
        // asigno valor a l
        // En cambio si lo usamos con el prefijo primero se asigna el valor y después se añade 1.
        // asigno valor a l
        // le sumo 1
        // La diferencia fundamental va a ser que con ++l va a impirmir 4, en cambio con l++ va a imprimir 3 porque pirmero asigna el valor y después lo suma. 

        // Con los operadores de equidad o diferencia obtendremos valores booleanos del tipo "True" o "False";

        // Operadores realcionales:
        // < -> menor que
        // > -> mayor que
        // <= -> menor o igual 
        // >= -> mayor o igual

        // Estos valores también devolverán valores booleanos.

        int z = 4;
        int o = 3;
        System.out.println("z > o -> " + (4>o));
        System.out.println("z < o -> " + (4<o));
        System.out.println("z >= o -> " + (4>=o));
        System.out.println("z <= o -> " + (4<=o));

        // Si ejecutamos un mayor o menor con dos numeros con el mismo valor dará false

        //Otros operadores interesantes son los llamados lógicos:
        // && -> AND a && b. Todas las combinaciones de esto serán falsos excepto cuando a y b sean verdaderos
        // || -> OR a || b Todas las combinaciones serán verdaderas escepto cuando ambos son falsos en cuyo caso serán falsos
        // ! -> NOT !a

        boolean n = false;
        boolean m = true;
        // Si a es false y b es true
        System.out.println("a && b -> " + (n && m));
        System.out.println("a || b -> " + (n || m));
        System.out.println("!a -> " + (!n));
        System.out.println("!b -> " + (!m));

    }
}