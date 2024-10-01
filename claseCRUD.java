import java.util.ArrayList;
import java.util.List;

public class claseCRUD {
    //atributos
    private List<docente>Listadocentes= new ArrayList<docente>();


    // metodos
    public void agregardocente(docente eldocente){// envian un objeto de la clase docente <"docente clase eldocente objeto">
        Listadocentes.add(eldocente);
        System.out.println("Docente agregado exitosamente ");


    }
    public void listardocente(){
        for(docente docente : Listadocentes){
            docente.Mostar();

        }
    }




}
