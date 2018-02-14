
/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */


package Operadora;

import java.util.ArrayList;

public class Calculos {
    private StackVector<Double> sv;
    static boolean INSTANCE_FLAG = false;
    
    /**
     * Constructor clase calculos
     */
    public Calculos() throws SingletonException
    {
        
    }
    
    /**
     * 
     * @param expresion: String que contiene todos los numerandos y operaciones que se quieren realizar
     * @param entry: tipo de implementacion que se desea: Pila o Lista
     * @param entryLista: tipo de lista que se desea
     * @param entryStack: tipo de stack que se desea
     * @return el resultado de operar todo lo que dice el string 
     */
    public double operar(String expresion, String entry, String entryLista, String entryStack)
    {
        Factory fac = new Factory();
        Object imp = fac.getStack(entry, entryLista, entryStack);
        double respuesta = 0;
        if (imp instanceof AbstractList)
        {
            AbstractList lista = (AbstractList)imp;
            if (lista instanceof CircularList)
            {
                respuesta = ((CircularList) lista).operar(expresion);
            }
            else if (lista instanceof DoublyLinkedList)
            {
                respuesta = ((DoublyLinkedList) lista).operar(expresion);
            }
            else if (lista instanceof SinglyLinkedList)
            {
                respuesta = ((SinglyLinkedList) lista).operar(expresion);
            }
        }
        else if(imp instanceof AbstractStack)
        {
            AbstractStack stack = (AbstractStack)imp;
            if (stack instanceof StackVector)
            {
                respuesta = ((StackVector) stack).operar(expresion);
            }
            else if (stack instanceof StackArrayList)
            {
                respuesta = ((StackArrayList) stack).operar(expresion);
            }
        }
        return respuesta;
    }
}
