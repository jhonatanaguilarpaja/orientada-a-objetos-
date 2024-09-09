import java.util.Scanner;
public class programa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] tablero = new String[7][5];
        tablero[2][3] = "U";
        tablero[0][3] = "U";
        tablero[4][2] = "U";
        tablero[0][4] = "U";
        tablero[6][3] = "U";
        for (int j = 0; j <=6; j++) {
            for (int i = 0; i <= 4; i++) {
                if (tablero[j][i] == null) {
                    tablero[j][i] = "x";
                }
            }
        }
        for (int j = 0; j <= 6; j++) {
            for (int i = 0; i <= 4; i++) {
                System.out.print(tablero[j][i]+"  ");
            }
            System.out.println();
        }

    }
}
