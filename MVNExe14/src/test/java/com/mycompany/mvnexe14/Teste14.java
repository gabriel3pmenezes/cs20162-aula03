package com.mycompany.mvnexe14;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste14 {


    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe14.LogaritmoNatural(-4,1);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(16.375, MVNExe14.LogaritmoNatural(3, 4));
    }

   

}