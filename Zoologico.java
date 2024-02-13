import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Zoologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoologico
{
    private String nombre;
    private ArrayList<Visitante> visitantes;


    public Zoologico(String p_nombre, Visitante p_visitante){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList());
        this.nuevoVisitante(p_visitante);   
    }
    
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }//end method setNombre

    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }//end method getVisitantes

    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }

    
    public boolean nuevoVisitante(Visitante p_visitante){
        return this.getVisitantes().add(p_visitante);
    }
    
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }

    
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for(Visitante unVisitante: this.getVisitantes()){
            if(unVisitante.getFechaVisita().equals(p_fecha) &&
            unVisitante.tipoVisitante().equals(p_tipoVisitante)){
                unVisitante.mostrar();
            }
        }
    }
    
    public void listarVisitantePorFecha(Calendar p_fecha){
        for(Visitante unVisitante: this.getVisitantes()){
            
            if(unVisitante.getFechaVisita().equals(p_fecha)){
            unVisitante.mostrar();
        }
    }
    }
    
    public double recaudacion(Calendar p_fechaDesde,Calendar p_fechaHasta){
        double recaudacion =0;
        for(Visitante unVisitante: this.getVisitantes()){
            if(unVisitante.getFechaVisita().before(p_fechaDesde)&&
            unVisitante.getFechaVisita().after(p_fechaHasta)){
            recaudacion+=unVisitante.entrada();}
        }
        return recaudacion;
    }
}//End class