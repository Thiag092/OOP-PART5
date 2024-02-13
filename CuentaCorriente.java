
/**
 * Abstraccion de una cuenta corriente al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo segun los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
    public class CuentaCorriente extends CuentaBancaria {
     //Definicion de atributos;-------------------------------------------

 
  private double limiteDescubierto;


       
    /**
     * Constructor de la clase CuentaCorriente.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_titular titular de la cuenta
     * 
     */
     public CuentaCorriente(int p_nroCuenta, Persona p_titular){
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
      public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
      super(p_nroCuenta,p_titular,p_saldo);
      }
      
      /**
     *Tercer  Constructor de la clase CuentaCorriente.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_saldo: saldo disponbiel
     * @param: p_titular titular de la cuenta
     * 
     */
   public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo, double p_limite){
       super(p_nroCuenta,p_titular,p_saldo);
       this.setLimiteDescubierto(p_limite);
   }
      
      private void setLimiteDescubierto(double p_limite){
          this.limiteDescubierto=p_limite;
      }
      
      public double getLimiteDescubierto(){
          return this.limiteDescubierto;
      }
      
      /**
       * @return: devuelve un valor boolean de acuerdo a si es posible realizar la extraccion solicitada
       * en relacion con el limite d edescubierto
       * @param: p_importe: importe que se desea extraer
       */
    public boolean PuedeExtraer(double p_importe){
      double limite=this.getSaldo()+this.getLimiteDescubierto();
       if ( p_importe<=limite){
            
           return true;
       }else{
           return false;
       }
       
       }
       
       /**
        * Realiza la extraccion del saldo pasado como parametro, disminuyendo el saldo
        */
       public void Extraccion(double p_importe){
       
           this.setSaldo(this.getSaldo()-p_importe);
       }
   
       /**
        * Realiza una comprobacion con respecto a si el importe pasado com parametro
        * esta disponible con respecto al saldo
        * 
        * @param: p_importe: importe que se desea extraer
        */
   public void Extraer(double p_importe){
       
       if(PuedeExtraer(p_importe)==true){
           Extraccion(p_importe);
       }else{
           System.out.println("*******************************************************************");
           System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
           System.out.println("*******************************************************************");
       }
   }
   
   /**
    * Suma el improte que se esta depositando al saldo
    * @param: p_importe: importe que se suma al saldo al tratarse de un deposito
    */
   public void Depositar (double p_importe){
       this.setSaldo(this.getSaldo()+p_importe);
       }

       /**
     *Imprime los datos solicitados con respecto a la cuenta
     *tales como el titular saldo, descuebioerto y nro de cunta
     */
      public void Mostrar(){
       
       System.out.println("-    Cuenta Corriente    -");
       System.out.println("Nro cuenta: "+this.getNroCuenta());
       System.out.println("Saldo: "+this.getSaldo());
       System.out.println("Titular: "+this.getTitular().NomYaApe());
       System.out.println("Descubierto:" +this.getLimiteDescubierto());
           }
}