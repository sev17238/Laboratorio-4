
package Operadora;

import java.util.ArrayList;

/**
 *
 * @author anahernandez
 */
public class StackArrayList<E> extends AbstractStack<E>{
    protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

    @Override
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    @Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    @Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}

    @Override
    public double operar(String linea) {
        double result = 0;    
        StackArrayList<String> list = new StackArrayList<String>();
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        list.push(caracter);
                    }
                    //Si por el contrario el usuario ingresa algun operando de los 
                    //Basicos deberia de efectuar tal operacion y lo hace con una 
                    //comparacion de Strings
                    //Cabe notar que en los Stacks solamente se puede sacar el 
                    //Ultimo valor asi que para operar se guarda este valor de forma
                    //Temporal en una variable para que asi de esta forma
                    //se pueda operar el ultimo elemento despues del antepenultimo
                    //en la operacion, de tal forma que obtiene un valor a y un valor b
                    //pero los opera como b (signo)a                    
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