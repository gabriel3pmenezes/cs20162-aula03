package com.mycompany.mvnexe18;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste18 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe18.Raiz(-4, 2);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(2, MVNExe18.Raiz(4, 2));
    }
}