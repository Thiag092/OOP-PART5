import java.util.*;
import java.util.ArrayList;

/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> cargos;
    

    
    public Profesor (int p_nroDni, String p_nombre, String p_apellido, Calendar p_fecha,
    String p_titulo, ArrayList<Cargo> p_cargos){
       super(p_nroDni,p_nombre,p_apellido,p_fecha);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    
    public Profesor (int p_nroDni, String p_nombre, String p_apellido, Calendar p_fecha,
    String p_titulo, Cargo p_cargo){
        super(p_nroDni,p_nombre,p_apellido,p_fecha);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<Cargo>());
        this.agregarCargo(p_cargo);
    }

    public String getTitulo(){
        return this.titulo;
    }

    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }

    
    public ArrayList<Cargo> getCargos(){
       return  this.cargos;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos=p_cargos;
    }
    
    public boolean agregarCargo(Cargo p_cargo){
        if(this.cargos.size()<4){
        return this.getCargos().add(p_cargo);
        }else{
            return false;
        }
    }
    
    public boolean quitarCargo(Cargo p_cargo){
        if(this.getCargos().size()>=1){
            return this.getCargos().remove(p_cargo);
        }else{
            return false;
        }
    }
    
    public void mostrar(){
        System.out.println("\nNombre y Apellido: "+this.NomYaApe());
            System.out.println("DNI :" +this.getNroDni());
             System.out.println("Edad " +this.Edad() + " años");
             System.out.println("Titulo: "+this.titulo);
             this.listarCargos();
              System.out.println("**Sueldo total: "+this.sueldoTotal()+"**");
    }

    public void listarCargos(){
        System.out.println("\n-***** Cargos Asignados *****-");
        System.out.println("--------------------------------");
       for(Cargo unCargo: this.getCargos()){
           System.out.println("\n"+unCargo.getNombreCargo()+" - Sueldo Basico: "
           +unCargo.getSueldoBasico()+" - Sueldo Cargo"+unCargo.sueldoDelCargo()+
           " - Antiguedad: "+unCargo.antiguedad()+" años");
           System.out.println("Horas Docencia: "+unCargo.getHorasDeDocencia());
           System.out.println("--------------------------------");
           
        }
        }    
    
    public double sueldoTotal(){
        double sueldoTotal=0;
        for(Cargo unCargo: this.getCargos()){
            sueldoTotal+=unCargo.sueldoDelCargo();
        }
        return sueldoTotal;
    }
    
    public String mostrarLinea(){
        return"DNI: "+this.getNroDni()+" - Nombre: "+ this.NomYaApe()+" - Sueldo Total: "
        +this.sueldoTotal();
    }
}