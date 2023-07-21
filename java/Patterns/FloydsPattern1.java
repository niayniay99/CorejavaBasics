package java.Patterns;


import java.util.Scanner;

public class FloydsPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows for Floyd's Triangle to print");
        int rows =Integer.parseInt(sc.nextLine().trim());


        // logic
        int value = 0;
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<(i+1);j++,value++)
            {
                System.out.print(value+" ");
             } System.out.println();
            
            sc.close();
        }
    }
}
