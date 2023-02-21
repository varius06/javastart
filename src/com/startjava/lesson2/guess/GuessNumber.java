package com.startjava.lesson2.guess;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

    private int number;
    private Player playerOne;
    private Player playerTwo;
    private Scanner scanner;


    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        Random generator = new Random();
        this.number = generator.nextInt(10);
        while(true) {
            System.out.print("Введите число первого игрока: ");
            playerOne.setNumber(scanner.nextInt());
            if(number == playerOne.getNumber()) {
                System.out.println("Победил игрок " +  playerOne.getName());
                break;
            } else if (number < playerOne.getNumber()) {
                System.out.println("Число " + Integer.toString(playerOne.getNumber()) + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + Integer.toString(playerOne.getNumber()) + " меньше того, что загадал компьютер");
            }

            System.out.print("Введите число второго игрока: ");
            playerTwo.setNumber(scanner.nextInt());
            if(number == playerTwo.getNumber()) {
                System.out.println("Победил игрок " +  playerTwo.getName());
                break;
            } else if (number < playerTwo.getNumber()) {
                System.out.println("Число " + Integer.toString(playerTwo.getNumber()) + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + Integer.toString(playerTwo.getNumber()) + " меньше того, что загадал компьютер");
            }          
        }
    }
}