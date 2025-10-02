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
    private JButton Dashboard;
    private JButton usuariosButton;
    private JButton informesButton;
    private JButton Ajustesbutton;
    private JButton ayudaButton;
    private JTextField nombreEntrada;
    private JTextField textField2;
    private JTabbedPane Jtabbed;
    private JTextArea textArea1;
    private JButton cancelarButton;
    private JButton limpiarButton;
    private JButton guardarButton;
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
    private JPanel Resumen;
    private JPanel Logs;
    private JList list1;
}
