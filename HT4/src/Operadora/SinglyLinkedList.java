
package Operadora;

/**
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public class SinglyLinkedList<E> extends AbstractList<E>{

   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   @Override
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
   @Override
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
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
  
   @Override
  public E removeLast(){
      return null;
  }
  
   @Override
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
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
      Node<E> finger = head;
	  
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
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
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