
/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */


package Operadora;

import java.util.ArrayList;

public class Calculos {
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
    public double operar(String expresion, String entryStack, String entryLista)
    {
        Factory fac = new Factory();
        Object imp = fac.getStack(entryStack, entryLista);
        double respuesta = 0;
        if (imp instanceof AbstractList)
        {
            StackList lista = (StackList)imp;
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
