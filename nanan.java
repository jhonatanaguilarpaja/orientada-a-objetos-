import java.util.Scanner;
import java.util.Random;
public class nanan {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int n;
        int x;
        x=777;
        for(int i=1;i<=250;i++) {
            n = aleatorio.nextInt(779 - 775) + 775;
            System.out.println(n);

            if (n == x)
                System.out.println("LO HEMOS ENCONTRADO ");
            else
                System.out.println("NO SE HA ENCONTRADO");

        }
    }
}
