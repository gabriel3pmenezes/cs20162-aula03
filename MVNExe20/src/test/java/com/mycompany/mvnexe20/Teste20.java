package com.mycompany.mvnexe20;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste20 {

   

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe20.Fibonacci(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(3, MVNExe20.Fibonacci(4));
    }

   

}