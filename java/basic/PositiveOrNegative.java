import java.util.Scanner;
public class PositiveOrNegative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int N = sc.nextInt();
		
		if(N>0)
			System.out.println("Number is Positive");
		else if(N<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Zero is neither Negative nor Positive Number");

			sc.close();
	}
}