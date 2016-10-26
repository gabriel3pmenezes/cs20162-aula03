package com.github.gabriel3pmenezes.mvnexe20;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste20 {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        Fibonacci.fibonacci(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto1() {
        assertEquals(3, Fibonacci.fibonacci(4));
    }
    
    @Test
    public void umNumeroArbitrarioCorreto2() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }
    
    @Test
    public void umNumeroArbitrarioCorreto3() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

}