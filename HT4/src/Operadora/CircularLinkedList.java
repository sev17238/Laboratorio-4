
package Operadora;

/**
 * Clase que representa la implementacion de lista circular que extiende a la clase <p>
 * AbstractList.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public class CircularLinkedList<E> extends AbstractList<E>{

private Node<E> tail; 
private int count;
private CircularLinkedList<String> listc;
/**
 * pre: contruye una nueva lista circular.
 */
public CircularLinkedList(){
   tail = null;
   count = 0;
}
/**
 * pre: ninguna
 * post: returna el tamaño de la lista.
 * @return el numero de elementos en la lista
 */
@Override
public int size(){
    return count;
}
/**
 * pre: el parametro no puede ser null
 * post: agrega un elemento al head de la lista
 * @param value el valor que se quiere en el head
 */
@Override
public void addFirst(E value){
   Node<E> temp = new Node<>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}
/**
 * Metodo que remueve el primer valor en la lista.
 * @return el valor
 */
@Override
public E removeFirst(){
    E value = tail.value();
    tail = null;
    return value;
}
/**
 * Metodo que agrega un valor al final de la lista<p>
 *  pre: value non-null<p>
 *  post: adds element to tail of list
 * @param value el valor
 */
@Override
public void addLast(E value){
   addFirst(value);
   tail = tail.next();
}
/**
 * pre: !isEmpty()
 * post: returna y remueve el valor de la cola
 * @return el valor
 */
@Override
public E removeLast(){
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
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
      return tail.value();
  }      
  /**
   * Retorna el indice del valor introducido como parametro
   * @param value el valor
   * @return el indice del valor
   */
  @Override
    public int indexOf(E value) {
        Node<E> finger = tail;
        int counter =0;
        while (finger.next().value() != tail) 
        {
            finger = finger.next();
            counter++;
        }
        return counter;
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
}