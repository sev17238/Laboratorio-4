
/**
 *
 * @author Ana Lucía Hernández 17138. Diego Sevilla (17238)
 */


package HTpack;

public class Calculos {
    private StackVector<Double> sv;
    
    /**
     * Constructor clase calculos
     */
    public Calculos()
    {
        sv = new StackVector<>();
    }
    
    /**
     * 
     * @param expresion: String que contiene todos los numerandos y operaciones que se quieren realizar
     * @return el resultado de operar todo lo que dice el string 
     */
    public double operar(String expresion)
    {
        String[] expresionSeparada=expresion.split("");
        int longitud=expresionSeparada.length;
        for (int i=0; i<longitud;i++)
        {
            try
            {
                sv.push(Double.parseDouble(expresionSeparada[i]));
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
}
