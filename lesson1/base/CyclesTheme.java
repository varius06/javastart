public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -11;
        int sumX = 0;
        int sumY = 0;
        do {
            if(counter % 2 == 0){
                sumX += counter;
            } else{
                sumY += counter;
            }
            counter++;
        } while (counter < 22);
        System.out.println("В промежутке [-10, 21] сумма четных чисел =" + sumX + ", а нечетных =" + sumY);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num2 > max) {
            max = num2;
        }
        else if (num3 > max) {
            max = num3;
        } 
        if (num1 < min) {
            min = num1;
        }
        else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int numsInRow = 5;
        int numString = 1;
        for (int i = 1; i < 24; i += 2) {
            count++;
            System.out.printf("%1$3d  ", i);
            if(count % numsInRow == 0){
                numString++;
                System.out.println();
            }
        }
        int zero = numString * numsInRow - count;
        for(int i = 0; i < zero; i++){
             System.out.printf("%1$3d  ", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        int srcNum = 3242592;
        int copySrcNum = 3242592;
        count = 0;
        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 2) {
                count++;
            }
            copySrcNum /= 10;
        }
        if(count % 2 == 0) {
            System.out.println("число " + srcNum + " содержит четное количество двоек:" + count);
        } else {
            System.out.println("число " + srcNum + " содержит нечетное количество двоек:" + count);
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++){
            for(int y = 0; y < 10; y++){
               System.out.printf("*");
            }
            System.out.println("\n");
        }

        int row = 5;
        while (row > 0) {
            int i = row;
            while (i > 0) {
                System.out.printf("*");
                i--;
            }
            System.out.println("\n");
            row--;
        }

        row = 5;
        int line = 0;
        int tempLine = 0;
        do {
            if(row > 2){
                line++;
            } else {
                line--;
            }
            tempLine = line; 
            while(tempLine > 0) {
                System.out.print("$");
                tempLine--;
            }
            System.out.println("\n");
            row--;
        } while (row > 0);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("Dec   Char");
        for (int i = 1; i < 47; i += 2) {
            System.out.printf("%3d  -  %2c%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int rank = 0;
        int rightPart = 0;
        int leftPart = 0;
        while (copySrcNum > 0) {
            rank++;
            copySrcNum /= 10;
        }
        copySrcNum = srcNum;
        
        int val = 0;
        count = rank;
        rank = (rank - 1) / 2;
        while (count > 0) {
            if(count > rank + 1){
                rightPart += copySrcNum % 10;
                System.out.printf("%3d", rightPart);
            } else if(count < rank + 1){
                leftPart += copySrcNum % 10;
                System.out.printf("%3d", leftPart);
            }
            copySrcNum = copySrcNum / 10;
            count--;
        }
        System.out.println("\n" + count); 

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("        ТАБЛИЦА ПИФАГОРА");
        System.out.print("   |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print("____");
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            for (int y = 1; y <= 9; y++) {
                if(y == 1){
                    System.out.printf("%2d |", i * y);
                } else {
                    System.out.printf("%3d ", i * y);
                }
           }
           System.out.println();
        }
    }
}