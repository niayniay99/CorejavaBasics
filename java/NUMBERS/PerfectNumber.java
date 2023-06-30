package java.NUMBERS;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer");
        int num = Integer.parseInt(sc.nextLine().trim());

        if(isPerfectNumber(num))
            System.out.println("Given Number "+num+" is a perfect Number");
        else
            System.out.println("Given Number "+num+" is NOT a perfect Number");
        sc.close();
    }

    public static boolean isPerfectNumber(int num)
    {
        int tempNum = num;
        int divisorSum = 1;
        for(int i = 2; i<=num/2; i++)
            if(num % i == 0)
                divisorSum += i;
        if(tempNum == divisorSum)
            return true;
        return false;
    }
}
