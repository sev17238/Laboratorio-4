
package Operadora;

/**
 * Clase que representa la implementacion de una lista simplemente encadenada.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 * @param <E> tipo generico o variable
 */
public class SinglyLinkedList<E> extends AbstractList<E>{

   protected int count; // list size
   protected Node<E> head; // ref. to first element
   /**
    * Se construye una nueva lista simplemente encadenada<p>
    * post: generates an empty list.
    */
   public SinglyLinkedList()   {
      head = null;
      count = 0;
   }
 /**
 * pre: ninguna<p>
 * post: returna el tamaño de la lista.
 * @return el numero de elementos en la lista
 */
   @Override
   public int size()  {
    return count;
  }
 /**
 * pre: el parametro no puede ser null<p>
 * post: agrega un elemento al head de la lista
 * @param value el valor que se quiere en el head
 */
   @Override
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
   /**
 * Metodo que agrega un valor al final de la lista<p>
 *  pre: value non-null<p>
 *  post: adds element to tail of list
 * @param value el valor
 */
    @Override
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;	  
	  count++;	  
   }
  /**
 * Metodo que remueve el primer valor en la lista.
 * @return el valor
 */
   @Override
  public E removeLast(){
      return null;
  }
  /**
 * Metodo que remueve el primer valor en la lista<p>
 * pre: list is not empty<p>
 * post: removes and returns value from beginning of list
 * @return el valor
 */
   @Override
  public E removeFirst() {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  /**
 * pre: list is not empty
 * post: returns first value in list
 * @return el valor
 */
   @Override
  public E getFirst()  {
      return head.value();
  }      
    /**
   * pre: el valor no es null
   * post: retorna true si el valor se encuentra en la lista
   * @param value el valor que se quiere encontrar
   * @return true o false
   */
   @Override
   public boolean contains(E value)  {
      Node<E> finger = head;
	  
      while (finger != null &&!finger.value().equals(value)){
          finger = finger.next();
      }
      return finger != null;
   }
   /**
         * pre: la lista no esta vacia
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
   @Override
    public E peek()
    {
        Node<E> finger = head;
	E value = null;
        while (finger != null)
        {
            finger = finger.next();
            value = finger.value();
        }
        return value;
    }
  /**
   * Retorna el indice del valor introducido como parametro
   * @param value el valor
   * @return el indice del valor
   */
    @Override
    public int indexOf(E value) {
        Node<E> finger = head;
        int contador =0;
	while (finger != null &&!finger.value().equals(value))
        {
            finger = finger.next();
            contador++;
        }
        return contador;
    }
}