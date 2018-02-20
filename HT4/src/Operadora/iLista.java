
package Operadora;

/**
 * Interfaz de las clases tipo lista. 
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 */
public interface iLista<E> {
    /**
     * post: returns number of elements in list
     * @return el tamaño de  la lista
     */
    public int size();

/**
 * post: returns true iff list has no elements
 * @return true o false 
 */
   public boolean isEmpty();

/**
 * post: value is added to beginning of list
 * @param value el valor
 */
   public void addFirst(E value);

/**
 * post: value is added to end of list
 * @param value el valor
 */
   public void addLast(E value);
  
/**
 * pre: list is not empty<p>
 * post: returns first value in list
 * @return el valor obtenido
 */
   public E getFirst();

   /**
    * pre: list is not empty<p>
    * post: removes first value from list
    * @return el valor removido en head
    */
   public E removeFirst();

   /**
    * pre: list is not empty<p>
    * post: removes last value from list 
    * @return el valor del final
    */
   public E removeLast();
  
  /**
   * pre: value is not null<p>
   * post: returns true iff list contains an object equal to value
   * @param value el valor que se quiere encontrar
   * @return true o false
   */  
   public boolean contains(E value);

   /**
    * re: value is not null<p>
    * post: returns (0-origin) index of value,<p>
    * or -1 if value is not found
    * @param value el valor
    * @return indice
    */
   public int indexOf(E value);
   /**
    * Returna un valor
    * @return el valor
    */
   public E peek();
}
