package java.NUMBERS;
import java.util.Scanner;

public class LargestDivisor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int output = largestDivisor(n);

        System.out.println("The largest divisor of "+n+" is "+output);
        sc.close();
    }

    public static int largestDivisor(int n)
    {
        for(int i =2;i<=Math.sqrt(n);i++)
            if(n%i == 0)
                return n/i;
            return 1;
    }
}
