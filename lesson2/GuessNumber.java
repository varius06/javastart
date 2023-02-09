import java.util.Random;
public class GuessNumber {

    private int number;
    private boolean start;
    private boolean check = true;
    
    public void startGame() {
        Random generator = new Random();
        this.number = generator.nextInt(10);
    }

    public int getNumber() {
        return this.number;
    }

    public boolean getGameOver() {
        return this.check;
    }

    public void setGameOver(boolean check) {
        this.check = check;
    }

    public boolean checkNumber(Player player) {
        if(this.number == player.getNumber()){
            this.check = false;
            System.out.println("Победил игрок " +  player.getName());
        } else {
            this.check = true;
            getHelp(player.getNumber());
        }
        return this.check;
    }

    private void getHelp(int number) {
        if(this.number < number){
             System.out.println("Число " + Integer.toString(number) + " больше того, что загадал компьютер");
        } else if (this.number > number) {
            System.out.println("Число " + Integer.toString(number) + " меньше того, что загадал компьютер");
        }
    }
}