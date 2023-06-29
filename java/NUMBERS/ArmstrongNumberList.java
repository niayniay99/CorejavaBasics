package java.NUMBERS;

import java.util.Scanner;

public class ArmstrongNumberList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong number from 1 to 1000 : ");
        
        for(int i = 1;i<=1000;i++)
        if(checkArmstrongNumber(i))
            System.out.println(i+" ");
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
