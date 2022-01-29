package amazon_viewer;
//Aquí vamos a comenzar nuestro proyecto de amazon viewer
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

import aaaa.Report;

public class amazon_viewer {
    public static void main(String[] args){
        // Movie movie = new Movie("Coco", "Animation", (short)2017);
        //Si quisiera cambiar los valores podría hacerlo de esta manera directamente porque en los datos hemos puesto public. Existen diferentes niveles de acceso a esos datos. Miremos esta tabla
        /*Modificador   Clase   Package   Subclase    Otros
        public          X       X           X           X    
        protected       X       X           X
        default         X       X
        private         X
        
        Esta tabla muestra los modificadores para los niveles de acceso de los atributos dentro del programa. Si quisiéramos evitar que este atributo se modifique deberíamos poner un "private" previo al atributo
        de esa manera solamente será accesible desde la propia clase
        */
        // movie.title = "Rambo";
        // movie.showData();
        // Movie movie = new Movie();
        // // así instanciamos un objeto.
        // movie.title = "Coco";
        // movie.duration = 120;
        showMenu();
    }

    public static void showMenu() {
    //Aquí creamos un método que nos va a servir para mostrar el menu. ponemos void porque este método no debe devolver ningún valor, solo impirmir texto.
        int exit = 0;

        do{
            System.out.println("Bienvenidos a AMAZON VIEWER");
            System.err.println("");
            System.out.println("Seleccione el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report today");
            System.out.println("0. Exit");
    
            //leer la respuesta del usuario
            Scanner sc = new Scanner(System.in);
            //Aquí el usuario introduce su elección

            int usuario_introduce = Integer.valueOf(sc.nextLine());

            //     System.out.println("Esa opción no es válida, Introduce una opción válida del menú");

            // Aquí se lee la introducción del usuario
            //Aquí estamos haciendo un parseo del string que introducirá el usuario pasándolo a Integer.
            // Si el usuario introdujera una letra el programa arrojaría una excepción, de ahí el try catch. 
            switch(usuario_introduce){
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReportDate(new Date());
                break;
                case 0:
                    exit = 0;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Esa opción no es válida");
                    break;
            }
    
        }while(exit != 0);
    }

    static ArrayList<Movie> movies;
    //La sacamos como variable global para acceder a ella en el último método. 
    public static void showMovies(){
        int exit =1;
        movies = Movie.makeMoviesList();
        do {
            System.out.println();
            System.err.println("");
            System.out.println(" :: MOVIES :: ");
            System.out.println();

            for (int i = 0; i < movies.size(); i++){
                System.out.println(i+1+ ". " + movies.get(i).getTitle() + " Vista: " + movies.get(i).isViewed());
            }

            System.out.println("0. Regresar al menú");
            System.out.println();

            //Leer la respuesta de un usuario.
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0){
                showMenu();
            }
            if (response > 0){
                Movie movieSelected = movies.get(response -1);
                //Debido a que los índices empiezan en 0 cualquiera que sea la elección del usuario deberá restarsele 1.
                movieSelected.setViewed(true);
                // Marcamos la película como vista
                Date dateI = movieSelected.startToSee(new Date());
                //Señalamos la fecha en que se empezó a ver. 

                movieSelected.stopToSee(dateI, new Date());
                //Llamamos a este método que recordemos restará a la fecha final la fecha de inicio dandonos el tiempo de visualización. 
                System.out.println();
                System.out.println("Viste: " + movieSelected);
                System.out.println("Por: " + movieSelected.getTimeViewed() + " segundos");
            }

        }while(exit !=0);
    }

    public static void showSeries(){
        int exit =1;
        ArrayList<Serie> series = Serie.makeSeriesList();
        do {
            System.out.println();
            System.err.println("");
            System.out.println(" :: SERIES :: ");
            System.out.println();

            for (int i = 0; i < series.size(); i++){
                System.out.println(i+1 + ". " + series.get(i).getTitle() + " Vista: " + series.get(i).isViewed());
            }

            System.out.println("0. Regresar al menú");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0){
                showMenu();
            }

            showChapters(series.get(response-1).getChapters());


        }while(exit !=0);
    }

    public static void showChapters(ArrayList<Chapter> chapterOfSerieSelected){
        int exit =0;

        do {
            System.out.println();
            System.err.println("");
            System.out.println(" :: CHAPTERS :: ");
            System.out.println();

            for (int i = 0; i < chapterOfSerieSelected.size(); i++){
                System.out.println(i+1 + ". " + chapterOfSerieSelected.get(i).getTitle() + " Visto: " + chapterOfSerieSelected.get(i).isViewed());
            }

            System.out.println("0. Regresar al menú de Series");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0){
                showSeries();
            }

            Chapter chapterSelected = chapterOfSerieSelected.get(response -1);

             //Debido a que los índices empiezan en 0 cualquiera que sea la elección del usuario deberá restarsele 1.
             chapterSelected.setViewed(true);
             // Marcamos el capítulo como visto
             Date dateI = chapterSelected.startToSee(new Date());
             //Señalamos la fecha en que se empezó a ver. 
 
             chapterSelected.stopToSee(dateI, new Date());
             //Llamamos a este método que recordemos restará a la fecha final la fecha de inicio dandonos el tiempo de visualización. 
             System.out.println();
             System.out.println("Viste: " + chapterSelected);
             System.out.println("Por: " + chapterSelected.getTimeViewed() + " segundos");


        }while(exit !=0);
    }

    public static void showBooks(){
        int exit =1;
        ArrayList<Book> books = Book.makeBooksList();
        do {

            System.out.println();
            System.err.println("");
            System.out.println(" :: BOOKS :: ");
            System.out.println();

            for (int i = 0; i < books.size(); i++){
                System.out.println(i+1+ ". " + books.get(i).getTitle() + " Fecha de edición: " + books.get(i).getEditionDate() + " " + books.get(i).getIsbn() +  " Leído: " + books.get(i).isReaded());
            }

            System.out.println("0. Regresar al menú");
            System.out.println();

            //Leer la respuesta de un usuario.
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0){
                showMenu();
            }

            Book bookSelected = books.get(response -1);
            String[] authors = {"Pepe", "Adolfa", "El neng", "Tu abueliña"};

            bookSelected.setAuthors(authors);
            //Debido a que los índices empiezan en 0 cualquiera que sea la elección del usuario deberá restarsele 1.
            bookSelected.setReaded(true);
            // Marcamos el libro como leído
            Date dateI = bookSelected.startToSee(new Date());
            //Señalamos la fecha en que se empezó a leer. 

            bookSelected.stopToSee(dateI, new Date());
            //Llamamos a este método que recordemos restará a la fecha final la fecha de inicio dandonos el tiempo de visualización. 
            System.out.println();
            System.out.println("Leíste: " + bookSelected);
            System.out.println("Por: " + bookSelected.getTimeReaded() + " segundos");
        }while(exit !=0);
    }

    public static void showMagazines(){
        int exit =1;
        do {
            System.out.println();
            System.err.println("");
            System.out.println(" :: MAGAZINES :: ");
            System.out.println();
        }while(exit !=0);
    }

    public static void makeReport(){

        //Da algún tipo de fallo al intentar importarlo como librería por lo que lo importo como clase

        Report report = new Report();
        report.setnameFile("Reporte");
        report.setTitle("::VISTOS::");
        report.setExtension("txt");

        String contentReport = "";

        for(Movie movie:movies){
            if(movie.getIsViewed()){
                contentReport += movie.toString();
            }
        }
        report.setContent(contentReport);
        report.makeReport();
    }

    public static void makeReportDate(Date date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = df.format(date);


        Report report = new Report();
        report.setnameFile("reporte" + dateString);
        report.setTitle("::VISTOS::");
        report.setExtension("txt");

        String contentReport = "";

        for(Movie movie:movies){
            if(movie.getIsViewed()){
                contentReport += movie.toString();
            }
        }
        report.setContent(contentReport);
        report.makeReport();
        
    }

}
/*Para crear un proyecto en java tenemos que crear una nueva carpeta y, del primer archivo.java que creemos dependerán todos los demás. Este primer archivo es el package.
Asimismo otra información útil para contrastar es importar librerías lo cual se hace con  import java separando por puntos para las librerías (ejemplos en Book y Magazines)
Para importar otras clases simplemente se usa la palabra reservada import. Con un asterisco podemos importar paquetes de clases. por ejemplo si queremos toda la librería de utils
podemos poner import "java.util.*" de esta manera ya tendríamos todas esas clases para ser utilizadas. Si tuviéramos clases con nombres similares y quisiéramos evitar conflicots
podemos almacenarlas en una variables:

importa java.util.Date;

java.sql.Date date = new java.sql.Date();

Para los miembros static de las otras clases (es decir aquellos que no cambian) se importan de la siguiente manera

import static java.lang.Math.PI

*/
