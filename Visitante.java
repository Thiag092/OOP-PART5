import java.util.*;
    /**
 * Write a description of class Visitante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;


    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    
    
    public String getNombre(){
        return this.nombre;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }

    private void setFechaVisita(Calendar p_fechaVisita){
        this.fechaVisita = p_fechaVisita;
    }

    public abstract void mostrar();
    
    public abstract double entrada();
    
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    public abstract String tipoVisitante ();
    

}