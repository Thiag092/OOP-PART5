import java.util.*;
    /**
 * Write a description of class Individuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Individuo extends Visitante
{
    private Persona persona;
    
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }
    
    public Persona getPersona(){
        return this.persona;
    }

    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }

    public double entrada(){
        return 10;
    }
    
    public void mostrar(){
        this.getPersona().Mostrar();
    }

    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().equals(p_fecha)
        &&this.tipoVisitante().equals(p_visitante)){
            this.mostrar();
        }
    }
    
    public String tipoVisitante(){
        return "Individuo";
    }
    
}