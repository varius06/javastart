package com.startjava.lesson2.calculator;

import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.print("Введите первое число: ");
            calculator.setNumberOne(in.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(in.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumberTwo(in.nextInt());
            calculator.calc();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                answer = in.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}
