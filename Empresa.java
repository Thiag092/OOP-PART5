
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
public class Empresa
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        Calendar fecha1=new GregorianCalendar(1992,12,10);
        Calendar fecha2=new GregorianCalendar(2013,2,12);
        
        System.out.println("\n***Ingrese informacion del empleado***");
        System.out.println("Ingrese DNI");
        int nroDni1=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Ingrese CUIL");
        long cuil1=teclado.nextLong();
        teclado.nextLine();
        
        System.out.println("Ingrese Nombre");
        String nombre1=teclado.nextLine();
        
        System.out.println("Ingrese Apellido");
        String apellido1=teclado.nextLine();
        
        System.out.println("Ingrese sueldo basico");
        double sueldo1=teclado.nextDouble();
        teclado.nextLine();
        
        Empleado empleado1= new Empleado (nroDni1,cuil1, nombre1, apellido1,sueldo1, fecha1, fecha2);
        System.out.println("\n***DATOS CARGADOS CORRECTAMENTE!***");
        
        
        
        System.out.println("--------------------------------------------------");
        
        empleado1.Mostrar();
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