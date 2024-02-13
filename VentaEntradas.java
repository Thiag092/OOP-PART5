import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * Write a description of class VentaEntradas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentaEntradas
{
    
    public static void main (String [] args){
    Calendar fecha1=new GregorianCalendar(2023,10,21);
    Calendar fecha2= new GregorianCalendar(2023,10,20);
    Calendar fecha3= new GregorianCalendar(2023,10,19);
    Calendar fecha4= new GregorianCalendar(2023,10,18);
    Calendar fecha5= new GregorianCalendar(2023,11,30);
    
    Calendar fechaNac1=new GregorianCalendar(1992,10,21);
    Calendar fechaNac2= new GregorianCalendar(2000,10,20);
    Calendar fechaNac3= new GregorianCalendar(1999,10,19);
    Calendar fechaNac4= new GregorianCalendar(1980,10,18);
    Calendar fechaNac5= new GregorianCalendar(1997,10,17);
    
    
    Persona persona1=new Persona(123,"Yago","Ayala",fechaNac1);
    Persona persona2=new Persona(444,"Juan", "Gomez",fechaNac2);
    Persona persona3=new Persona(555,"Maria", "Sanchez",fechaNac3);
    
    
    Individuo individuo1=   new Individuo( persona1.NomYaApe(),fecha2,persona1);
    Individuo individuo2=   new Individuo( persona2.NomYaApe(),fecha1,persona2);
    Individuo individuo3=   new Individuo( persona3.NomYaApe(),fecha3,persona3);
    
    //--------------------------------------------------------------------
    
    ArrayList unaDelegacion1=new ArrayList();
    unaDelegacion1.add(individuo2);
    unaDelegacion1.add(individuo3);
    Delegacion delegacion1=new Delegacion("PAMI",fecha1,unaDelegacion1);    
    
    //-----------------------------------------------------------------
    Zoologico zoologico1=new Zoologico("El Caribu",delegacion1);
    zoologico1.nuevoVisitante(individuo1);
    
    
    System.out.println("\nVisitante de tipo Individuo en la fecha "+
    fecha2.get(Calendar.YEAR)+"-"+
    fecha2.get(Calendar.MONTH)+"-"+fecha2.get(Calendar.DAY_OF_MONTH));
    zoologico1.listaTipoVisitantePorFecha(fecha2, "Individuo");
    System.out.println("--------------------------------------");
     
    System.out.println("\nVisitante de tipo Delegacion en la fecha "+fecha1.get(Calendar.YEAR)+"-"+
    fecha1.get(Calendar.MONTH)+"-"+fecha1.get(Calendar.DAY_OF_MONTH));
     zoologico1.listarVisitantePorFecha(fecha1);
     
     
     
    System.out.println("--------------------------------------");

    System.out.println("\nLa recaudacion total ha sido de: "+
    zoologico1.recaudacion(fecha5, fecha4));
    
    }
}