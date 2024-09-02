//Números Aleatorios
import java.util.Random;

public class jaja {
    public static void main(String[] args) {
        Random rand = new Random();
        int n ;
        int x=777;
        int contador=0;
        do {
            n = rand.nextInt(1001-1)+1;
            System.out.println(n);
            contador++;

        }while (n!=x);
        System.out.println("encontrado en la vuelta :"+contador);


    }

}
