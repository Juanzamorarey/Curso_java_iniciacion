package aaaa;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Report {
    private String nameFile;
    private String content;
    private String title;
    private String extension;

    public String getExtension(){
        return extension;
    }

    public void setExtension(String extension){
        this.extension = extension;
    }

    public String getNameFile(){
        return nameFile;
    }

    public void setnameFile(String nameFile){
        this.nameFile = nameFile;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void makeReport(){
        if ((getNameFile() != null) && (getTitle() != null) && (getContent() != null)){
            try{
                File file = new File(getNameFile() + "." + getExtension());
                //Crea el archivo
                FileOutputStream fos = new FileOutputStream(file);
                //Recibe el archivo y lo prepara para escribir bytes dentro de él
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                //Escribimos los que tenemos en fos 
                //SIEMPRE QUE USEMOS ARCHIVOS EXTERNOS AJVA NOS OBLIGA A UTILIZAR UN TRY CATCH 
                // Ahora vamos a poner un buffer para escribir elementos más rápido
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                //Siempre que utilicemos un buffer hay que cerrarlo
                bw.close();

            } catch (IOException e){
                e.printStackTrace();
            }
        } else{
            System.out.println("Ingresa los datos del archivo");
        }
    }
}