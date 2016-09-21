package com.mycompany.mvnexe13;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class MVNExe13 {

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
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n;
        float resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Fatorial(n);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
