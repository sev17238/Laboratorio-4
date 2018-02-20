
package Operadora;

import java.util.ArrayList;

/**
 * Clase que representa la implementacion de arraylist como un stack que extiende a la clase <p>
 * AbstractStack.
 * @author Diego Sevilla 17238
 * @author Ana Lucia Hernandez 17138
 * @param <E> tipo generico o variable
 */
public class StackArrayList<E> extends AbstractStack<E>{
    protected ArrayList<E> data;
        /**
         * post: construye un nuevo stack vacia.
         */
	public StackArrayList()
	{
		data = new ArrayList<E>();
	}
        /**
         * post: el valor es agregado al stack
         * @param item el elemento
         */
    @Override
	public void push(E item)	{
		data.add(item);
	}
        /**
         * pre: el stack no debe estar vacio<p>
         * post: el item mas recientemente metido al stack se saca primero.
        */
    @Override
	public E pop()	{
		return data.remove(size()-1);
	}
        /**
         * pre: el stack no esta vacio
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
	public E peek()	{
		return data.get(size() - 1);
	}
        /**
         * post: se retorna el numero de elementos del stack
         * @return un entero
         */
    @Override 
    public int size()
    {
        return data.size();
    }
    /**
     * Metodo que hace los calculos respectivos basados en la linea ingresada como parametro.
     * @param linea la linea con la operacion postfix
     * @return el resultado de la operacion en la linea postfix
     */
    @Override
    public double operar(String linea) {
        double result = 0;    
        StackArrayList<String> list = new StackArrayList<>();
        linea = linea + " ";
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        list.push(caracter);
                    }
                   
                    else if(caracter.contentEquals("+")){                        
                        result = Double.parseDouble(list.pop()) + Double.parseDouble(list.pop());
                        list.push(Double.toString(result));
                        
                    }else if(caracter.contentEquals("-")){
                        result = -Double.parseDouble(list.pop()) + Double.parseDouble(list.pop());
                        list.push(Double.toString(result));
                        //La resta se sustituyo con el metodo de suma con un inverso aditivo
                        
                    }else if(caracter.contentEquals("*")){
                        result = Double.parseDouble(list.pop()) * Double.parseDouble(list.pop());
                        list.push(Double.toString(result));
                        
                    }else if(caracter.contentEquals("/")){
                        //La division tiene una condicion en la cual si el 
                        //Ultimo valor del vector es igual a 0 definitivamente no
                        //sera capaz de efectuar la division por lo que tirara
                        //al usuario una alerta de que es invalido dividir entre 0.
                        result = Double.parseDouble(list.peek());
                        if(result == 0){
                            System.out.println("No se puede dividir entre cero");
                        }
                        else {
                        result = (1/Double.parseDouble(list.pop())) * Double.parseDouble(list.pop());
                        list.push(Double.toString(result));    
                        //El metodo se sustituyo de division a producto por el inverso multiplicativo
                        }       
                    }            
                }
        }catch(Exception e){           
            result = Double.NaN;
        }                    
        return result;        
    }
}
