import java.util.ArrayList;
/**
 * Write a description of class Gerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerencia
{
    private String nombre;
    private ArrayList <Alojamiento> alojamientosAlquilados;
    
    
    
    public Gerencia(String p_nombre,ArrayList <Alojamiento> p_aloamientos){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_aloamientos);
    }
    
    public Gerencia(String p_nombre,Alojamiento p_alojamiento){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(new ArrayList <Alojamiento>());
        this.agregarAlojamiento(p_alojamiento);
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    public ArrayList <Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    
    private void setAlojamientosAlquilados(ArrayList <Alojamiento> p_alojamientos){
        this.alojamientosAlquilados=p_alojamientos;
    }
    
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    public int contarAlojamiento(String tipoAlojamiento){
        int total=0;
        for(Alojamiento unAlojamiento: this.getAlojamientosAlquilados()){
           total+= unAlojamiento.contar(tipoAlojamiento);
           
        }
        return total;
    }
    
    public void liquitar(){
        
        
        for(Alojamiento unAlojamiento: this.getAlojamientosAlquilados()){
            unAlojamiento.liquitar();
            
        }
        
    }
    
    public void mostrarliquidacion(){
        System.out.println("Gerencia"+this.getNombre());
        System.out.println("Liquidacion---------------------");
        liquitar();
        System.out.println("Alojamiento tipo Cabaña---->"
        +contarAlojamiento("Cabana"));
        System.out.println("Alojamiento tipo Hotel ---->"+contarAlojamiento("Hotel"));
    }
}

