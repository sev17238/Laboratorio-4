/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTpack;
import java.util.Vector;

/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */
public class StackVector<E> implements iPila<E>{
    private Vector<E> data;
    /**
     *  Constructor de la clase
     */
    public StackVector()
    // post: constructs a new, empty stack
    {
        data = new Vector<>();
    }

    /**
    * 
    * @param item: valor que se desea ingresar al stack
    */
    @Override
    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.add(item);
    }
    
    /**
    * 
    * @return valor que se ingreso de ultimo al stack y que en el metodo se eliminó
    */
    @Override
    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }
    
    /**
    * 
    * @return valor que se ingreso de ultimo al stack
    */
    @Override
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }
    
    /**
    * 
    * @return valor entero del tamaño del stack
    */
    @Override
    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }
    
    /**
    * 
    * @return si el stack está vacío o no 
    */
    @Override
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }
}