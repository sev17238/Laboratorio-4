
package Operadora;

/**
 *
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public class CircularLinkedList<E> extends AbstractList<E>{

protected Node<E> tail; 
protected int count;

public CircularLinkedList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

@Override
public int size(){
    return count;
}

@Override
public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

@Override
public E removeFirst(){
    E value = tail.value();
    tail = null;
    return value;
}

@Override
public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}

// lo dificil es quitar el elemento de la cola
@Override
public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
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

 @Override
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return tail.value();
  }      
  
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

    @Override
    public E peek() {
        return tail.value();
    }
}