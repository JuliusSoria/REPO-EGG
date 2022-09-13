/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.

 */
package test;

import java.util.Scanner;

/**
 *
 * @author A286579
 */
public class Eureka {
    public static void main(String[] args) {
            
     Scanner leer = new Scanner(System.in);
     
     String frase, palabra;
     
    palabra = "Eureka";
     
            System.out.println("Ingrese una frase");
            
        frase = leer.nextLine();
     
        if (palabra.equals(frase)) {
            
            System.out.println("Correcto");
            
        }   else { System.out.println("Incorrecto");  
        
        }
    }    
}
