
package Operadora;

/**
 * Clase que representa la implementacion de la lista doblemente encadenada y que extiende a<p>
 * abstractList.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 * @param <E> tipo generico o variable
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
private int count;
private DoublyLinkedNode<E> head;
private DoublyLinkedNode<E> tail;
/**
 * pre: contruye una nueva lista doubly.
 */
public DoublyLinkedList(){
   head = null;
   tail = null;
   count = 0;
}

/**
 * pre: el parametro no puede ser null<p>
 * post: agrega un elemento al head de la lista
 * @param value el valor que se quiere en el head
 */
@Override
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

/**
 * Metodo que agrega un valor al final de la lista<p>
 *  pre: value non-null<p>
 *  post: adds element to tail of list
 * @param value el valor
 */
@Override
public void addLast(E value){
   // construct new element
   tail = new DoublyLinkedNode<>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}
/**
 * Metodo que remueve el primer valor en la lista.
 * @return el valor
 */
@Override
public E removeFirst(){
    DoublyLinkedNode<E> temp = head;
    head = head.next();
    count--;
    return temp.value();
}
/**
 * pre: !isEmpty()
 * post: returna y remueve el valor de la cola
 * @return el valor
 */
@Override
public E removeLast(){
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       //tail.setNext(null);
   }
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
      DoublyLinkedNode<E> finger = head;
	  
      while (finger != null &&!finger.value().equals(value)){
          finger = finger.next();
      }
      return finger != null;
   }
   /**
 * pre: ninguna
 * post: returna el tamaño de la lista.
 * @return el numero de elementos en la lista
 */
    @Override
    public int size() {
        return count;
    }
    /**
         * pre: la lista no esta vacia
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
    public E peek() {
        return tail.value();
    }
    /**
   * Retorna el indice del valor introducido como parametro
   * @param value el valor
   * @return el indice del valor
   */
    @Override
    public int indexOf(E value) {
      DoublyLinkedNode<E> finger = head;
      int counter =0;
      while (finger != null &&!finger.value().equals(value))
      {
        finger = finger.next();
        counter++;          
      }
      return counter;
    }
}