/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe19;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe19 {

    public static int Horner(int x, int g, int ag, int ai){
        
         if (g < 0){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
         
         int p = ag;
         int i = g - 1;
         
         while (0 <= i){
             p = (p * x) + ai;
             i = i - 1;
         }
         
         return p;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;
        int g;
        int ag;
        int ai;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de x: ");
        
        x = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de g: ");
        
        g = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de ag: ");
        
        ag = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de ai: ");
        
        ai = Integer.parseInt(leitor.nextLine());
        
        resultado = Horner(x, g, ag, ai);
        
        System.out.println("O resultado é: " + resultado);
        
    }
    
}
