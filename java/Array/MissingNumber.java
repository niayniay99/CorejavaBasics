package java.Array;
public class MissingNumber {
    public static void main(String[] args)
    {
        int array[] = {2,4,1,6,7,5,3,9};
      //  int array[] = {2,4,1,6,3};

        int n = array.length;

        // calculate the sum of array1

        int arraysum = 0;

        for(int v : array)
            arraysum += v;


        //array length is 8
        // one no is missing , then n should be n+1
        // here 8+1
        n = n+1;

        // this formula calculates the sum from 1 to n
        // 1 + 2+3 ...n
        int expectedSum = n*(n+1) /2;

        System.out.println("The Given array is : ");
        for(int v : array)
            System.out.println(v+"");
        
        int missingNo = expectedSum - arraysum;
        System.out.println("\n Missing number is : "+missingNo);

    }
}
