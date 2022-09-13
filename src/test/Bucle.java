/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author A286579
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner leer = new Scanner(System.in);
            
             int num, suma, limite;
             
             suma = 0;

             System.out.println("Ingrese el límite de numeros a ingresar");
             
             limite = leer.nextInt();

             while (suma <=limite){
             
                 System.out.println("Ingrese un número");
             num = leer.nextInt();

             suma = suma + num;
             
                 
             }
             System.out.println("Fin");

    }
    
}
