package com.github.gabriel3pmenezes.mvnexe16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste16 {

    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        QuadradoPerfeito.quadradoPerfeito(-3);
    }

    @Test
    public void umNumeroArbitrarioVerdadeiro() {
        assertEquals(true, QuadradoPerfeito.quadradoPerfeito(16));
    }
    
    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, QuadradoPerfeito.quadradoPerfeito(2));
    }
}
