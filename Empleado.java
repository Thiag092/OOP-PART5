
import java.util.*;

 /**
 * Abstraccion de un empleado al cual se le solicita diferentes datos personales para su posterior publicacion y manejo.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Empleado extends Persona {
   //Definicion de los atributos de la clase Empleado------------------------------------------------
   
    private long cuil;
    
    private double sueldoBasico;
    private Calendar fechaIngreso;
 
    
    /**
     * Constructor de la clase Empleado.
     * 
     * @param: p_cuil: Numero de cuil del empelado de hasta 11 digitos.
     * @param: p_nombre: Nombre del empleado.
     * @param: p_apellido: Apellido del empleado.
     * @param: p_importe; Sueldo basico del empleado.
     * @param: p_anio: Anio de ingreso del empleado.
     * 
     */
    public Empleado(int p_nroDni,long p_cuil, String p_nombre, String p_apellido, double p_importe,Calendar p_nacimiento, Calendar p_fecha){
        super(p_nroDni,p_nombre,p_apellido,p_nacimiento);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
       
        
    }
   
    //Definimos los setters de cada atributo-----------------------------------------
    
    /**
     * @param: p_cuil: Numero de cuil del empleado, de hasta 11 digitos.
     */
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
      }
    
    
    
    /**
     * @param: p_importe; Sueldo basico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico=p_sueldoBasico;
    }
    
    /**
     * @param: p_anio: Anio de ingreso del empleado.
     */
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso=p_fecha;
    }
    
    //Ahora definimos los Getters de cada atributo:-------------------------------------
    
    /**
     * @return: Devuelve el numero de cuil del empleado.
     */
    public long getCuil(){
        return this.cuil;
          }
    
    
    
    /**
     * Devuelve el sueldo basico dle empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * @return: Devuelve el anio de ingreso del empleado.
     */
    public Calendar getFechaIngreso(){
        return fechaIngreso;
    }
    
    /**
     * Calcula la antiguedad del empleado, obtenido como resultado de la resta dle anio actual con el de ingreso del mismo.
     * 
     * @return: antiguedad del empleado en la empresa.
     */
    public int Antiguedad(){
       
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
       
        int antiguedad = anioHoy - this.fechaIngreso.get(Calendar.YEAR);
        return antiguedad;
    }
   //----------------------------------------------------------------------------------------------------
   
   /**
    * Calcula el valor del sueldo basico, menos las deducciones por obra social y seguro de vida.
    * 
    * @return: Devuelve el nuevo sueldo basico menos las deducciones mencionadas.
    */
    private double Descuento(){
    double seguroVida = 1500;
    double obraSocial = (sueldoBasico * 0.02);
    double descuentoTotal = obraSocial + seguroVida;
    return descuentoTotal;
}

   
    /**
     * Modifica el sueldo del empleado con respecto a los adicionales, en concepto de antiguedad.
     * 
     * @return: Nuevo valor del sueldo basico con los adicionales.
     */
   private double Adicional(){
    double sueldoConAdicional = sueldoBasico;
    if (this.Antiguedad() < 2) {
        sueldoConAdicional = (sueldoBasico * 0.02); 
    } else if (this.Antiguedad() >= 2 && Antiguedad() < 10) {
        sueldoConAdicional =  (sueldoBasico * 0.04); 
    } else if (this.Antiguedad() >= 10) {
        sueldoConAdicional = (sueldoBasico * 0.06); 
    }
    return sueldoConAdicional;
}

   
    /**
     * Calcula el sueldo neto, correpsondiente al sueldo basico mas el adicional menos los descuentos.
     * 
     * @return: Devbuelve nuevo valor del sueldo.
     */
    public double SueldoNeto(){
    double sueldoNeto = (sueldoBasico + this.Adicional()) - this.Descuento();
    return sueldoNeto;
}

    
    
    /**
     * Une la cadena de caracteres del nombre y apellido del empleado.
     * @return: Devuevle la cadena de caracteres unida.
     */
    public String ApeyNom(){
        
        return super.getApellido()+", "+super.getNombre();
    }
    
    /**
     * Imprime los datos personales del empleado, tales como nombre completo, cuil, antiguedad y sueldo neto.
     */
    public void Mostrar(){
        super.Mostrar();
        System.out.println("CUIL: "+this.getCuil());
        System.out.println("Antiguedad: "+this.Antiguedad()+" años de servicio.");
        System.out.println("Sueldo neto: $" + this.SueldoNeto());
        }
    
    /**
    * Impime los datos personales del empleado en una sola linea.
    * 
    * @return: Datos del empelado en una sola linea.
     */
    public String MostrarLinea(){
            
            return this.getCuil()+"      "+this.ApeyNom()+"..................$"+this.SueldoNeto();
        }
        
        /**
         * @return: Devuelve un valor de tipo bool
         * el cual determina si es el aniversario en la empresa 
         * de dicho empleado o no.
         * Comparando el dia y mes de ingreso con el dia y mes actual
         */
        public boolean EsAniversario(){
            Calendar hoy=new GregorianCalendar();
             return hoy.get(Calendar.MONTH)==this.getFechaIngreso().get(Calendar.MONTH)&&
            hoy.get(Calendar.DAY_OF_MONTH)==this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
            
        }
}

