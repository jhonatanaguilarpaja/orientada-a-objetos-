import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class formularioLibros  extends JFrame{
    private JTable tablalibros;
    private JButton boton_eliminar;
    private JButton boton_modificar;
    private JButton boton_listar;
    private JButton boton_nuevo;
    private JPanel panelLibros;

    String hastbd="jdbc:mysql://localhost:3306/bd_biblioteca";
    String usuariobd="root";
    String passwordbd="";
    
    public Connection conectarbd(){
        Connection conex=null;
        try{
            conex= DriverManager.getConnection(hastbd,usuariobd,passwordbd);

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"no hemos podido conectarmos asu base de datos " );
            System.out.println("Error no se puede acessar a la base de datos ");
        }
        return conex;
    }

    public formularioLibros(){//inicio del constructor
         setContentPane(panelLibros);//agregamos el panel principal
         setTitle("formulario de libros ");//titulo de formulario
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//accion para cerrar la ventana
         setLocationRelativeTo(null);//centrado del formularioen pantalla
         setResizable(false);//para que el usuario no pueda modificar el tamaño del formulario
         setVisible(true);//para visulaizar la pantalla
         setSize(500,500);// tamaño del formulario


        boton_listar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conex=null;
                conex=conectarbd();
                if(conex!=null){
                    System.out.println("exelente , la BD ha respondidio.");
                    JOptionPane.showMessageDialog(null,"exelente , la BD ha respondidio.");

                    Statement statement=null;//sirve para intrucciones SQL
                    ResultSet resultset=null;//ES para el conjunto de registros

                    String SQL="select * from libros";//selecciona todos los registros de de la tabla de libros
                    try {

                        statement=conex.createStatement();
                        resultset=statement.executeQuery(SQL);
                       /* while(resultset.next()){
                            String titulo = resultset.getString("titulo");
                            String autor=resultset.getString("autor");
                            int n_paginas =resultset.getInt("n_paginas");
                            System.out.println(titulo+""+autor+""+n_paginas);
                        }

                        */
                        //creamos un modelo para mostrar los registros en el JTABLE

                        DefaultTableModel modelo = new DefaultTableModel();
                        modelo.setColumnIdentifiers(new Object[]{"titulo","autor","n_paginas"});
                        modelo.setRowCount(0);

                        while(resultset.next()){
                            Object[] fila=new Object[4];
                            fila[0]=resultset.getString("titulo");
                            fila[1]=resultset.getString("autor");
                            fila[2]=resultset.getInt("n_paginas");
                            modelo.addRow(fila);



                        }
                        tablalibros.setModel(modelo);

                    }catch (SQLException ex){
                        System.out.println(ex.getMessage());
                        System.out.println(" Error no se puede acessar a la base de datos ");
                    }


                }else {
                    System.out.println("lo siento , la BD no ha respondido ");
                }
            }
        });
    }

    public static void main(String[] args) {//inicio del main
        new formularioLibros();

    }//fin fe main






}

