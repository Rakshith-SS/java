import java.lang.Math;
import java.util.Scanner;

class QuadraticEquation{
	public static void main(String args[]){
		int a, b, c, discrimant;
		double root1, root2;
		
		System.out.println("Enter the coefficients of the Quadratic Equation"); 

		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();


		discrimant = b*b - 4*a*c;
		
		if (discrimant < 0)
			System.out.println("\nThe Roots of the Equation are Imaginary ");
		else if (discrimant == 0){
			System.out.println("\nThe Roots of the Equation are Real and Equal ");
			root1 = -b/(2*a);
			root2 = root1;
			System.out.println("\nThe Root is: "+ root1);
		}
		else{
			System.out.println("The Roots of the Equation are Real and Distinct" );
			root1 = (-b + Math.sqrt(discrimant))/(2*a);
			root2 =  (-b - Math.sqrt(discrimant))/(2*a);
			System.out.println("\nThe Roots are: "+root1+" and "+root2);
		}
	}
}
