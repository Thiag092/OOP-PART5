import java.util.ArrayList;

/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facultad
{
    private String nombre;
    private ArrayList <Profesor> profesores;


    public Facultad (String p_nombre,ArrayList <Profesor> p_profesores){
        
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
        
    }
    
    public Facultad (String p_nombre,Profesor p_profesor){
        
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList <Profesor> ());
        this.agregarProfesor(p_profesor);
        
    }
    
    //Definimos los getters y setters----------------------------------------------------------
        
    public String getNombre(){
        return this.nombre;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    

    public java.util.ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    

    private void setProfesores(java.util.ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
        
    }

    //---------------------------------------------------------------------------------------------
    
    
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    public boolean quitarProfesor(Profesor p_profesor){
        if(this.getProfesores().size()>=1){
            return this.getProfesores().remove(p_profesor);
        }else{
            return false;
        }
    }
    
    public void nominaProfesores(){
        System.out.println("------------------------------------------------------------------");
        for(Profesor unProfesor: this.getProfesores()){
            System.out.println("DNI: "+unProfesor.getNroDni()+"; Nombre: "+unProfesor.NomYaApe()+
            " - Sueldo total: "+unProfesor.sueldoTotal());
        }
        System.out.println("------------------------------------------------------------------");
    }
    
    public double totalAPagar(){
        double total=0;
        for(Profesor unProfesor: this.getProfesores()){
            total+=unProfesor.sueldoTotal();
        }
        return total;
    }
    
    public void listarProfesorCargos(){
             System.out.println("------------------------------------------------------------");
            System.out.println("\n***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
             for(Profesor unProfesor: this.getProfesores()){
                
              
                System.out.println("------------------------------------------------------------");
                System.out.println("Nombre y Apellido: "+unProfesor.NomYaApe());
                System.out.println("DNI: "+unProfesor.getNroDni());
                System.out.println("Titulo: "+unProfesor.getTitulo());
                unProfesor.listarCargos();
                System.out.println("\n**Sueldo total del profesor: **"+unProfesor.sueldoTotal()+"**");
              }
              System.out.println("\n******************");
              System.out.println("*Hay "+this.getProfesores().size()+" profesores*");
              System.out.println("******************");
    }

}