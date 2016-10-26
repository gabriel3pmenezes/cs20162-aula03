/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe14;

/**
 * Implementação do logaritmo de 'n' e 'k'.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class LogaritmoNatural {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private LogaritmoNatural() {
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
    public static float fatorial(final float n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        float i = 2;
        float f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    /**
     * Obtém a soma para o valor de 'n'.
     * @param n O primeiro valor para cálculo do logaritmo. Valor maior ou
     * igual a um.
     * @param k O segundo valor para o cálculo do logaritmo. Valor maior ou
     * igual a dois
     * @return O valor do logaritmo obtido.
     *
     * @throws IllegalArgumentException Se o número 'n' for inválido
     * (menor do que um) ou se o número 'k' for inválido (menor do que 2).
     */
    public static double logaritmoNatural(final float n, final float k) {
        if ((n < 1) || (k < 2)) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        float  i = 2;
        double e = n + 1;
        double p;
        float  f;

        while (i <= k) {
            p = Math.pow(n, i);
            f = fatorial(i);
            e = e + (p / f);
            i = i + 1;
        }

        return e;
    }
}
