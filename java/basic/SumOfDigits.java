import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int N = Integer.parseInt(sc.nextLine().trim());
        int tempN = N;
        int sum = 0;

        while(N>0)
        {    
            int lastDigit = N % 10;
            sum +=lastDigit;
            N = N/10;
        }

        System.out.println("Sum of Digits of "+tempN+" is "+sum);
        sc.close();
    }
}
