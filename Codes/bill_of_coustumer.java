import java.util.*;

public class bill_of_coustumer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil :");
        float a = sc.nextFloat();
        System.out.print("Enter the cost of pen :");
        float b = sc.nextFloat();
        System.out.print("Enter the cost of eraser :");
        float c = sc.nextFloat();
        float total = a + b + c;
        float gst = total + (0.18f * total);                                    // with 18% gst
        System.out.println("Total cost after billing :" + total);
        System.out.println("Total cost with GST and original billing :" + gst);
    }
}