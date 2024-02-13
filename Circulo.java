
/**
 * Abstraccion de un Circulo al cual se le solicita diferentes datos
 *  para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Circulo extends Elipse
{
    //Definicion de atributos;-------------------------------------------
    
    private double radio;
    private Punto centro;
    
    /**
     * Constructor de la clase Circulo.
     * cuyos valores ya ya se encuentra pre definidos
     * 
     */
    public Circulo (Punto p_centro,double p_radio){
        super(p_centro,0,0);
        this.setRadio(p_radio);
    }
    
   
    
    //Definimos los setters--------------------------------------------
     /**
     * @param: p_radio: Radio del circulo
     */
    private void setRadio(double p_radio){
        this.radio=p_radio;
    }
    
     /**
     * @param: p_centro; Centro del circulo, determinado por un objeto
     * de clase Punto
     */
        private void setCentro(Punto p_centro){
        this.centro=p_centro;
    }
    
    //Definimos los getters--------------------------------------------
    
     /**
     * @return: devuelve el radio establecido del circulo
     */
        public double getRadio(){
        return this.radio;
    }
    
    public double superficie(){
        double pi=3.14;
        
        return( pi * (this.getRadio()*this.getRadio()));
    }
    
    /**
     * @return: Devuelve una cadena de caracteres, entre dos opciones,
     * de acuerdo a los valores de medida de la figura.
     */
     public String nombreFigura(){
            return "\n***Circulo***";
     }
     public void Caracteristicas(){
        System.out.println( nombreFigura());
        System.out.println("\n Centro: (" + this.getOrigen().getX()+", "+this.getOrigen().getY()+" )");
        System.out.println("\nRadio: " +this.getRadio());
        System.out.println("\n Superficie: " + this.superficie());
    }
}

