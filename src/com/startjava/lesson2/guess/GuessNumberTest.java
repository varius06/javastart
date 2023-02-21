package com.startjava.lesson2.guess;

import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(in.nextLine());
        System.out.print("Введите имя вторго игрока: ");
        Player playerTwo = new Player(in.nextLine());
        GuessNumber guess = new GuessNumber(playerOne, playerTwo);
        String answer = "yes";
        while(!answer.equals("no")) {
            guess.startGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                answer = in.next();
            } while (!answer.equals("yes") && !answer.equals("no") && !answer.equals(""));
        }
        
    }
}