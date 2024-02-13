import java.util.ArrayList;

/**
 * Write a description of class Alojamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Alojamiento
{
   private String nombre;
   private double precioBase;
   private int diasAqluiler;
   private ArrayList<Servicio> servicios;
   
    public Alojamiento(String p_nombre, double p_precioBase,
    int p_alquiler,ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAqluiler(p_alquiler);
        this.setServicios(p_servicios);
    }
    
    public Alojamiento(String p_nombre, double p_precioBase,
    int p_alquiler,Servicio p_servicio){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAqluiler(p_alquiler);
        this.setServicios(new ArrayList<Servicio>());
        this.agregarServicio(p_servicio);
    }

    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }//end method setNombre

    public double getPrecioBase(){
        return this.precioBase;
    }//end method getPrecioBase

    private void setPrecioBase(double p_precioBase){
        this.precioBase = p_precioBase;
    }//end method setPrecioBase

    public int getDiasAqluiler(){
        return this.diasAqluiler;
    }//end method getDiasAqluiler

    private void setDiasAqluiler(int p_diasAqluiler){
        this.diasAqluiler = p_diasAqluiler;
    }//end method setDiasAqluiler

    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }//end method getServicios

    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }//end method setServicios

    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }

     public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    public abstract int contar(String p_alojamiento);
    
    public double costo(){
        return this.precioBase*this.diasAqluiler;
    }
    
    public void listarServicios(){
        for(Servicio unServicio: this.getServicios()){
            System.out.println(unServicio.getDescripcion()+" :"+
            unServicio.getPrecio());
        }
    }
    public double costoServicios(){
        double costoTotal=0;
        for(Servicio unServicio: this.getServicios()){
            costoTotal+=unServicio.getPrecio();
        }
        return costoTotal;
    }
    
    public void liquitar(){
        System.out.println("Alojamiento: "+this.getNombre());
        System.out.println("Costo por "+this.getDiasAqluiler()+
        " dias: "+this.costo());
        this.listarServicios();
        System.out.println("Total: ------> $"+this.costoServicios());
    }
    
    
}