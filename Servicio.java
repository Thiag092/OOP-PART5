    
/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio
{
    private String descripcion;
    private double precio;
    
   
    public Servicio(){
        this.setDescripcion(null);
        this.setPrecio(0);
    }
    
    public Servicio(String p_descripcion,double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }

    public double getPrecio(){
        return this.precio;
    }

    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }



}