public class docente extends persona{
    String especialidad;
    Double sueldo;
    String turno;
    String nivel;
    String intitucion;





    public  docente(String nombre ,String dni ,String direccion){
        super(nombre,dni,direccion);

    }




    public void setIntitucion(String intitucion) {
        this. intitucion=intitucion;

    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSueldo(double sueldo) {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;

    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
   @Override
    public void  Mostar(){
        super.Mostar();
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Turno: "+turno);
        System.out.println("Nivel: "+nivel);
       System.out.println("Intitucion: "+intitucion);;


    }
}
