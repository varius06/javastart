package com.startjava.lesson2.guess;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    private int number;
    private Player playerOne;
    private Player playerTwo;
    private Scanner scanner;
    private boolean endGame = false;
    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        scanner = new Scanner(System.in);
    }
    public void startGame() {
        Random generator = new Random();
        this.number = generator.nextInt(12);
        while(playerTwo.getCheckAttempt() && playerTwo.getCheckAttempt()) {
            if(playerOne.getCheckAttempt()) {
                System.out.print("Введите число первого игрока: ");
                playerOne.setNumber(scanner.nextInt());
                playerOne.saveNumbers(playerOne.getNumber());
                if(view(number, playerOne)) {
                    playerOne.setCheckAttempt(false);
                    playerTwo.setCheckAttempt(false);
                }
            }

            if(playerTwo.getCheckAttempt()) {
                System.out.print("Введите число второго игрока: ");
                playerTwo.setNumber(scanner.nextInt());
                playerTwo.saveNumbers(playerTwo.getNumber());
                if(view(number, playerTwo)) {
                    playerOne.setCheckAttempt(false);
                    playerTwo.setCheckAttempt(false);
                }
            }

        }
        playerTwo.clearNumbers();
        playerOne.clearNumbers();
        endGame = false;
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        playerOne.setCheckAttempt(true);
        playerTwo.setCheckAttempt(true);
    }

    private boolean view(int number, Player player) {
        if(number == player.getNumber()) {
            System.out.println("Победил игрок " +  player.getName() + " угадал число " + player.getNumber() + " с " + player.getAttempt() + " попытки");
            player.viewNumbers();
            endGame = true;
        } else if (number < player.getNumber()) {
            System.out.println("Число " + Integer.toString(player.getNumber()) + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + Integer.toString(player.getNumber()) + " меньше того, что загадал компьютер");
        }
        if(!player.getCheckAttempt()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return endGame;
    }
}