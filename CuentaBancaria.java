
/**
 * Abastraccionde una cuenta bancaria, con los datos necesarios para identificarla y para su posterior manejo
 * 
 * @author Yago Ayala
 * @version 1.0
 */
public class CuentaBancaria
{
    
    private int nroCuenta;
   private double saldo;
   private Persona titular;
   
   
   
   
   /**
     * Constructor de la clase CuentaBancaria.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_titular titular de la cuenta
     * 
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(0);
       this.setTitular(p_titular);
   }
   
   /**
     *Segundo  Constructor de la clase CuentaBancaria.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_saldo: saldo disponbiel
     * @param: p_titular titular de la cuenta
     * 
     */
   public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setTitular(new Persona(0,""," ",null));
   }
   
   
       //Getteres y Setters-----------------------------------------------------------------
        /**
         * @return: Deuvele el numero de cuenta 
         */
    public int getNroCuenta(){
        return this.nroCuenta;
    }

     /**
         * @param: p_nroCuenta: Nro de la cuenta
         */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
     /**
         * @return: Deuvele el saldo de la cuenta
         */
    public double getSaldo(){
        return this.saldo;
    }
    
     /**
         * @param:p_saldo: saldo disponible de la cuenta bancaria
         */
    protected void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
     

         /**
         * @return: Deuvele el titular de cuenta 
         */
    public Persona getTitular(){
        return this.titular;
    }

         /**
         * @param: p_titular: Titular de la cuenta
         */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    
}
