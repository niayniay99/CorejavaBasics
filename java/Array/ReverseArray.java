package java.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int N = array.length;

        System.out.println("The Given Array is : ");
        printArray(array,N);
        reverseArray(array, N );
        System.out.println("The Reversed Array is : ");
        printArray(array, N);      
    }
   
    static void printArray(int array[], int N)
    {
        for(int i: array )
        {
                System.out.println(i + " ");
        }
            System.out.println();
    }

    static void reverseArray(int array[] , int N)
    {
       int temp; 
        // N/2 iterations.
       for(int i = 0; i< N/2;i++){
            // swap ith index with N-i-1 index 
            temp = array[i];
            array[i] = array[N - 1 - i ];
            array[N - 1 - i] = temp;
        } 
    }
}
