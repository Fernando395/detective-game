package com.estudos.locations;

import org.junit.Assert;
import org.junit.Test;

public class MarketTest {

    @Test
    public void shouldGetAHint() {
        Market market = new Market();

        String firstHint = market.getHint();
        String secondHint = market.getHint();
        String thirdHint = market.getHint();
        String fourthHint = market.getHint();

        Assert.assertEquals(firstHint, "O balcão do caixa está com gotas de sangue!");
        Assert.assertEquals(secondHint, "A porta dos fundos esta arrombada!");
        Assert.assertEquals(thirdHint, "Este local não contem mais dicas!");
        Assert.assertEquals(fourthHint, "Este local não contem mais dicas!");
    }

}
