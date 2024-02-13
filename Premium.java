
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Etiqueta
{
    private int colores;
    
    public Premium(double p_costo,int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    public int getColores(){
        return this.colores;
    }
    
    private void setColores(int p_colores){
        this.colores=p_colores;
    }
    
    public double precio(int q){
        double total;
        double precioTotal = q*this.getCosto();
        
        total = precioTotal + (precioTotal*this.adicional());
        
        return total;
    }
    
    public String toString(){
        return super.toString()+" - Colores: "+this.getColores();
    }
    
    private double adicional(){
        double ad=0;

        if(this.getColores()==1){
            return ad= 0;
        }else if(this.getColores()==2){
            return ad= 0.05;
        }else if(this.getColores()==3){
            return ad = 0.07;
        }else{
              return ad =this.getColores()*3/100;
        }
    }
    public String tipo(){
        return "Premium";
    }
}
