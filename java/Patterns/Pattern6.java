package java.Patterns;


import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows for Floyd's Triangle to print");
        int rows = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Logic of TRIANGLE PATTERN IS BELOW");

        // logic
        int value = rows;        
        for(int i = 1;i<=rows;i++)
        {
            value -=1;
           
            for(int j = rows;j>=i;j--)
            {
                System.out.print(j+" ");
                 
             } System.out.println();
          //  value--;
            sc.close();
        }
    }   
}
