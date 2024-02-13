
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel extends Alojamiento
{
    private String tipoHabitacion;
    
    
    public Hotel (String p_nombre, double p_precioBase,
    int p_alquiler,Servicio p_servicio,String p_habitaciones){
        super(p_nombre,p_precioBase,p_alquiler,p_servicio);
        this.setTipoHabitacion(p_habitaciones);
    }

    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }//end method getTipoHabitacion

        private void setTipoHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion = p_tipoHabitacion;
    }//end method setTipoHabitacion

    public double costo(){
        double costo=0;
        if(this.getTipoHabitacion().equalsIgnoreCase("single")){
            costo=(this.getPrecioBase()+20)*this.getDiasAqluiler();
            return costo;
        }else{
            costo=(this.getPrecioBase()+35)*this.getDiasAqluiler();
            return costo;
        }
    }
    
    public void liquidar(){
        System.out.println("Habitacion Single");
        
        System.out.println("Total: ------->$"+this.costo());
        
    }
    
    public int contar(String p_alojamiento){
       if(p_alojamiento.equals("Hotel")){
           return 1;
       }else{
           return 0;
       }
    }
}//End class