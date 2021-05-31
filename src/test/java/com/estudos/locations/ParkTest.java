package com.estudos.locations;

import org.junit.Assert;
import org.junit.Test;

public class ParkTest {

    @Test
    public void shouldGetAHint() {
        Park park = new Park();

        String firstHint = park.getHint();
        String secondHint = park.getHint();
        String thirdHint = park.getHint();
        String fourthHint = park.getHint();

        for (int i = 0; i < 100; i++) {
            Assert.assertEquals(park.getHint(), "Este local não contem mais dicas!");
        }

        Assert.assertEquals(firstHint, "O guarda do parque viu uma pessoa estranha correndo na noite anterior!");
        Assert.assertEquals(secondHint, "Há marcas de faca próximo a uma árvore!");
        Assert.assertEquals(thirdHint, "Este local não contem mais dicas!");
        Assert.assertEquals(fourthHint, "Este local não contem mais dicas!");
    }


}


