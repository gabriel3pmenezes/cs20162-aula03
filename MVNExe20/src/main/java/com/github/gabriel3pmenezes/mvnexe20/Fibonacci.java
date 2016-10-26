/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe20;

/**
 * Implementação da Sequência de Fibonacci.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class Fibonacci {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private Fibonacci() {
    }

    /**
     * Obtém o número correspondente na Sequência de Fibonacci para 'n'.
     * @param n O valor para cálculo da sequência. Valor maior ou igual a zero.
     *
     * @return O valor do número correspondente na Sequência de Fibonacci.
     *
     * @throws IllegalArgumentException Se o número 'n' for inválido (menor do
     * que zero).
     */
    public static int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        int a = 0;
        int c = 1;
        int t;
        int i;

        if ((n == 0) || (n == 1)) {
            return n;
        }

        i = 2;

        while (i <= n) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}
