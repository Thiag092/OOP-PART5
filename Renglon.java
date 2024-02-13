
/**
 * Write a description of class Renglon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    
    
    public Renglon(int cantidad,double importe,Etiqueta item){
        this.setCantidad(cantidad);
        this.setImporte(importe);
        this.setItem(item);
    }
    
    public int getCantidad(){
        return this.cantidad;
    }

    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }

    public double getImporte(){
        return this.importe;
    }

    private void setImporte(double p_importe){
        this.importe = p_importe;
    }

    public Etiqueta getItem(){
        return this.item;
    }
    
    
    private void setItem(Etiqueta p_item){
        this.item=p_item;
    }
    
    
    public void mostrar(){
        System.out.println(this.getCantidad()+"Etiquetas de tipo"+this.getItem().toString()+" - Costo: $"+this.item.getCosto());
    }
}