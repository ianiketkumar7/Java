import java.util.*;

public class PositiveOrNegative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}