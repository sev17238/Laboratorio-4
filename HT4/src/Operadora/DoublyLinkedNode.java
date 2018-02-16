
package Operadora;

/**
 *
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public class DoublyLinkedNode<E>{
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
            previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v){
    // post: constructs a single element
        this(v,null,null);
    }
    
    public E value()
   // post: returns value associated with this element
   {
      return data;
   }
    
   public DoublyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
   public DoublyLinkedNode<E> previous()
   // post: returns reference to next value in list
   {
      return previousElement;
   }
}