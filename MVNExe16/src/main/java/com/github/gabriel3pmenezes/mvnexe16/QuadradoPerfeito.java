/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe16;

/**
 * Implementação da checagem de quadrado perfeito.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class QuadradoPerfeito {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private QuadradoPerfeito() {
    }

    /**
     * Checa se o valor 'k' é um quadrado perfeito.
     * @param k O valor para cálculo da checagem. Valor maior ou igual a um.
     *
     * @return Boolean representando a checagem ou não do quadrado perfeito.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static boolean quadradoPerfeito(final int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = 1;
        int q = 1;

        while (q < k) {
            i = i + 2;
            q = q + i;
        }

        return q == k;
    }
}
