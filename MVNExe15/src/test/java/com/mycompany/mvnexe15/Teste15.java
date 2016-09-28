package com.mycompany.mvnexe15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste15 {

    

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MVNExe15.RazaoAurea(-4, 1, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MVNExe15.RazaoAurea(3, 1, -4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1.6166667, MVNExe15.RazaoAurea(4, 5, 6), 0.01);
    }

    

}