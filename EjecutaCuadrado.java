import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class EjecutaCuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutaCuadrado
{
    public static void main (String [] args){
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("\n--------------------------------------------------");

        //crearcuadrado en el punto (7.4, 4.5) y cuyo lado sea un numero aleatorio
        System.out.println("Ingrese datos de un CUADRADO");
        System.out.println("Ingrese el valor de los lados");
        double lado1=teclado.nextDouble();
        teclado.nextLine(); 
        
        System.out.println("\nValores de su CENTRO");
        System.out.println("Ingrese valor de origen X del cuadrado");
        double x2=teclado.nextDouble();
        teclado.nextLine(); 
        System.out.println("Ingrese valor de origen Y del cuadrado");
        double y2=teclado.nextDouble();
        teclado.nextLine(); 
        
        
        Punto punto2 = new Punto (x2,y2);
        Cuadrado cuadrado1 = new Cuadrado (punto2,lado1);
        //mostrar las características del cuadrado creado
        System.out.println("\n--------------------------------------------------");
        cuadrado1.caracteristicas();
        System.out.println("--------------------------------------------------");
        
    }
}
