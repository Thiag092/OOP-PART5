
/**
 * Write a description of class Lavarropas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;

    
    public Lavarropas(String p_marca, float p_precio, int p_stock,int p_programas,
   float p_kilos, boolean p_automatico){
       super(p_marca,p_precio,p_stock);
       this.setProgramas(p_programas);
       this.setKilos(p_kilos);
       this.setAutomatico(p_automatico);
       
   }

    public int getProgramas(){
        return this.programas;
    }

    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }

    public float getKilos(){
        return this.kilos;
    }

    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }

    public boolean getAutomatico(){
        return this.automatico;
    }

    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }

    public float creditoConAdicional(int p_cuotas,float p_interes){
        
        float interes=p_interes*(float)0.01;
        float porcentajePrecio=this.precio*interes;
        float cuotas=(this.precio+porcentajePrecio)/p_cuotas;
        float porcentajeDescuento=cuotas*(float)0.02;
        if(this.getAutomatico()==false){
            
            return cuotas-porcentajeDescuento;
        }else{return cuotas;
            }
        
        }

public void imprimir(){
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: "+this.getProgramas());
        System.out.println("Peso: "+this.getKilos());
        System.out.println("Es Automatico?: ");
        if(this.getAutomatico()==true){
        System.out.println("Si");}
        else{System.out.println("No");
        }
    }
}