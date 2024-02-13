
/**
 * Abstraccion de un Elipse al cual se le solicita diferentes datos
 *  para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Elipse extends FiguraGeometrica
{
    //Definicion de atributos;-------------------------------------------
    
    private double ejeMayor;
    private double ejeMenor;
    
    /**
     * Constructor de la clase Circulo.
     * cuyos valores ya ya se encuentra pre definidos
     * 
     */
    public Elipse (){
        super(new Punto (0,0));
        this.setEjeMayor(0);
        this.setEjeMenor(0);
        
    }
    
    /**
     *Segundo Constructor de la clase Circulo.
     * 
     * @param: p_radio: Radio del circulo
     * @param: p_centro; Centro del circulo, determinado por un objeto
     * de clase Punto
     * 
     */
    public Elipse (Punto p_centro,double p_mayor, double p_menor){
        super(p_centro);

        this.setEjeMayor(p_mayor);
        this.setEjeMenor(p_menor);
    }
    
    //Definimos los setters--------------------------------------------
     /**
     * @param: p_radio: Radio del circulo
     */
    private void setEjeMayor(double p_mayor){
        this.ejeMayor=p_mayor;
    }

     /**
     * @param: p_radio: Radio del circulo
     */
    private void setEjeMenor(double p_menor){
        this.ejeMenor=p_menor;
    }
    
    
    
    //Definimos los getters--------------------------------------------
    
     /**
     * @return: devuelve el radio establecido del circulo
     */
        public double getEjeMayor(){
        return this.ejeMayor;
    }
    
     /**
     * @return: devuelve el radio establecido del circulo
     */
        public double getEjeMenor(){
        return this.ejeMenor;
    }
    
     
     /**
     * @return: Devuelve la superficie del Circulo
     * luego de realizar el calculo correspondiente
     */
    public double superficie(){
        double pi=3.14;
        
        return( pi * this.ejeMayor * this.ejeMenor);
    }
    
    
     /**
     *Imprime las caracteristicas solicitadas del Circulo
     */
    public void Caracteristicas(){
        
        System.out.println(nombreFigura());
        System.out.println("\n Centro: (" + this.getOrigen().getX()+", "+this.getOrigen().getY()+" )");
        System.out.println("\nSemieje menor: " +this.getEjeMayor());
        System.out.println("\nSemieje mayor: " +this.getEjeMenor());
        System.out.println("\n Superficie: " + this.superficie());
            }
    
     /**
     * @return: devuelve cual de los dos circulos es el mayor, el original
     * o el pasado como parametro
     * 
     * @param: otroCirculo: circulo necesario para realizar la comparacion
     */
        public Elipse ElMayor(Elipse p_otroElipse){
        if (this.superficie() > p_otroElipse.superficie()){
            return this;
        }else{
            return p_otroElipse;
        }
    }
    
    /**
     *Desplaza el centro del circulo con los parametros pasados
     *@param:p_dx: nuevo punto x del centro
     *@param:p_dy: nuevo punto y del centro
     */
    public void Desplazar (double p_dx, double p_dy){
        Punto nuevoPunto = new Punto (p_dx, p_dy);
        
        this.setOrigen(nuevoPunto);
        
    }
    
    /**
     *
     *@return: Devuelve la distancia de los centro de ambos circulos
     *luego de realizar el correspondiente calculo y comparativa
     *
     *@param: otroCirculo: Circulo con le cual se compara
     */
     public double DistanciaA(Circulo otroCirculo){
        Punto centroActual = this.getOrigen();
        Punto centroOtro = otroCirculo.getOrigen();

        double distancia = centroActual.DistanciaA(centroOtro);

        return distancia;
        }
        
        
    /**
     * @return: Devuelve una cadena de caracteres, entre dos opciones,
     * de acuerdo a los valores de medida de la figura.
     */
        public String nombreFigura(){
            return "\n***Elipse***";
        }
}

