/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe15;

/**
 * Implementação da Razão Áurea.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class RazaoAurea {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private RazaoAurea() {
    }

    /**
     * Obtém a Razão Áurea a partir dos números 'x', 'y' e 'k'.
     * @param x O primeiro valor para cálculo do somatório. Valor maior ou
     * igual a zero.
     * @param y O segundo valor para cálculo do somatório. Valor maior que 'x'.
     * @param k O terceiro valor para cálculo do somatório. Valor maior
     * que zero.
     *
     * @return O valor da Razão Áurea obtido.
     *
     * @throws IllegalArgumentException Se o número 'x' for inválido (menor que
     * zero), ou se o número 'y' for inválido (menor que 'x') ou se o número
     * 'k' for inválido (menor ou igual que zero).
     */
   public static float razaoAurea(final float x, final float y, final float k) {
        if ((x < 0) || (x > y) || (k <= 0)) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        float c = y;
        float a = x;
        float i = 1;
        float t;

        while (i <= k) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return (c / a);
    }
}
