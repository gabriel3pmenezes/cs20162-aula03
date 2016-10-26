package com.github.gabriel3pmenezes.mvnexe18;

import com.github.gabriel3pmenezes.mvnexe18.RaizQuadrada;
import org.junit.Test;

import static org.junit.Assert.*;

public class Teste18 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        RaizQuadrada.raizQuadrada(-4, 2);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(2, RaizQuadrada.raizQuadrada(4, 2));
    }
}