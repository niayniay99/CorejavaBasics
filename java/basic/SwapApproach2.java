import java.util.Scanner;

public class SwapApproach2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for a : ");
	int a = sc.nextInt();
	System.out.println("Enter value for b : ");
	int b = sc.nextInt();
	
	System.out.println("Before swapping  a&b : ");
	System.out.println("a = "+a+", b = "+b);
	
	a = a*b;
	b = a/b;
	a = a/b;
	
	System.out.println("After swapping  a&b : ");
	System.out.println("a = "+a+", b = "+b);
	
	}
}
