package com.mycompany.mvnexe12;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste12 {

  

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe12.Pi(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(3.46, MVNExe12.Pi(3), 0.01);
    }

    
}