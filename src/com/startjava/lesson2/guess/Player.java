package com.startjava.lesson2.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private String name;
    private int number = 0;
    private final int LIMIT = 10;
    private final int MIN = -1;
    private final int MAX = 11;
    private int attempt = 0;
    private boolean checkAttempt = true;
    private int [] playerNumbers;
    Player(String name) {
        this.name = name;
        playerNumbers = new int[10];
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(Scanner scanner) {
        System.out.print("Введите число " + name + " игрока: ");
        int num = scanner.nextInt();
        if (num > MIN && num <= MAX) {
            number = num;
            if (attempt <= LIMIT){
                playerNumbers[attempt] = number;
                attempt++;
            }
            if (attempt == LIMIT) {
                checkAttempt = false;
            }
        } else {
            do {
                System.out.println("Невнрный диопазон чисел ");
                System.out.print("Введите число " + name + " игрока: ");
                num = scanner.nextInt();
                if(num > MIN && num <= MAX) {
                    number = num;
                    break;
                }
            } while (true);

        }
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttempt() {
        return attempt;
    }
    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    public void setCheckAttempt(boolean checkAttempt) {
        this.checkAttempt = checkAttempt;
    }
    public boolean getCheckAttempt() {
        return checkAttempt;
    }
    public void viewNumbers() {
        int[] copy = Arrays.copyOf(playerNumbers, attempt);
        for (int element : copy) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public void clearNumbers() {
        Arrays.fill(playerNumbers, 0, attempt, 0);
        attempt = 0;
    }
}