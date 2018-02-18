
package Operadora;
import java.util.Vector;

/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */
public class StackVector<E> extends AbstractStack<E>{
    protected Vector myVector;
    public StackVector()
    {
        myVector=new Vector();
    }
 
    @Override
    public void push(E obj)
    {
        myVector.add(obj);
 
    }
 
    @Override
    public E pop() {
        E p = null;
        if( !myVector.isEmpty()) {
        p = (E) myVector.lastElement();
         myVector.remove( myVector.size() - 1);
    }
    return p;
    }
 
    @Override
    public E peek() {
        return (E)myVector.lastElement();
    }
    
    @Override
    public int size()
    // post: returns the number of elements in the stack
    {
    return myVector.size();
    }
    
    @Override
    public double operar(String linea) {
        double result = 0;    
        StackVector<String> list = new StackVector<String>();
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

   
    /**
    @Override
    public double operar(String expresion) {
        String[] expresionSeparada=expresion.split("");
        int longitud=expresionSeparada.length;
        for (int i=0; i<longitud;i++)
        {
            try
            {
                super.push(Double.parseDouble(expresionSeparada[i]));
            }
            catch(Exception e)
            {
                if(expresionSeparada[i].equals("+"))
                {
                    if (sv.size() > 1) //Esto se hace para ver si ya se tiene un numerando con el cual trabajar
                    { //para evitar errores cuando se ingresen dos operandos consecutivos, por ejemplo.
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1+num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("*"))
                {
                    if (sv.size() > 1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1*num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("-"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1-num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("/"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        if(num2==0)
                        {
                            return Double.NaN;
                        }
                        double resultante = num1/num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
            }
        }
            return sv.peek();
    }
    }**/
}