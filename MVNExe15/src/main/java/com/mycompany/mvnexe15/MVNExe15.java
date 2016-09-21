/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe15;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe15 {

    public static float RazaoAurea(float x, float y, float k){
        
         if (x < 0 || x > y || k < 0){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
         
         float c = y;
         float a = x;
         float i = 1;
         float t;
         
         while(i <= k){
             t = c;
             c = c + a;
             a = t;
             i = i + 1;
         }
         
         return (c / a);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        float x;
        float y;
        float k;
        float resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de x: ");
        
        x = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de y: ");
        
        y = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de k: ");
        
        k = Integer.parseInt(leitor.nextLine());
        
        resultado = RazaoAurea(x, y, k);
        
        System.out.println("O resultado é: " + resultado);
        
        
    }
    
}
