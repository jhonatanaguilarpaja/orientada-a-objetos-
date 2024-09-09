import java.util.Scanner;
import java.util.Random;
public class programa21{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[7][5];
        int n;
        int x;
       for (int i = 1; i <=5; i++) {
           n = rand.nextInt(7 - 0) + 0;
           x = rand.nextInt(5 - 0) + 0;
           tablero[n][x] = "z";

           System.out.println("fila  y columna  "+n+" = "+x);


       }


        for (int j = 0; j <= 6; j++) {
            for (int i = 0; i <= 4; i++) {
                if (tablero[j][i] == null) {
                    tablero[j][i] = "_";
                }
            }
        }
        for (int j = 0; j <= 6; j++) {
            for (int i = 0; i <= 4; i++) {
                System.out.print(tablero[j][i] + "    ");
            }
            System.out.println();



        }





    }

}
