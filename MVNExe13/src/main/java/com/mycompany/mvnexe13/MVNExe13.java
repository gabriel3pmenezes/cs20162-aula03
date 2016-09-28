package com.mycompany.mvnexe13;


import java.util.Scanner;


public class MVNExe13 {

    public static int Fatorial(int n){
        
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = 2;
        int f = 1;
        
        while(i <= n){
            f = f * i;
            i = i + 1;
        }
        
        return f;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Fatorial(n);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
