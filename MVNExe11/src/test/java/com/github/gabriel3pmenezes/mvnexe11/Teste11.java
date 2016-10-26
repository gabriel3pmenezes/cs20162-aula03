package com.github.gabriel3pmenezes.mvnexe11;

import com.github.gabriel3pmenezes.mvnexe11.SomaElementar;
import org.junit.Test;

import static org.junit.Assert.*;

public class Teste11 {

    

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        SomaElementar.somaNaturais(-3);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(0.7, SomaElementar.somaNaturais(2),0.01);
    }

}