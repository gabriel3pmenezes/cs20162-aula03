/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe18;

/**
 * Implementação da raiz quadrada.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class RaizQuadrada {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private RaizQuadrada() {
    }

    /**
     * Obtém a raiz quadrada de 'n' aproximada por 'i'.
     * @param n O valor para cálculo da raiz quadrada. Valor maior ou igual
     * a zero..
     * @param i O valor para aproximação do resultado.
     *
     * @return O valor da raiz quadrada calculada.
     *
     * @throws IllegalArgumentException Se o número 'n' for inválido (menor
     * do que zero).
     */
    public static int raizQuadrada(final int n, final int i) {
        if (n < 0) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        int j = i;
        int r = 1;

        while (0 <= j) {
            r = (r + (n / r)) / 2;
            j = j - 1;
        }

        return r;
    }
}
