/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe12;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe12 {

    public static float Pi(float n){
         
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        float i = 1;
        float s = -1;
        float d = -1;
        float p = 0;
        
        while(i <= n){
            d = d + 2;
            s = -1 * s;
            p = p + 4 * (s / d);
            i = i + 1;
        }
        
        return p;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n;
        float resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Pi(n);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
