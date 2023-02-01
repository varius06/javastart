public class MyFirstGame {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        int targetNum = 99;
        int myNum = 50;

        while (targetNum != myNum) {
            if (targetNum < myNum) {
                System.out.println("Число " + myNum + " больше того, что загадал компьютер");
                to = myNum;
            } else if (targetNum > myNum) {
                System.out.println("Число " + myNum + " меньше того, что загадал компьютер");
                from = myNum;
            }
            myNum = (from + to) / 2;
        }
        System.out.println("Вы угадали! Я загадывал " + myNum);

    }
}