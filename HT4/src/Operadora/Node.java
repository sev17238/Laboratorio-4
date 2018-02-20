
package Operadora;

/**
 *  Clase que representa el nodo simple que usa la lista simplemente encadenada.
 * @author Diego Sevilla 17238
 * @author Ana Lucia Hernandez 17138
 */
public class Node<E>{
   private E data; // value stored in this element
   protected Node<E> nextElement; // ref to next
   /**
    * Constructor primario que construye un nuevo nodo simple<p>
    * pre: v is a value, next is a reference to remainder of list<p>
    * post: an element is constructed as the new head of list
    * @param v la indformacion del nodo
    * @param next el puntero hacia el nodo siguiente
    */
   public Node(E v, Node<E> next)   {
       data = v;
       nextElement = next;
   }
   /**
    * Constructor secundario que crea un nodo vacio
    * post: constructs a new tail of a list with value v.
    * @param v la info del nodo
    */
   public Node(E v)   {
      this(v,null);
   }
   /**
    * post: returns reference to next value in list
    * @return el proximo nodo
    */
   public Node<E> next()   {
      return nextElement;
   }
   /**
    * post: sets reference to new next value
    * @param next el valor proximoi
    */
   public void setNext(Node<E> next)   {
      nextElement = next;
   }
   /**
    * post: returns value associated with this element
    * @return la informacion del nodo
    */
   public E value()   {
      return data;
   }
   /**
    * post: sets value associated with this element
    * @param value el valor
    */
   public void setValue(E value)   {
      data = value;
   }
}