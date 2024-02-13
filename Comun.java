
/**
 * Write a description of class Comun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comun extends Etiqueta
{
    private double plus;
    
    
    
    public Comun(Double p_costo,double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }

    public double getPlus(){
        return this.plus;
    }

    private void setPlus(double p_plus){
        this.plus = p_plus;
    }

    public double precio(int q){
        double precio=(super.getCosto()+this.getPlus())*q;
        double descuento=this.descuento(q);
        return precio-descuento;
    }
    
    private double descuento(int q){
        double descuento=0;
        if(q<=10){
            descuento = 0;
        } else if(q>10 && q<=50){
            descuento = q*this.getCosto()*0.02;
        }else if(q>50 && q<=100){
            descuento = q*this.getCosto()*0.05;
        } else if(q >100){
            descuento = q*this.getCosto()*(q/10);
        }
        
        return descuento;
    }
    
    public String toString(){
        return super.toString()+" - Diseño: "+this.getPlus();
    }
    
    public String tipo(){
        return "Comun";
    }
    }
    
    