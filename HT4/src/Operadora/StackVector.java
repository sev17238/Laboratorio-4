/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;
import java.util.Vector;

/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */
public class StackVector<E> extends AbstractStack<E>{
    private StackVector<Double> sv;
    /**
     *  Constructor de la clase
     */
    public StackVector()
    // post: constructs a new, empty stack
    {
        super();
        sv = new StackVector<>();
    }

    @Override
    public double operar(String expresion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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