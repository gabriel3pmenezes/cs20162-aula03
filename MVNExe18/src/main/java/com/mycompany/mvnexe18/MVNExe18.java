/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe18;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe18 {

    public static int Raiz(int n, int i){
        
        if (n < 0){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
        
        int r = 1;
        
        while(0 <= i){
            r = (r + (n / r))/2;
            i = i - 1;
        }
        
        return r;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        int i;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de i: ");
        
        i = Integer.parseInt(leitor.nextLine());
        
        resultado = Raiz(n, i);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
