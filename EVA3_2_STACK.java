/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_stack;

/**
 *
 * @author diegi
 */
public class EVA3_2_STACK {

    public static void main(String[] args) {
        System.out.println("Iniciar main");
      A();
        System.out.println("Terminar main");
    }
    
    public static void A (){
        System.out.println("Iniciar A");
        B();
        System.out.println("Terminar A");
    }
    
    public static void B (){
        System.out.println("Iniciar B");
        C();
        System.out.println("Terminar B");
    }
    
    public static void C (){
        System.out.println("Iniciar C");
        int x = 5, y = 0;
    int resu = x / y; // DIVISION ENTRE CERO
        System.out.println("Resultado = " + resu);
        System.out.println("Terminar C");
    }
}
