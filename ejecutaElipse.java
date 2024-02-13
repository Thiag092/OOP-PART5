import java.util.Random;
import java.util.Scanner;

/**
 * Se encarga de instanciar objetos de clase Circulo para posteiormente
 * actuar sobre las instanciar creadas segun el menu disponible
 * 
 */
public class ejecutaElipse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random unNumero = new Random();
        //Instanciacion del primer circulo con los datos provistos
        
        
        Punto punto1=new Punto(4,6);
        Punto punto2=new Punto(7,9);
        
        Elipse elipse1=new Elipse(punto1,2,6);
        Circulo circulo1=new Circulo (punto2,9);
        System.out.println("\nDatos del ELIPSE:");
        elipse1.Caracteristicas();
        System.out.println("-----------------------------------------");
        System.out.println("\nDatos del CIRCULO:");
        circulo1.Caracteristicas();
    }
}