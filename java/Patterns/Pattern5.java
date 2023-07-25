package java.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows for Pattern five to print");
        int rows = Integer.parseInt(sc.nextLine().trim());


        // logic
        int value = 0;        
        for(int i = 1;i<=rows;i++)
        {
            value +=1;
            for(int j = 1;j<i+2;j++)
            {
                System.out.print(value+" ");
                
             } System.out.println();
            
            sc.close();
        }
    }
}
