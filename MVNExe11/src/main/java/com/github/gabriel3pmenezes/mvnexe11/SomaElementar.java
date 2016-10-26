/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe11;

/**
 * Implementação da soma dos 'n' primeiros números naturais.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class SomaElementar {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private SomaElementar() {
    }

    /**
     * Obtém a soma para o valor de 'n'.
     * @param n O valor para cálculo do somatório. Valor maior ou igual a um.
     *
     * @return O valor do somatório total realizado.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static float somaNaturais(final float n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        float i = 1;
        float s = 0;
        float d;

        while (i <= n) {
            d = 1 + (i * i);
            s = s + (1 / d);
            i = i + i;
        }

        return s;
    }
}
