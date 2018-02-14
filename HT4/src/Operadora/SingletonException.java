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
