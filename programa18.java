import java.util.Scanner;
public class programa18{
    public static void main(String[] args) {
        Scanner po = new Scanner(System.in);
       String []  nombres = new String[10];
       for(int i = 0 ; i <=9 ; i++){
           System.out.println("ingrese un nombre");
           nombres[i] = po.nextLine();
       }
       for(int i = 0 ; i <=9 ; i++){
           System.out.println("nombres ingresados "+nombres[i]);
       }

    }
}