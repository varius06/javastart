package com.startjava.lesson2.guess;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    private int number;
    private Player [] players;
    private Scanner scanner;
    private boolean endGame = false;

    private final int LIMIT = 10;
    private final int MIN = -1;
    private final int MAX = 11;
    GuessNumber(Player ... players) {
        this.players = players;
        scanner = new Scanner(System.in);
    }
    public void startGame() {
        Random generator = new Random();
        this.number = generator.nextInt(12);

        while(!endGame) {
            for (Player player : players) {
                if(player.getCheckAttempt()) {
                    player.setNumber(checkNumber(player));
                    if(viewResult(number, player)) {
                        break;
                    }
                }
            }
        }

        for (Player player : players) {
            player.setAttempt(0);
            player.setCheckAttempt(true);
        }
        this.endGame = false;
    }

    private boolean viewResult(int number, Player player) {
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

    private int checkNumber(Player player) {
        System.out.print("Введите число " + player.getName() + " игрока: ");
        int num = scanner.nextInt();
        if (!(num > MIN && num <= MAX)) {
            do {
                System.out.println("Невнрный диопазон чисел ");
                System.out.print("Введите число " + player.getName() + " игрока: ");
                num = scanner.nextInt();
                if(num > MIN && num <= MAX) {
                    break;
                }
            } while (true);
        }
        return num;
    }
}