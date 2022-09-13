/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author A286579
 */
public class Letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
                 Scanner leer = new Scanner(System.in);
            
             String frase;
             
             System.out.println("Ingrese una frase");
    
             frase = leer.nextLine();
             
             
            if ( frase.substring(0, 1).equalsIgnoreCase("a")){
                
                System.out.println("Correcto");
                
            } else{
                
                System.out.println("Incorrecto");
                
            }
                    
                    
                    
                    
                    

    
    }
    
}
