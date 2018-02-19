/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;

/**
 *
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 */
public interface iLista<E> {
    public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list
   
   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

   public E removeLast();
   // pre: list is not empty
   // post: removes last value from list   
  
   public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value
   
   public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found
   public E peek();
}
