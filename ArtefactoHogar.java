
/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ArtefactoHogar
{
    private String marca;
    protected float precio;
    private int stock;
    
    
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    public String getMarca(){
        return this.marca;
    }

    private void setMarca(String p_marca){
        this.marca = p_marca;
    }

    public float getPrecio(){
        return this.precio;
    }

    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    public int getStock(){
        return this.stock;
    }

    private void setStock(int p_stock){
        this.stock = p_stock;
    }

    public void imprimir(){
        System.out.println("Marca: "+this.marca+"   -   Precio: "+this.precio+"   -   Stock: "+
        this.stock);
    }
    
    public float cuotaCredito(int p_cuotas, float p_interes){
        float interes=p_interes*(float)0.01;
        float porcentajePrecio=this.precio*interes;
        
        float cuotas=(this.precio+porcentajePrecio)/p_cuotas;
        
        
        return cuotas;
        
    }
    
    
    public abstract  float creditoConAdicional(int p_cuotas, float p_interes);

}