package com.github.gabriel3pmenezes.mvnexe12;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste12 {

  

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        CalculoPi.pi(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(3.46, CalculoPi.pi(3), 0.01);
    }

    
}