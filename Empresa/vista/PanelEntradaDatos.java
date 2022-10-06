package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbnombre;
    private JLabel lbAñoNacimiento;
    private JLabel lbfechaIngreso;
    private JTextField tfnombre;
    private JTextField tfAñoNacimiento;
    private JTextField tffechaIngreso;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Empresa.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas nombre, AñoNacimiento y fechaIngreso
        lbnombre = new JLabel("Nombre = ");
        lbnombre.setBounds(230,10,60,20);
        add(lbnombre);
        
        lbAñoNacimiento = new JLabel("Año de nacimiento = ");
        lbAñoNacimiento.setBounds(230,40,60,20);
        add(lbAñoNacimiento);
        
        lbfechaIngreso = new JLabel("Fecha de ingreso = ");
        lbfechaIngreso.setBounds(230,70,60,20);
        add(lbfechaIngreso);
        
        
        //Creación y adición de campos de texto
        tfnombre = new JTextField("Azul");
        tfnombre.setBounds(300, 10, 60, 20);
        add(tfnombre);
        
        tfAñoNacimiento = new JTextField("10");
        tfAñoNacimiento.setBounds(300, 40, 60, 20);
        add(tfAñoNacimiento);
        
        tffechaIngreso = new JTextField("10");
        tffechaIngreso.setBounds(300, 70, 60, 20);
        add(tffechaIngreso);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfnombre.getText();
    }
    
    public String getAñoNacimiento()
    {
        return tfAñoNacimiento.getText();
    }
    
    public String getfechaIngreso()
    {
        return tffechaIngreso.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfnombre.setText("");
        tfAñoNacimiento.setText("");
        tffechaIngreso.setText("");
    }
}