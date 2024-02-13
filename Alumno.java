import java.util.*;
/**
 * Abstraccion de un alumno al cual se le solicita diferentes datos personales para su posterior
 * publicacion y manejo para le promedio.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */

public class Alumno extends Persona {
   
    /**
     * Atributos de la clase Alumno
     */
    
    private int lu;
    private double nota1;
    private double nota2;
   
    
    /**
     * Constructor de la calse Alumno, el cual los ultimos dos atributos ya estan inicializados en "0".
     * 
     * @param: p_lu: Numero de libreta universitaria del alumno.
     * @param: p_nombre: Nombre del alumno.
     * @param: p_apellido: Apellido del alumno.
     * 
     */
    public Alumno(int p_nroDni,int p_lu, String p_nombre, String p_apellido, Calendar p_anio){
       super(p_nroDni,p_nombre,p_apellido,p_anio);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    //Definimos los setters de cada atributo-----------------------------------------
    /**
     * @param: p_lu: Numero de libreta universitara dle alumno.
     */
    private void setLu(int p_lu){
        this.lu=p_lu;
    }
       
    /**
     * @param: p_nota1: Primera nota de evaluacion del alumno.
     */
    private void setNota1(double p_nota1){
        this.nota1=p_nota1;
    }
    
    /**
     * @param: p_nota2: Segunda nota de evalulaciopn del alumno.
     */
    private void setNota2(double p_nota2){
        this.nota2=p_nota2;
        }
    
    //Ahora definimos los Getters de cada atributo:-------------------------------------
    
    /**
     * @return: Devuelve el numero de libreta universitaria del alumno.
     */
    public int getLu(){
        return this.lu;
        }
    
    
    /**
     * @return: Devuelve la nota dle primer examen del alumno.
     */
    public double getNota1(){
        return this.nota1;
    }
   
    /**
     * @preturn: Devuelve la nota del segundo examen del alumno:
     */
    public double getNota2(){
        return this.nota2;
    }
   
    /**
     * Agrega el valor de la primer nota del alumno.
     */
    public void AgregarNota1(double p_nota1){
        this.setNota1(p_nota1);
    }
    
    /**
     * Agrega el valor de la segunda nota del alumno.
     */
    public void AgregarNota2(double p_nota2){
        this.setNota2(p_nota2);
        }
    
    /**
     * @return: Devuelve tipo de dato booleano de acuerdo a si el promedio de las dos notas del alumno 
     * es suficiente o no para aprobar.
     */
    private boolean Aprueba(){
       
        if((this.Promedio())>=7){
            return true;
        }else{
           return false;
        }
       
    }
   
    /**
     * @return: De acuerdo al resultado del metodo "Aprueba", imprime una cadena de caracteres 
     * correspondiente con su aprobacion o no de la materia.
     */
    private String LeyendaAprueba(){
        if(this.Aprueba()==true){
        return "(APRUEBA)";
    }else{
        return "(DESAPRUEBA)";
    }
    }
   
    /**
     * @return: Devuelve el valor del promedio de las dos notas del alumno.
     */
    public double Promedio (){
        return ((this.getNota1()+this.getNota2())/2);
    }
   
   
    /**
     * Imprime los datos del alumno, tales como nomre completo, numero de librea universitaria,
     * las notas de cada examen con su promedio y estado de aprobacion en la materia.
     */
    public void Mostrar(){
       
        super.Mostrar();
        System.out.println("LU: "+this.getLu());
        System.out.println("NOTAS: "+ this.getNota1()+" - "+this.getNota2());
        System.out.println("Promedio: " + this.Promedio()+this.LeyendaAprueba());
        }
    }  
