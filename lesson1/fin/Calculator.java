public class Calculator {
    public static void  main(String[] args) {
        int a = 5;
        int b = 3;
        String sign = "^";
        int result = 0;
        if(sign == "+") {
            result = a + b;
            sign = "+";
        } else if (sign == "-") {
             result = a - b;
        } else if (sign == "*") {
             result = a * b;
        } else if (sign == "/") {
             result = a / b;
        } else if (sign == "%") {
             result = a % b;
        } else if (sign == "^") {
            result = a;
            for (int i = 1; i < b; i++) {
                result = result * a;
            }
        }
        System.out.print(a + "" + sign + "" + b + "=" + result);
    }
}