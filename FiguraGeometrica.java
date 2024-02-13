
/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class FiguraGeometrica
{
    private Punto origen;
    
    
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    
    /**
     * @param: p_origen:  Origen del r4ectangulo, siendo su centro de tipo Punto
     */
    
    protected void setOrigen(Punto p_origen){
        this.origen=p_origen;
    }
    
    /**
     * @return: Devuelve el centro de la figura de tipo Punto
     */
    public Punto getOrigen(){
        return this.origen;
    }
    
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    public void mostrarSuperficie(){
        System.out.println(this.nombreFigura());
        System.out.println(this.superficie());
    }
}
