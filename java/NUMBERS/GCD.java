package java.NUMBERS;

public class GCD {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 55;

        // for this approach a should be bigger and b should be smaller
        if(a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        while(b > 0)
        {
            int temp = b;
            // as b is small get the remainder of b
            b = a%b;
            a = temp;

        }
        System.out.println("GCD of 10 & 55 is : "+a);
    }
}
