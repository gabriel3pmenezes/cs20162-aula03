/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe17;

/**
 * Implementação da soma dos 'n' primeiros números naturais.
 * <p>Algoritmo correspondente ao obtido da lista da aula 3,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class RestoDivInteira {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private RestoDivInteira() {}

    /**
     * Obtém a soma para o valor de 'n'.
     * @param x O primeiro valor para o cálculo da divisão. Valor maior ou
     * igual a zero.
     * @param y O segundo valor para o cálculo da divisão. Valor maior ou
     * igual a zero.
     *
     * @return O valor do resto da divisão inteira.
     *
     * @throws IllegalArgumentException Se o número 'x' for inválido (menor
     * do que zero) ou se o número 'y' for inválido (menor do que zero).
     */
    public static int resto(final int x, final int y) {
        if ((x < 0) || (y < 0)) {
            throw new IllegalArgumentException("Número(s) fora da faixa");
        }

        int s = x;

        while (y <= s) {
            s = s - y;
        }

        return s;
    }
}
