
/**
 * Write a description of class Heladera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;

    
    
    public Heladera(String p_marca, float p_precio, int p_stock,int p_pies,
   int p_puertas, boolean p_compresor){
       super(p_marca,p_precio,p_stock);
       this.setPies(p_pies);
       this.setPuertas(p_puertas);
       this.setCompresor(p_compresor);
       
   }

    public int getPies(){
        return this.pies;
    }

    private void setPies(int p_pies){
        this.pies = p_pies;
    }

    public int getPuertas(){
        return this.puertas;
    }

    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }

    public boolean getCompresor(){
        return this.compresor;
    }

    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    
    public float creditoConAdicional(int p_cuotas,float p_interes){
        float interes=p_interes*(float)0.01;
        float porcentajePrecio=this.precio*interes;
        float cuotas=(this.precio+porcentajePrecio)/p_cuotas;
        if(this.getCompresor()==true){
            
            return cuotas+50;
        }else{return cuotas;
            }
        
        }
    

    public void imprimir(){
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: "+this.getPies());
        System.out.println("Puertas: "+this.getPuertas());
        System.out.println("Tiene compresor?: ");
        if(this.getCompresor()==true){
        System.out.println("Si");}
        else{System.out.println("No");
        }
    }
}
    

