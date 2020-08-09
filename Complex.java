import java.util.Scanner;
class Complex{
  public static void main(String[] args) {
    /* take the Complex Numbers as input
       a+ib
    */
    System.out.println("Enter a Complex Number:");
    System.out.print("Real Part: ");
    Scanner input = new Scanner(System.in);
    int real = input.nextInt();
    System.out.print("Imaginary Part: ");
    int imaginary = input.nextInt();
    System.out.println("Complex Number: "+ real +" + i"+imaginary);
    /* c+ib */
    System.out.println("Enter another Complex Number:");
    System.out.print("Real Part: ");
    int real2 = input.nextInt();
    System.out.print("Imaginary Part: ");
    int imaginary2 = input.nextInt();
    System.out.println("Complex Number: "+ real2 +" + i"+imaginary2);

    /* Your Choice to perform which operation */
    System.out.println("\n\n So What do you want to do now?");
    System.out.println("1.Add");
    System.out.println("2.Subtract");
    System.out.println("3.Multiply");
    System.out.println("4.Exit");
    System.out.print("Your Choice: ");
    int choice = input.nextInt();
    switch (choice) {
      case 1:
        ComplexNumberAdd(real, imaginary, real2, imaginary2);
        break;
      case 2:
        ComplexNumberSub(real, imaginary, real2, imaginary2);
        break;
      case 3:
        ComplexNumberMultiply(real, imaginary, real2, imaginary2);
        break;
      case 4:
        System.out.println("Goodbye ...");
        break;
      default:
        System.out.println("Please enter a valid Choice ...");
    }
}

/*
Complex Number 1: a+ib
Complex Number 2: c+id
Addition : (a+c) + i(b+d)
Subtraction : (a-c) + i(b-d)
Multiplication: (ac-bd) + i(ad+bc)
*/

  public static void ComplexNumberAdd(int a, int b,int c, int d){
    int realpart = a+c;
    int imaginarypart = b+d;
    System.out.println("Addition of the two Complex Numbers: ");
    System.out.println(realpart+" + i"+imaginarypart);
  }
  public static void ComplexNumberSub(int a, int b,int c, int d){
    int realpart = a-c;
    int imaginarypart = b-d;
    System.out.println("Addition of the two Complex Numbers: ");
    System.out.println(realpart+" + i"+imaginarypart);
  }
  public static void ComplexNumberMultiply(int a, int b,int c, int d){
    int realpart = a*c - b*d;
    int imaginarypart = a*d + b*c;
    System.out.println("Addition of the two Complex Numbers: ");
    System.out.println(realpart+" + i"+imaginarypart);
  }
}
