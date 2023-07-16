package java.Array;


public class MaximumSubArrayKadanes {
    public static void main(String[] args) {
        
        int[] a = {-2,1,3,4,1,-6,4,2,5};
        System.out.println("Maximum Sub array is : "+maximumSubArrayKadanes(a));
        
    }

    static int maximumSubArrayKadanes(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max;
    }

}
