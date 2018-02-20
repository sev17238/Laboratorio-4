
package Operadora;

/**
 * Clase abstracta que contiene algunos metodos comunes en las implementaciones de stackXXX y que <p>
 * implementa a la interfaz iPila.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public abstract class AbstractStack<E> implements iPila<E> {
    
     /**
         * pre: el stack no debe estar vacio<p>
         * post: el item mas recientemente metido al stack se saca primero.
        */
    @Override
    public abstract E pop();
     /**
         * pre: el stack no esta vacio
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
    public abstract E peek();
    /**
    * pre: ninguna<p>
    * post: retorna true si el stack no tiene elementos.
    * @return true o false
    */
    @Override
    public boolean empty() {
        return size() == 0;
    }
    /**
         * post: se retorna el numero de elementos del stack
         * @return un entero
         */
    @Override
    public int size()    {
            return size();
    }

    
    
}
