
package Operadora;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ana Lucía Hernández (17138) Diego Sevilla (17238)
 */
public class Principal {
    
    public static void main (String[] args) throws IOException{
        int decision = 0;        
        
        System.out.println("Ingrese la direccion o el nombre del documento .txt (en el caso está en la misma carpeta que el programa): ");
        Scanner teclado = new Scanner(System.in);
        String file = teclado.nextLine();
        Calculos calc = new Calculos();
        
    while(decision != 1){
        BufferedReader br = new BufferedReader(new FileReader(file));     
                            
        try {                
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println("¿Desea usar un Stack o una Lista? (Escriba solo el numero) \n1. Stack \n2. Lista");
            String entry = teclado.nextLine();
            switch (entry)
            {
                case "1":
                    entry = "Stack";
                    System.out.println("¿Desea usar un Vector o un ArrayList? (Escriba solo el numero) \n1. Vector \n2. ArrayList");
                    String entryStack = teclado.nextLine();
                    switch(entryStack)
                    {
                        case "1":
                            entryStack = "Vector";
                            if (Double.isNaN(calc.operar(everything, entry, "", entryStack)))
                            {
                                System.out.println("\nMATH ERROR.\n");
                            }
                            else
                            {
                                System.out.println("\n"+calc.operar(everything, entry, "", entryStack)+"\n");                
                            }
                            break;
                        case "2":
                            entryStack = "ArrayList";
                            if (Double.isNaN(calc.operar(everything, entry, "", entryStack)))
                            {
                                System.out.println("\nMATH ERROR.\n");
                            }
                            else
                            {
                                System.out.println("\n"+calc.operar(everything, entry, "", entryStack)+"\n");                
                            }
                            break;
                    }
                    break;
                case "2":
                    entry = "Lista";
                    System.out.println("¿Desea usar una Simplemente encadenada, Doblemente encadenada o Circular? (Escriba solo el numero) \n1. Simplemente encadenada \n2. Doblemente encadenada \n3. Lista circular");
                    String entryLista = teclado.nextLine();
                    switch(entryLista)
                    {
                        case "1":
                            entryLista = "Simplemente encadenada";
                            if (Double.isNaN(calc.operar(everything, entry, entryLista, "")))
                            {
                                System.out.println("\nMATH ERROR.\n");
                            }
                            else
                            {
                                System.out.println("\n"+calc.operar(everything, entry, entryLista, "")+"\n");
                            }
                            break;
                        case "2":
                            entryLista = "Doblemente encadenada";
                            if (Double.isNaN(calc.operar(everything, entry, entryLista, "")))
                            {
                                System.out.println("\nMATH ERROR.\n");
                            }
                            else
                            {
                                System.out.println("\n"+calc.operar(everything, entry, entryLista, "")+"\n");
                            }
                            break;
                        case "3":
                            entryLista = "Lista Circular";
                            if (Double.isNaN(calc.operar(everything, entry, entryLista, "")))
                            {
                                System.out.println("\nMATH ERROR.\n");
                            }
                            else
                            {
                                System.out.println("\n"+calc.operar(everything, entry, entryLista, "")+"\n");
                            }
                            break;
                    }
                    break;
            }           
            
            System.out.println("Desea salir?\n0.No\n1.Si");
            decision = Integer.parseInt(teclado.nextLine());
        
        }finally{
            br.close();
        }  
    }
        
        /**
         * 
    String expresion, String entry, String entryLista, String entryStack
            
            if (Double.isNaN(calc.operar(everything)))
            {
                System.out.println("MATH ERROR.");
            }
            else
            {
                System.out.println(calc.operar(everything));                
            }**/
        
    }
}
