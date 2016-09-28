package com.mycompany.mvnexe11;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste11 {

    

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe11.SomaNaturais(-3);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(0.7, MVNExe11.SomaNaturais(2),0.01);
    }

}