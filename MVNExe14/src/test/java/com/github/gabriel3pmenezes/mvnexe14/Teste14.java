package com.github.gabriel3pmenezes.mvnexe14;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste14 {


    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        LogaritmoNatural.logaritmoNatural(-4,1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        LogaritmoNatural.logaritmoNatural(-4,3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        LogaritmoNatural.logaritmoNatural(4,1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido4() {
        LogaritmoNatural.fatorial(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(16.375, LogaritmoNatural.logaritmoNatural(3, 4), 0.01);
    }
}
