package java.Patterns;

public class Pascal {
    public static void main(String[] args) {
        int n =4,i,j;
        Pascal p =new Pascal();
        for(i =0;i<=n;i++)
        {
            for(j =0;j<=n-i;j++)
            {
                // for left spacing 
                System.out.print("");
            }
            for(j=0;j<= i;j++)
            {
                //ncr formula
                System.out.println(" "+p.factorial(i)/p.factorial(i-j)*p.factorial(j));
            }
        }
    }
    public int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}
