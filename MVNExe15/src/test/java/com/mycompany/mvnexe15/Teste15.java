package com.mycompany.mvnexe15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste15 {

    

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe15.RazaoAurea(-4, 1, -2);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1.6166667, MVNExe15.RazaoAurea(4, 5, 6));
    }

    

}