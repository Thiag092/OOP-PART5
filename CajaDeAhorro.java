
/**
 * Abstraccion de una caja de ahorro al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo segun los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
    public class CajaDeAhorro extends CuentaBancaria {
            //Definicion de atributos;-------------------------------------------

   
           private int extraccionesPosibles;
   
   
     
           
            /**
     * Constructor de la clase CajaDeAhorro.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_titular titular de la cuenta
     * 
     */
     public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
      super(p_nroCuenta,p_titular);
      }
   
   /**
     *Segundo  Constructor de la clase CajaDeAhorro.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_saldo: saldo disponbiel
     * @param: p_titular titular de la cuenta
     * 
     */
   public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
       super(p_nroCuenta,p_titular,p_saldo);
   }
   
    /**
     *Segundo  Constructor de la clase CajaDeAhorro.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_saldo: saldo disponbiel
     * @param: p_titular titular de la cuenta
     * 
     */
   public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo, int p_extracciones){
       super(p_nroCuenta,p_titular,p_saldo);
       this.setExtraccionesPosibles(p_extracciones);
   }
   
   
   private void setExtraccionesPosibles(int p_extracciones){
       this.extraccionesPosibles=p_extracciones;
   }
   
   public int getExtraccionesPosibles(){
       return this.extraccionesPosibles;
   }
   
   /**
    * @return: Devuelve un mensaje booleano conforme pueda o no realizar als extracciones
    * siempre y cuando no supere lelimite pre establecido
    */
   public boolean PuedeExtraer(double p_importe){
       if ( extraccionesPosibles<=10 &&this.getSaldo()>=p_importe){
            this.extraccionesPosibles++;
           return true;
       }else{
           return false;
       }
       
       
   }
   
   /**
    * @param: p_importe: Modifica el saldo de la caja restando el saldo actual al tratarse de una extraccion
    * 
    */
   public void Extraccion(double p_importe){
       
           this.setSaldo(this.getSaldo()-p_importe);
   }
   
   
   /**
    * @param: p_importe:  Determina la autorizacion conforme
    * si es posible realizar la extraccion con respecto
    * al saldo disponiblr
    * 
    */
   public void Extraer(double p_importe){
       
       if(PuedeExtraer(p_importe)==true){
           Extraccion(p_importe);
       }else{
           System.out.println("HA ALCANZADO EL LIMITE DE EXTRACCIONES");
       }
   }
   
   
   /**
    * @param: p_importe: Modifica el saldo de la caja restando el saldo actual al tratarse de un deposito
    * 
    */ 
   public void Depositar (double p_importe){
       this.setSaldo(this.getSaldo()+p_importe);
   }
   
   /**
    * Imprinme los datos de l caja solicitados
    */
   public void Mostrar(){
       
       System.out.println("-    Caja de Ahorro    -");
       System.out.println("Nro cuenta: "+this.getNroCuenta());
       System.out.println("Saldo: "+this.getSaldo());
       System.out.println("Titular: "+this.getTitular().NomYaApe());
       System.out.println("Extracciones posibles:" +this.getExtraccionesPosibles());

       
       }
   
}
