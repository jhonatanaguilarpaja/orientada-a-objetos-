import java.util.Scanner;

public class programa29 {
    public static void main(String[] args) {
        int fila;
        int columna;
        Scanner sc = new Scanner(System.in);


        punto puntito = new punto();
        puntito.posicionar(2,30);
        puntito.mostrar();
        punto puntito2 = new punto();
        puntito2.posicionar(1,25);
        puntito2.mostrar();




    }
}
class punto {
    int fila;
    int columna;
    public void posicionar(int fila, int columna) {
        this.fila = fila;//
        this.columna = columna;//

        String[][] tablero = new String[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                tablero[i][j] = null;
                if (tablero[i][j] == " ") {
                        tablero[i][j] = "o";
                }

            }
        }

        for(int i=1;i<fila;i++){
            System.out.println();
        }
        for(int j=1;j<columna;j++){
            System.out.print(" ");
        }

    }
    public void mostrar() {
        System.out.println(".");
    }
}
