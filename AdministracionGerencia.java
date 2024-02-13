    import java.util.ArrayList;
/**
 * Write a description of class AdministracionGerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdministracionGerencia
{
   public static void main (String [] args){
       ArrayList servicios1=new ArrayList();
       
       
       Servicio servicio1= new Servicio("Alquiler de auto",50);
       Servicio servicio2=new Servicio("Lavanderia", 30);
      Cabana alojamiento1=new Cabana("La Alondra", 100,5,servicio1,3);
      alojamiento1.agregarServicio(servicio2);
       
       //------------------------------------------------------------------
      
      Servicio servicio3=new Servicio("Lavanderia", 30);
      Servicio servicio4=new Servicio("Internet", 20);
       Hotel alojamiento2=new Hotel("Hotel Guarani",200,7,servicio3,"single");
       alojamiento2.agregarServicio(servicio4);
       
       //--------------------------------------------------
       
       
       Servicio servicio5= new Servicio("Alquiler de auto",50);
       Servicio servicio6=new Servicio("Lavanderia", 30);
      Cabana alojamiento3=new Cabana("Rnacho", 100,5,servicio5,3);
      alojamiento3.agregarServicio(servicio6);
       
       //------------------------------------------------------------------
       Gerencia gerencia1=new Gerencia ("Los Arroyos",alojamiento1);
       gerencia1.agregarAlojamiento(alojamiento2);
       gerencia1.agregarAlojamiento(alojamiento3);
       gerencia1.mostrarliquidacion();
       
   }
}