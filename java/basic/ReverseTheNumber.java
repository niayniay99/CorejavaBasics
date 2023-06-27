import java.util.Scanner;
public  class ReverseTheNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int num = Integer.parseInt(sc.nextLine().trim());

        int reversedNum = reverse(num);
        System.out.println("Reverse of the given number is: "+reversedNum);
        sc.close();
    }

    public static int reverse(int num){
        int reversedNum = 0;

        while (num >0){
            int unitDigit = num % 10;
            reversedNum = (reversedNum * 10) + unitDigit;
            num = num / 10;

        }
        return reversedNum;
    }
}
