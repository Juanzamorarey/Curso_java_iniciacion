package amazon_viewer;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;


public class Serie extends Film {

    private int id;
    private int sessionQuantity;
    private ArrayList<Chapter> chapters;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters){
        super(title, genre, creator, duration);
        this.sessionQuantity= sessionQuantity;
        this.chapters = chapters;
    }
    
    public int getId(){
        return this.id;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public ArrayList<Chapter> getChapters(){
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters){
        this.chapters = chapters;
    }

    public String toString() {
        return "\n :: SERIE ::" +
                "\n Title: " + getTitle() +
                "\n Genre: " + getGenre() +
                "\n Year: " + getYear() +
                "\n Creator: " +getCreator() +
                "\n Duration: " +getDuration();
    }

    public static ArrayList<Serie> makeSeriesList() {
        ArrayList<Serie> series = new ArrayList();

        for (int i= 1; i <=5; i++) {
            series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Chapter.makeChaptersList()));
        }

        return series;
    }

    

}
