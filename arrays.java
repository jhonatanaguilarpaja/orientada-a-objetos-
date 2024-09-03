import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner po = new Scanner(System.in);
        int[] numeros = new int[10];//declaramos o creamos un array entero de 10 celdas
        //colocamos valores en las celdas del arry "numeros"
        numeros[0] = 700;
        numeros[1] = 7;
        numeros[2] = 6;
        numeros[3] = 46;
        numeros[4] = 65;
        numeros[5] = 3;
        numeros[6]= 45;
        numeros[7]= 3;
        numeros[8]= 2;
        numeros[9]= 1;
        for (int i = 0; i <=9; i++) {
            System.out.println("valor de la celda "+i+"=:"+numeros[i]);
        }

    }
}