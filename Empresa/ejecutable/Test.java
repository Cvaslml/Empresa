package ejecutable;
import controlador.Controlador;
import modelo.Empresa;
import vista.VentanaPrincipal;
public class Test 

{
    public static void main(String[] args) 
    {
        Empresa miModelo = new Empresa();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miModelo);    
    }
}
