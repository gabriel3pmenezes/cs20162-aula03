package com.github.gabriel3pmenezes.mvnexe17;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste17{

   
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        RestoDivInteira.resto(-4, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        RestoDivInteira.resto(4, -3);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, RestoDivInteira.resto(4,3));
    }
}
