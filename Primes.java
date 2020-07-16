public class Primes {
   public static void main(String args[]) {    
       for (int number =2; number<=100; number++)
       { 
           boolean is_prime=true;
           for (int trial= 2; trial<number; trial++)
           {
               if (number%trial == 0)
               {
               is_prime = false;
               break;
               }
           }
           if (is_prime ==true)
           System.out.println(number);
       }
   } 
}