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
   public Object getStack(String entryStack, String entryLista) {
    // seleccion de la implementacion a utilizar:
        
        if(entryStack.equals("Vector"))
        {
            implementacion =  new StackVector<>();
        }
        else if(entryStack.equals("ArrayList"))
        {
            implementacion = new StackArrayList<>();
        }
        else if(entryStack.equals("Lista"))
        {
            implementacion = new StackList<>(entryLista);
        }
        return implementacion;            
   }
}
