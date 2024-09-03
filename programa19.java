// matriz 
import java.util.Scanner;

public class programa19{
    public static void main(String[] args) {
        Scanner po = new Scanner(System.in);
      String [] [] tablero = new String[5][5];

      tablero[0][2] = "x";
      tablero[2][1] = "x";
      tablero[2][3] = "x";
      tablero[3][1] = "x";
      tablero[4][1] = "x";

     for (int j = 0; j <=4; j++) {
       for (int i = 0; i <= 4; i++) {
         if (tablero[j][i] == null)
           tablero[j][i] = "0";

       }
     }
        System.out.print(tablero[0][0]+"    ");
        System.out.print(tablero[0][1]+"    ");
        System.out.print(tablero[0][2]+"    ");
        System.out.print(tablero[0][3]+"    ");
        System.out.print(tablero[0][4]+"    ");

        System.out.println();

        System.out.print(tablero[1][0]+"    ");
        System.out.print(tablero[1][1]+"    ");
        System.out.print(tablero[1][2]+"    ");
        System.out.print(tablero[1][3]+"    ");
        System.out.print(tablero[1][4]+"    ");

        System.out.println();

        System.out.print(tablero[2][0]+"    ");
        System.out.print(tablero[2][1]+"    ");
        System.out.print(tablero[2][2]+"    ");
        System.out.print(tablero[2][3]+"    ");
        System.out.print(tablero[2][4]+"    ");

        System.out.println();

        System.out.print(tablero[3][0]+"    ");
        System.out.print(tablero[3][1]+"    ");
        System.out.print(tablero[3][2]+"    ");
        System.out.print(tablero[3][3]+"    ");
        System.out.print(tablero[3][4]+"    ");

        System.out.println();

        System.out.print(tablero[4][0]+"    ");
        System.out.print(tablero[4][1]+"    ");
        System.out.print(tablero[4][2]+"    ");
        System.out.print(tablero[4][3]+"    ");
        System.out.print(tablero[4][4]+"    ");
    }
}