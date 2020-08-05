/*
    Sorting Reference: https://stackoverflow.com/questions/31377448/how-to-do-sorting-in-array-list-without-using-collections-in-java
    Program to move the 0's to the right end and sort the rest of
    nonzero elements
    example:
    input -> [91,82,0,0,76,15,0]
    output -> [15,76,82,91,0,0,0]
*/

import java.util.Scanner;
import java.util.ArrayList;

class ZeroNSort{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = input.nextInt();
    int array[] = new int[n];

    System.out.println("Enter the elements of the array: ");
    for (int i=0; i<n ;i++ ) {
      array[i] = input.nextInt();
    }

    ArrayList<Integer> zeros = new ArrayList<Integer>();
    ArrayList<Integer> nonzeros = new ArrayList<Integer>();

    for (int i=0; i<n ; i++ ) {
      if (array[i] == 0){
        zeros.add(array[i]);
      }
      else{
        nonzeros.add(array[i]);
      }
    }

/*  Sorting the non zero ArrayList  using bubblesort method.
    the nonzeros.get(i) is a method used to get the element in the
    ArrayList of index i.
    for example: if array is an ArrayList where
                array = [91,80,13,42,97]
                array.get(1)
                return 80
    array.set(1,90) updates the value in the ArrayList of the 1st element
    so the new ArrayList would be
    array = [91,90,13,42,97]
*/
    for (int i=0;i<nonzeros.size() ;i++ ) {
      for (int j=0;j<nonzeros.size()-1 ; j++ ) {
        if (nonzeros.get(i) < nonzeros.get(j)) {
          int temp = nonzeros.get(i);
          nonzeros.set(i, nonzeros.get(j));
          nonzeros.set(j, temp);
        }
      }
    }

/* concatenate the two ArrayLists using addAll method */
    nonzeros.addAll(zeros);

    System.out.println("\n\nResultant Array: "+ nonzeros);
  }
}
