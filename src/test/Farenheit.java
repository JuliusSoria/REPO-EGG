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
public class Farenheit {
    public static void main(String[] args) {
            
     Scanner leer = new Scanner(System.in);
     
     float C, F;
     
        System.out.println("Ingrese los grados centigrados");
        
        C = leer.nextFloat();

        F = 32 + (9 * C / 5);
        
        System.out.println(C + " equivale a " + F + " grados Fahrenheit");
        
          
     
    }
}
