package java.Patterns;


public class PascalPattern2 {
    public static void main(String[] args) {
        int n =4,i,j;
        PascalPattern2 p =new PascalPattern2();
        for(i =0;i<=n;i++)
        {
            for(j =0;j<=n-i;j++)
            {
                // for left spacing 
                System.out.print(" ");
            }
            for(j=0;j<= i;j++)
            {
                //ncr formula
                System.out.print(" "+p.factorial(i)/(p.factorial(i-j)*p.factorial(j)));
            }
            System.out.println();
        }
    }
    public int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
