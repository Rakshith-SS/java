/* Majority Element
an Element that occurs more than n/2 in an Array
example: array = {23,34,23,23}
here the majority Element is 23
*/

import java.util.Scanner;

class MajorityElements{
  public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.println("Enter the Element of the array: ");
    int array[] = new int[n];

    for (int i =0; i<n;i++ ) {
      array[i] = input.nextInt();
    }

    int maxcount =0;
    int index =-1;
    for (int i=0; i<n; i++) {
      int count =0;
      for (int j=0;j<n ;j++ ) {
        if(array[i] == array[j])
          count++;
        if (count > maxcount){
          maxcount = count;
          index =i;
        }
      }
    }

    if (maxcount > n/2) {
      System.out.println("Majority Element is : "+ array[index]);
    }
    else {
      System.out.println("Majority Element doesn't exist");
    }

  }
}
