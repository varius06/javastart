import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(in.nextLine());
        System.out.print("Введите имя вторго игрока: ");
        Player playerTwo = new Player(in.nextLine());
        GuessNumber guss = new GuessNumber();
        String answer = "yes";
        while(!answer.equals("no")) {
            guss.startGame();
            while(guss.getGameOver()){
                System.out.print("Введите число первого игрока: ");
                playerOne.setNumber(in.nextInt());
                guss.checkNumber(playerOne);
                if(guss.getGameOver()){
                    System.out.print("Введите число второго игрока: ");
                    playerTwo.setNumber(in.nextInt());
                    guss.checkNumber(playerTwo);
                }
            }
            guss.setGameOver(true);
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                answer = in.next();
            } while (!answer.equals("yes") && !answer.equals("no") && !answer.equals(""));
        }
        
    }
}