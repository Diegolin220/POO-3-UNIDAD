/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_unchecked_ex;

import java.util.Scanner;

/**
 *
 * @author diegi
 */
public class EVA3_1_UNCHECKED_EX {

    public static void main(String[] args) {
    //ARITHMETIC EXCEPTION ---> DIVICION ENTRE CERO 
    int x = 5, y = 0;
    int resu = x / y; // DIVISION ENTRE CERO
        System.out.println("Resultado: " + resu);
        
        
    //NULL POINTER EXCEPTION
    prueba prue= null;
    prue.toString(); //USAR UN OBJETO QUE NO EXISTE
    
    //INDEXOUTOFBOUNDS EXCEPTION
    //ARREGLOS: LEER UNA POSICION QUE NO EXISTE
    int [] arreglo = new int [5]; //0, 1, 2, 3, 4
        System.out.println(arreglo [10]);
        
    //IMPUTMISMATCH EXCEPTION
    //PIDEN UN TIPO DE DATO Y LES MANDA UNO DIFERENTE
    Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero Entero: ");
        int valor = captu.nextInt();
        System.out.println("Valor = " valor);
        
        
        System.out.println("FIN DEL PROGRAMA!!!!!!");
    }
}

class prueba{
}    
