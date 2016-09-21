/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe14;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe14 {
    
    public static float Fatorial(float n){
        
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        float i = 2;
        float f = 1;
        
        while(i <= n){
            f = f * i;
            i = i + 1;
        }
        
        return f;
        
    }

    public static double LogaritmoNatural(float n, float k){
        
        if (n < 1 || k < 2){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
        
        float i = 2;
        double e = n + 1;
        double p;
        float f;
        
        while(i <= k){
            p = Math.pow(n, i);
            f = Fatorial(i);
            e = e + (p / f);
            i = i + 1;
        }
        
        return e;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        float k;
        float n;
        double resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de k: ");
        
        k = Integer.parseInt(leitor.nextLine());
        
        resultado = LogaritmoNatural(n, k);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
