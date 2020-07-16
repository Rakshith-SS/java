import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        int result;
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int x  = input.nextInt();
        int y = input.nextInt();
        System.out.println("Menu");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("Your Choice?");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
            result = x+y;
            System.out.println(x+" + "+y+" : "+ result);
                break;
            case 2:
            result = x-y;
            System.out.println(x+" - "+y+" : "+ result);
            break;
            case 3:
            result = x*y;
            System.out.println(x+" * "+y+" : "+ result);
            break;
            case 4:
            result = x/y;
            System.out.println(x+" / "+y+" : "+ result);
            break;
            default:
            System.out.println("Select a valid choice...");
        }
    }
}