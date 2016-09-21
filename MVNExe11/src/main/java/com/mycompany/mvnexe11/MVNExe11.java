/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe11;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe11 {

    public static float SomaNaturais(float n){
        
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        float i = 1;
        float s = 0;
        float d;
        
        while (i <= n){
            d = 1 + (i*i);
            s = s + (1/d);
            i = i+ i;
        }
        
        return s;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n;
        float resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = SomaNaturais(n);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
