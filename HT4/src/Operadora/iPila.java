
package Operadora;

/**
 * 
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 * @param <E>
 */
public interface iPila<E> 
{
   /**
    * 
    * @param item: valor que se desea ingresar al stack
    */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * 
    * @return valor que se ingreso de ultimo al stack y que en el metodo se eliminó
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * 
    * @return valor que se ingreso de ultimo al stack
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * 
    * @return si el stack está vacío o no 
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * 
    * @return valor entero del tamaño del stack
    */
   public int size();
   // post: returns the number of elements in the stack
   
   public double operar(String expresion);
}
