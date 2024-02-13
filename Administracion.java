import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class Administracion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administracion
{
   public static void main (String [] args){
       ArrayList listaFiguras1=new ArrayList();
       Punto punto1 = new Punto (1,1);
       Rectangulo rectangulo1=new Rectangulo (punto1, 3,5);
       //rectangulo1.mostrarSuperficie();
       //System.out.println("*********************************");
       listaFiguras1.add(rectangulo1);
       
       Punto punto2 = new Punto (2,2);
       Elipse elipse1=new Elipse (punto2, 3,5);
       //elipse1.mostrarSuperficie();
      // System.out.println("*********************************");
       listaFiguras1.add(elipse1);
       
       Punto punto3 = new Punto (3,3);
       Cuadrado cuadrado1=new Cuadrado (punto3, 3);
      // cuadrado1.mostrarSuperficie();
      // System.out.println("*********************************");
        listaFiguras1.add(cuadrado1);       
       
       Punto punto4 = new Punto (4,4);
       Circulo circulo1=new Circulo (punto4, 4);
      // circulo1.mostrarSuperficie();
       //System.out.println("*********************************");
       listaFiguras1.add(circulo1);  
       
       Punto punto5 = new Punto (5,5);
       Triangulo triangulo1=new Triangulo (punto5, 4,8);
       listaFiguras1.add(triangulo1);
       
       
       Jardin jardin1=new Jardin("Patito feo",listaFiguras1);
       
       jardin1.detalleFiguras();
       
   }
}
