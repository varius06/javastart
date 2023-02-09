public class Calculator {

    private int numberOne;
    private int numberTwo;
    private char sign;
    private int result;

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calc() {
         boolean visable = true;
         switch(sign) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-' :
                result = numberOne - numberTwo;
                break;
            case '*' :
                result = numberOne * numberTwo;
                break;
            case '/' :
                result = numberOne * numberTwo;
                break;
            case '%' :
                result = numberOne % numberTwo;
                break;
            case '^' :
                result = numberOne;
                for (int i = 1; i < numberTwo; i++) {
                    result = result * numberOne;
                }
                break;
            default : System.out.print("Неверный знак операции");
            visable = false;
        }
        if(visable) {
            System.out.print(numberOne + " " + sign + " " + numberTwo + " = " + result + "\n");
        }
    }
}
