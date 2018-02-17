
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
    
    if(tail == null){
        tail = null;
    }
    Node<E> temp = tail;
    tail = tail.next();
    count--;
    return temp.value();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public double operar(String linea) {
        double result = 0;    
        CircularLinkedList<String> list = new CircularLinkedList<String>();
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        list.addLast(caracter);
                    }
                    //Si por el contrario el usuario ingresa algun operando de los 
                    //Basicos deberia de efectuar tal operacion y lo hace con una 
                    //comparacion de Strings
                    //Cabe notar que en los Stacks solamente se puede sacar el 
                    //Ultimo valor asi que para operar se guarda este valor de forma
                    //Temporal en una variable para que asi de esta forma
                    //se pueda operar el ultimo elemento despues del antepenultimo
                    //en la operacion, de tal forma que obtiene un valor a y un valor b
                    //pero los opera como b (signo)a                    
                    else if(caracter.contentEquals("+")){                        
                        result = Double.parseDouble(list.removeLast()) + Double.parseDouble(list.removeLast());
                        list.addLast(Double.toString(result));
                        
                    }else if(caracter.contentEquals("-")){
                        result = -Double.parseDouble(list.removeLast()) + Double.parseDouble(list.removeLast());
                        list.addLast(Double.toString(result));
                        //La resta se sustituyo con el metodo de suma con un inverso aditivo
                        
                    }else if(caracter.contentEquals("*")){
                        result = Double.parseDouble(list.removeLast()) * Double.parseDouble(list.removeLast());
                        list.addLast(Double.toString(result));
                        
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
                        result = (1/Double.parseDouble(list.removeLast())) * Double.parseDouble(list.removeLast());
                        list.addLast(Double.toString(result));    
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