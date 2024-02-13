
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo
{
    /**
     * Consctructor de la clase cuadrado
     */
    public Cuadrado (Punto p_origen,double p_lado){
        super(p_origen, p_lado,p_lado);
    }

    
    /**
     * @return: Devuelve una cadena de caracteres, entre dos opciones,
     * de acuerdo a los valores de medida de la figura.
     */
    public String nombreFigura(){
        return "\n******* Cuadrado *******";
    }
    
    /**
     * Imrpimer las caracteristicas de la figura
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: ("+super.getOrigen().getX()+","+super.getOrigen().getY()+
        ") -"+"Lado: "+super.getAncho());
        System.out.println("Superficie: "+super.superficie()+" - Perimetro: "+super.Perimetro());
    }
    
}
