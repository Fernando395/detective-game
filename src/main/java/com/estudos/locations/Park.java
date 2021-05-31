package com.estudos.locations;

public class Park extends GameLocation {

    private final static int ID = 2;
    final int hint = generateRandomHint();

    public Park(int crimeLocation) {
        if (crimeLocation == Market.getId() && (hint >= 50)) {
            hints.add("O morador de rua ouviu gritos vindos do mercado a noite passada");
        } else if (crimeLocation == Market.getId() && (hint > 19)) {
            hints.add("O parque esta vazio. volte outra hora");
        } else if (crimeLocation == Market.getId()) {
            hints.add("Os professores da Escola estavam cochichando no Parque");
        } else if (crimeLocation == Park.getId() && (hint >= 50)) {
            hints.add("O guarda disse que viu uma pessoa estranha correndo no Parque a noite");
        } else if (crimeLocation == Park.getId() && (hint > 19)) {
            hints.add("O parque esta vazio. volte outra hora");
        } else if (crimeLocation == Park.getId()) {
            hints.add("Um rapaz disse que viu 2 carros de policia indo para o mercado ontem a noite");
        } else if (crimeLocation == School.getId() && hint >= 50) {
            hints.add("um dos ciclistas do parque disse que ouviu gritos vindo da escola ontem a noite");
        } else if (crimeLocation == School.getId() && hint > 19) {
            hints.add("O parque esta vazio. volte outra hora");
        } else if (crimeLocation == School.getId()) {
            hints.add("você encontrou gotas de sangue em um dos bancos do parque");
        }
    }

    public static int getId() {
        return ID;
    }



}
