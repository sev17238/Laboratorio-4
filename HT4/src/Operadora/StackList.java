/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;

/**
 *
 * @author anahernandez
 */
public class StackList <E> extends AbstractStack<E>{
    private iLista<String> list;
    
    public StackList(String tipo)
    {
        if (tipo.equals("Simplemente encadenada"))
        {
            list = new SinglyLinkedList<>();
        }
        if (tipo.equals("Doblemente encadenada"))
        {
            list = new DoublyLinkedList<>();
        }
        if (tipo.equals("Lista Circular"))
        {
            list = new CircularLinkedList<>();
        }
    }
    @Override
    public void push(E item) {
        list.addLast((String) item);
    }
    @Override
    public E peek()
    {
        return (E) list.peek();
    }
    @Override
    public double operar(String linea) 
    {
        double result = 0;    
        linea = linea + " ";
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        list.addFirst(caracter);
                    }
                    
                    else if(caracter.contentEquals("+")){                        
                        result = Double.parseDouble(list.removeFirst()) + Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        
                    }else if(caracter.contentEquals("-")){
                        result = -Double.parseDouble(list.removeFirst()) + Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        //La resta se sustituyo con el metodo de suma con un inverso aditivo
                        
                    }else if(caracter.contentEquals("*")){
                        result = Double.parseDouble(list.removeFirst()) * Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));
                        
                    }else if(caracter.contentEquals("/")){
                        //La division tiene una condicion en la cual si el 
                        //Ultimo valor del vector es igual a 0 definitivamente no
                        //sera capaz de efectuar la division por lo que tirara
                        //al usuario una alerta de que es invalido dividir entre 0.
                        result = Double.parseDouble(list.getFirst());
                        if(result == 0){
                            System.out.println("No se puede dividir entre cero");
                        }
                        else {
                        result = (1/Double.parseDouble(list.removeFirst())) * Double.parseDouble(list.removeFirst());
                        list.addFirst(Double.toString(result));    
                        //El metodo se sustituyo de division a producto por el inverso multiplicativo
                        }       
                    }            
                }
        }catch(Exception e){
            result = Double.NaN;
        }                    
        return result;        

    }

    @Override
    public E pop() {
        E value = (E)list.peek();
        list.removeLast();
        return value;
    }
    
}
