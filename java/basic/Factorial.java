import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int result = 1;
		for(int i =1;i<=num;i++)
		result = result * i;
	
		System.out.print("Factorial of "+num);
		System.out.println(" is "+result);
		sc.close();
	}
}