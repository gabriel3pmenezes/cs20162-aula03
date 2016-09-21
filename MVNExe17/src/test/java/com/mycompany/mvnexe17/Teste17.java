package com.mycompany.mvnexe17;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste17{

   
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe17.Mod(-4, -3);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MVNExe17.Mod(4,3));
    }

    

}
