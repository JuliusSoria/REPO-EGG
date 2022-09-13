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
public class mayusculas {
    
        public static void main(String[] args) {
            
     Scanner leer = new Scanner(System.in);
     
     String frase;
     
            System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
            System.out.println(frase.toUpperCase());
     
            System.out.println(frase.toLowerCase());
     
     
            
        }
        
}
