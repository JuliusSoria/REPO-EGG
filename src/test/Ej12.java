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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        int correcto, incorrecto;
        correcto = 0;
        incorrecto = 0;

        do {
        
            System.out.println("Ingrese una palabra de 5 caracteres");
                
        palabra = leer.next();
        
        if (palabra.length()==5 && palabra.substring(0,1).equalsIgnoreCase("x") && palabra.substring(4,5).equalsIgnoreCase("o")){
        
            correcto++;
        
        }
        else {
            if (!"&&&&&".equals(palabra)){
                
            incorrecto++;    
            }
            
        }    
        }   while (!"&&&&&".equals(palabra));
          
        System.out.println("Se ingresaron: " + correcto + " cadenas correctas");
        
        System.out.println("Se ingresaron: " + incorrecto + " cadenas incorrectas");  
        
        }
    }


