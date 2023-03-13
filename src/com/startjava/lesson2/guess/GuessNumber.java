package com.startjava.lesson2.guess;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    private int number;
    private Player [] players;
    private Scanner scanner;
    private boolean endGame = false;
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
                    player.setNumber(scanner);
                    if(view(number, player)) {
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