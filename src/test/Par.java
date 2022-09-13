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
public class Par {
    public static void main(String[] args) {
            
     Scanner leer = new Scanner(System.in);
     
     int num;
     
        System.out.println("Ingrese un número");
        
     num = leer.nextInt();
     
     if (num % 2 == 0){
         
         System.out.println("El número es par");
       
     }else{
         System.out.println("El numero es impar");
         
        
        
    }
     
     
     
     
    }
}
