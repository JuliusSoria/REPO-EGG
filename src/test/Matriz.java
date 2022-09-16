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
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);

        String[][] matriz = new String [3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
            
            matriz[i][j] = "A";
            }
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                
                System.out.print("[" + matriz [i][j] + "]");
                
                
            }
            System.out.println("");
        }
        
        
    }
    
}
