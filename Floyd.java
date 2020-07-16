import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        int i,j,n=1,rows=7;
        for (i=1; i<=rows ;i++)
        {
           for (j=1 ;j<=i ;j++)
             {
                System.out.print(n+" ");
                n++;
             }
            System.out.println();
        }
        }
    }