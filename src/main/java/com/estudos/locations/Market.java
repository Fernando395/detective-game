package com.estudos.locations;

// OBJETO -> ATRIBUTOS E MÉTODOS / DADOS E COMPORTAMENTO
public class Market extends GameLocation {

    private final static int ID = 1;
    final int hint = generateRandomHint();


    public Market(int crimeLocation) {
        if (crimeLocation == Market.getId() && (hint >= 50)) {
            hints.add("O Gerente disse que o alarme do mercado tocou a noite passada");
        } else if (crimeLocation == Market.getId() && (hint > 19)) {
            hints.add("O Mercado estava muito movimentado. ninguém pode falar com você");
        } else if (crimeLocation == Market.getId()) {
            hints.add("A operadora de caixa disse que seu filho esta com medo de ir a Escola");
        } else if (crimeLocation == Park.getId() && (hint >= 50)) {
            hints.add("A operadora de caixa saiu a noite e disse que tinha uma confusão no parque!");
        } else if (crimeLocation == Park.getId() && (hint > 19)) {
            hints.add("O Mercado estava muito movimentado. ninguém pode falar com você");
        } else if (crimeLocation == Park.getId()) {
            hints.add("Estavam consertando a porta do mercado que avia sido arrombada");
        } else if (crimeLocation == School.getId() && hint >= 50) {
            hints.add("um dos funcionários disse que seu filho estava assustado e não queria mais ir a Escola");
        } else if (crimeLocation == School.getId() && hint > 19) {
            hints.add("O Mercado estava muito movimentado. ninguém pode falar com você");
        } else if (crimeLocation == School.getId()) {
            hints.add("O estoquista disse que ouviu gritos no parque a noite passada");
        }
    }

    public static int getId() {
        return ID;
    }
}
