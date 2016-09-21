package com.mycompany.mvnexe16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste16 {

    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe16.QuadradoPerfeito(-3);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe16.QuadradoPerfeito(16));
    }

    
}