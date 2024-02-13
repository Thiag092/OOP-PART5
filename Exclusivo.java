
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exclusivo extends Cargo
{
    private int horasDeInvestigacion;
    private int horasDeExtension;
    
    public Exclusivo (String p_nombreCargo, double p_sueldo, int p_anio, int p_horas,
    int p_horasDeInvestigacion,int p_horasDeExtension){
        super(p_nombreCargo,p_sueldo,p_anio,p_horas);
        this.setHorasInvestigacion(p_horasDeInvestigacion);
        this.setHorasExtension(p_horasDeExtension);
    }
    
    public  int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public  int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    
    private void setHorasInvestigacion(int p_horasDeInvestigacion){
    this.horasDeInvestigacion=p_horasDeInvestigacion;
    }

    private void setHorasExtension(int p_horasDeExtension){
    this.horasDeExtension=p_horasDeExtension;
        }

        
    public void mostrarCargo(){
        System.out.println("--------------------------------------------------");
        System.out.println("\n"+this.getNombreCargo()+" - Sueldo Basico: "+this.getSueldoBasico()+
        " - Antiguedad: "+this.antiguedad()+" años");
        System.out.println("\nHoras Docencia: "+this.getHorasDeDocencia());
        System.out.println("\n----Cargo de caracter Exclusivo----");
        System.out.println("\nHoras investigacion: "+this.getHorasDeInvestigacion());
        System.out.println("\nHoras extension: "+this.getHorasDeExtension());
        System.out.println("--------------------------------------------------");
    }
}
