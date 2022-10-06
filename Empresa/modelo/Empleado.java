package modelo;

public class Empleado
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int numHoras = 210;
    private static int Año = 2022;
    private int AñoNacimiento;
    private int fechaIngreso;
    private int dias;
    private String nombre;

    //--------------------------
    //Métodos
    //--------------------------

    AuxilioTrans = if Salario < 2000000*/

    //Constructor
    public Empleado()
    {

    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }   
    public void CalcularEdad()
    {
        edad = Año - AñoNacimiento
    }
    public void CalcularAntiguedad()
    {
        antiguedad = Año - fechaIngreso
    }
    public void CalcularSalario()
    {
    }
    public String toString()
    {
        return "Datos del empleado: \nNombre:" + nombre + "\nEdad: " edad + "\nAntiguedad:"+ antiguedad + "\nSalario:" + "\nAuxilio de transporte: " + AuxilioTrans;
    }
}