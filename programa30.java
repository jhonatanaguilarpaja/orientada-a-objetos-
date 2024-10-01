
public class programa30{
    public static void main(String[] args) {
        //CONTRUCTOR
        //persona docente = new persona("40788956","Luis Pacheco",45);
        //creando un objeto de la clase persona

        //docente.setDni("71945097");
       //docente.setNombre("juan Perez ");
        ///docente.setEdad(30);
        //docente.Mostar();
        //System.out.println("El nombre del docente es :"+docente.getNombre());
       // System.out.println("El edad del docente es :"+docente.getEdad());
        //System.out.println("El dni del docente es :"+docente.getDni());

        //docente ProfPedrito  = new docente("pedro diaz","05454254542");
        //System.out.println("Nombre del profesor Pedrito"+ProfPedrito.getNombre());




        claseCRUD sistema = new claseCRUD();
        docente profpedrito = new docente("prof pedrito ", "0255555","av leonidad");
        profpedrito.setEdad(25);

        sistema .agregardocente(profpedrito);
        docente profmaria = new docente("prof maria ", "36562356","av leonidad");
        sistema.agregardocente(profmaria);
        profmaria.setEdad(30);
        profmaria.setIntitucion("gae");



        docente profnancy = new docente("prof nancy ", "454542","av leonidad");
        sistema.agregardocente(profnancy);
        profnancy.setEdad(38);
        profnancy.setSueldo(2655.50);
        profnancy.setNivel("superior ");
        profnancy.setIntitucion("upeu");












        sistema.listardocente();








    }
}
