package java.NUMBERS;
public class PalindromeCheck {
    public static void main(String[] args)
    {
        int N = 12345;
        String reverse = "";

        int temp = N;
        while(temp > 0){
            int d = temp % 10;
            temp = temp/10;
            reverse = reverse + d;

        }
        int reverseN = Integer.parseInt(reverse);
        if( N == reverseN)
            System.out.println(N+ " is a Plaindrome Number");
        else 
            System.out.println(N+ " is NOT a Plaindrome Number");
    }
}
