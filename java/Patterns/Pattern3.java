package java.Patterns;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows for Floyd's Triangle to print");
        int rows = Integer.parseInt(sc.nextLine().trim());


        // logic for forward number pattern.
        
        for(int i = 1;i< rows;i++)
        {
            for(int j = 1;j<i+2;j++)
            {
                System.out.print(j+" ");
             } System.out.println();
            
            sc.close();
        }
    }
}
