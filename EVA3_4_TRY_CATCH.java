/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_try_catch2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diegi
 */
public class EVA3_4_TRY_CATCH2 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
    try{
        System.out.println("INTRODUCE EL VALOR: ");
        int valor = captu.nextInt();
        System.out.println("El valor es = " + valor);
    }catch( InputMismatchException e){
        e.printStackTrace();
    }
    }
    }

    

