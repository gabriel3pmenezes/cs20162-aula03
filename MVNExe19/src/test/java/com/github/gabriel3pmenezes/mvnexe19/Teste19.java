package com.github.gabriel3pmenezes.mvnexe19;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste19 {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorQueValido() {
        RegraDeHorner.horner(3, -2, 3, 4);
    }


    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(11, RegraDeHorner.horner(1, 2, 3, 4));
    }

   

}