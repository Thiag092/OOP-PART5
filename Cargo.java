import java.util.*;
/**
 * Write a description of class Cargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargo
{
    
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    
        public Cargo(String p_nombre, double p_sueldo, int p_anio, int p_horas){
        this.setNombreCargo(p_nombre);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDeDocencia(p_horas);
    }
    


    public String getNombreCargo(){
        return this.nombreCargo;
    }//end method getNombreCargo

    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }//end method setNombreCargo

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }//end method getSueldoBasico

    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }//end method setSueldoBasico

    public int getAnioIngreso(){
        return this.anioIngreso;
    }//end method getNioIngreso

    private void setAnioIngreso(int p_nioIngreso){
        this.anioIngreso = p_nioIngreso;
    }//end method setNioIngreso

    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }//end method getHorasDeDocencia

    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia = p_horasDeDocencia;
    }//end method setHorasDeDocencia


    public int antiguedad(){
        
        Calendar fechaHoy=new GregorianCalendar();
        int anioHoy=fechaHoy.get(Calendar.YEAR);
        
        return (anioHoy-this.getAnioIngreso());
        
    }

    public double adicionalXAntiguedad(){
        double porcentajeAdicional=((double)this.antiguedad()*0.1);
        double adicional=this.sueldoBasico*porcentajeAdicional;
        return adicional;
    }
    
    public double sueldoDelCargo(){
        return (this.sueldoBasico+this.adicionalXAntiguedad());
    }
    
    public void mostrarCargo(){
        System.out.println("--------------------------------------------------");
        System.out.println("\n"+this.nombreCargo+" - Sueldo Basico: "+this.getSueldoBasico()+
        " - Antiguedad: "+this.antiguedad()+" años");
        System.out.println("\nHoras Docencia: "+this.getHorasDeDocencia());
        System.out.println("--------------------------------------------------");
    }
    }
