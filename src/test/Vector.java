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
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

         System.out.println("Ingrese la cantidad de jugadores del equipo");

         int tam = leer.nextInt();
         
         
         String[] equipo = new String [tam];
         
         leer.nextLine();
         
         for (int i = 0; i < tam; i++) {
             
             System.out.println("Ingrese el nombre del " + i + "° jugador");
           
              equipo[i] = leer.nextLine();

         }
        
    }
    
}
