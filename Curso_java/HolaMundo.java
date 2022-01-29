// Lo primero en Java es crear una clase para ello usamos lo siguiente. Es importante que el nombre de la clase sea el mismo que el nombre del archivo

public class HolaMundo {
// Una vez creada la clase creamos un metodo
    public static void main(String[] args){
        System.out.println("Hola mundo :)");
    }
}

// después de cada línea de código hay que escribir ;
// Fases de la programación:
    // 1o generamos archivos cone xtensión .java
    // 2o compilamos nuestro archivo (comando javac). Este comando verificará el debug del código entonces genera un archivo de bytecode el cual es leído por la máquina de java.
    // Cuando hacemos el paso 2 se genera un archivo del mismo nombre con la extensión .class
    // 3o para leer el archivo de bytecode ejecutamos el comando java y este es leído por la máquina virtual. 

    // Java es compilado e interpretado. 
    
    // Ahora vamos a hablar sobre el metodo main:
    // En java dentro de cada clase definimos métodos. El método main es el punto de entrada de una aplicación Java. Si no existe el metodo main el programa directamente no funciona
    // Todo lo que queremos que esté en nuestro programa debe estar definido en el método main. 
    // Cuando el programa compila detecta el método main y mira los argumentos que tiene. Si en la consola yo escribiera

        // java HolaMundo hola

    // Este último hola sería el argumento del metodo main. Hay una forma más sencilla de hacer un "hola mundo" en java, utilizar un IDE o entorno de desarrollo. Para 
    // este entorno usamos VS de tal modo que el compilador, la terminal y el explorador estén jutos en una sola aplicación. En estos entornos existe una carpeta denominada src en la que
    // podemos definir un package, que no es otra cosa que un sistema de carpetas. En VS esto no hace falta puesto que funciona directamente.