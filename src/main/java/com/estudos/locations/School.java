package com.estudos.locations;

public class School extends GameLocation {

    private final static int ID = 3;
    final int hint = generateRandomHint();


    public School(int crimeLocation) {
        if (crimeLocation == Market.getId() && (hint >= 50)) {
            hints.add("O professor de historia viu uma pessoa saindo do mercado correndo ontem a noite");
        } else if (crimeLocation == Market.getId() && (hint > 19)) {
            hints.add("A escola esta fechada. volte outra hora");
        } else if (crimeLocation == Market.getId()) {
            hints.add("você viu que  a porta do corredor estava arrombada");
        } else if (crimeLocation == Park.getId() && (hint >= 50)) {
            hints.add("O professor de geografia disse que viu uma pessoa estranha correndo no Parque a noite");
        } else if (crimeLocation == Park.getId() && (hint > 19)) {
            hints.add("A escola esta fechada. volte outra hora");
        } else if (crimeLocation == Park.getId()) {
            hints.add("Um aluno disse que viu 1 carro de policia indo para o mercado ontem a noite");
        } else if (crimeLocation == School.getId() && hint >= 50) {
            hints.add("um dos alunos do 8*ano disse que ouviu gritos vindo da escola ontem a noite");
        } else if (crimeLocation == School.getId() && hint > 19) {
            hints.add("A escola esta fechada. volte outra hora");
        } else if (crimeLocation == School.getId()) {
            hints.add("A funcionaria da limpeza disse que viu uma pessoa estranha tentando se esconder no parque ontem a noite");
        }
    }

    public static int getId() {
        return ID;
    }


}
