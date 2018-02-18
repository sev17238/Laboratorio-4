
package Operadora;

/**
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

@Override
public int size(){
    return count;
}

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


@Override
public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

@Override
public E removeFirst(){
    DoublyLinkedNode<E> temp = head;
    head = head.next();
    count--;
    return temp.value();
}

@Override
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
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

 @Override
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  } 
  
   @Override
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      DoublyLinkedNode<E> finger = head;
	  
      while (finger != null &&!finger.value().equals(value)){
          finger = finger.next();
      }
      return finger != null;
   }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}