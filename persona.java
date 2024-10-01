
 public class persona{//CLASE PERSONA
    //atributos
    private String dni;
    private String nombre;
    private int  edad;
    private String direccion;

    //Este el el método CONTRUCTOR
    public persona(String dni, String nombre, int edad, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;



    }
    //segundo constructor que recibe solo 2 parámetros
     public persona(String nombre, String dni,String direccion){

         this.nombre = nombre;
         this.dni = dni;
         this.direccion = direccion;



     }


    //Métodos de la clase Persona

    public  void Mostar (){
        System.out.println("Nombre :"+nombre);
        System.out.println("Edad :"+edad);
        System.out.println("Dni :"+dni);
        System.out.println("Direccion :"+direccion);


    }
    //establece datos
    //Método setea = configura el dni= seter
    //método utilizado para establecer el valor de una propiedad en una clase.
    // Junto con el "getter", que obtiene el valor, forman parte de la encapsulación de datos.

    //MÉTODO GET
    public String getDni() {
        return dni;
    }
    //MÉTOD SETTER
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
