/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadora;
/**
 * Clase que crea la excepcion del patron de diseño de Singleton.
 * @author Diego Sevilla 17238
 * @author Ana Lucia Hernandez 17138
 */
public class SingletonException extends RuntimeException{
    public SingletonException()
    {
        super(); 
    }
//----------------------------------------------- 
    public SingletonException(String s)
    {
        super(s); 
    }
    
}
