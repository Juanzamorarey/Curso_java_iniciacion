package amazon_viewer;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Book extends Publication implements IVisualizable{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String isbn, boolean readed, int timeReaded){
        super(title, editionDate, editorial);
        this.isbn = isbn;
        this.readed = readed;
        this.timeReaded = timeReaded;
    }
    
    public int getId(){
        return id;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String isReaded() {
        String response = "";
        if (readed == true){
            response = "Leído";
        } else{
            response = "No leído";
        }
        return response;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public void showData(){
            System.out.println("Title: " + getTitle());
            System.out.println("Date of edition: " + getEditionDate());
            System.out.println("Editorial: " + getEditorial());
        }

    public String toString(){
        String detailBook = "\n :: BOOK ::" +
                            "\n Title: " + getTitle() +
                            "\n Editorial: " + getTitle() +
                            "\n Edition Date: " + getTitle() +
                            "\n Authors: ";
        for (int i = 0; i< getAuthors().length; i++){
            detailBook += "\t" + getAuthors()[i];
        }
        return detailBook;                    
    }

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
            setTimeReaded(total);
        } else {
            setTimeReaded(0);
        }
    }

    public static ArrayList<Book> makeBooksList() {
        Date Fecha = new Date();
        ArrayList<Book> books = new ArrayList();
        for (int i = 1; i <= 5; i++){
            books.add(new Book("Book " + i, Fecha, " Editorial " + i, " ISBN " + i, false, 120 + i));
        }

        return books;

    }
    //estos dos métodos se corresponden con la interfaz.
}
