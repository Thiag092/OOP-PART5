import java.util.ArrayList;

/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jardin
{
    private String nombre;
    private ArrayList <FiguraGeometrica> figuras;

    
    /**
     * Consctructor de la clase Jardin
     */
    public Jardin(String p_nombre,ArrayList <FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    /**
     * Constructor de la clase Jardin
     */
        public Jardin(String p_nombre,FiguraGeometrica p_figura){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList <FiguraGeometrica>());
        this.agregarigura(p_figura);
    }
    
    
    
    public String getNombre(){
        return this.nombre;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    
    public void setFiguras (ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    

    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    

    public boolean agregarigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    
    public boolean quitarfigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    
    /**
     * Calcula el total de listros necesarios de acuerdo a la superficie total de la figura
     * que se desea pintar
     * 
     * @return: devuelve el total de litros
     */
    public double cuantosLitros(){
        double totalLitros=0;
        for(FiguraGeometrica unaFigura: this.getFiguras()){
            totalLitros+=unaFigura.superficie();
            
        }
        
        return (totalLitros*4)/20;
    }

    /**
     * Clacula el total de latas necesarios para pintar las figuras
     */
    public int cuantasLatas(){
        return (int) Math.ceil(this.cuantosLitros() / 4);
    }
    
    /**
     * Calcula la cantidad de metros cuadrados a cubrir de acuerdo a las dimensiones
     * de todas las figuras contenidas en el array
     * 
     * @return: suma total de la superficie
     */
    public double cuantosMetros(){
        double totalMetros=0;
        for(FiguraGeometrica unaFigura: this.getFiguras()){
            totalMetros+=unaFigura.superficie();
            
        }
        return totalMetros;
        }
    
        /**
         * Este metodo imprimir los datos de las figuras contenidas en el arreglo
         * tales como su tipo y su supeficie, asi como la superficie total a cubrir
         * y la cantidad de latas necesarias
         */
    public void detalleFiguras(){
        for(FiguraGeometrica unaFigura: this.getFiguras()){
            System.out.println(unaFigura.nombreFigura());
            System.out.println("Superficie: "+unaFigura.superficie());
        }
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: "+this.cuantosMetros());
        System.out.println("Comprar "+this.cuantasLatas()+" latas");

    }   
    
}