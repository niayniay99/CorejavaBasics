package java.Array;

public class LargeFactorial {
    public static void main(String[] args) {
        largeFactorial(10);
    }

    static void largeFactorial(int fact)
    {
        int ans[] = new int[500];
        
        ans[0] =1;
        int ans_size = 1;

        // factorial formula
        for(int x =2; x<=fact; x++)
            ans_size = multiply(x,ans,ans_size);

        System.out.println("Factorial of the given number is :");
        
        for(int i = ans_size - 1; i>=0;i--)
                System.out.println(ans[i]);
        
    }

    static int multiply(int x, int ans[], int ans_size)
    {
        int carry = 0;

        for(int i =0;i<ans_size;i++)
            {
                int prod = ans[i] * x + carry;
                ans[i] = prod % 10;  // storing last digit for ans
                carry = prod / 10; // storing rest for carry
                ans_size++;
            }
            return ans_size;
    }
}
