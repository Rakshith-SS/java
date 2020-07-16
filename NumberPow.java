import java.lang.Math;
import java.util.Scanner;


public class NumberPow {
    public static void main(String args[]) {
        System.out.println("Enter a Number:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter power");
        int c = input.nextInt();    
        Double result = Math.pow(a,c);
        System.out.println("Result: "+ result);
    }
    
}