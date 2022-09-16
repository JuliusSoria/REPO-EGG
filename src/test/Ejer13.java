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
public class Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int elementos;
        
                Scanner leer = new Scanner(System.in);
          
        elementos = leer.nextInt();
                
    for (int i = 0; i < elementos; i++) {
        
        
    for (int j = 0; j < elementos; j++) {

        if (i==0 || i==elementos-1 || j==0 || j==elementos-1){

        System.out.print("*");
           
        } else {
            
            System.out.print(" ");
        }
        }
        System.out.println("");
                
        }

    }
    
    }
    
    

