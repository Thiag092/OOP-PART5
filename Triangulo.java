
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;


    public Triangulo (Punto p_centro,double p_base, double p_altura){
        super(p_centro);

        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    public double getBase(){
        return this.base;
    }

    private void setBase(double p_base){
        this.base = p_base;
    }

    public double getAltura(){
        return this.altura;
    }

    private void setAltura(double p_altura){
        this.altura = p_altura;
    }

/**
     * @return: Devuelve una cadena de caracteres, entre dos opciones,
     * de acuerdo a los valores de medida de la figura.
     */
        public String nombreFigura(){
            return "\n***Triangulo***";
        }

        public double superficie(){
            double superficie=0;
            superficie=(this.base*this.altura)/2;
            return superficie;
        }
}