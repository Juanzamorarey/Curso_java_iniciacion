package amazon_viewer;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Movie extends Film implements IVisualizable{

    private int id;
    private int timeViewed;

    // public Movie(String title, String genre, String creator, int duration, short year){
    //     super();
    // }

    // public Movie(String title, String genre, short year){
    //     super();
    // }

    //Vamos a generar nuevos métodos constructores con herencia. Está heredando de la clase film con su metodo constructor todos los atributos que se corresponen con las variables presentes.
    //Nosotros vamos aintroducirle el método setYear() también el cual está en nuestra clase Film. 
    //ATENCIÓN: De por sí la clase film no incorpora year a sus herencias, pero si posee este atributo si queremos que aparezca en sus herencias.
    public Movie(String title, String genre, String creator, int duration,short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    //Al poner public delante estamos haciendo que esos datos san accesibles desde la clase principal

    public void showData(){
    //     System.out.println("Title: " + title);
    //     System.out.println("Genre: " + genre);
    //     System.out.println("Year: " + year);
    }

    //Vamos a crear un metodo getter y Setter

    public int getId(){
        return id;
    }

    // public void setId(int id){
    //     this.id = id;
    // }
    //Vamos a generarlo automáticamente
    
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    //Overriding methods 
    //En esta clase hijo estamos redefiniendo el método de Object toString(), ahora este método que antes hacía algo distinto hará las instrucciones que le indiquemos aquí.
    public String toString(){
        return  "\n :: MOVIE ::" +
                "\n Title: " + getTitle() +
                "\n Genero: " + getGenre() +
                "\n Año: " + getYear() +
                "\n Creador: " + getCreator() +
                "\n Duración: " + getDuration();
    }

    //Al redefinir el método toString() estamos entrando en el polimorfismo de clases, es decir. Podemos tener métodos con el mismo nombre pero que dependiendo de en qué clase se ejecuten tendrán comportamientos diferentes.

    public Date startToSee(Date dateI){
        return dateI;
    }

    public void stopToSee(Date dateI, Date dateF){
        Calendar calIni = Calendar.getInstance();
        Calendar calFin = Calendar.getInstance();
        calIni.setTime(dateI);
        calFin.setTime(dateF);
        int segundosInicio = calIni.get(Calendar.SECOND);
        int segundosFinal = calFin.get(Calendar.SECOND);
        if (segundosFinal > segundosInicio){
            int total = segundosFinal - segundosInicio;
            setTimeViewed(total);
        } else {
            setTimeViewed(0);
        }
    }
    //estos dos métodos se corresponden con la interfaz.

    public static ArrayList<Movie> makeMoviesList() {
        ArrayList<Movie> movies = new ArrayList();
        for (int i = 1; i <= 5; i++){
            movies.add(new Movie("Movie " + i, "genero " +i, "Creador " +i, 120 +i, (short)(2017+i)));
        }

        return movies;

    }


}
