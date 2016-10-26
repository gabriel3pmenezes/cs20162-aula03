package com.github.gabriel3pmenezes.mvnexe13;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste13 {

  

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        FatorialNaturais.fatorial(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(6, FatorialNaturais.fatorial(3));
    }

    
}