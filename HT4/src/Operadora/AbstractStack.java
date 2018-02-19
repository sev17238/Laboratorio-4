/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;

/**
 *
 * @author anahernandez
 */
public abstract class AbstractStack<E> implements iPila<E> {
    

    @Override
    public abstract E pop();

    @Override
    public abstract E peek();

    @Override
    public boolean empty() {
        return size() == 0;
    }
    @Override
    public int size()
    // post: returns the number of elements in the stack
    {
            return size();
    }

    
    
}
