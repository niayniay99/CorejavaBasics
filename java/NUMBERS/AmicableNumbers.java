package java.NUMBERS;
import java.util.ArrayList;

public class AmicableNumbers {
    public static void main(String[] args)
    {
        int a = 220;
        int b = 284;

        ArrayList<Integer> aFactors = factors(a);
        ArrayList<Integer> bFactors = factors(b);

        int aSum = 0; 
        int bSum = 0;

        for(int i =0; i<aFactors.size(); i++)
            aSum += aFactors.get(i);
        for(int i = 0; i<bFactors.size();i++)
            bSum += bFactors.get(i);

        if( aSum == b && bSum == a)
            System.out.println(a+" & "+b+ " are Amicable number Pair");
        else
            System.out.println(a+" & "+b+ " are NOT Amicable number Pair");
        
    }

    public static ArrayList<Integer> factors(int num)
    {
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);
        for(int i = 2; i<num; i++)
        {
            if(num % i == 0){
                factors.add(i);
                factors.add(num/i);
            }
            if(num/i  <= i)
                break;
        }
        return factors;
    }
}
