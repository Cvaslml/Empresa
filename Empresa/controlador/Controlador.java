package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empleado model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empleado pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarBotones(this);        
    }
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comando generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("crear"))
        {   
            //Validar datos entrada
            try
            {
                String nombre = venPrin.miPanelEntradaDatos.getNombre();
                int AñoNacimiento = Integer.parseInt(venPrin.miPanelEntradaDatos.getAñoNacimiento());
                int fechaIngreso = Integer.parseInt(venPrin.miPanelEntradaDatos.getfechaIngreso());
            
                //Creación del objeto tipo Carro
                model = new Empleado(nombre, AñoNacimiento, fechaIngreso);
                
                venPrin.miPanelResultado.mostrarResultado("Se ha creado un objeto Empleado");
                venPrin.miPanelResultado.mostrarResultado("Su número de horas a trabajar por dia son " + model.getNumHoras());
                venPrin.miPanelResultado.mostrarResultado("Su nombre es " + model.getNombre());
                venPrin.miPanelResultado.mostrarResultado("Su año de nacimiento es " + model.getAñoNacimiento());
                venPrin.miPanelResultado.mostrarResultado("Su fecha de ingreso a la empresa es " + model.getfechaIngreso());
                
                //Desactivar boton crear
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   