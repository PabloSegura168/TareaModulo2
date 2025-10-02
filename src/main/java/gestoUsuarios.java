import javax.swing.*;

public class gestoUsuarios {

    public static void main(String[] args) {
        JFrame frame = new JFrame("gestoUsuarios");
        frame.setContentPane(new gestoUsuarios().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JLabel logo;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField nombreEntrada;
    private JTextField textField2;
    private JTabbedPane tabbedPane1;
    private JTextArea textArea1;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel Navegacion;
    private JPanel Header;
    private JPanel Botonera;
    private JPanel Formulario;
    private JPanel Previsualización;
    private JTextArea textArea2;
    private JLabel Notas;
    private JLabel Nombre;
    private JLabel emailEntrada;
    private JComboBox comboBox1;
    private JLabel rolEntrada;
    private JCheckBox checkBox1;
    private JLabel Activo;
}
