package java.NUMBERS;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive Integer :: ");
        int num = Integer.parseInt(sc.nextLine().trim());

        System.out.println("The Prime Factors are : ");
        printprimeFactors(num);

        sc.close();

    }

    public static void printprimeFactors(int num)
    {
        int limit = (int) Math.sqrt(num);

        for(int i = 2; i<=limit; i++)
        {
            while(num % i == 0)
            {
                System.out.print(i+ " ");
                num = num/i;

            }
        }
        if (num > 2)
            System.out.print(num);
             
    }
}
