import java.util.Scanner;

/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Consulta de cuotas sobre heladera");
        Heladera heladera1=new Heladera("\nSamsung", 20000,10,4,2,true);
        
        
        
        System.out.println("Ingrese cantidad de cuotas");
        int cuotas1=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Ingrese valor del interes");
        float interes1=teclado.nextFloat();
        teclado.nextLine();
        
        heladera1.cuotaCredito(cuotas1, interes1);
        System.out.println("----------------------------------------------");
        heladera1.imprimir();
        System.out.println("\nCuotas: "+cuotas1+" - Interes: "+interes1+"%");
        System.out.println("Valor cuota "+ heladera1.cuotaCredito(cuotas1, interes1));
        System.out.println("Valor cuota con adicionales: "+
        heladera1.creditoConAdicional(cuotas1, interes1));
        
        System.out.println("----------------------------------------------");
        Lavarropas lavarropas1=new Lavarropas("BGH",30000,20,3,200,true);
        
        System.out.println("\nConsulta de cuotas sobre lavarropas");
        System.out.println("Ingrese cantidad de cuotas");
        int cuotas2=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Ingrese valor del interes");
        float interes2=teclado.nextFloat();
        teclado.nextLine();
        
        lavarropas1.cuotaCredito(cuotas2, interes2) ;  
        System.out.println("----------------------------------------------");
        lavarropas1.imprimir();
        
        System.out.println("\nCuotas: "+cuotas2+" - Interes: "+interes2+"%");
        System.out.println("Valor cuota "+ lavarropas1.cuotaCredito(cuotas2, interes2));
        System.out.println("Valor cuota con adicionales: "+
        heladera1.creditoConAdicional(cuotas2, interes2));
        
        
    }
}
