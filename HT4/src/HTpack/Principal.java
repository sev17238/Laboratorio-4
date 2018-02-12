/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTpack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 */
public class Principal {
    
    public static void main (String[] args) throws IOException
    {
        System.out.println("Ingrese la direccion o el nombre del documento .txt (en el caso está en la misma carpeta que el programa): ");
        Scanner teclado = new Scanner(System.in);
        String file = teclado.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(file));
        Calculos calc = new Calculos();
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            if (Double.isNaN(calc.operar(everything)))
            {
                System.out.println("MATH ERROR.");
            }
            else
            {
                System.out.println(calc.operar(everything));                
            }
        
            
        } 
        finally 
        {
            br.close();
        }
    }
}
