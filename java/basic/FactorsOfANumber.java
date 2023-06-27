import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        System.out.println("The Factors of Given number are ");
        printFactors(num);
        sc.close();
    }

    public static void printFactors(int num){
        for(int i = 1; i<num/2; i++)
        {
            if(num % i == 0)
            System.out.print(i+" ");
        }
        System.out.println(num);
    }
}
