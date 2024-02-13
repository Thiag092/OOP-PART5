import java.util.ArrayList;
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
    private ArrayList<Renglon> renglones;
    
    public Pedido(Renglon p_renglon){
        this.setRenglones(new ArrayList());
        this.agregarRenglon(p_renglon);
    }
    
    public Pedido(ArrayList<Renglon> p_renglones){
        this.setRenglones(p_renglones);
    }
    
    
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    private void setRenglones(ArrayList p_renglones){
        this.renglones=p_renglones;
    }
    
    public boolean agregarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    
    public boolean quitarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    
    public void mostrar(){
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: "+this.getRenglones().size());
        
        int i=1,totalPedidos=0;
        double precioTotal=0;
        
        for(Renglon renglon: this.getRenglones()){
            System.out.println("\nItem "+i+":");
            renglon.mostrar();
            System.out.println("Precio: "+renglon.getItem().precio(renglon.getCantidad()));
            
            i+=1;
            totalPedidos += renglon.getCantidad();
            precioTotal += renglon.getItem().precio(renglon.getCantidad());
        }
        
        System.out.println("\n-- Total pedido: "+totalPedidos+" Etiquetas por un importe total de : $"+precioTotal);
    }
    
    
    }
