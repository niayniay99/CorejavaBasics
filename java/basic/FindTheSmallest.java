import java.util.Scanner;

public class FindTheSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b :: ");
        int b = sc.nextInt();
        System.out.println("Enter value of c :: ");
        int c = sc.nextInt();
        int smallest = findtheSmallest(a,b,c);
        System.out.println("The Smallest of a,b,c is ::  "+smallest);
        sc.close();
    }
    public static int findtheSmallest(int a, int b, int c)
    {
        if(a/b == 0){
            // here a is smaller then b
            if(c/a == 0){
                return c;
            }
            else{
                // here a is smaller than c
            return a;
            }
        }
        else
        {
            // here b is smmaller then a
            if(c/b == 0){
                // here c is smaller then b
                return c;
            }
            else{
                // here b is smaller then b
                return b;
            }
        }

    }
}
