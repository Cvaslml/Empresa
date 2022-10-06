package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoEmpresa extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbAñoNacimiento;
    private JLabel lbFechaIngreso;
    private JTextField txAñoNacimiento;
    private JTextField txFechaIngreso;
    private JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoEmpresa()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Empresa",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
        
        lbAñoNacimiento= new JLabel("Año de nacimiento = ",JLabel.RIGHT);
        lbAñoNacimiento.setFont(new Font("Arial", Font.BOLD, 25));
        lbAñoNacimiento.setBounds(10,50,140,20);
        add(lbAñoNacimiento);
        
        lbFechaIngreso= new JLabel("Fecha de ingreso = " + Año,JLabel.RIGHT);
        lbFechaIngreso.setFont(new Font("Arial", Font.BOLD, 25));
        lbFechaIngreso.setBounds(10,90,140,20);
        add(lbFechaIngreso);
        
        txAñoNacimiento= new JTextField();
        txAñoNacimiento.setFont(new Font("Arial", Font.BOLD, 25));
        txAñoNacimiento.setBounds(150,50,100,25);
        add(txAñoNacimiento);
        
        txFechaIngreso= new JTextField();
        txFechaIngreso.setFont(new Font("Arial", Font.BOLD, 25));
        txFechaIngreso.setBounds(150,90,100,25);
        add(txFechaIngreso);
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(20,140,260,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Empresa");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getAñoNacimiento()
    {
        return txAñoNacimiento.getText();
    }
    
    public String getFechaIngreso()
    {
        return txFechaIngreso.getText();
    }
    
    public void agregarBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}