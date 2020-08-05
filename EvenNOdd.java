import java.util.ArrayList;
import java.util.Scanner;
/* ArrayList is used to create an array,
 whose size is not fixed  */
public class EvenNOdd{
  public static void main(String[] args) {
    int n;
    /* Create two ArrayList's to store even and odd integers */
    ArrayList<Integer> Even = new ArrayList<Integer>();
    ArrayList<Integer> Odd = new ArrayList<Integer>();

    System.out.println("Enter the size of the array: ");
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    int array[] = new int[n];
    System.out.println("Enter the elements of the array: ");

    for (int i = 0;i<n ;i++ ) {
      array[i] = input.nextInt();
    }

    for (int i=0;i<n ;i++ ) {
      if (array[i]%2 == 0){
        Even.add(array[i]);
      }
      else {
          Odd.add(array[i]);
        }
    }

    //Print the ArrayList
    System.out.println("\nEven Array: "+ Even);

    System.out.println("\nOdd Array: "+ Odd );
  }
}
