import java.util.*;

public class largest_datatype{
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (double)((float)(f * b) + (int)(i % c) - (double)(d * s));
        System.out.println(result);
    }
}