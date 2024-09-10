import java.util.Scanner;
import java.util.Random;
public class programa22{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        int n;
        int x;
        //generamos una posicion aleatoria y alli colocamos un letra "Q"
        for (int i = 1; i <=1; i++) {
            n = rand.nextInt(8 - 0) + 0;
            x = rand.nextInt(8 - 0) + 0;
            tablero[n][x] = "Q";

            System.out.println("fila  y columna  " + n + " = " + x);
            for (int o = 1; o <=4; o++){
                tablero[n][o]="x";
            }
            for (int o = 1; o <=4; o++){

                tablero[o][n]="x";
            }
        }
        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 4; i++) {
                if (tablero[j][i] == null) {
                    tablero[j][i] = "_";
                }
            }
        }
        //for para visualisar la matriz
        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 4; i++) {
                System.out.print(tablero[j][i] + "    ");
            }
            System.out.println();
        }
    }
}
