
/**
 * Write a description of class Cabana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabana extends Alojamiento
{
    private int nroHabitaciones;

    
    public Cabana (String p_nombre, double p_precioBase,
    int p_alquiler,Servicio p_servicio,int p_habitaciones){
        super(p_nombre,p_precioBase,p_alquiler,p_servicio);
        this.setNroHabitaciones(p_habitaciones);
    }

    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }//end method getNroHabitaciones

    private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }//end method setNroHabitaciones

    public double costo(){
        return super.costo()+30;
    }
    
    public void liquidar(){
        System.out.println("Cabana con "+this.getNroHabitaciones()+
        " habitaciones");
        
        System.out.println("Total: ------->$"+this.costo());
        
    }
    
    public int contar(String p_alojamiento){
       if(p_alojamiento.equals("Cabana")){
           return 1;
       }else{
           return 0;
       }
    }

}

