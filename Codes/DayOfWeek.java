import java.util.*;

public class DayOfWeek {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Day: ");
        int day = sc.nextInt();

        switch(day) {
            case 1 :
                System.out.println("It's Monday");
                break;
            case 2 :
                System.out.println("It's Tuesday");
                break;
            case 3 :
                System.out.println("It's Wednesday");
                break;
            case 4 :
                System.out.println("It's Thursday");
                break;
            case 5 :
                System.out.println("It's Friday");
                break;
            case 6 :
                System.out.println("It's Saturday");
                break;
            case 7 :
                System.out.println("It's Sunday");
                break;
            default :
                System.out.println("There are only 7 days in a week.\nGo and sit in LKG again to learn these.\nHaaaa....");
        }
    }
}