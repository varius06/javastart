public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        byte ram = 4;
        short winVersion = 10;
        int cpuCapacity = 64;
        long purchaseYear = 2019; // 
        float cpuFreq = 1.51f;
        double freeRam = 3.90;
        char cpuType = 'x';
        boolean myComp = true;
        if (myComp) {
            System.out.println("Операционная система: Windows " + winVersion + 
                    ", " + purchaseYear + " год" + "\n" +
                    "Установленная память: " + ram + " Гб" + "\n" +
                    "Свободная память: " + freeRam + " Гб" + "\n" +
                    "Процессор: " + cpuType + cpuCapacity + "\n" +
                    "Частота процессора: " + cpuFreq + " ГГц");
        }
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int discount = ((pen + book) * 11) / 100;
        int price =  pen + book - discount;
        System.out.println("Сумма скидки:" + discount + "\n" + "Цена:" + price);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteNum = 127;
        short shortNum = 32_767;
        int intNum = 2_147_483_647;
        long longNum = 9_223_372_036_854_775_807L;

        System.out.println(byteNum + " " + ++byteNum + " " + --byteNum);
        System.out.println(shortNum + " " + ++shortNum + " " + --shortNum);
        System.out.println(intNum + " " + ++intNum + " " + --intNum);
        System.out.println(longNum + " " + ++longNum + " " + --longNum);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println(num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
        System.out.println("Перестановка с помощью арифметической операции");
        System.out.println(num1 + " " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println(num1 + " " + num2);
        System.out.println("Перестановка с помощью побитовой операции");
        System.out.println(num1 + " " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(num1 + " " + num2);

        System.out.println("\n6. Вывод символов и их кодов"); 
        char sym1 = 35;
        char sym2 = 38;
        char sym3 = 64;
        char sym4 = 94;
        char sym5 = 95;
        System.out.println((int) sym1 + " - " + sym1);
        System.out.println((int) sym2 + " - " + sym2);
        System.out.println((int) sym3 + " - " + sym3);
        System.out.println((int) sym4 + " - " + sym4);
        System.out.println((int) sym5 + " - " + sym5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;
        System.out.println("Число N содержит:");
        System.out.println((srcNum / 100) + " сотню");
        System.out.println((srcNum / 10 % 10) + " десятка");
        System.out.println((srcNum % 10) + " единицы");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = 0;
        char backslash = 92;
        char slash = 47;
        char under = 95; 
        char openBr = 40;
        char closeBr = 41;
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + under + openBr + space + closeBr + 
                backslash);
        System.out.println("" + space + slash + space + space + space + space + space +  space +
                backslash);
        System.out.println("" + slash + under + under + under + under + slash + backslash + under + 
                under + backslash);

        System.out.println("\n10. Преобразование секунд");
        int totalSec = 43321;
        int hours = totalSec / 3600;
        int mins = totalSec % 3600 / 60;
        int seconds = totalSec % 3600 % 60;
        System.out.println(hours + ":" + mins + ":" + seconds);

    }


}