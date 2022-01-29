public class NamingJava {
    public static void main(String[] args){
    int variable = 2;
    System.out.println(variable);

    int VALOR_MAXIMO = 1;
    System.out.println(VALOR_MAXIMO);
    // Las variables constantes se escriben con Mayúsculas. Si este valor no se usa dará error. 

    // En Java a veces tenemos que cambiar los tipos de datos. Esto en Java se llama Cast, lo podemos hacer con tipos de datos primitivos y tipos de objetos primitivos.
    
    // El casteo tiene unas reglas específicas de tal modo que puede haber conversión automátic (->) y conversiones que requieren casteo (<_)
    // byte -> short -> int -> long -> float -> double | byte <_ short <_ int <_ long <_ float <_ double
    // byte <_ char / char <_ byte | short <_ char / char <_ short | char -> int 7 int <_ char.
    // Se puede aplicar esto en terminos de memoria utilizada. 
    byte b = 6;
    System.out.println(b);
    short s = b;
    System.out.println(s);
        // Este caso no requiere casteo porque pasamos de byte a short, si hacemos el contrario sí sería necesario. 
    b = (byte) s;

    int i = 1;
    double d = 2.5;
    i = (int) d;
    System.out.println(i);
    // Si nos fijamos en este último print veremos que está truncando el dato, puesto que un int no tiene decimales, de este modo cogerá todos los dígitos previos a la coma. 

    int codigo = 97;
    char codigoASCII = (char) codigo;
    System.out.println(codigoASCII);
    // En este ejemplo vemos que para 97 imprime, cuando lo casteamos a char, la letra a que es la que le corresponde en el codigo ASCII.

    // Si intentaramos castear un número en un tipo de variable en la que no cabe veríamos que se imprime como el exceso de , por ejemplo:
    short probador = 250;
    byte probador_reducido = (byte) probador;
    System.out.println(probador_reducido);

    }
}
// Java toma en cuenta las mayúsculas y minúsculas. Podemos nombrar las variables con "-" antes o con "$" o una letra. Nunca puede comenzar una variable con un número.
// La convención de nomrbes tiene el Upeer camel case y lower camel case. El nombre de la clase siempre tiene mayúscula al inicio de cada palabra siempre, al igual que los archivos.
// Si trabajamos con objetos, variables y métodos usaremos las minúsculas. 


