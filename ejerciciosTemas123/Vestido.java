
/**
 * Clase Vestido.
 * 
 * @author Alba
 * @version 2015
 */
public class Vestido
{
   
    //Atributos
   private double  precio;
   private char    talla;
   private boolean esAjustado;
   
   //Metodos
   /**
    * El vestido se basa en los siguientes parametros:
    * @param double  precio
    * @param char    talla
    * @param boolean esAjustado
    */
   public Vestido(double precio, char talla, boolean esAjustado) {
       this.precio     = precio;
       this.talla      = talla;
       this.esAjustado = esAjustado;
   }
   
   /**
    * Getter del atributo precio.
    */
   public double getPrecio() {
       return this.precio;
   }
   
   /**
    * Setter del atributo precio.
    * @param double nuevoPrecio
    */
   public void setPrecio(double nuevoPrecio) {
       this.precio = nuevoPrecio;
   }
   
   /**
    * Getter del atributo talla.
    */
   public char getTalla() {
       return this.talla;
   }
   
   /**
    * Setter del atributo talla.
    * @char nuevaTalla
    */
   public void setTalla(char nuevaTalla) {
       this.talla = nuevaTalla;
   }
   
   /**
    * Getter del atributo esAjustado.
    */
   public boolean getEsAjustado() {
       return this.esAjustado;
   }
   
   /**
    * Setter del atributo esAjustado.
    * @param boolean esAjustado
    */
   public void setAjustado(boolean nuevoEsAjustado) {
       this.esAjustado = nuevoEsAjustado;
   }
   
   /**
    * Metodo calcular precio.
    * @param int numeroDeVestidos
    */
   public double calcularPrecio(int numeroDeVestidos)  {
       return this.precio * numeroDeVestidos;
   }
   
   /**
    * Metodo que dice si te lo puedes permitir. 
    * @param double presupuesto
    */
   public boolean puedesComprarlo(double presupuesto) {
       return this.precio <= presupuesto;
   }
}
