import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter any one opreation among the following:\nAdd -> (+)\nSub -> (-)\nMul -> (*)\nDiv -> (/)\nMod -> (%) ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Addition is: " + (a + b));
                break;
            case '-':
                System.out.println("Substraction is: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication is: " + (a * b));
                break;
            case '/':
                System.out.println("Division is: " + (a / b));
                break;
            case '%':
                System.out.println("Modulos is: " + (a % b));
                break;
            default:
                System.out.println("The input is wrong and unable to perform that operation.");
        }
    }
}