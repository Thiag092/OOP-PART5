import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Delegacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delegacion extends Visitante
{
    
    private ArrayList <Individuo> integrantes;
    
    
        public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_intregrante){
        super(p_nombre, p_fecha);
        this.setIntegrantes(new ArrayList<Individuo>());
        this.agregarIndividuo(p_intregrante);
    }
    
       public Delegacion(String p_nombre, Calendar p_fecha, 
       ArrayList <Individuo> p_intregrantes){
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_intregrantes);
    }


        public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
        }

    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }

        
    
    public boolean agregarIndividuo(Individuo p_integrante){
       return  this.getIntegrantes().add(p_integrante);
    }
    
    public boolean quitarIntegrante(Individuo p_integrante){
        return this.getIntegrantes().remove(p_integrante);
    }
    
    public double entrada(){
        double total=0;
        double descuento=0;
        int integrantes=0;
        double entrada=10;
        
        for(Individuo unIntegrante: this.getIntegrantes()){
            integrantes++;
        }
       
        entrada=10*integrantes;
        descuento=entrada*0.10;
        total=entrada-descuento;
        
        return total;
    }
    
    public void mostrar(){
        System.out.println("Delegacion: "+this.getNombre());
        System.out.println("Integrantes");
        for(Individuo unIndividuo: this.getIntegrantes()){
            unIndividuo.mostrar();
            System.out.println("--------------------------------------");
        }
        System.out.println("Cantidad de integrantes: "+this.getIntegrantes().size());
    }

    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        for(Individuo unIntegrante: this.getIntegrantes()){
            if(unIntegrante.getFechaVisita().equals(p_fecha)
        &&unIntegrante.tipoVisitante().equals(p_visitante)){
            unIntegrante.mostrar();
        }
        }
    }
    
    public String tipoVisitante(){
        return "Delegacion";
    }


}