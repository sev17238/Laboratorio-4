
package Operadora;

/**
 * Clase que organiza las implementaciones de lista y que estiende a abstractlist.
 * @author Diego Sevilla 17238
 * @author AnaLucia Hernandez 17138
 * @param <E> tipo generico o variable
 */
public class StackList <E> extends AbstractStack<E>{
    private iLista<String> list;
    private iLista<String> listc;
    /**
     * constructor que construye ya sea una lista simplemente encadenada,<p>
     * una doblemente encadenada o una cicular.
     * @param tipo un string que indica el tipo delista a construir
     */
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
            listc = new CircularLinkedList<String>();
        }
    }
    /**
         * post: el valor es agregado a la lista
         * @param item el elemento
         */
    @Override
    public void push(E item) {
        list.addLast((String) item);
    }
    /**
         * pre: la lista no esta vacia
         * post: el valor del tope a ser sacado es returnado
         * @return el objeto del tope
         */
    @Override
    public E peek()
    {
        return (E) list.peek();
    }
    
    /**
         * pre: la lista no debe estar vacia<p>
         * post: el item mas recientemente metido a la lista se saca primero.
        */
    @Override
    public E pop() {
        E value = (E)list.peek();
        list.removeLast();
        return value;
    }
    
   /**
     * Metodo que hace los calculos respectivos basados en la linea ingresada como parametro,<p>
     * que sirve para las implementaciones de las listas simple y doblemente encadenada.
     * @param linea la linea con la operacion postfix
     * @return el resultado de la operacion en la linea postfix
     */
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
    /**
     * Metodo que hace los calculos respectivos basados en la linea ingresada como parametro,<p>
     * que sirve para la implementacion de lista circular.
     * @param linea la linea con la operacion postfix
     * @return el resultado de la operacion en la linea postfix
     */
    public double operarc(String linea) 
    {
        double result = 0;    
        linea = linea + " ";
        try{
            for(int i =1;i<linea.length();i++){
                    String caracter = linea.substring((i-1), i);                                                                                
                    if(caracter.contentEquals("1")||caracter.contentEquals("2")||caracter.contentEquals("3")
                      ||caracter.contentEquals("4")||caracter.contentEquals("5")||caracter.contentEquals("6")
                      ||caracter.contentEquals("7")||caracter.contentEquals("8")||caracter.contentEquals("9")){
                        listc.addLast(caracter);
                    }
                    
                    else if(caracter.contentEquals("+")){                        
                        result = Double.parseDouble(listc.removeLast()) + Double.parseDouble(listc.removeLast());
                        listc.addLast(Double.toString(result));
                        
                    }else if(caracter.contentEquals("-")){
                        result = -Double.parseDouble(listc.removeLast()) + Double.parseDouble(listc.removeLast());
                        listc.addLast(Double.toString(result));
                        //La resta se sustituyo con el metodo de suma con un inverso aditivo
                        
                    }else if(caracter.contentEquals("*")){
                        result = Double.parseDouble(listc.removeLast()) * Double.parseDouble(listc.removeLast());
                        listc.addLast(Double.toString(result));
                        
                    }else if(caracter.contentEquals("/")){
                        //La division tiene una condicion en la cual si el 
                        //Ultimo valor del vector es igual a 0 definitivamente no
                        //sera capaz de efectuar la division por lo que tirara
                        //al usuario una alerta de que es invalido dividir entre 0.
                        result = Double.parseDouble(listc.getFirst());
                        if(result == 0){
                            System.out.println("No se puede dividir entre cero");
                        }
                        else {
                        result = (1/Double.parseDouble(listc.removeLast())) * Double.parseDouble(listc.removeLast());
                        listc.addLast(Double.toString(result));    
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
