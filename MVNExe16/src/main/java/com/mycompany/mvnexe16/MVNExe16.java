/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe16;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe16 {

    public static boolean QuadradoPerfeito(int k){
        
        if (k < 1){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
        
        int i = 1;
        int q = 1;
        
        while(q < k){
            i = i + 2;
            q = q + 1;
        }
        
        if(q == k){
            return true;
        }
        else {
            return false;
        }
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k;
        boolean resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de k: ");
        
        k = Integer.parseInt(leitor.nextLine());
        
        resultado = QuadradoPerfeito(k);
        
        System.out.println("O resultado é: " + resultado);
        
    }
    
}
