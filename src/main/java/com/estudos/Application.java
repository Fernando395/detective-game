package com.estudos;

// SRP - Single Responsibility Principle - Princípio da responsabilidade única
// KISS - Keep it simple, stupid - Mantenha isso simples, estúpido
// DRY - Don't repeat yourself - Não repita a si mesmo

// OOP
// Abstração
// Encapsulamento
// Herança
// Polimorfismo

import com.estudos.locations.Market;
import com.estudos.locations.Park;
import com.estudos.locations.School;

import java.util.Random;
import java.util.Scanner;

public class Application {
    private static int generateRandomLocation() {
        Random rand = new Random();
        return rand.ints(1, 3).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        final int crimeLocation = generateRandomLocation();
//        final int crimeWeapon = generateRandomWeapon();
//        final int crimeAssassin = generateRandomAssassin();

        GameMenu menu = new GameMenu();

        Scanner input = new Scanner(System.in);
        int numberGuessing = 0;

        Market market = new Market(crimeLocation);
        Park park = new Park(crimeLocation);
        School school = new School(crimeLocation);


        while (numberGuessing != crimeLocation) {
            // Primeiro vai num local e pega uma dica
            menu.printInitialMenu();
            int numberLocation = input.nextInt();

            while (numberLocation > 3 || numberLocation < 1) {
                System.out.println("Local inválido!");
                numberLocation = input.nextInt();
            }

            System.out.println("Mercado numero de dicas: " + market.numberOfHints());
            System.out.println("Parque numero de dicas: " + park.numberOfHints());
            System.out.println("School numero de dicas: " + school.numberOfHints());


            if (numberLocation == Market.getId()) {
                System.out.println(market.getHint());
            } else if (numberLocation == Park.getId()) {
                System.out.println(park.getHint());
            } else if (numberLocation == School.getId()) {
                System.out.println(school.getHint());
            }

            // Segundo faz um chute do local do crime
            menu.printGuessingMenu();
            numberGuessing = input.nextInt();
            if (numberGuessing == crimeLocation) {
                System.out.println("Voce desvendou o crime.");
            } else {
                System.out.println("Voce errou o chute");

            }

        }
        // continua

        // Design Pattern
        // Factory - Fábrica

    }
}


   // Um crime ocorreu na cidade e o jogador deve descobrir o assassino, a arma do crime e o local do crime
     //   - A cada rodada o jogador deve visitar um dos locais do jogo
    //    - Em seguida ele adquiri uma dica sobre o crime
     //   - Ao final da rodada ele deve fazer seu chute
     //   - Caso ele acerte o jogo se encerra e ele recebe uma pontuação
      //  - Caso ele erre o jogo deve informar se ele acertou alguma informação do chute
     //   - Após isso uma nova rodada se inicia até que ele desvende o caso