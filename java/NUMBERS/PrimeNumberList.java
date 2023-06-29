package java.NUMBERS;
import java.util.Scanner;

public class PrimeNumberList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value of the range");
        int start = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter the value of the range");
        int end = Integer.parseInt(sc.nextLine().trim());

        for(int i = start; i<=end;i++)
            if(checkPrimeNumber(i))
                System.out.println(i+" is a Prime Number");
            else 
                System.out.println(i+ "is NOT a Prime Number");
                sc.close();
    }

    private static boolean checkPrimeNumber(int number)
    {
        if(number <=1)
            return false;
        int length = number/2;

        for(int i =2; i< length; i++)
            if(number % i == 0)
                return false;
        return true;
    }
}
