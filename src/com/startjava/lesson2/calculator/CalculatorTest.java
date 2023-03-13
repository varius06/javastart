package com.startjava.lesson2.calculator;

import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "yes";
        do{
            if ("yes".equals(answer)){
                while (true){
                    System.out.print("Введите опрацию ");
                    String expression = in.nextLine();
                    try {
                        Calculator.calc(expression);
                    }catch (NumberFormatException e){
                        System.out.println("Некорректный тип операции");
                    }
                    break;
                }
            }
            System.out.print("Хотите продолжить опрацию ");
            answer = in.nextLine();
        }while (!"no".equals(answer));
    }
}
