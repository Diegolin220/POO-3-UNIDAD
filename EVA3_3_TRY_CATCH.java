/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_try_catch;

/**
 *
 * @author diegi
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        
   
    try{//ES EL BLOQUE QUE INTENTA EJECUTAR EL CODIGO
        //QUE POTENCIALMENTE GENERA UNA EXCEPCION
        int x = 5, y = 0;
    
    int resu = x / y; // DIVISION ENTRE CERO
    
    System.out.println("Resultado = " + resu);
    }catch(ArithmeticException e){
        //AQUI TENEMOS QUE RESOLVER LA EXCEPCION
        e.printStackTrace();
    }
        System.out.println("Termina el programa!!!");
    }
}

