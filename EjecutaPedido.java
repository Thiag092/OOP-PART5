import java.util.ArrayList;

/**
 * Write a description of class EjecutaPedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutaPedido
{
    public static void main(){
    
        Comun comun1 = new Comun(100.00,100);
        Premium premium1 = new Premium(10,200);
        Premium premium2 = new Premium(7,200);
        
        Renglon renglon = new Renglon(7,500,premium1);
        Renglon renglon2 = new Renglon(57,300,comun1);
        Renglon renglon3 = new Renglon(94,300,premium2);
        
        ArrayList<Renglon> renglones = new ArrayList<Renglon>();
        renglones.add(renglon);
        renglones.add(renglon2);
        renglones.add(renglon3);
        
        Pedido pedido = new Pedido(renglones);
        
        System.out.println("\nAdicional: "+premium1.precio(10));
        pedido.mostrar();
    }
}
