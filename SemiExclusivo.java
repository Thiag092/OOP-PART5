
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemiExclusivo extends Cargo
{
     private int horasDeInvestigacion;

     public SemiExclusivo (String p_nombreCargo, double p_sueldo, int p_anio, int p_horas,
    int p_horasDeInvestigacion){
        super(p_nombreCargo,p_sueldo,p_anio,p_horas);
        this.setHorasInvestigacion(p_horasDeInvestigacion);
    }

    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }

    private void setHorasInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }

    public void mostrarCargo(){
        System.out.println("--------------------------------------------------");
        System.out.println("\n"+this.getNombreCargo()+" - Sueldo Basico: "+this.getSueldoBasico()+
        " - Antiguedad: "+this.antiguedad()+" años");
        System.out.println("\nHoras Docencia: "+this.getHorasDeDocencia());        
        System.out.println("\n----Cargo de caracter SemiExclusivo----");
        System.out.println("\nHoras investigacion: "+this.getHorasInvestigacion());
        System.out.println("--------------------------------------------------");
        }   

    }