import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formRomano extends JFrame {
    private JButton convertirARomanoButton;
    private JTextField textnumero;
    private JTextField textromano;
    private JPanel mipanel;

    public formRomano() {
        setContentPane(mipanel);
        setTitle("Formuario");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        convertirARomanoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero = textnumero.getText();



                int N = Integer.parseInt(numero);//387
                int millar= (N/1000)*1000;
                System.out.println(millar);

               int centena = ((N-millar )/ 100)*100;//300
                System.out.println(centena);


                int decena=((N-millar-centena)/10)*10;//80
                System.out.println(decena);


                int unidad = N-millar-centena-decena;
                System.out.println(unidad);



                String romanos ="";

                switch(millar){
                    case 1000: romanos ="M"; break;
                    case 2000: romanos ="MM"; break;
                    case 3000: romanos ="MMM"; break;
                }
                switch(centena){
                    case 100: romanos =romanos+"C"; break;
                    case 200: romanos =romanos+"CC" ;break;
                    case 300: romanos =romanos+"CCC"; break;
                    case 400: romanos =romanos+"CD"; break;
                    case 500: romanos =romanos+"D"; break;
                    case 600: romanos =romanos+"DC"; break;
                    case 700: romanos =romanos+"DCC"; break;
                    case 800: romanos =romanos+"DCCC"; break;
                    case 900: romanos =romanos+"E"; break;

                }
                switch(decena){
                    case 10: romanos =romanos+"X"; break;
                    case 20: romanos =romanos+"XX"; break;
                    case 30: romanos =romanos+"XXX"; break;
                    case 40: romanos =romanos+"XL"; break;
                    case 50: romanos =romanos+"L"; break;
                    case 60: romanos =romanos+"LX"; break;
                    case 70: romanos =romanos+"LXX"; break;
                    case 80: romanos =romanos+"LXXX"; break;
                    case 90: romanos =romanos+"xc"; break;
                }
                switch(unidad){
                    case 1: romanos =romanos+"I"; break;
                    case 2: romanos =romanos+"II"; break;
                    case 3: romanos =romanos+"III"; break;
                    case 4: romanos =romanos+"IV"; break;
                    case 5: romanos =romanos+"V"; break;
                    case 6: romanos =romanos+"VI"; break;
                    case 7: romanos =romanos+"VII"; break;
                    case 8: romanos =romanos+"VIII"; break;
                    case 9: romanos =romanos+"IX"; break;
                }
                System.out.println(romanos);
                textromano.setText(romanos);
                }


        });
    }
    public static void main(String[] args) {
        new formRomano();


    }
}
