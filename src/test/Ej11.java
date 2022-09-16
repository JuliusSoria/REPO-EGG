/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author A286579
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
             Scanner leer = new Scanner(System.in);
         int num1, num2, opcion, suma, resta, multiplicacion, division;
         String op = null;
                 
         System.out.println("Ingrese un número");
        num1 = leer.nextInt();
         System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        resta =  num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        do {
            
        System.out.println("");
        System.out.println("MENU");
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Elija opción:");
        
        
            
        opcion = leer.nextInt();
        
        switch (opcion) {
               case 1: System.out.println("La suma de los dos números es: " + suma);
               break;
               case 2: System.out.println("La resta de los dos números es: " + resta);
               break;
               case 3: System.out.println("La multiplicacion de los dos números es: " + multiplicacion);
               break;
               case 4: System.out.println("La division de los dos números es: " + division);
               break;
               case 5: System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               
               op = leer.next();
               
               if ( op.equals ("N")) {
                   
               break;
               
               } else if (op.equals("S")) {
                   
                   opcion = 6;
                   
                  break;
                   
               }
               default: System.out.println("La opción ingresada es errónea");
                   opcion = 6;
         
        }
         
    }
        while (opcion<6);
    }    
}
