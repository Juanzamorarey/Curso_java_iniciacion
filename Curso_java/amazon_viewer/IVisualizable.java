package amazon_viewer;
import java.util.Date;

//En esta interfaz vamos a colocar métodos comunes a clases que no pertenecen a la misma familia: Movie, Chapter y Book los cuales pueden ser visualizados.

public interface IVisualizable {
    Date startToSee(Date dateI);
    //fecha de inicio
    void stopToSee(Date dateI, Date dateF);
    
}

//En al interfaz solo dejamos constancia de los metodos para que estos se puedan aplicar a las clases, luego definiremos cada método de manera propia en la clase, lo importante
//es que se podrán aplicar a diferentes clases entre las que no haya necesariamente una relación de herencia

//Es posible implementar varias interfaces separándolas entre comas en las clases

// public class Movie extends Film implements IVisualizable, IEliminable...{
