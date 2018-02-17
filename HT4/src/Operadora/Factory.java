/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;

/**
 *
 * @author ana Lucía Hernandez (17138). Diego Sevilla (17238).
 */
class Factory<E> {
    Object implementacion;
    public Factory(){}
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Object getStack(String entry, String entryLista, String entryStack) {
    // seleccion de la implementacion a utilizar:
        
        if (entry.equals("Stack"))
        {
            if(entryStack.equals("Vector"))
            {
                implementacion =  new StackVector<>();
            }
            else if(entryStack.equals("ArrayList"))
            {
                implementacion = new StackArrayList<>();
            }
        }
        else if(entry.equals("Lista"))
        {
            if(entryLista.equals("Simplemente encadenada"))
            {
                implementacion = new SinglyLinkedList<>();
            }
            else if(entryLista.equals("Doblemente encadenada"))
            {
                implementacion = new DoublyLinkedList<>();
            }
            else if(entryLista.equals("Lista Circular"))
            {
                implementacion = new CircularLinkedList<>();
            }
        }
        return implementacion;            
   }
}
