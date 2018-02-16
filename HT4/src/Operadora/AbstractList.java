
package Operadora;

/**
 *
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 */
public abstract class AbstractList<E> implements iLista<E>{
 
   public AbstractList()
   // post: does nothing
   {
 
   }

   @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
   @Override
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
  
}
