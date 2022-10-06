package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bCalcularEdad;
    public JButton bCalcularAntiguedad;
    public JButton bCalcularSalario;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor

    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bCalcularEdad = new JButton("Calcular Edad");
        bCalcularEdad.setFont(new Font("Arial", BOLD, 12));
        bCalcularEdad.setBounds(10,20,90,20);
        add(bCalcularEdad);
        bCalcularEdad.setActionCommand("calcularEdad");

        bCalcularAntiguedad = new JButton("Calcular Antiguedad");
        bCalcularAntiguedad.setFont(new Font("Arial", BOLD, 12));
        bCalcularAntiguedad.setBounds(105,20,90,20);
        add(bCalcularAntiguedad);
        bCalcularAntiguedad.setActionCommand("CalcularAntiguedad");
        
        bCalcularSalario = new JButton("CalcularSalario");
        bCalcularSalario.setFont(new Font("Arial", BOLD, 12));
        bCalcularSalario.setBounds(200,20,90,20);
        add(bCalcularSalario);
        bAcelerar.setActionCommand("CalcularSalario");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarBotones(ActionListener pAL)
    {
        bCrear.addActionListener(pAL);
        bMover.addActionListener(pAL);
        bAcelerar.addActionListener(pAL);
        bFrenar.addActionListener(pAL);
    }
    
    public void desactivarBotonCrear()
    {
        bCrear.setEnabled(false);
    }
    
}