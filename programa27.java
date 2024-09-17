import java.util.*;
public class programa27 {
    public static void main(String[] args) {

        animal leon = new animal ();
        leon.hacer_sonido();
        perro firulais = new perro ();
        firulais .cuidar();
        firulais.hacer_sonido();
        gato garfil = new gato();
        garfil.hacer_sonido();
    }

}


class  animal{
    String name;
    int edad;
    public void hacer_sonido(){
        System.out.println("el animal esta haciendo un sonido:...");
    }
}
class perro extends animal{
    String color;
    String sexo;
    String raza;
    public void cuidar(){
        System.out.println("el perro esta cuidadnod la casa ....");

    }
    @Override
    public void hacer_sonido(){
        System.out.println("el perro esta ladrando");
    }
}
class gato extends animal{
    @Override
    public void hacer_sonido(){
        System.out.println("El gato esta maullando");
    }
}

