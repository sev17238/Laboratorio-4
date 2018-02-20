
package Operadora;

/**
 * Clase abstracta que contiene dos metodos comunes en las implementaciones de listas y que <p>
 * implementa a la interfaz iLista.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public abstract class AbstractList<E> implements iLista<E>{
    /**
     * Constructor vacio.
     */
   public AbstractList()   {
 
   }
   /**
    * pre: ninguna<p>
    * post: retorna true si la lista no tiene elementos.
    * @return true o false
    */
   @Override
   public boolean isEmpty()
   {
      return size() == 0;
   }
  /**
   * pre: value is not null<p>
   * post: returns true iff list contains an object equal to value.
   */
   @Override
  public boolean contains(E value)  {
	return -1 != indexOf(value);
  }
  
}
