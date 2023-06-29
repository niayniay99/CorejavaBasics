package java.NUMBERS;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = Integer.parseInt(sc.nextLine().trim());
        boolean status = checkPrimeNumber(number);

        if(status == true)
            System.out.println("The entered number is Prime Number");
        else    System.out.println("The Entered number is NOT a Prime Number");
        sc.close();
    }

    public static boolean checkPrimeNumber(int number)
    {
        if(number <=1)
        return false;

        int length = number/2;

        for(int i =2; i<length; i++)
            if(number % i ==0)
                return false;
        
        return true;
        
    }
}