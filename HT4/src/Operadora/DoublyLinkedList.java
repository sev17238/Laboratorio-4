
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
   head = new DoublyLinkedNode<E>(value, head, null);
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
   tail = new DoublyLinkedNode<E>(value, null, tail);
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

    @Override
    public double operar(String linea) {
        double result = 0;    
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        linea = linea + " ";
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        list.addFirst(caracter);
                    }
                    
                    else if(caracter.contentEquals("+")){                        
                        result = Double.parseDouble(list.removeFirst()) + Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        
                    }else if(caracter.contentEquals("-")){
                        result = -Double.parseDouble(list.removeFirst()) + Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        //La resta se sustituyo con el metodo de suma con un inverso aditivo
                        
                    }else if(caracter.contentEquals("*")){
                        result = Double.parseDouble(list.removeFirst()) * Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        
                    }else if(caracter.contentEquals("/")){
                        //La division tiene una condicion en la cual si el 
                        //Ultimo valor del vector es igual a 0 definitivamente no
                        //sera capaz de efectuar la division por lo que tirara
                        //al usuario una alerta de que es invalido dividir entre 0.
                        result = Double.parseDouble(list.getFirst());
                        if(result == 0){
                            System.out.println("No se puede dividir entre cero");
                        }
                        else {
                        result = (1/Double.parseDouble(list.removeFirst())) * Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));    
                        //El metodo se sustituyo de division a producto por el inverso multiplicativo
                        }       
                    }            
                }
        }catch(Exception e){
            result = Double.NaN;
        }                    
        return result;        
    }
   
}
