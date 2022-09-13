/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
/**
 *
 * @author A286579
 */
public class Doble {
    
    public static void main(String[] args) {
            
     Scanner leer = new Scanner(System.in);
     
     float num, doble, triple, raiz;
    
        System.out.println("Ingrese un numero");
     
     num = leer.nextFloat();
     
     doble = num * 2;
     
     triple = num * 3;
     
     raiz = (float) Math.sqrt(num);
     
        System.out.println("El doble de " + num + " es " + doble + "el triple es " + triple + " y la raiz cuadrada es " + raiz);
     
     
     
    }
}
