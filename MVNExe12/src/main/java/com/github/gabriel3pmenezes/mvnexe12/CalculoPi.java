/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe12;

/**
 * Implementação do cálculo de Pi pelo número 'n'.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class CalculoPi {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private CalculoPi() {
    }

    /**
     * Obtém o pi através do somatório de 'n'.
     * @param n O valor para cálculo do somatório. Valor maior ou igual a um.
     *
     * @return O valor do somatório de pi realizado.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static float pi(final float n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        final float quatro = 4;
        float i = 1;
        float s = -1;
        float d = -1;
        float p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + quatro * (s / d);
            i = i + 1;
        }

        return p;
    }
}

