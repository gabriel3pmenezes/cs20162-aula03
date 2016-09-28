package com.mycompany.mvnexe19;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste19 {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorQueValido() {
        MVNExe19.Horner(3, -2, 3, 4);
    }


    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(11, MVNExe19.Horner(1, 2, 3, 4));
    }

   

}