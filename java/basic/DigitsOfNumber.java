import java.util.ArrayList;
import java.util.Scanner;
public class DigitsOfNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer : ");
        int A = sc.nextInt();

        ArrayList<Integer> digitsList = new ArrayList<>();
        while( A > 0){
            int unitDigit = A % 10;
            digitsList.add(0, unitDigit);
            A = A/10;
        }

        System.out.println("The digits of given number : ");
        for(int digit : digitsList)
             System.out.print(digit+" ");
        sc.close();
    }
}