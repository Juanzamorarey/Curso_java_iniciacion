public class controldeflujo {
    public static void main(String[] args){
        // Vamos a empezar a utilizar los controladores de flujo 
        // Esta es la sintaxis para llevar a cabo, por ejemplo, el if:
        /*if (condicion){
            instrucciones
        } else{
            instrucciones
        }
            */ 

        //Vamos a reutilizar las variables anteriores
        int q =8;
        int p = 5;

        if(q > p){
            //true
            System.out.println("q es mayor que p");
        } else{
            //false
            System.out.println("p es mayor que q");
        }
        //Dentro del else se pueden anidar if de modo que nos queden cosas similares a esta:

        if(q > p){
            //true
            System.out.println("q es mayor que p");
            //Si esto no se cumple introducimos una nueva posibilidad: si q es igual a p...
        } else if(q == p){
            //false
            System.out.println("p es igual a q");
            //Si esto tampoco se cumpliera no hace falta introducir condición porque es el caso de descarte y ejecutamos lo siguietne
        } else {
            System.out.println("No es igual y tampoco mayor");
        }

        //Tenemos también la sentencia switch que es básicamente un if pero con varios caminos a recorrer. La sintaxis es:
        // switch(a){
        //     case valor1:
        //         break;
        //     case valor2:
        //         break;
        //     case valor3:
        //         break;
        //     default:
        //         break;
        // }

        int mes = 15;
        switch(mes){
            case 1:
            System.out.println("Enero");
            break;
            case 2:
            System.out.println("Febrero");
            break;
            case 3:
            System.out.println("Marzo");
            break;
            case 4:
            System.out.println("Abril");
            break;
            case 5:
            System.out.println("Mayo");
            break;
            case 6:
            System.out.println("Junio");
            break;
            case 7:
            System.out.println("Julio");
            break;
            case 8:
            System.out.println("Agosto");
            break;
            case 9:
            System.out.println("Septimebre");
            break;
            case 10:
            System.out.println("Octubre");
            break;
            case 11:
            System.out.println("Noviembre");
            break;
            case 12:
            System.out.println("Diciembre");
            break;
            default:
            System.out.println("Eso no es un mes subnormal");
            break;
        }

        // El switch se recorre y comprueba en case si el valor se corresponde con mes, en caso de ser afirmativo ejecuta el código que hay a continuación. En caso de que ninguno se corresponda acabará en default y ejecutará ahí

        //Veamos ahora los bucles for, for each y while

        //While:

        // while (condicion){
        //     //instrucciones
        // }

        int e = 1;
        while (e <= 5){
            System.out.println("e va a aparecer 5 veses wey");
            e++;
        }
        //do while

        //do{
        //     //instrucciones
        // } while (condición);
        // OJO: las instrucciones se ejecutan minimo 1 vez

        //for (inicialización; condición, incremento{
            //instrucciones
        // })

        int [] numeros = new int[5];
        // recuerda que el número final es el length de la lista

        for (int c = 0; c < 5; c++){
            numeros[c] = c;
            System.out.println("numeros ["+c+"]: " + numeros[c]);
        }

        //Una forma mas sencilla y eficiente de iterar arrays es el foreach
        // for (TipoDato elemento: coleccion){
            //instrucciones
        // }

        for(int j:numeros){
            System.out.println(j);
        }

        //En el bucle for each j toma el valor del elemento en vez de tener que pensar también en la posición como ocurría con el for normal. Pero debemos recordar que con for each no tenemos acceso al índice, mientras que con for normal sí.


























    }
}
