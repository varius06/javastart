package com.startjava.lesson1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        if (age > 20) {
            System.out.println("Возраст больше, возраст:" + age +"\n");
        } else {
            System.out.println("Возраст больше, меньше:" + age +"\n");
        }

        boolean female = true;;
        if (!female) {
            System.out.println("Женский пол\n");
        } else {
            System.out.println("Мужской пол\n");
        }

        double height = 1.64;
        if (height < 1.80) {
            System.out.println("Рост меньше, рост:" + height +"\n");
        } else {
            System.out.println("Рост больше, рост:" + height +"\n");
        }


        char nameFirstLetter = "Mary".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Первая буква в слове M\n");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Первая буква в слове I\n");
        } else {
            System.out.println("Нет такой буквы в слове\n");
        }

        System.out.println("2. Поиск max и min числа");
        int num1 = 30;
        int num2 = 20;
        if(num1 > num2) {
            System.out.println("Максимальное число:" + num1 + ", минимальное число:" + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальное число:" + num2 + ", минимальное число:" + num1);
        } else {
             System.out.println("Числа равны");
        }

        System.out.println("3. Проверка числа");
        int number = 6;
        if(number > 0) {
            if(number % 2 == 0) {
                System.out.println("Число:" + number + " четное");
            }else {
                System.out.println("Число:" + number + " нечетное");
            }

            if(number > 0) {
                 System.out.println("Число:" + number + " положительное");
            }else{
                System.out.println("Число:" + number + " отрицательное");
            }
        }

        System.out.println("3. Поиск одинаковых цифр в числах");
        num1 = 123;
        num2 = 223;
        System.out.println("Первое число: " + num1 + "\nВторое число: " + num2);
        if (num1 % 10 == num2 % 10) {
            System.out.println("Числа третьего разряда совпадают: " + num2 % 10);
        } else if (num1 /10 % 10 == num2 / 10 % 10) {
            System.out.println("Числа второго разряда совпадают: " + num2 / 10 % 10);
        } else if (num1 / 100 == num2 / 100) {
            System.out.println("Числа первого разряда совпадают: " + num2 / 100);
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0074';
        System.out.println("The char is: " + symbol);
        
        if ((int) symbol > 64 && (int) symbol < 91) {
            System.out.println("Это большая буква: " + symbol);
        } else if ((int) symbol > 96 && (int) symbol < 123) {
            System.out.println("Это маленькая буква: " + symbol);
        } else if ((int) symbol > 47 && (int) symbol < 58) {
            System.out.println("Это цифра: " + symbol);
        } else {
            System.out.println("Не буква и не число: " + symbol);
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int deposit = 300000;
        int percent = 0;
        int amount = 0;

        if(deposit < 100000){
            percent = 5;
        } else if (deposit >= 100000 &&  deposit <= 300000) {
            percent = 7;
        } else if (deposit > 300000) {
            percent = 10;
        }
        amount = (deposit * percent / 100) + deposit;
        System.out.println("Депозит:" + deposit + "\n" + "Процент:" + percent + "\n" + "Общая сумма:" + amount);

        System.out.println("\n8. Расчет прибыли");
        int priceRoom = 5000;
        int profit = 13000;
        int costPrice = 9000;
        int annualProfit = (profit - costPrice - priceRoom) * 12;
        if(annualProfit > 0) {
            System.out.println("Годовая прибыль:+" + annualProfit);
        } else if (annualProfit < 0) {
            System.out.println("Годовая прибыль:" + annualProfit);
        } else {
            System.out.println("Годовая прибыль:" + annualProfit);
        }
    }
}