public class programa28 {
    public static void main(String[] args) {
    }

}
class  vehiculosAereos{
    String modelo;
    double precio;
    double velocidad;
    double altitud;
    double peso;

    public void hacer_ruido(){
        System.out.println("el vehiculoAereo  esta despegando :...");
    }
}
class helicoptero extends vehiculosAereos{
    String color;
    String marca;

    public void aterrisaje(){
        System.out.println("el helicoptero esta aterizando de emergencia en un bosque .");

    }
    @Override
    public void hacer_ruido(){
        System.out.println("el helicoptero esta despegando");
        System.out.println("\n" +
                "\n" +
                "   ______.........--=T=--.........______\n" +
                "      .             |:|\n" +
                " :-. //           /\"\"\"\"\"\"-.\n" +
                " ': '-._____..--\"\"(\"\"\"\"\"\"()`---.__\n" +
                "  /:   _..__   ''  \":\"\"\"\"'[] |\"\"`\\\\\n" +
                "  ': :'     `-.     _:._     '\"\"\"\" :\n" +
                "   ::          '--=:____:.___....-\"\n" +
                "                     O\"       O\" grp");
    }
}
class avioneta extends vehiculosAereos{
    String color;
    String marca;

    public void velocidad(){
        System.out.println("la avioneta esta a una velocidad de luz ");

    }
    @Override
    public void hacer_ruido(){
        System.out.println("la avioneta esta despegando");
        System.out.println("  |        | ___\\          /~~~|\n" +
                " _:_______|/'(..)`\\_______/  | |\n" +
                "<_|``````  \\__~~__/  USAF ___|_|\n" +
                "  :\\_____(=========,(*),--\\__|_/\n" +
                "  |       \\       /---'\n" +
                "           | (*) /\n" +
                "           |____/\n");
    }
}

class avion extends vehiculosAereos{
    String color;
    String marca;
    public void capacidad(){
        System.out.println(" el avion esta llevando personal de combate ");
        System.out.println("           ______\n" +
                "            _\\ _~-\\___\n" +
                "    =  = ==(____AA____D\n" +
                "                \\_____\\___________________,-~~~~~~~`-.._\n" +
                "                /     o O o o o o O O o o o o o o O o  |\\_\n" +
                "                `~-.__        ___..----..                  )\n" +
                "                      `---~~\\___________/------------`````\n" +
                "                      =  ===(_________D");
    }
    @Override
    public void hacer_ruido(){
        System.out.println("la avion esta despegando");
    }

}