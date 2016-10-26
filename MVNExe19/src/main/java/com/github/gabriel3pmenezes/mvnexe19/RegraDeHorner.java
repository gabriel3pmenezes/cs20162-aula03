/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe19;

/**
 * Implementação da Regra de Horner.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class RegraDeHorner {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private RegraDeHorner() {
    }

    /**
     * Realiza a Regra de Horner.
     * @param x O primeiro valor para cálculo da Regra de Horner.
     * @param g O segundo valor para cálculo da Regra de Horner. Valor maior
     * ou igual a um.
     * @param ag O terceiro valor para cálculo da Regra de Horner
     * @param ai O quarto valor para cálculo da Regra de Horner.
     *
     * @return O valor resultante da Regra de Horner.
     *
     * @throws IllegalArgumentException Se o número 'g' for inválido (menor
     * do que um).
     */
public static int horner(final int x, final int g, final int ag, final int ai) {
        if (g < 1) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        int p = ag;
        int i = g - 1;

        while (0 <= i) {
            p = (p * x) + ai;
            i = i - 1;
        }

        return p;
    }
}
