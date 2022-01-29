package amazon_viewer;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;


public class Chapter extends Movie {

    private int id;
    // private String title;
    // private int duration;
    // private short year;
    // private boolean viewed;
    // private int timeViewed;
    private int sessionNumber;

    // public Chapter(String title, int duration, short year){
    //     super();
    //     this.title = title;
    //     this.duration = duration;
    //     this.year = year;
    // }

    public Chapter(String title, String genre, String creator, int duration,short year, int sessionNumber){
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }



    public int getId(){
        return  this.id;
    }

    public int sessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public String toString(){
        return  "\n :: CHAPTER ::" + 
                "\n Title: " + getTitle() +
                "\n Year: " + getYear() +
                "\n Creator: " +getCreator() +
                "\n Duración: " +getDuration();
    }

    public static ArrayList<Chapter> makeChaptersList() {
        ArrayList<Chapter> chapters = new ArrayList();

        for (int i= 1; i <=5; i++) {
            chapters.add(new Chapter("Capítulo "+i, "genero "+i, "creador "+i, 45, (short)(2017+i),i));
        }

        return chapters;
    }


    // public void setId(int id){
    //     this.id = id;
    // }

    // public String getTitle(){
    //     return title;
    // }

    // public void setTitle(String title){
    //     this.title = title;
    // }

    // public int getDuration(){
    //     return duration;
    // }

    // public void setDuration(int duration){
    //     this.duration = duration;
    // }

    // public short getYear(){
    //     return year;
    // }

    // public void setYear(short year){
    //     this.year = year;
    // }

    // public boolean isViewed() {
    //     return viewed;
    // }

    // public void setViewed(boolean viewed) {
    //     this.viewed = viewed;
    // }
    
    // public int timeViewed() {
    //     return timeViewed;
    // }

    // public void setTimeViewed(int timeViewed) {
    //     this.timeViewed = timeViewed;
    // }

    
    
}
