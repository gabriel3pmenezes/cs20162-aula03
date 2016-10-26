/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe13;

/**
 * Implementação do cálculo do fatorial de 'n'.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class FatorialNaturais {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private FatorialNaturais() {
    }

    /**
     * Obtém o fatorial para o valor de 'n'.
     * @param n O valor para cálculo do fatorial. Valor maior ou igual a um.
     *
     * @return O valor do fatorial realizado.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static int fatorial(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
