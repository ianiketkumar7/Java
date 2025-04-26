import java.util.*;

public class LargOf3Num{
    public static void main(String args[]){
        int a = 7, b = 3, c = 6;

        if((a >= b) && (a >= c)) {
            System.out.println("Largest no is A: " + a);
        } else if ((b >= a) && (b >= c)) {
            System.out.println("Largest no is B: " + b);
        } else {
            System.out.println("Largest no is C: " + c);
        }
    }
}