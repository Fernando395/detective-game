package com.estudos.locations;

import java.util.ArrayList;
import java.util.Random;

public class GameLocation {

    protected ArrayList<String> hints = new ArrayList<>();

    protected int generateRandomHint() {
        Random rand = new Random();
        return rand.ints(1, 100).findFirst().orElse(0);
    }

    public String getHint() {
        if (hints.isEmpty()) {
            return "Este local não contem mais dicas!";
        }

        String hint = hints.get(0);
        hints.remove(0);
        return hint;
    }

    public int numberOfHints() {
        return hints.size();
    }

}
