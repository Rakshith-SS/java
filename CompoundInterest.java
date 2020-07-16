import java.lang.Math;
public class CompoundInterest {
    public static void main(String[] args) {
        int time =3 ;
        int NumberOfTimes =6;
        float principal = 10000;
        float InterestRate = 8;
        double CompoundInterest_ ;
        double x  = Math.pow((1+ InterestRate/NumberOfTimes), (NumberOfTimes*time));
        CompoundInterest_ = principal*x;
        System.out.println("Compound Interest: "+CompoundInterest_);
    }  
}