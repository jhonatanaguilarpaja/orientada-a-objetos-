import java.util.Scanner;
import java.util.Random;
public class programa23 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[][] tablero = new String[8][8];
        int n;
        int x;
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                tablero[j][i] = "_";
            }
        }
        n = rand.nextInt(8);
        x = rand.nextInt(8);
        tablero[n][x] = "Q";

        System.out.println("Fila y columna: " + n + " = " + x);

        for (int i = 0; i < 8; i++) {
            if (tablero[n][i] != "Q") {
                tablero[n][i] = "x";
            }
            if (tablero[i][x] != "Q") {
                tablero[i][x] = "x";
            }
        }

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                System.out.print(tablero[j][i] + " ");
            }
            System.out.println();
        }
    }
}
