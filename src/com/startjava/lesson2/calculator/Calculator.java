package com.startjava.lesson2.calculator;

public class Calculator {
    public static void calc(String expression) {
        double result = 0.0f;
        String[] splitExpression = expression.split(" ");
        double numberOne = Integer.parseInt(splitExpression[0]);
        double numberTwo = Integer.parseInt(splitExpression[2]);

        try {
            if (numberTwo < 0 || numberOne < 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Значение не должно быть меньше нуля");
        }

        try {
            if (numberTwo == 0 && "/".equals(splitExpression[1])) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Делить на ноль нельзя");
        }

        switch (splitExpression[1]){
            case "+" -> result = numberOne + numberTwo;
            case "-" -> result = numberOne - numberTwo;
            case "*" -> result = numberOne * numberTwo;
            case "/" -> result = numberOne / numberTwo;
            case "%" -> result = numberOne % numberTwo;
            case "^" -> result =  Math.pow(numberOne, numberTwo);
            default -> System.out.println("Введите корректный тип операции");
        }
        if (numberOne % numberTwo != 0 && "/".equals(splitExpression[1])) {
            System.out.println(String.format("%.2f", result));
        } else {
            System.out.println(String.format("%.0f",result));
        }
    }
}
