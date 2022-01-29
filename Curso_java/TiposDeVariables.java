public class TiposDeVariables {
    // Una vez creada la clase creamos un metodo
        public static void main(String[] args){
            System.out.println("Hola mundo :)");
        }
    // Una variable es un espacio en memoria al que se le asigna un contenido. EN java hay varios tipos de datos:
        // - tipo primitivo:
            // -int -hasta 2 millones y poco más 8 bytes
            // -long -muchos millones 4 bytes
            // -short -32768 a 32,767 2 bytes
            // -byte -128 a 127 1byte

        // Es importante adaptar las cifras a la memoria que utiliza cada tipo de dato. 

        // - tipo objeto

        // Vamos a trabajar enteros
        byte edad = 127;
        // Si pusieramos 128 aquí daría un error puesto que solo admite hasta 127
        short year = 2020;
        // Ocurre lo mismo si el rango estuviera fuera del permitido daría error
        int id_user = 1001;
        // Este es un tipo de dato más comodín y que se suele utilizar aunque pierda memoria puesto que 4 bytes es en realidad algo insignificante en la ram para un ordenador moderno.
        long id_twitter = 124345643654L;
        // En los tipos de dato long, por no ser tan habituales, tienes que escribir L al final para que se reconozcan

        // Vamos a ver ahora numeros flotantes:
            // float (decimales no tan específicos) 4bytes
            // double permite muchísimos decimales (cuentas bancarias, datos financieros, datos matemáticos...) 8bytes

        float regueton = 34.25F;
        // Como vemos los float requieren una F (mayúscula o minúscula al final)
        double precio = 12312.5463423;
        // Como se ve no es necesario escribir ninguna letra al final. ç

        // Otro tipo de dato son los datos de texto 
        char genero = 'F';
        // Se trata de un dato unicode, por lo que solo puede tener un caracter y IMPORTANTE comillas simples ''

        // Datos lógicos: el más habitual es el boolean, ocupa 2 bytes
        boolean isVisible = true;
        boolean isNotVisible = false;

        // Una de las buenas practicas de Java es manejar todo en inglés. 
        
    }
