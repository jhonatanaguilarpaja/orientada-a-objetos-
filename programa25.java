
import java.util.*;
public class programa25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos el objeto "chester" a partir de la clase "operaciones " que esta
        // definida más abajo.
        System.out.println("ingrese un número ");
         int a = sc.nextInt();
        System.out.println("ingese el segundo número");
        int  b = sc.nextInt();
        operaciones  chester= new operaciones();
        int r,s,m,d;//declaramos 2 simples variables
        chester.configurar(a,b);//configura al objeto "chester" con los números que debe operar
        r= chester.restar();//Invocamos  al método  "restar"  de "chester y el resultado lo colocamos en r "
        s= chester.sumar();//Invocamos  al método  "sumar"  de "chester y el resultado lo colocamos en s "
        m= chester.multiplicar();//Invocamos  al método  "multiplicar"  de "chester y el resultado lo colocamos en m "
        d= chester.dividir();//Invocamos  al método  "dividir"  de "chester y el resultado lo colocamos en d "
        System.out.println("resultado  resta "+r);
        System.out.println("resultado suma  "+s);
        System.out.println("resultado multiplicacion "+m);
        System.out.println("resultado division  "+d);
    }
}
//creamos la clase  operaciones
class operaciones {
    //difinimos las propiedades de la clase
    int a,b;
    // defiminos o creamos los métodos o funciones de la clase "operaciones ", en este ejempo
    //defiminos o configurara , sumar, retar, multiplicar y  dividir
    public  void configurar(int v1 , int v2) {        // Este método recibe 2 parámetros v1 y v2
        this.a=v1;          //en la propiedad  a  de la clase colocamos el primer parámetro recibido
        this.b=v2;            //en la propiedad  b  de la clase colocamos el primer parámetro recibido
    }
    public int sumar(){
        return a+b;          //retornamos la suma de las propiedades  a y b
    }
    public int restar(){
        return a-b;        //retornamos la resta de las propiedades a y b
    }
    public int multiplicar(){
        return a*b;            // retornamos la multiplicar de las propiedades a y b
    }
    public int dividir(){
        return a/b;                  // retornamos la division de las propiedades a y b
    }
}