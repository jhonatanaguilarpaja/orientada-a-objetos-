import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class OperacionesMatematicas extends JFrame {
    private JTextField n1;
    private JTextField n2;
    private JComboBox comboOperaciones;
    private JButton operarButton;
    private JTextField result;
    private JPanel PanelPrincipal;

    private JRadioButton botonRadio1;
    private JCheckBox checkRedondear2DecimalesCheckBox;

    public OperacionesMatematicas() {
        setContentPane(PanelPrincipal);
        setTitle("Formulario para operar de 2 numeros");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        comboOperaciones.addItem("sumar");
        comboOperaciones.addItem("restar");
        comboOperaciones.addItem("multiplicar");
        comboOperaciones.addItem("dividir");

        operarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double x, y, resultado;
                String operacion;

                resultado = 0.0;

                x = Double.parseDouble(n1.getText());
                y = Double.parseDouble(n2.getText());
                operacion = comboOperaciones.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null, "" + operacion);
                if (operacion.equals("sumar")) {
                    resultado = x + y;
                }
                if (operacion.equals("restar")) {
                    resultado = x - y;
                }
                if (operacion.equals("multiplicar")) {
                    resultado = x * y;
                }
                if (operacion.equals("dividir")) {
                    resultado = x / y;
                }
                if (checkRedondear2DecimalesCheckBox.isSelected()) {
                    DecimalFormat df = new DecimalFormat("0.00");
                    result.setText(df.format(resultado));
                } else {
                    result.setText(resultado.toString());
                }

                JOptionPane.showMessageDialog(null, "desea decimal:"+result.getText());
            }
        });
    }
    public static void main(String[] args) {
        new OperacionesMatematicas();
    }
}
