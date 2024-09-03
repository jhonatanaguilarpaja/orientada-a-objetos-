import java.util.Scanner;
public class programa17{
    public static void main(String[] args) {
        Scanner po = new Scanner(System.in);
        int [] numeros = new int[10];
        int indice;
        int valor=0;
            do {
                System.out.print("en que indice  desias ingresar un numero: ");
                indice = po.nextInt();
                if (indice != 1000) {
                    if (indice >= 0 && indice <= 9) {

                        System.out.print("que numero deseas ingresar en la celda: ");
                        valor = po.nextInt();
                        numeros[indice] = valor;// esto es lo correcto
                    }else{
                        System.out.println("Error ese indice NO EXISTE");
                    }
                }
            }while (indice!=1000);
            for (int i = 0; i <=9; i++) {
                System.out.println(" la celda "+i+"=="+numeros[i]);
            }






    }
}