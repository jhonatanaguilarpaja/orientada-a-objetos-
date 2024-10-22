import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class formularioProductos extends JFrame {
    private JButton listarButton;
    private JTable table1;
    private JPanel panelproductos;

    // crear 3 variables para la coxeion ala base de datos
    String hast="jdbc:mysql://localhost:3306/tiendabd";
    String usuario="root";
    String password="";

    public Connection conectarBD(){
        Connection conexion=null;
        try{
            conexion= DriverManager.getConnection(hast,usuario,password);

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"no hemos podido conectarmos asu base de datos " );
            System.out.println("Error no se puede acessar a la base de datos ");


        }
        return conexion;
    }

    public formularioProductos() {
        setContentPane(panelproductos);
        setTitle("Listar Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);


        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conexion=null;
                conexion=conectarBD();
                if(conexion!=null){
                    System.out.println("exelente , la BD ha respondidio.");
                    JOptionPane.showMessageDialog(null,"exelente , la BD ha respondidio.");
                }else {
                    System.out.println("lo siento , la BD no ha respondido ");
                }


            }
        });
    }
    public static void main(String[] args) {
        new formularioProductos();

    }
}
