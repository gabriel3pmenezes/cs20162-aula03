/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnexe17;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class MVNExe17 {

    public static int Mod(int x, int y){
        
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
        
        int s = x;
        
        while(y <= s){
            s = s - y;
        }
        
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;
        int y;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de x: ");
        
        x = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de y: ");
        
        y = Integer.parseInt(leitor.nextLine());
        
        resultado = Mod(x, y);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
