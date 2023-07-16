package java.Array;


import java.util.Arrays;

public class MinimumDifferenceOfHeights {
    public static void main(String[] args) {
        int arr[] = {2,3,10,12};
        int k = 6;
        System.out.println("The minimum Difference is : "+minimumDifference(arr,arr.length, k));
    }

    static int minimumDifference(int arr[],int N, int k)
    {
        Arrays.sort(arr);
        int minHeight = arr[0];
        int maxHeight = arr[N-1];
        int ans = maxHeight - minHeight;

        for(int i = 0; i<N; i++)
        {
            if(arr[i]-k <0)
                continue;

            minHeight = Math.min(arr[0] + k, arr[i] - k);
            maxHeight = Math.max(arr[i]+k,arr[N-1] - k);
            ans = Math.min(ans,maxHeight - minHeight);
        }
        return ans;
    }
}
