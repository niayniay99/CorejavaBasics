package java.NUMBERS;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int num = Integer.parseInt(sc.nextLine().trim());

        if(checkArmstrongNumber(num) == true)
            System.out.println("Given number "+num+" is an armstrong number");
        else
        System.out.println("Given number "+num+" is NOT an armstrong number");
        sc.close();
    }

    public static boolean checkArmstrongNumber(int num){
        int digitSum = 0;
        int tempNum = num;

        while(num > 0){
            // get the unit digit number
            int digit = num % 10;
            // sum the cubes of the unit digit
            digitSum += digit * digit * digit;
            num = num/10;

            }

            if( digitSum == tempNum)
                return true;
            return false;
    }
}
