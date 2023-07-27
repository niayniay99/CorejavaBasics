package java.Patterns;


import java.util.Scanner;

public class Pattern7 {
  public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows Triangle to print");
        int rows = Integer.parseInt(sc.nextLine().trim());


        // logic
      //  int value = rows;        
        for(int i = rows;i>=1;i--)
        {
            //value +=1;
           
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j+" ");         
            }
        System.out.println();
          //  value--;
            sc.close();
        }
    }      
}
