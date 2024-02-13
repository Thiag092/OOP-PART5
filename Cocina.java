
/**
 * Write a description of class Cocina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cocina extends ArtefactoHogar
{
   private int hornallas;
   private int calorias;
   private String dimensiones;


   public Cocina(String p_marca, float p_precio, int p_stock,int p_hornallas,
   int p_calorias, String p_dimensiones){
       super(p_marca,p_precio,p_stock);
       this.setHornallas(p_hornallas);
       this.setCalorias(p_calorias);
       this.setDimensiones(p_dimensiones);
       
   }
       
   
    public int getHornallas(){
        return this.hornallas;
    }

    public void setHornallas(int hornallas){
        this.hornallas = hornallas;
    }

    public int getCalorias(){
        return this.calorias;
    }

    public void setCalorias(int calorias){
        this.calorias = calorias;
    }

    public String getDimensiones(){
        return this.dimensiones;
    }

    public void setDimensiones(String dimensiones){
        this.dimensiones = dimensiones;
    }

    
    public void imprimir(){
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: "+this.getHornallas());
        System.out.println("Calorias: "+this.getCalorias());
        System.out.println("Dimensiones: "+this.getDimensiones());
    }

    public float creditoConAdicional(int p_cuotas,float p_interes){
        float interes=p_interes*(float)0.01;
        float porcentajePrecio=this.precio*interes;
        float cuotas=(this.precio+porcentajePrecio)/p_cuotas;
        
        if(this.getCalorias()>20000){
            
            return cuotas+100;
        }else{return cuotas;
            }
        
        }
}   