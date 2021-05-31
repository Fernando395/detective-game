package com.estudos;

public class GameMenu {
    private void printLocations() {
        System.out.println("1 - Mercado ");
        System.out.println("2 - Parque ");
        System.out.println("3 - Escola ");
    }

    public void printInitialMenu() {
        System.out.println("Aonde você quer ir ?");
        printLocations();
        System.out.println("Digite o numero correspondente ao local desejado.");
    }

    public void printGuessingMenu() {
        System.out.println("Qual seu chute?");
        printLocations();
        System.out.println("Digite o numero correspondente ao seu chute.");
    }


}
