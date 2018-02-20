
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
    
    public static void main(String[] args) throws IOException{
        int decision = 0;        
        
        System.out.println("Ingrese la direccion o el nombre del documento .txt (en el caso está en la misma carpeta que el programa): ");
        Scanner teclado = new Scanner(System.in);
        String file = teclado.nextLine();
        Calculos calc = new Calculos();
        while(decision != 2){
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
                System.out.println("¿Desea usar un Vector, una Lista o un ArrayList? (Escriba solo el numero) \n1. Vector \n2. ArrayList \n3. Lista");
                String entryStack = teclado.nextLine();
                switch(entryStack)
                {
                    case "1":
                        entryStack = "Vector";
                        if (Double.isNaN(calc.operar(everything, entryStack, "")))
                        {
                            System.out.println("\nMATH ERROR.\n");
                        }
                        else
                        {
                            System.out.println("\n RESULTADO: "+calc.operar(everything, entryStack, "")+"\n");                
                        }
                        break;
                    case "2":
                        entryStack = "ArrayList";
                        if (Double.isNaN(calc.operar(everything, entryStack, "")))
                        {
                            System.out.println("\nMATH ERROR.\n");
                        }
                        else
                        {
                            System.out.println("\n RESULTADO: "+calc.operar(everything, entryStack, "")+"\n");                
                        }
                        break;
                    case "3":
                        entryStack = "Lista";
                        System.out.println("¿Desea usar una lista doblemente encadenada, simplemente encadenada o circular? (Escriba solo el numero) \n1. Doblemente encadenada \n2. Simplemente encadenada \n3. Lista Circular");
                        String entryLista = teclado.nextLine();
                        switch (entryLista)
                        {
                            case "1":
                                entryLista = "Simplemente encadenada";
                                if (Double.isNaN(calc.operar(everything, entryStack, entryLista)))
                                {
                                    System.out.println("\nMATH ERROR.\n");
                                }
                                else
                                {
                                    System.out.println("\n RESULTADO: "+calc.operar(everything, entryStack, entryLista)+"\n");
                                }
                                break;
                            case "2":
                                entryLista = "Doblemente encadenada";
                                if (Double.isNaN(calc.operar(everything, entryStack, entryLista)))
                                {
                                    System.out.println("\nMATH ERROR.\n");
                                }
                                else
                                {
                                    System.out.println("\n RESULTADO: "+calc.operar(everything, entryStack, entryLista)+"\n");
                                }
                                break;
                            case "3":
                                entryLista = "Lista Circular";
                                if (Double.isNaN(calc.operar(everything, entryStack, entryLista)))
                                {
                                    System.out.println("\nMATH ERROR.\n");
                                }
                                else 
                                {
                                    System.out.println("\n RESULTADO: "+calc.operar(everything, entryStack, entryLista)+"\n");
                                }
                                break;

                        }
                }

                System.out.println("Desea salir? \n1. No \n2. Si");
                decision = Integer.parseInt(teclado.nextLine());

            }finally{
                br.close();
            }  
        }
        
    }
}
