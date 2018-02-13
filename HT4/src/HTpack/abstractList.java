
package HTpack;

/**
 *
 * @author SDiego
 */
public abstract class abstractList<E>implements List<E>{
    private int size;
   public abstractList()
   // post: does nothing
   {
       size = 0;
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
  
    @Override
    public int size(){
      return size;
  }
  
}
