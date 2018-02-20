
package Operadora;

/**
 * Clase que representa el nodo doble que usa la lista doblemente encadenada.
 * @author Diego Sevilla 17238
 * @author Ana Lucia Hernandez 17138
 */
public class DoublyLinkedNode<E>{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;
    /**
     * Constructor primario que construye un nuevo nodo doble.
     * @param v la informacion del nodo
     * @param next el puntero hacia el nodo posterior
     * @param previous el punetre hacia el nodo anterior
     */
    public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
            previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }
    /**
     * Constructor secundario que construye un nodo doble vacio<p>
     * post: cosntruye un nodo vacio
     * @param v la informacion
     */
    public DoublyLinkedNode(E v){
        this(v,null,null);
    }
    /**
     * post: returns value associated with this element
     * @return la informacion del nodo
     */
    public E value()   {
      return data;
   }
   /**
    * post: returns reference to next value in list
    * @return el proximo nodo
    */
   public DoublyLinkedNode<E> next()   {
      return nextElement;
   }
   /**
    * post: returns reference to previus value in list
    * @return el nodo anterior
    */
   public DoublyLinkedNode<E> previous()   {
      return previousElement;
   }
}