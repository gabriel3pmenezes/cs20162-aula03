package com.mycompany.mvnexe20;

import java.util.Scanner;

public class MVNExe20 {

    public static int Fibonacci(int n){
        
        if (n < 0){
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }
        
        int a = 0;
        int c = 1;
        int t;
        int i;
        
        if ((n == 0) || (n == 1)){
            return n;
        }
        
        i = 2;
        
        while (i <= n){
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        
        return c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Fibonacci(n);
        
        System.out.println("O resultado é: " + resultado);
        
    }
    
}
