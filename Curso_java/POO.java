public class POO {
    public static void main(String[] args){

    // Pra hablar de objetos y clases utilizaremos de ejemplo un coche:
    // Un coche sería un objeto con unos atributos y operaciones propios 
    /*
    OBJETO AUTO
    ATRIBUTOS
    Color: verde
    Tamaño: grande
    Estado: bueno
    OPERACIONES
    Arrancar
    Acelerar
    Frenar
    
    Por su parte una clase sería el molde que crea los cohces de modo que contará con los atributosd
    pero dentro de cada atributo el valor de los mismos quedará vacío porque sirve para crear objetos. 
    
    CLASE AUTO
    ATRIBUTOS
    Color:
    Tamaño:
    Estado:

    Para declarar una clase en java crearemos la clase con public class NombreDeLaClase{
        atributos (serán variables con su tipo)
        comportamientos (serán métodos/ funciones)
    }
    */

    /*METODOS
    Los metodos son las operaciones que pueden realizar los objetos. Veamos un ejemplo:

    public int suma (int a, int b){
        return a+b;
    }
    
    Este método será de acceso publico (public) devolverá un entero (int) y se llamará suma estará dentro de un objeto por ejemplo y lo que hará será, tomando dos argumentos (a y b)(los argumentos siempre deben estar separados por comas o tener
    el paréntesis vacío) retornar la suma del valor de ambos. Si no se devuleve nada pondremos void y podemos ahorrarnos return. No se pueden anidar métodos dentro de métodos.
    Por convenio se utilizan camel lower case en los métodos

    DECLARAR OBJETOS

    nombre_objeto = new nombre_clase();
    miCoche = new Coche();

    El metodo constructor viene definido por default en java. Usa 0 o más argumentos y nunca regresará un valor.

    Los métodos static se pueden usar en toda la clase y, al mismo tiempo, en otras clases. Con estos métodos no hace falta crear un objeto para tener acceso a los métodos, ejemplo:

    Math.random();

    Los métodos static ayudan a ahorrar memoria porque no hace falta cargar el objeto o la variable.

    A veces necesitamos que haya metodos con el mismo nombre pero diferentes argumentos. Por ejemplo la suma de una calculadora que suma enteros, floatantes y enteros con flotantes. Eso son parametros diferentes para un
    mismo método. Esto se llama sobrecarga y se puede dar también en metodos constructores. 

    Para tener acceso a los valores de las variables dentro de los objetos vamos a usar los getters y los setters

    El getter nos permitirá obtener los datos de una variable mientras que el metodo setter nos permitirá asignar o cambiar el valor de una variable. 

    HERENCIA:

    La idea de la herencia es la transmisión de ciertos atributos de unas clases padres a unas clases hijos.

    En nuestro proyecto hemos visto que los atributos id, title, genre, creator, duration, year y viewed son comunes a las clases movies, chapter y serie. Para agruparlos vamos a unir movie y serie a Film y chapter a movie ya que heredará 
    todos los atributos de esta clase. Esta separación obedece a que Movie y Serie tienen toda una serie de atributos comunes pero el atributo "genre" no está presente en Chapter. Es por esto que es más fácil hacerlo de la siguiente manera
    para la herencia:

    FILM > Movie, Serie > Chapter 

    Chapter heredará de esta clase hijo y añadirá sus propios atributos. Siendo así

    FILM<--------Movie<--------Chapter
    ^
    |
    |
    |------------Serie


    En book y magazine por su parte es 

    Book------------>PUBLICATION<---------------Magazine

    Para usar la herencia en el código java son Super y extends así veremos el código de esta manera:

    public class Film{

    }

    public class Movie extends Film {

    }

    Como vemos el extends es la clase hijo y cada vez que veamos la palabra "super" estaremos refiriéndonos a la clase padre. Se heredan los elmentos con modificadopres de acceso public o protected. Entonces super se referirá a
    la clase padre y "this" se referirá a la clase en la que nos encontramos, es decir la clase hija. El this y super son utilizados para las variables.

    INTERFACES

    Es un tipo de referencia similar a una clase que podría contener solo constantes, definiciones de métodos y métodos con modificador de acceso default. No se implementan bloques de código dentro de las interfaces.
    La ventaja de las interfaces es que nos permiten reutilizar métodos de clases pertenecientes a diferentes familias. Por ejemplo Film y Publication. algo important de remarcar es que los metodos que demos, medinate la interfaz, a una clase
    se heredarán a sus clases hijo, esto queire decir que, en nuestro ejemplo, no es necesario que implementemos los métodos de la interfaz VISUALIZABLE a Chapter, puesto que Chapter los heredará de Movie. En el código se ve de la siguiente manera

    public interface IVisualizable{

        Date startToSee(Date dateI);
        void stopToSee(Date dateI, Date dateF);
    }

    public class Movie extends Film
    implements IVisualizable{

    }

    Las interfaces suelen nombrarse previamente con la letra I de modo que IVisualizable. Para crearlas se aplican como un archivo .java más pero en vez de public class pondremos public interface. Esta es la única forma en la que podemos comparar objetos
    */
    }
}
