import java.util.*;
import java.util.Scanner;
/**
 * Clase ejcutable de la entidad bancaria, la cual se encarga de incluir nuevos lcientes,
 * cuentas para despues
 * publicar dicha informacio y realizar diversos manejos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escuela
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        Calendar fecha1=new GregorianCalendar(1992,12,10);
        Calendar fecha2=new GregorianCalendar(1992,2,12);
        
        System.out.println("\nIngrese informacion del alumno");
        System.out.println("Ingrese DNI");
        int nroDni1=teclado.nextInt();
        teclado.nextLine();        
        System.out.println("Ingrese numero libreta universitaria");
        int lu1=teclado.nextInt();
        teclado.nextLine();        
        
        System.out.println("Ingrese Nombre");
        String nombre1=teclado.nextLine();
        
        System.out.println("Ingrese Apellido");
        String apellido1=teclado.nextLine();
        Alumno alumno1= new Alumno (nroDni1,lu1, nombre1, apellido1, fecha1);
        System.out.println("\n***DATOS CARGADOS CORRECTAMENTE!***");
        
        System.out.println("\nIngrese primer nota de examen");
        double nota11=teclado.nextInt();
                teclado.nextLine();
            alumno1.AgregarNota1(nota11);
        
        System.out.println("Ingrese segunda nota de examen");
        double nota22=teclado.nextInt();
                teclado.nextLine();
        alumno1.AgregarNota2(nota22);
        
        System.out.println("\n***NOTAS CARGADAS CORRECTAMENTE!***");
        System.out.println("--------------------------------------------------");
        
        alumno1.Mostrar();
        System.out.println("--------------------------------------------------");
        
        //---------------------------------------------------------------------
        
        System.out.println("Ingrese informacion de la persona");
        System.out.println("Ingrese DNI");
        int nroDni2=teclado.nextInt();
        teclado.nextLine();        
        
        
        System.out.println("Ingrese Nombre");
        String nombre2=teclado.nextLine();
        
        System.out.println("Ingrese Apellido");
        String apellido2=teclado.nextLine();
        Persona persona1 = new Persona (nroDni2,nombre2, apellido2,fecha2);
        System.out.println("\n***DATOS CARGADOS CORRECTAMENTE!***");
        System.out.println("--------------------------------------------------");
        persona1.Mostrar();
        
        System.out.println("--------------------------------------------------");            
        
        
        System.out.println("GRACIAS POR USAR EL SERVICIO");
        
        
    }
}