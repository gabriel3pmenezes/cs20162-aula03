package com.mycompany.mvnexe13;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste13 {

  

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe13.Fatorial(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(6, MVNExe13.Fatorial(3));
    }

    
}