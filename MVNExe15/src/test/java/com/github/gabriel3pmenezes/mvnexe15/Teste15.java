package com.github.gabriel3pmenezes.mvnexe15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste15 {

    

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        RazaoAurea.razaoAurea(-4, -3, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        RazaoAurea.razaoAurea(4, 1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        RazaoAurea.razaoAurea(1, 3, -4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1.6166667, RazaoAurea.razaoAurea(4, 5, 6), 0.01);
    }
}
